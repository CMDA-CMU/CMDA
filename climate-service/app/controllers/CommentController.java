/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import models.ClimateService;
import models.Comment;
import play.Logger;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.twirl.api.HtmlFormat;
import scala.Console;
import utils.Constants;
import utils.RESTfulCalls;
import play.data.DynamicForm;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import views.html.*;

public class CommentController extends Controller {

	final static Form<Comment> commentForm = Form.form(Comment.class);
	private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	private static ObjectNode failJsonObject(String msg) {
		ObjectNode response = Json.newObject();
		response.put("success", false);
		response.put("message", msg);

		return response;
	}

	private static String failJson(String msg) {
		ObjectNode response = Json.newObject();
		response.put("success", false);
		response.put("message", msg);

		return response.toString();
	}

	public static Result getComment(String url, Long version) {
		System.out.println("GET COMMENT");
		
		ClimateService element = findServiceByUrl(url);
		JsonNode response = null;

		try {
			System.out.println(Constants.URL_HOST
					+ Constants.CMU_BACKEND_PORT
					+ Constants.GET_COMMENT_CALL
					+ element.getId() + "/"
					+ version + "/" + session("email") + "/json");
			response = RESTfulCalls.getAPI(Constants.URL_HOST
					+ Constants.CMU_BACKEND_PORT
					+ Constants.GET_COMMENT_CALL
					+ element.getId() + "/"
					+ version + "/" + session("email") + "/json");
		} catch (IllegalStateException e) {
			e.printStackTrace();
			return ok(failJson("Fail to connect"));
		} catch (Exception e) {
			e.printStackTrace();
			return ok(failJson("Fail to connect"));
		}

		return ok(response.toString());
	}
	
	public static ClimateService findServiceByUrl(String url) {
		JsonNode climateServicesNode = RESTfulCalls.getAPI(Constants.URL_HOST
				+ Constants.CMU_BACKEND_PORT
				+ Constants.GET_ALL_CLIMATE_SERVICES);
		
		List<ClimateService> services = new ArrayList<ClimateService>();

		for (int i = 0; i < climateServicesNode.size(); i++) {
		    JsonNode json = climateServicesNode.path(i);
		    ClimateService newService = new ClimateService();
		    newService.setId(json.path("id").asLong());
		    newService.setName(json.get("name").asText());
		    newService.setPurpose(json.path("purpose").asText());
		    newService.setUrl(json.path("url").asText());
		    //newService.setCreateTime(json.path("createTime").asText());
		    newService.setScenario(json.path("scenario").asText());
		    newService.setVersionNo(json.path("versionNo").asText());
		    newService.setRootServiceId(json.path("rootServiceId").asLong());
		    services.add(newService);
		}
		
		for (ClimateService element : services) {
		    if (element.getUrl().equals(url)) {
		    	return element;
		    }  	
		}
		return null;	
	}

	public static Result postComment(String url, Long version) {
		System.out.println("POST COMMENT");

		if (session("email") == null) {
			return ok(failJson("Please login first"));
		}
		String text = DynamicForm.form().bindFromRequest().get("text");
		String parent_id = DynamicForm.form().bindFromRequest()
				.get("parent_id");
		ClimateService element = findServiceByUrl(url);
		ObjectNode jsonData = Json.newObject();
		JsonNode response = null;

		try {
			Date date = new Date();
			jsonData.put("posted_date", dateFormat.format(date));
			jsonData.put("parent_id", parent_id);
			jsonData.put("text", HtmlFormat.escape(text).toString());
			jsonData.put("email", session("email"));
			jsonData.put("climate_service_id", element.getId());
			// version
			jsonData.put("version_id", version);
			response = RESTfulCalls.postAPI(Constants.URL_HOST
					+ Constants.CMU_BACKEND_PORT
					+ Constants.POST_COMMENT_CALL,
					 jsonData);
		} catch (IllegalStateException e) {
			e.printStackTrace();
			return ok(failJson("Fail to connect"));
		} catch (Exception e) {
			e.printStackTrace();
			return ok(failJson("Fail to connect"));
		}

		return ok(response.toString());
	}

	public static Result editComment(String url, Long version, String id) {
		System.out.println("EDIT COMMENT");

		String text = DynamicForm.form().bindFromRequest().get("text");
		String comment_id = id;
		ClimateService element = findServiceByUrl(url);
		ObjectNode jsonData = Json.newObject();
		JsonNode response = null;

		try {
			Date date = new Date();
			jsonData.put("posted_date", dateFormat.format(date));
			jsonData.put("comment_id", comment_id);
			jsonData.put("text", text);
			jsonData.put("version", version);
			jsonData.put("climate_service_id", element.getId());
			response = RESTfulCalls.putAPI(Constants.URL_HOST
					+ Constants.CMU_BACKEND_PORT
					+ Constants.EDIT_COMMENT_CALL, 
					jsonData);
		} catch (IllegalStateException e) {
			e.printStackTrace();
			return ok(failJson("Fail to connect"));
		} catch (Exception e) {
			e.printStackTrace();
			return ok(failJson("Fail to connect"));
		}

		return ok(response.toString());
	}

	public static Result deleteComment(String url, Long version) {
		System.out.println("DELETE COMMENT");

		String comment_id = DynamicForm.form().bindFromRequest()
				.get("comment_id");
		ClimateService element = findServiceByUrl(url);
		JsonNode response = null;

		try {
			response = RESTfulCalls.deleteAPI(Constants.URL_HOST
					+ Constants.CMU_BACKEND_PORT
					+ Constants.DELETE_COMMENT_CALL
					+ element.getId()
					+ "/" + version + "/" + comment_id);
		} catch (IllegalStateException e) {
			e.printStackTrace();
			return ok(failJson("Fail to connect"));
		} catch (Exception e) {
			e.printStackTrace();
			return ok(failJson("Fail to connect"));
		}

		return ok(response.toString());
	}

	public static Result searchCommentByHashTagPage() {
		return ok(searchCommentByHashTag.render());
	}

	public static Result searchCommentByHashTag(String hashTag) {
		System.out.println(hashTag);
		JsonNode response = null;
		try {
			response = RESTfulCalls.getAPI(Constants.URL_HOST
					+ Constants.CMU_BACKEND_PORT
					+ "/comment/searchCommentByHashTag/" + hashTag);
		} catch (Exception e) {
			e.printStackTrace();
			return ok(failJsonObject("Fail to connect"));
		}
		return ok(response);
	}
}
