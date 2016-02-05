// @SOURCE:/Users/weiwang/climate-service/conf/routes
// @HASH:e5858c3d3b3a4f68f965d7093f71de0c93c56bdb
// @DATE:Thu Dec 10 17:28:46 PST 2015


import scala.language.reflectiveCalls
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_home0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_home0_invoker = createInvoker(
controllers.Application.home(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "home", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_login1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_login1_invoker = createInvoker(
controllers.Application.login(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
        

// @LINE:8
private[this] lazy val controllers_Application_logout2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_Application_logout2_invoker = createInvoker(
controllers.Application.logout(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:9
private[this] lazy val controllers_Application_authenticate3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate"))))
private[this] lazy val controllers_Application_authenticate3_invoker = createInvoker(
controllers.Application.authenticate(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "authenticate", Nil,"GET", """""", Routes.prefix + """authenticate"""))
        

// @LINE:10
private[this] lazy val controllers_Application_signup4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
private[this] lazy val controllers_Application_signup4_invoker = createInvoker(
controllers.Application.signup(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "signup", Nil,"GET", """""", Routes.prefix + """signup"""))
        

// @LINE:11
private[this] lazy val controllers_Application_createNewUser5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createNewUser"))))
private[this] lazy val controllers_Application_createNewUser5_invoker = createInvoker(
controllers.Application.createNewUser(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createNewUser", Nil,"GET", """""", Routes.prefix + """createNewUser"""))
        

// @LINE:12
private[this] lazy val controllers_Application_createSuccess6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createSuccess"))))
private[this] lazy val controllers_Application_createSuccess6_invoker = createInvoker(
controllers.Application.createSuccess(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createSuccess", Nil,"GET", """""", Routes.prefix + """createSuccess"""))
        

// @LINE:13
private[this] lazy val controllers_Application_isEmailExisted7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("isEmailExisted"))))
private[this] lazy val controllers_Application_isEmailExisted7_invoker = createInvoker(
controllers.Application.isEmailExisted(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "isEmailExisted", Nil,"POST", """""", Routes.prefix + """isEmailExisted"""))
        

// @LINE:19
private[this] lazy val controllers_ClimateServiceController_recommendationSummary8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/recommendationSummary/"),DynamicPart("userId", """[^/]+""",true))))
private[this] lazy val controllers_ClimateServiceController_recommendationSummary8_invoker = createInvoker(
controllers.ClimateServiceController.recommendationSummary(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "recommendationSummary", Seq(classOf[String]),"GET", """recommendation overview""", Routes.prefix + """climateService/recommendationSummary/$userId<[^/]+>"""))
        

// @LINE:24
private[this] lazy val controllers_ClimateServiceController_showAllClimateServices9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/allServices"))))
private[this] lazy val controllers_ClimateServiceController_showAllClimateServices9_invoker = createInvoker(
controllers.ClimateServiceController.showAllClimateServices(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "showAllClimateServices", Nil,"GET", """ Climate Service""", Routes.prefix + """climateService/allServices"""))
        

// @LINE:25
private[this] lazy val controllers_ClimateServiceController_addClimateService10_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/add"))))
private[this] lazy val controllers_ClimateServiceController_addClimateService10_invoker = createInvoker(
controllers.ClimateServiceController.addClimateService(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addClimateService", Nil,"POST", """""", Routes.prefix + """climateService/add"""))
        

// @LINE:26
private[this] lazy val controllers_ClimateServiceController_addAClimateService11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/addAClimateService"))))
private[this] lazy val controllers_ClimateServiceController_addAClimateService11_invoker = createInvoker(
controllers.ClimateServiceController.addAClimateService(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addAClimateService", Nil,"GET", """""", Routes.prefix + """climateService/addAClimateService"""))
        

// @LINE:27
private[this] lazy val controllers_ClimateServiceController_passPageStr12_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/savePage"))))
private[this] lazy val controllers_ClimateServiceController_passPageStr12_invoker = createInvoker(
controllers.ClimateServiceController.passPageStr(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "passPageStr", Nil,"POST", """""", Routes.prefix + """climateService/savePage"""))
        

// @LINE:28
private[this] lazy val controllers_ClimateServiceController_serviceModels13_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/html/climateService/serviceModels"))))
private[this] lazy val controllers_ClimateServiceController_serviceModels13_invoker = createInvoker(
controllers.ClimateServiceController.serviceModels(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "serviceModels", Nil,"POST", """""", Routes.prefix + """assets/html/climateService/serviceModels"""))
        

// @LINE:29
private[this] lazy val controllers_ClimateServiceController_serviceModels14_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/serviceModels"))))
private[this] lazy val controllers_ClimateServiceController_serviceModels14_invoker = createInvoker(
controllers.ClimateServiceController.serviceModels(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "serviceModels", Nil,"POST", """""", Routes.prefix + """climateService/serviceModels"""))
        

// @LINE:30
private[this] lazy val controllers_ClimateServiceController_ruleEngineData15_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/ruleEngineData"))))
private[this] lazy val controllers_ClimateServiceController_ruleEngineData15_invoker = createInvoker(
controllers.ClimateServiceController.ruleEngineData(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "ruleEngineData", Nil,"POST", """""", Routes.prefix + """climateService/ruleEngineData"""))
        

// @LINE:32
private[this] lazy val controllers_ClimateServiceController_mostPopularServices16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/mostPopularServices"))))
private[this] lazy val controllers_ClimateServiceController_mostPopularServices16_invoker = createInvoker(
controllers.ClimateServiceController.mostPopularServices(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "mostPopularServices", Nil,"GET", """""", Routes.prefix + """climateService/mostPopularServices"""))
        

// @LINE:33
private[this] lazy val controllers_ClimateServiceController_mostRecentlyUsedClimateServices17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/mostRecentlyUsedClimateServices"))))
private[this] lazy val controllers_ClimateServiceController_mostRecentlyUsedClimateServices17_invoker = createInvoker(
controllers.ClimateServiceController.mostRecentlyUsedClimateServices(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "mostRecentlyUsedClimateServices", Nil,"GET", """""", Routes.prefix + """climateService/mostRecentlyUsedClimateServices"""))
        

// @LINE:34
private[this] lazy val controllers_ClimateServiceController_mostRecentlyAddedClimateServices18_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/mostRecentlyAddedClimateServices"))))
private[this] lazy val controllers_ClimateServiceController_mostRecentlyAddedClimateServices18_invoker = createInvoker(
controllers.ClimateServiceController.mostRecentlyAddedClimateServices(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "mostRecentlyAddedClimateServices", Nil,"GET", """""", Routes.prefix + """climateService/mostRecentlyAddedClimateServices"""))
        

// @LINE:35
private[this] lazy val controllers_ClimateServiceController_searchClimateServices19_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/searchClimateService"))))
private[this] lazy val controllers_ClimateServiceController_searchClimateServices19_invoker = createInvoker(
controllers.ClimateServiceController.searchClimateServices(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "searchClimateServices", Nil,"GET", """""", Routes.prefix + """climateService/searchClimateService"""))
        

// @LINE:36
private[this] lazy val controllers_ClimateServiceController_getSearchResult20_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getSearchResult"))))
private[this] lazy val controllers_ClimateServiceController_getSearchResult20_invoker = createInvoker(
controllers.ClimateServiceController.getSearchResult(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getSearchResult", Nil,"GET", """""", Routes.prefix + """climateService/getSearchResult"""))
        

// @LINE:39
private[this] lazy val controllers_ClimateServiceController_replaceFile21_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/replaceFile"))))
private[this] lazy val controllers_ClimateServiceController_replaceFile21_invoker = createInvoker(
controllers.ClimateServiceController.replaceFile(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "replaceFile", Nil,"POST", """replace page""", Routes.prefix + """climateService/replaceFile"""))
        

// @LINE:43
private[this] lazy val controllers_ServiceExecutionLogController_getServiceLog22_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceLog"))))
private[this] lazy val controllers_ServiceExecutionLogController_getServiceLog22_invoker = createInvoker(
controllers.ServiceExecutionLogController.getServiceLog(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "getServiceLog", Nil,"GET", """ Service Execution Log""", Routes.prefix + """serviceLog"""))
        

// @LINE:44
private[this] lazy val controllers_ServiceExecutionLogController_searchServiceLog23_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchServiceLog"))))
private[this] lazy val controllers_ServiceExecutionLogController_searchServiceLog23_invoker = createInvoker(
controllers.ServiceExecutionLogController.searchServiceLog(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "searchServiceLog", Nil,"GET", """""", Routes.prefix + """searchServiceLog"""))
        

// @LINE:45
private[this] lazy val controllers_ServiceExecutionLogController_getSearchServiceLog24_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchServiceLogResult"))))
private[this] lazy val controllers_ServiceExecutionLogController_getSearchServiceLog24_invoker = createInvoker(
controllers.ServiceExecutionLogController.getSearchServiceLog(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "getSearchServiceLog", Nil,"GET", """""", Routes.prefix + """searchServiceLogResult"""))
        

// @LINE:46
private[this] lazy val controllers_ServiceExecutionLogController_getConfigurationByConfId25_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getConfigurationByConfId"))))
private[this] lazy val controllers_ServiceExecutionLogController_getConfigurationByConfId25_invoker = createInvoker(
controllers.ServiceExecutionLogController.getConfigurationByConfId(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "getConfigurationByConfId", Nil,"GET", """""", Routes.prefix + """getConfigurationByConfId"""))
        

// @LINE:49
private[this] lazy val controllers_DatasetController_showAllDatasets26_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataSet/allDatasets"))))
private[this] lazy val controllers_DatasetController_showAllDatasets26_invoker = createInvoker(
controllers.DatasetController.showAllDatasets(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "showAllDatasets", Nil,"GET", """ Dataset""", Routes.prefix + """dataSet/allDatasets"""))
        

// @LINE:50
private[this] lazy val controllers_DatasetController_searchDataset27_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataSet/searchDataSet"))))
private[this] lazy val controllers_DatasetController_searchDataset27_invoker = createInvoker(
controllers.DatasetController.searchDataset(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "searchDataset", Nil,"GET", """""", Routes.prefix + """dataSet/searchDataSet"""))
        

// @LINE:51
private[this] lazy val controllers_DatasetController_getSearchResult28_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataSet/getSearchResult"))))
private[this] lazy val controllers_DatasetController_getSearchResult28_invoker = createInvoker(
controllers.DatasetController.getSearchResult(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "getSearchResult", Nil,"GET", """""", Routes.prefix + """dataSet/getSearchResult"""))
        

// @LINE:52
private[this] lazy val controllers_DatasetController_mostPopularDatasets29_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataSet/mostPopularDatasets"))))
private[this] lazy val controllers_DatasetController_mostPopularDatasets29_invoker = createInvoker(
controllers.DatasetController.mostPopularDatasets(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "mostPopularDatasets", Nil,"GET", """""", Routes.prefix + """dataSet/mostPopularDatasets"""))
        

// @LINE:55
private[this] lazy val controllers_DatasetLogController_getAllDatasetLogs30_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("datasetLog/allDatasetLogs"))))
private[this] lazy val controllers_DatasetLogController_getAllDatasetLogs30_invoker = createInvoker(
controllers.DatasetLogController.getAllDatasetLogs(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "getAllDatasetLogs", Nil,"GET", """ Dataset Log""", Routes.prefix + """datasetLog/allDatasetLogs"""))
        

// @LINE:58
private[this] lazy val controllers_AnalyticsController_getRecommend31_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceLogRecommend"))))
private[this] lazy val controllers_AnalyticsController_getRecommend31_invoker = createInvoker(
controllers.AnalyticsController.getRecommend(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getRecommend", Nil,"GET", """ Analytics""", Routes.prefix + """serviceLogRecommend"""))
        

// @LINE:59
private[this] lazy val controllers_AnalyticsController_getDatasetRecommend32_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("datasetRecommend"))))
private[this] lazy val controllers_AnalyticsController_getDatasetRecommend32_invoker = createInvoker(
controllers.AnalyticsController.getDatasetRecommend(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getDatasetRecommend", Nil,"GET", """""", Routes.prefix + """datasetRecommend"""))
        

// @LINE:60
private[this] lazy val controllers_AnalyticsController_getScientistRecommend33_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profileRecommend"))))
private[this] lazy val controllers_AnalyticsController_getScientistRecommend33_invoker = createInvoker(
controllers.AnalyticsController.getScientistRecommend(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getScientistRecommend", Nil,"GET", """""", Routes.prefix + """profileRecommend"""))
        

// @LINE:61
private[this] lazy val controllers_AnalyticsController_getLogGraph34_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceLogGraph"))))
private[this] lazy val controllers_AnalyticsController_getLogGraph34_invoker = createInvoker(
controllers.AnalyticsController.getLogGraph(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getLogGraph", Nil,"GET", """""", Routes.prefix + """serviceLogGraph"""))
        

// @LINE:62
private[this] lazy val controllers_AnalyticsController_getSearchAndGenerateWorkflow35_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchAndGenerateWorkflow"))))
private[this] lazy val controllers_AnalyticsController_getSearchAndGenerateWorkflow35_invoker = createInvoker(
controllers.AnalyticsController.getSearchAndGenerateWorkflow(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getSearchAndGenerateWorkflow", Nil,"GET", """""", Routes.prefix + """searchAndGenerateWorkflow"""))
        

// @LINE:63
private[this] lazy val controllers_AnalyticsController_getKnowledgeGraph36_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceKnowledgeGraph"))))
private[this] lazy val controllers_AnalyticsController_getKnowledgeGraph36_invoker = createInvoker(
controllers.AnalyticsController.getKnowledgeGraph(fakeValue[String], fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getKnowledgeGraph", Seq(classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """serviceKnowledgeGraph"""))
        

// @LINE:64
private[this] lazy val controllers_AnalyticsController_getRelationalKnowledgeGraph37_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("relationalKnowledgeGraph"))))
private[this] lazy val controllers_AnalyticsController_getRelationalKnowledgeGraph37_invoker = createInvoker(
controllers.AnalyticsController.getRelationalKnowledgeGraph(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getRelationalKnowledgeGraph", Nil,"GET", """""", Routes.prefix + """relationalKnowledgeGraph"""))
        

// @LINE:65
private[this] lazy val controllers_AnalyticsController_getSpecifiedKnowledgeGraph38_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getSpecifiedKnowledgeGraph"))))
private[this] lazy val controllers_AnalyticsController_getSpecifiedKnowledgeGraph38_invoker = createInvoker(
controllers.AnalyticsController.getSpecifiedKnowledgeGraph(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getSpecifiedKnowledgeGraph", Nil,"POST", """""", Routes.prefix + """getSpecifiedKnowledgeGraph"""))
        

// @LINE:66
private[this] lazy val controllers_AnalyticsController_getShortestPath39_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getShortestPath"))))
private[this] lazy val controllers_AnalyticsController_getShortestPath39_invoker = createInvoker(
controllers.AnalyticsController.getShortestPath(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getShortestPath", Nil,"POST", """""", Routes.prefix + """getShortestPath"""))
        

// @LINE:67
private[this] lazy val controllers_AnalyticsController_getPartKnowledgeGraph40_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getPartKnowledgeGraph"))))
private[this] lazy val controllers_AnalyticsController_getPartKnowledgeGraph40_invoker = createInvoker(
controllers.AnalyticsController.getPartKnowledgeGraph(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getPartKnowledgeGraph", Nil,"POST", """""", Routes.prefix + """getPartKnowledgeGraph"""))
        

// @LINE:68
private[this] lazy val controllers_AnalyticsController_getKthShortestPath41_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getKthShortestPath"))))
private[this] lazy val controllers_AnalyticsController_getKthShortestPath41_invoker = createInvoker(
controllers.AnalyticsController.getKthShortestPath(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getKthShortestPath", Nil,"POST", """""", Routes.prefix + """getKthShortestPath"""))
        

// @LINE:72
private[this] lazy val controllers_UsersController_getAllUsers42_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("scientist/allUsers"))))
private[this] lazy val controllers_UsersController_getAllUsers42_invoker = createInvoker(
controllers.UsersController.getAllUsers(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsersController", "getAllUsers", Nil,"GET", """ Users""", Routes.prefix + """scientist/allUsers"""))
        

// @LINE:73
private[this] lazy val controllers_UsersController_searchUser43_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("scientist/searchUser"))))
private[this] lazy val controllers_UsersController_searchUser43_invoker = createInvoker(
controllers.UsersController.searchUser(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsersController", "searchUser", Nil,"GET", """""", Routes.prefix + """scientist/searchUser"""))
        

// @LINE:74
private[this] lazy val controllers_UsersController_getUsernamesAndServicesAutoCompleteSource44_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/getUsernamesAndServicesAutoCompleteSource"))))
private[this] lazy val controllers_UsersController_getUsernamesAndServicesAutoCompleteSource44_invoker = createInvoker(
controllers.UsersController.getUsernamesAndServicesAutoCompleteSource(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsersController", "getUsernamesAndServicesAutoCompleteSource", Nil,"GET", """""", Routes.prefix + """users/getUsernamesAndServicesAutoCompleteSource"""))
        

// @LINE:77
private[this] lazy val controllers_CommentController_getComment45_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("comment/getComment/"),DynamicPart("url", """[^/]+""",true),StaticPart("/"),DynamicPart("version", """[^/]+""",true))))
private[this] lazy val controllers_CommentController_getComment45_invoker = createInvoker(
controllers.CommentController.getComment(fakeValue[String], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "getComment", Seq(classOf[String], classOf[Long]),"GET", """ Comment""", Routes.prefix + """comment/getComment/$url<[^/]+>/$version<[^/]+>"""))
        

// @LINE:78
private[this] lazy val controllers_CommentController_postComment46_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("comment/postComment/"),DynamicPart("url", """[^/]+""",true),StaticPart("/"),DynamicPart("version", """[^/]+""",true))))
private[this] lazy val controllers_CommentController_postComment46_invoker = createInvoker(
controllers.CommentController.postComment(fakeValue[String], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "postComment", Seq(classOf[String], classOf[Long]),"POST", """""", Routes.prefix + """comment/postComment/$url<[^/]+>/$version<[^/]+>"""))
        

// @LINE:79
private[this] lazy val controllers_CommentController_editComment47_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("comment/postComment/"),DynamicPart("url", """[^/]+""",true),StaticPart("/"),DynamicPart("version", """[^/]+""",true),StaticPart("/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_CommentController_editComment47_invoker = createInvoker(
controllers.CommentController.editComment(fakeValue[String], fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "editComment", Seq(classOf[String], classOf[Long], classOf[String]),"POST", """""", Routes.prefix + """comment/postComment/$url<[^/]+>/$version<[^/]+>/$id<[^/]+>"""))
        

// @LINE:80
private[this] lazy val controllers_CommentController_deleteComment48_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("comment/deleteComment/"),DynamicPart("url", """[^/]+""",true),StaticPart("/"),DynamicPart("version", """[^/]+""",true))))
private[this] lazy val controllers_CommentController_deleteComment48_invoker = createInvoker(
controllers.CommentController.deleteComment(fakeValue[String], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "deleteComment", Seq(classOf[String], classOf[Long]),"DELETE", """""", Routes.prefix + """comment/deleteComment/$url<[^/]+>/$version<[^/]+>"""))
        

// @LINE:81
private[this] lazy val controllers_CommentController_searchCommentByHashTag49_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("comment/searchCommentByHashTag/"),DynamicPart("hashTag", """[^/]+""",true))))
private[this] lazy val controllers_CommentController_searchCommentByHashTag49_invoker = createInvoker(
controllers.CommentController.searchCommentByHashTag(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "searchCommentByHashTag", Seq(classOf[String]),"GET", """""", Routes.prefix + """comment/searchCommentByHashTag/$hashTag<[^/]+>"""))
        

// @LINE:82
private[this] lazy val controllers_CommentController_searchCommentByHashTagPage50_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("comment/searchCommentByHashTagPage"))))
private[this] lazy val controllers_CommentController_searchCommentByHashTagPage50_invoker = createInvoker(
controllers.CommentController.searchCommentByHashTagPage(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "searchCommentByHashTagPage", Nil,"GET", """""", Routes.prefix + """comment/searchCommentByHashTagPage"""))
        

// @LINE:86
private[this] lazy val controllers_Assets_at51_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at51_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:87
private[this] lazy val controllers_Assets_at52_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at52_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"POST", """""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:91
private[this] lazy val controllers_AboutController_aboutUs53_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutUs"))))
private[this] lazy val controllers_AboutController_aboutUs53_invoker = createInvoker(
controllers.AboutController.aboutUs(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AboutController", "aboutUs", Nil,"GET", """ About""", Routes.prefix + """aboutUs"""))
        

// @LINE:92
private[this] lazy val controllers_AboutController_aboutProject54_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutProject"))))
private[this] lazy val controllers_AboutController_aboutProject54_invoker = createInvoker(
controllers.AboutController.aboutProject(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AboutController", "aboutProject", Nil,"GET", """""", Routes.prefix + """aboutProject"""))
        

// @LINE:93
private[this] lazy val controllers_AboutController_tutorial55_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tutorial"))))
private[this] lazy val controllers_AboutController_tutorial55_invoker = createInvoker(
controllers.AboutController.tutorial(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AboutController", "tutorial", Nil,"GET", """""", Routes.prefix + """tutorial"""))
        

// @LINE:94
private[this] lazy val controllers_AboutController_FAQs56_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("FAQs"))))
private[this] lazy val controllers_AboutController_FAQs56_invoker = createInvoker(
controllers.AboutController.FAQs(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AboutController", "FAQs", Nil,"GET", """""", Routes.prefix + """FAQs"""))
        

// @LINE:97
private[this] lazy val controllers_BugReportController_reports57_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bugs"))))
private[this] lazy val controllers_BugReportController_reports57_invoker = createInvoker(
controllers.BugReportController.reports(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "reports", Nil,"GET", """ BugReporting""", Routes.prefix + """bugs"""))
        

// @LINE:98
private[this] lazy val controllers_BugReportController_newReport58_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newReport"))))
private[this] lazy val controllers_BugReportController_newReport58_invoker = createInvoker(
controllers.BugReportController.newReport(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "newReport", Nil,"GET", """""", Routes.prefix + """newReport"""))
        

// @LINE:99
private[this] lazy val controllers_BugReportController_list59_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bug/list"))))
private[this] lazy val controllers_BugReportController_list59_invoker = createInvoker(
controllers.BugReportController.list(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "list", Nil,"GET", """""", Routes.prefix + """bug/list"""))
        

// @LINE:100
private[this] lazy val controllers_BugReportController_deleteReport60_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete/report"))))
private[this] lazy val controllers_BugReportController_deleteReport60_invoker = createInvoker(
controllers.BugReportController.deleteReport(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "deleteReport", Nil,"POST", """""", Routes.prefix + """delete/report"""))
        

// @LINE:101
private[this] lazy val controllers_BugReportController_solveReport61_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("solve/report"))))
private[this] lazy val controllers_BugReportController_solveReport61_invoker = createInvoker(
controllers.BugReportController.solveReport(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "solveReport", Nil,"POST", """""", Routes.prefix + """solve/report"""))
        

// @LINE:104
private[this] lazy val controllers_ClimateServiceController_addAllParameters62_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/addAllParameters"))))
private[this] lazy val controllers_ClimateServiceController_addAllParameters62_invoker = createInvoker(
controllers.ClimateServiceController.addAllParameters(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addAllParameters", Nil,"POST", """ AddParameters""", Routes.prefix + """climateService/addAllParameters"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.home()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.signup()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createNewUser""","""controllers.Application.createNewUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createSuccess""","""controllers.Application.createSuccess()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """isEmailExisted""","""controllers.Application.isEmailExisted()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/recommendationSummary/$userId<[^/]+>""","""controllers.ClimateServiceController.recommendationSummary(userId:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/allServices""","""controllers.ClimateServiceController.showAllClimateServices()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/add""","""controllers.ClimateServiceController.addClimateService()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/addAClimateService""","""controllers.ClimateServiceController.addAClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/savePage""","""controllers.ClimateServiceController.passPageStr()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/html/climateService/serviceModels""","""controllers.ClimateServiceController.serviceModels()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/serviceModels""","""controllers.ClimateServiceController.serviceModels()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/ruleEngineData""","""controllers.ClimateServiceController.ruleEngineData()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/mostPopularServices""","""controllers.ClimateServiceController.mostPopularServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/mostRecentlyUsedClimateServices""","""controllers.ClimateServiceController.mostRecentlyUsedClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/mostRecentlyAddedClimateServices""","""controllers.ClimateServiceController.mostRecentlyAddedClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/searchClimateService""","""controllers.ClimateServiceController.searchClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getSearchResult""","""controllers.ClimateServiceController.getSearchResult()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/replaceFile""","""controllers.ClimateServiceController.replaceFile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceLog""","""controllers.ServiceExecutionLogController.getServiceLog()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchServiceLog""","""controllers.ServiceExecutionLogController.searchServiceLog()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchServiceLogResult""","""controllers.ServiceExecutionLogController.getSearchServiceLog()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getConfigurationByConfId""","""controllers.ServiceExecutionLogController.getConfigurationByConfId()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataSet/allDatasets""","""controllers.DatasetController.showAllDatasets()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataSet/searchDataSet""","""controllers.DatasetController.searchDataset()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataSet/getSearchResult""","""controllers.DatasetController.getSearchResult()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataSet/mostPopularDatasets""","""controllers.DatasetController.mostPopularDatasets()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """datasetLog/allDatasetLogs""","""controllers.DatasetLogController.getAllDatasetLogs()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceLogRecommend""","""controllers.AnalyticsController.getRecommend()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """datasetRecommend""","""controllers.AnalyticsController.getDatasetRecommend()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profileRecommend""","""controllers.AnalyticsController.getScientistRecommend()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceLogGraph""","""controllers.AnalyticsController.getLogGraph()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchAndGenerateWorkflow""","""controllers.AnalyticsController.getSearchAndGenerateWorkflow()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceKnowledgeGraph""","""controllers.AnalyticsController.getKnowledgeGraph(param1:String ?= "User", param2:String ?= "Dataset", param3:String ?= "Service")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """relationalKnowledgeGraph""","""controllers.AnalyticsController.getRelationalKnowledgeGraph()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getSpecifiedKnowledgeGraph""","""controllers.AnalyticsController.getSpecifiedKnowledgeGraph()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getShortestPath""","""controllers.AnalyticsController.getShortestPath()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getPartKnowledgeGraph""","""controllers.AnalyticsController.getPartKnowledgeGraph()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getKthShortestPath""","""controllers.AnalyticsController.getKthShortestPath()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """scientist/allUsers""","""controllers.UsersController.getAllUsers()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """scientist/searchUser""","""controllers.UsersController.searchUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/getUsernamesAndServicesAutoCompleteSource""","""controllers.UsersController.getUsernamesAndServicesAutoCompleteSource()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """comment/getComment/$url<[^/]+>/$version<[^/]+>""","""controllers.CommentController.getComment(url:String, version:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """comment/postComment/$url<[^/]+>/$version<[^/]+>""","""controllers.CommentController.postComment(url:String, version:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """comment/postComment/$url<[^/]+>/$version<[^/]+>/$id<[^/]+>""","""controllers.CommentController.editComment(url:String, version:Long, id:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """comment/deleteComment/$url<[^/]+>/$version<[^/]+>""","""controllers.CommentController.deleteComment(url:String, version:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """comment/searchCommentByHashTag/$hashTag<[^/]+>""","""controllers.CommentController.searchCommentByHashTag(hashTag:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """comment/searchCommentByHashTagPage""","""controllers.CommentController.searchCommentByHashTagPage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutUs""","""controllers.AboutController.aboutUs()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutProject""","""controllers.AboutController.aboutProject()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tutorial""","""controllers.AboutController.tutorial()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """FAQs""","""controllers.AboutController.FAQs()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugs""","""controllers.BugReportController.reports()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newReport""","""controllers.BugReportController.newReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bug/list""","""controllers.BugReportController.list()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete/report""","""controllers.BugReportController.deleteReport()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """solve/report""","""controllers.BugReportController.solveReport()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/addAllParameters""","""controllers.ClimateServiceController.addAllParameters()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_home0_route(params) => {
   call { 
        controllers_Application_home0_invoker.call(controllers.Application.home())
   }
}
        

// @LINE:7
case controllers_Application_login1_route(params) => {
   call { 
        controllers_Application_login1_invoker.call(controllers.Application.login())
   }
}
        

// @LINE:8
case controllers_Application_logout2_route(params) => {
   call { 
        controllers_Application_logout2_invoker.call(controllers.Application.logout())
   }
}
        

// @LINE:9
case controllers_Application_authenticate3_route(params) => {
   call { 
        controllers_Application_authenticate3_invoker.call(controllers.Application.authenticate())
   }
}
        

// @LINE:10
case controllers_Application_signup4_route(params) => {
   call { 
        controllers_Application_signup4_invoker.call(controllers.Application.signup())
   }
}
        

// @LINE:11
case controllers_Application_createNewUser5_route(params) => {
   call { 
        controllers_Application_createNewUser5_invoker.call(controllers.Application.createNewUser())
   }
}
        

// @LINE:12
case controllers_Application_createSuccess6_route(params) => {
   call { 
        controllers_Application_createSuccess6_invoker.call(controllers.Application.createSuccess())
   }
}
        

// @LINE:13
case controllers_Application_isEmailExisted7_route(params) => {
   call { 
        controllers_Application_isEmailExisted7_invoker.call(controllers.Application.isEmailExisted())
   }
}
        

// @LINE:19
case controllers_ClimateServiceController_recommendationSummary8_route(params) => {
   call(params.fromPath[String]("userId", None)) { (userId) =>
        controllers_ClimateServiceController_recommendationSummary8_invoker.call(controllers.ClimateServiceController.recommendationSummary(userId))
   }
}
        

// @LINE:24
case controllers_ClimateServiceController_showAllClimateServices9_route(params) => {
   call { 
        controllers_ClimateServiceController_showAllClimateServices9_invoker.call(controllers.ClimateServiceController.showAllClimateServices())
   }
}
        

// @LINE:25
case controllers_ClimateServiceController_addClimateService10_route(params) => {
   call { 
        controllers_ClimateServiceController_addClimateService10_invoker.call(controllers.ClimateServiceController.addClimateService())
   }
}
        

// @LINE:26
case controllers_ClimateServiceController_addAClimateService11_route(params) => {
   call { 
        controllers_ClimateServiceController_addAClimateService11_invoker.call(controllers.ClimateServiceController.addAClimateService())
   }
}
        

// @LINE:27
case controllers_ClimateServiceController_passPageStr12_route(params) => {
   call { 
        controllers_ClimateServiceController_passPageStr12_invoker.call(controllers.ClimateServiceController.passPageStr())
   }
}
        

// @LINE:28
case controllers_ClimateServiceController_serviceModels13_route(params) => {
   call { 
        controllers_ClimateServiceController_serviceModels13_invoker.call(controllers.ClimateServiceController.serviceModels())
   }
}
        

// @LINE:29
case controllers_ClimateServiceController_serviceModels14_route(params) => {
   call { 
        controllers_ClimateServiceController_serviceModels14_invoker.call(controllers.ClimateServiceController.serviceModels())
   }
}
        

// @LINE:30
case controllers_ClimateServiceController_ruleEngineData15_route(params) => {
   call { 
        controllers_ClimateServiceController_ruleEngineData15_invoker.call(controllers.ClimateServiceController.ruleEngineData())
   }
}
        

// @LINE:32
case controllers_ClimateServiceController_mostPopularServices16_route(params) => {
   call { 
        controllers_ClimateServiceController_mostPopularServices16_invoker.call(controllers.ClimateServiceController.mostPopularServices())
   }
}
        

// @LINE:33
case controllers_ClimateServiceController_mostRecentlyUsedClimateServices17_route(params) => {
   call { 
        controllers_ClimateServiceController_mostRecentlyUsedClimateServices17_invoker.call(controllers.ClimateServiceController.mostRecentlyUsedClimateServices())
   }
}
        

// @LINE:34
case controllers_ClimateServiceController_mostRecentlyAddedClimateServices18_route(params) => {
   call { 
        controllers_ClimateServiceController_mostRecentlyAddedClimateServices18_invoker.call(controllers.ClimateServiceController.mostRecentlyAddedClimateServices())
   }
}
        

// @LINE:35
case controllers_ClimateServiceController_searchClimateServices19_route(params) => {
   call { 
        controllers_ClimateServiceController_searchClimateServices19_invoker.call(controllers.ClimateServiceController.searchClimateServices())
   }
}
        

// @LINE:36
case controllers_ClimateServiceController_getSearchResult20_route(params) => {
   call { 
        controllers_ClimateServiceController_getSearchResult20_invoker.call(controllers.ClimateServiceController.getSearchResult())
   }
}
        

// @LINE:39
case controllers_ClimateServiceController_replaceFile21_route(params) => {
   call { 
        controllers_ClimateServiceController_replaceFile21_invoker.call(controllers.ClimateServiceController.replaceFile())
   }
}
        

// @LINE:43
case controllers_ServiceExecutionLogController_getServiceLog22_route(params) => {
   call { 
        controllers_ServiceExecutionLogController_getServiceLog22_invoker.call(controllers.ServiceExecutionLogController.getServiceLog())
   }
}
        

// @LINE:44
case controllers_ServiceExecutionLogController_searchServiceLog23_route(params) => {
   call { 
        controllers_ServiceExecutionLogController_searchServiceLog23_invoker.call(controllers.ServiceExecutionLogController.searchServiceLog())
   }
}
        

// @LINE:45
case controllers_ServiceExecutionLogController_getSearchServiceLog24_route(params) => {
   call { 
        controllers_ServiceExecutionLogController_getSearchServiceLog24_invoker.call(controllers.ServiceExecutionLogController.getSearchServiceLog())
   }
}
        

// @LINE:46
case controllers_ServiceExecutionLogController_getConfigurationByConfId25_route(params) => {
   call { 
        controllers_ServiceExecutionLogController_getConfigurationByConfId25_invoker.call(controllers.ServiceExecutionLogController.getConfigurationByConfId())
   }
}
        

// @LINE:49
case controllers_DatasetController_showAllDatasets26_route(params) => {
   call { 
        controllers_DatasetController_showAllDatasets26_invoker.call(controllers.DatasetController.showAllDatasets())
   }
}
        

// @LINE:50
case controllers_DatasetController_searchDataset27_route(params) => {
   call { 
        controllers_DatasetController_searchDataset27_invoker.call(controllers.DatasetController.searchDataset())
   }
}
        

// @LINE:51
case controllers_DatasetController_getSearchResult28_route(params) => {
   call { 
        controllers_DatasetController_getSearchResult28_invoker.call(controllers.DatasetController.getSearchResult())
   }
}
        

// @LINE:52
case controllers_DatasetController_mostPopularDatasets29_route(params) => {
   call { 
        controllers_DatasetController_mostPopularDatasets29_invoker.call(controllers.DatasetController.mostPopularDatasets())
   }
}
        

// @LINE:55
case controllers_DatasetLogController_getAllDatasetLogs30_route(params) => {
   call { 
        controllers_DatasetLogController_getAllDatasetLogs30_invoker.call(controllers.DatasetLogController.getAllDatasetLogs())
   }
}
        

// @LINE:58
case controllers_AnalyticsController_getRecommend31_route(params) => {
   call { 
        controllers_AnalyticsController_getRecommend31_invoker.call(controllers.AnalyticsController.getRecommend())
   }
}
        

// @LINE:59
case controllers_AnalyticsController_getDatasetRecommend32_route(params) => {
   call { 
        controllers_AnalyticsController_getDatasetRecommend32_invoker.call(controllers.AnalyticsController.getDatasetRecommend())
   }
}
        

// @LINE:60
case controllers_AnalyticsController_getScientistRecommend33_route(params) => {
   call { 
        controllers_AnalyticsController_getScientistRecommend33_invoker.call(controllers.AnalyticsController.getScientistRecommend())
   }
}
        

// @LINE:61
case controllers_AnalyticsController_getLogGraph34_route(params) => {
   call { 
        controllers_AnalyticsController_getLogGraph34_invoker.call(controllers.AnalyticsController.getLogGraph())
   }
}
        

// @LINE:62
case controllers_AnalyticsController_getSearchAndGenerateWorkflow35_route(params) => {
   call { 
        controllers_AnalyticsController_getSearchAndGenerateWorkflow35_invoker.call(controllers.AnalyticsController.getSearchAndGenerateWorkflow())
   }
}
        

// @LINE:63
case controllers_AnalyticsController_getKnowledgeGraph36_route(params) => {
   call(params.fromQuery[String]("param1", Some("User")), params.fromQuery[String]("param2", Some("Dataset")), params.fromQuery[String]("param3", Some("Service"))) { (param1, param2, param3) =>
        controllers_AnalyticsController_getKnowledgeGraph36_invoker.call(controllers.AnalyticsController.getKnowledgeGraph(param1, param2, param3))
   }
}
        

// @LINE:64
case controllers_AnalyticsController_getRelationalKnowledgeGraph37_route(params) => {
   call { 
        controllers_AnalyticsController_getRelationalKnowledgeGraph37_invoker.call(controllers.AnalyticsController.getRelationalKnowledgeGraph())
   }
}
        

// @LINE:65
case controllers_AnalyticsController_getSpecifiedKnowledgeGraph38_route(params) => {
   call { 
        controllers_AnalyticsController_getSpecifiedKnowledgeGraph38_invoker.call(controllers.AnalyticsController.getSpecifiedKnowledgeGraph())
   }
}
        

// @LINE:66
case controllers_AnalyticsController_getShortestPath39_route(params) => {
   call { 
        controllers_AnalyticsController_getShortestPath39_invoker.call(controllers.AnalyticsController.getShortestPath())
   }
}
        

// @LINE:67
case controllers_AnalyticsController_getPartKnowledgeGraph40_route(params) => {
   call { 
        controllers_AnalyticsController_getPartKnowledgeGraph40_invoker.call(controllers.AnalyticsController.getPartKnowledgeGraph())
   }
}
        

// @LINE:68
case controllers_AnalyticsController_getKthShortestPath41_route(params) => {
   call { 
        controllers_AnalyticsController_getKthShortestPath41_invoker.call(controllers.AnalyticsController.getKthShortestPath())
   }
}
        

// @LINE:72
case controllers_UsersController_getAllUsers42_route(params) => {
   call { 
        controllers_UsersController_getAllUsers42_invoker.call(controllers.UsersController.getAllUsers())
   }
}
        

// @LINE:73
case controllers_UsersController_searchUser43_route(params) => {
   call { 
        controllers_UsersController_searchUser43_invoker.call(controllers.UsersController.searchUser())
   }
}
        

// @LINE:74
case controllers_UsersController_getUsernamesAndServicesAutoCompleteSource44_route(params) => {
   call { 
        controllers_UsersController_getUsernamesAndServicesAutoCompleteSource44_invoker.call(controllers.UsersController.getUsernamesAndServicesAutoCompleteSource())
   }
}
        

// @LINE:77
case controllers_CommentController_getComment45_route(params) => {
   call(params.fromPath[String]("url", None), params.fromPath[Long]("version", None)) { (url, version) =>
        controllers_CommentController_getComment45_invoker.call(controllers.CommentController.getComment(url, version))
   }
}
        

// @LINE:78
case controllers_CommentController_postComment46_route(params) => {
   call(params.fromPath[String]("url", None), params.fromPath[Long]("version", None)) { (url, version) =>
        controllers_CommentController_postComment46_invoker.call(controllers.CommentController.postComment(url, version))
   }
}
        

// @LINE:79
case controllers_CommentController_editComment47_route(params) => {
   call(params.fromPath[String]("url", None), params.fromPath[Long]("version", None), params.fromPath[String]("id", None)) { (url, version, id) =>
        controllers_CommentController_editComment47_invoker.call(controllers.CommentController.editComment(url, version, id))
   }
}
        

// @LINE:80
case controllers_CommentController_deleteComment48_route(params) => {
   call(params.fromPath[String]("url", None), params.fromPath[Long]("version", None)) { (url, version) =>
        controllers_CommentController_deleteComment48_invoker.call(controllers.CommentController.deleteComment(url, version))
   }
}
        

// @LINE:81
case controllers_CommentController_searchCommentByHashTag49_route(params) => {
   call(params.fromPath[String]("hashTag", None)) { (hashTag) =>
        controllers_CommentController_searchCommentByHashTag49_invoker.call(controllers.CommentController.searchCommentByHashTag(hashTag))
   }
}
        

// @LINE:82
case controllers_CommentController_searchCommentByHashTagPage50_route(params) => {
   call { 
        controllers_CommentController_searchCommentByHashTagPage50_invoker.call(controllers.CommentController.searchCommentByHashTagPage())
   }
}
        

// @LINE:86
case controllers_Assets_at51_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at51_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:87
case controllers_Assets_at52_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at52_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:91
case controllers_AboutController_aboutUs53_route(params) => {
   call { 
        controllers_AboutController_aboutUs53_invoker.call(controllers.AboutController.aboutUs())
   }
}
        

// @LINE:92
case controllers_AboutController_aboutProject54_route(params) => {
   call { 
        controllers_AboutController_aboutProject54_invoker.call(controllers.AboutController.aboutProject())
   }
}
        

// @LINE:93
case controllers_AboutController_tutorial55_route(params) => {
   call { 
        controllers_AboutController_tutorial55_invoker.call(controllers.AboutController.tutorial())
   }
}
        

// @LINE:94
case controllers_AboutController_FAQs56_route(params) => {
   call { 
        controllers_AboutController_FAQs56_invoker.call(controllers.AboutController.FAQs())
   }
}
        

// @LINE:97
case controllers_BugReportController_reports57_route(params) => {
   call { 
        controllers_BugReportController_reports57_invoker.call(controllers.BugReportController.reports())
   }
}
        

// @LINE:98
case controllers_BugReportController_newReport58_route(params) => {
   call { 
        controllers_BugReportController_newReport58_invoker.call(controllers.BugReportController.newReport())
   }
}
        

// @LINE:99
case controllers_BugReportController_list59_route(params) => {
   call { 
        controllers_BugReportController_list59_invoker.call(controllers.BugReportController.list())
   }
}
        

// @LINE:100
case controllers_BugReportController_deleteReport60_route(params) => {
   call { 
        controllers_BugReportController_deleteReport60_invoker.call(controllers.BugReportController.deleteReport())
   }
}
        

// @LINE:101
case controllers_BugReportController_solveReport61_route(params) => {
   call { 
        controllers_BugReportController_solveReport61_invoker.call(controllers.BugReportController.solveReport())
   }
}
        

// @LINE:104
case controllers_ClimateServiceController_addAllParameters62_route(params) => {
   call { 
        controllers_ClimateServiceController_addAllParameters62_invoker.call(controllers.ClimateServiceController.addAllParameters())
   }
}
        
}

}
     