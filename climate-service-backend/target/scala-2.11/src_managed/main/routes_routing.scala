// @SOURCE:/Users/weiwang/climate-service-backend/conf/routes
// @HASH:4088b6f2c67503eb4c2067f861a839393dcbcc17
// @DATE:Fri Jan 15 17:00:21 PST 2016


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


// @LINE:10
private[this] lazy val controllers_ClimateServiceController_getClimateService0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getClimateService/"),DynamicPart("name", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_ClimateServiceController_getClimateService0_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateService(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getClimateService", Seq(classOf[String], classOf[String]),"GET", """ Climate Service""", Routes.prefix + """climateService/getClimateService/$name<[^/]+>/json"""))
        

// @LINE:11
private[this] lazy val controllers_ClimateServiceController_getClimateServiceById1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getClimateService/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ClimateServiceController_getClimateServiceById1_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateServiceById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getClimateServiceById", Seq(classOf[Long]),"GET", """""", Routes.prefix + """climateService/getClimateService/id/$id<[^/]+>"""))
        

// @LINE:12
private[this] lazy val controllers_ClimateServiceController_getAllClimateServices2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getAllClimateServices/json"))))
private[this] lazy val controllers_ClimateServiceController_getAllClimateServices2_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServices(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServices", Seq(classOf[String]),"GET", """""", Routes.prefix + """climateService/getAllClimateServices/json"""))
        

// @LINE:13
private[this] lazy val controllers_ClimateServiceController_getAllClimateServicesOrderByCreateTime3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getAllMostRecentClimateServicesByCreateTime/json"))))
private[this] lazy val controllers_ClimateServiceController_getAllClimateServicesOrderByCreateTime3_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCreateTime(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByCreateTime", Seq(classOf[String]),"GET", """""", Routes.prefix + """climateService/getAllMostRecentClimateServicesByCreateTime/json"""))
        

// @LINE:14
private[this] lazy val controllers_ClimateServiceController_getAllClimateServicesOrderByLatestAccessTime4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getAllMostRecentClimateServicesByLatestAccessTime/json"))))
private[this] lazy val controllers_ClimateServiceController_getAllClimateServicesOrderByLatestAccessTime4_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByLatestAccessTime(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByLatestAccessTime", Seq(classOf[String]),"GET", """""", Routes.prefix + """climateService/getAllMostRecentClimateServicesByLatestAccessTime/json"""))
        

// @LINE:15
private[this] lazy val controllers_ClimateServiceController_getAllClimateServicesOrderByCount5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getAllMostUsedClimateServices/json"))))
private[this] lazy val controllers_ClimateServiceController_getAllClimateServicesOrderByCount5_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCount(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByCount", Seq(classOf[String]),"GET", """""", Routes.prefix + """climateService/getAllMostUsedClimateServices/json"""))
        

// @LINE:16
private[this] lazy val controllers_ClimateServiceController_getTopKUsedClimateServicesByDatasetId6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getTopKUsedClimateServicesByDatasetId/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ClimateServiceController_getTopKUsedClimateServicesByDatasetId6_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getTopKUsedClimateServicesByDatasetId(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getTopKUsedClimateServicesByDatasetId", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """climateService/getTopKUsedClimateServicesByDatasetId/$id<[^/]+>"""))
        

// @LINE:17
private[this] lazy val controllers_ClimateServiceController_addClimateService7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/addClimateService"))))
private[this] lazy val controllers_ClimateServiceController_addClimateService7_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addClimateService,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addClimateService", Nil,"POST", """""", Routes.prefix + """climateService/addClimateService"""))
        

// @LINE:18
private[this] lazy val controllers_ClimateServiceController_queryClimateServices8_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/queryClimateService"))))
private[this] lazy val controllers_ClimateServiceController_queryClimateServices8_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).queryClimateServices,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "queryClimateServices", Nil,"POST", """""", Routes.prefix + """climateService/queryClimateService"""))
        

// @LINE:19
private[this] lazy val controllers_ClimateServiceController_getAllServiceEntries9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getAllServiceEntries/json"))))
private[this] lazy val controllers_ClimateServiceController_getAllServiceEntries9_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllServiceEntries(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllServiceEntries", Seq(classOf[String]),"GET", """""", Routes.prefix + """climateService/getAllServiceEntries/json"""))
        

// @LINE:20
private[this] lazy val controllers_ClimateServiceController_addServiceEntry10_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/addServiceEntry"))))
private[this] lazy val controllers_ClimateServiceController_addServiceEntry10_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addServiceEntry,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addServiceEntry", Nil,"POST", """""", Routes.prefix + """climateService/addServiceEntry"""))
        

// @LINE:21
private[this] lazy val controllers_ClimateServiceController_updateClimateServiceById11_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/updateClimateService/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ClimateServiceController_updateClimateServiceById11_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "updateClimateServiceById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """climateService/updateClimateService/id/$id<[^/]+>"""))
        

// @LINE:22
private[this] lazy val controllers_ClimateServiceController_updateClimateServiceByName12_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/updateClimateService/name/"),DynamicPart("oldName", """[^/]+""",true))))
private[this] lazy val controllers_ClimateServiceController_updateClimateServiceByName12_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceByName(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "updateClimateServiceByName", Seq(classOf[String]),"PUT", """""", Routes.prefix + """climateService/updateClimateService/name/$oldName<[^/]+>"""))
        

// @LINE:23
private[this] lazy val controllers_ClimateServiceController_deleteClimateServiceById13_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/deleteClimateService/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ClimateServiceController_deleteClimateServiceById13_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "deleteClimateServiceById", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """climateService/deleteClimateService/id/$id<[^/]+>"""))
        

// @LINE:24
private[this] lazy val controllers_ClimateServiceController_deleteClimateServiceByName14_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/deleteClimateService/name/"),DynamicPart("name", """[^/]+""",true))))
private[this] lazy val controllers_ClimateServiceController_deleteClimateServiceByName14_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceByName(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "deleteClimateServiceByName", Seq(classOf[String]),"DELETE", """""", Routes.prefix + """climateService/deleteClimateService/name/$name<[^/]+>"""))
        

// @LINE:27
private[this] lazy val controllers_ClimateServiceController_savePage15_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/savePage"))))
private[this] lazy val controllers_ClimateServiceController_savePage15_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).savePage,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "savePage", Nil,"POST", """ Save Climate Service Page""", Routes.prefix + """climateService/savePage"""))
        

// @LINE:30
private[this] lazy val controllers_BugReportController_getBugReport16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bugReport/getBugReport/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_BugReportController_getBugReport16_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).getBugReport(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "getBugReport", Seq(classOf[Long], classOf[String]),"GET", """ Bug Report""", Routes.prefix + """bugReport/getBugReport/id/$id<[^/]+>"""))
        

// @LINE:31
private[this] lazy val controllers_BugReportController_getAllBugReports17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bugReport/getAllBugReports/json"))))
private[this] lazy val controllers_BugReportController_getAllBugReports17_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).getAllBugReports,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "getAllBugReports", Nil,"GET", """""", Routes.prefix + """bugReport/getAllBugReports/json"""))
        

// @LINE:32
private[this] lazy val controllers_BugReportController_getAllUnsolvedBugReports18_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bugReport/getAllUnsolvedBugReports/json"))))
private[this] lazy val controllers_BugReportController_getAllUnsolvedBugReports18_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).getAllUnsolvedBugReports,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "getAllUnsolvedBugReports", Nil,"GET", """""", Routes.prefix + """bugReport/getAllUnsolvedBugReports/json"""))
        

// @LINE:33
private[this] lazy val controllers_BugReportController_getAllSolvedBugReports19_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bugReport/getAllSolvedBugReports/json"))))
private[this] lazy val controllers_BugReportController_getAllSolvedBugReports19_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).getAllSolvedBugReports,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "getAllSolvedBugReports", Nil,"GET", """""", Routes.prefix + """bugReport/getAllSolvedBugReports/json"""))
        

// @LINE:34
private[this] lazy val controllers_BugReportController_addBugReport20_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bugReport/addBugReport"))))
private[this] lazy val controllers_BugReportController_addBugReport20_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).addBugReport,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "addBugReport", Nil,"POST", """""", Routes.prefix + """bugReport/addBugReport"""))
        

// @LINE:35
private[this] lazy val controllers_BugReportController_updateBugReportById21_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bugReport/updateBugReport/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_BugReportController_updateBugReportById21_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).updateBugReportById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "updateBugReportById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """bugReport/updateBugReport/id/$id<[^/]+>"""))
        

// @LINE:36
private[this] lazy val controllers_BugReportController_deleteBugReport22_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bugReport/deleteBugReport/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_BugReportController_deleteBugReport22_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).deleteBugReport(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "deleteBugReport", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """bugReport/deleteBugReport/id/$id<[^/]+>"""))
        

// @LINE:39
private[this] lazy val controllers_ClimateServiceCommentController_getComment23_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateServiceComment/getComment/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("email", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_ClimateServiceCommentController_getComment23_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceCommentController]).getComment(fakeValue[Long], fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceCommentController", "getComment", Seq(classOf[Long], classOf[String], classOf[String]),"GET", """ ClimateServiceComment""", Routes.prefix + """climateServiceComment/getComment/$id<[^/]+>/$email<[^/]+>/json"""))
        

// @LINE:40
private[this] lazy val controllers_ClimateServiceCommentController_searchCommentByHashTag24_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateServiceComment/searchCommentByHashTag/"),DynamicPart("hashTag", """[^/]+""",true))))
private[this] lazy val controllers_ClimateServiceCommentController_searchCommentByHashTag24_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceCommentController]).searchCommentByHashTag(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceCommentController", "searchCommentByHashTag", Seq(classOf[String]),"GET", """""", Routes.prefix + """climateServiceComment/searchCommentByHashTag/$hashTag<[^/]+>"""))
        

// @LINE:41
private[this] lazy val controllers_ClimateServiceCommentController_getMentions25_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateServiceComment/getMentions/"),DynamicPart("email", """[^/]+""",true))))
private[this] lazy val controllers_ClimateServiceCommentController_getMentions25_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceCommentController]).getMentions(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceCommentController", "getMentions", Seq(classOf[String]),"GET", """""", Routes.prefix + """climateServiceComment/getMentions/$email<[^/]+>"""))
        

// @LINE:42
private[this] lazy val controllers_ClimateServiceCommentController_postComment26_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateServiceComment/postComment"))))
private[this] lazy val controllers_ClimateServiceCommentController_postComment26_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceCommentController]).postComment,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceCommentController", "postComment", Nil,"POST", """""", Routes.prefix + """climateServiceComment/postComment"""))
        

// @LINE:43
private[this] lazy val controllers_ClimateServiceCommentController_editComment27_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateServiceComment/editComment"))))
private[this] lazy val controllers_ClimateServiceCommentController_editComment27_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceCommentController]).editComment,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceCommentController", "editComment", Nil,"PUT", """""", Routes.prefix + """climateServiceComment/editComment"""))
        

// @LINE:44
private[this] lazy val controllers_ClimateServiceCommentController_deleteComment28_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateServiceComment/deleteComment/"),DynamicPart("service_id", """[^/]+""",true),StaticPart("/"),DynamicPart("comment_id", """[^/]+""",true))))
private[this] lazy val controllers_ClimateServiceCommentController_deleteComment28_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceCommentController]).deleteComment(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceCommentController", "deleteComment", Seq(classOf[Long], classOf[Long]),"DELETE", """""", Routes.prefix + """climateServiceComment/deleteComment/$service_id<[^/]+>/$comment_id<[^/]+>"""))
        

// @LINE:47
private[this] lazy val controllers_ServiceConfigurationController_getServiceConfiguration29_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceConfiguration/getServiceConfiguration/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_ServiceConfigurationController_getServiceConfiguration29_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).getServiceConfiguration(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationController", "getServiceConfiguration", Seq(classOf[Long], classOf[String]),"GET", """ Service Configuration""", Routes.prefix + """serviceConfiguration/getServiceConfiguration/id/$id<[^/]+>/json"""))
        

// @LINE:48
private[this] lazy val controllers_ServiceConfigurationController_addServiceConfiguration30_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceConfiguration/addServiceConfiguration"))))
private[this] lazy val controllers_ServiceConfigurationController_addServiceConfiguration30_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).addServiceConfiguration,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationController", "addServiceConfiguration", Nil,"POST", """""", Routes.prefix + """serviceConfiguration/addServiceConfiguration"""))
        

// @LINE:49
private[this] lazy val controllers_ServiceConfigurationController_updateServiceConfigurationById31_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceConfiguration/updateServiceConfiguration/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ServiceConfigurationController_updateServiceConfigurationById31_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).updateServiceConfigurationById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationController", "updateServiceConfigurationById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """serviceConfiguration/updateServiceConfiguration/id/$id<[^/]+>"""))
        

// @LINE:50
private[this] lazy val controllers_ServiceConfigurationController_deleteServiceConfiguration32_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceConfiguration/deleteServiceConfiguration/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ServiceConfigurationController_deleteServiceConfiguration32_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).deleteServiceConfiguration(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationController", "deleteServiceConfiguration", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """serviceConfiguration/deleteServiceConfiguration/$id<[^/]+>"""))
        

// @LINE:51
private[this] lazy val controllers_ServiceConfigurationController_getServiceConfigurationsByUser33_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceConfiguration/getAllServiceConfigurationsByUserId/"),DynamicPart("userId", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_ServiceConfigurationController_getServiceConfigurationsByUser33_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).getServiceConfigurationsByUser(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationController", "getServiceConfigurationsByUser", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """serviceConfiguration/getAllServiceConfigurationsByUserId/$userId<[^/]+>/json"""))
        

// @LINE:54
private[this] lazy val controllers_ServiceConfigurationItemController_getServiceConfigurationItemById34_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceConfigurationItem/serviceConfigurationItemById/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ServiceConfigurationItemController_getServiceConfigurationItemById34_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).getServiceConfigurationItemById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationItemController", "getServiceConfigurationItemById", Seq(classOf[Long]),"GET", """ Service Configuration Item""", Routes.prefix + """serviceConfigurationItem/serviceConfigurationItemById/$id<[^/]+>"""))
        

// @LINE:55
private[this] lazy val controllers_ServiceConfigurationItemController_getServiceConfigurationItemsInServiceConfig35_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceConfigurationItem/serviceConfigurationItemByServiceConfig/"),DynamicPart("serviceConfigId", """[^/]+""",true))))
private[this] lazy val controllers_ServiceConfigurationItemController_getServiceConfigurationItemsInServiceConfig35_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).getServiceConfigurationItemsInServiceConfig(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationItemController", "getServiceConfigurationItemsInServiceConfig", Seq(classOf[Long]),"GET", """""", Routes.prefix + """serviceConfigurationItem/serviceConfigurationItemByServiceConfig/$serviceConfigId<[^/]+>"""))
        

// @LINE:56
private[this] lazy val controllers_ServiceConfigurationItemController_getServiceConfigurationItemByParameterId36_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceConfigurationItem/serviceConfigurationItemByParamId/"),DynamicPart("paramId", """[^/]+""",true))))
private[this] lazy val controllers_ServiceConfigurationItemController_getServiceConfigurationItemByParameterId36_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).getServiceConfigurationItemByParameterId(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationItemController", "getServiceConfigurationItemByParameterId", Seq(classOf[Long]),"GET", """""", Routes.prefix + """serviceConfigurationItem/serviceConfigurationItemByParamId/$paramId<[^/]+>"""))
        

// @LINE:57
private[this] lazy val controllers_ServiceConfigurationItemController_addServiceConfigurationItem37_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceConfigurationItem/addServiceConfigurationItem"))))
private[this] lazy val controllers_ServiceConfigurationItemController_addServiceConfigurationItem37_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).addServiceConfigurationItem,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationItemController", "addServiceConfigurationItem", Nil,"POST", """""", Routes.prefix + """serviceConfigurationItem/addServiceConfigurationItem"""))
        

// @LINE:58
private[this] lazy val controllers_ServiceConfigurationItemController_updateServiceConfigurationItemById38_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceConfigurationItem/updateServiceConfigurationItem/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ServiceConfigurationItemController_updateServiceConfigurationItemById38_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).updateServiceConfigurationItemById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationItemController", "updateServiceConfigurationItemById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """serviceConfigurationItem/updateServiceConfigurationItem/id/$id<[^/]+>"""))
        

// @LINE:59
private[this] lazy val controllers_ServiceConfigurationItemController_deleteServiceConfigurationItemById39_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceConfigurationItem/deleteServiceConfigurationItemById/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ServiceConfigurationItemController_deleteServiceConfigurationItemById39_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).deleteServiceConfigurationItemById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationItemController", "deleteServiceConfigurationItemById", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """serviceConfigurationItem/deleteServiceConfigurationItemById/$id<[^/]+>"""))
        

// @LINE:62
private[this] lazy val controllers_ServiceExecutionLogController_getAllServiceExecutionLogs40_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceExecutionLog/getAllServiceExecutionLog"))))
private[this] lazy val controllers_ServiceExecutionLogController_getAllServiceExecutionLogs40_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).getAllServiceExecutionLogs(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "getAllServiceExecutionLogs", Seq(classOf[String]),"GET", """ Service Execution Log""", Routes.prefix + """serviceExecutionLog/getAllServiceExecutionLog"""))
        

// @LINE:63
private[this] lazy val controllers_ServiceExecutionLogController_getServiceExecutionLog41_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceExecutionLog/getServiceExecutionLog/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ServiceExecutionLogController_getServiceExecutionLog41_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).getServiceExecutionLog(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "getServiceExecutionLog", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """serviceExecutionLog/getServiceExecutionLog/$id<[^/]+>"""))
        

// @LINE:64
private[this] lazy val controllers_ServiceExecutionLogController_addServiceExecutionLog42_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceExecutionLog/addServiceExecutionLog"))))
private[this] lazy val controllers_ServiceExecutionLogController_addServiceExecutionLog42_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).addServiceExecutionLog(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "addServiceExecutionLog", Nil,"POST", """""", Routes.prefix + """serviceExecutionLog/addServiceExecutionLog"""))
        

// @LINE:65
private[this] lazy val controllers_ServiceExecutionLogController_queryExecutionLogsByUser43_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceExecutionLog/queryExecutionLogsByUser"))))
private[this] lazy val controllers_ServiceExecutionLogController_queryExecutionLogsByUser43_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).queryExecutionLogsByUser(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "queryExecutionLogsByUser", Nil,"POST", """""", Routes.prefix + """serviceExecutionLog/queryExecutionLogsByUser"""))
        

// @LINE:66
private[this] lazy val controllers_ServiceExecutionLogController_queryServiceExecutionLogs44_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceExecutionLog/queryServiceExecutionLogs"))))
private[this] lazy val controllers_ServiceExecutionLogController_queryServiceExecutionLogs44_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).queryServiceExecutionLogs(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "queryServiceExecutionLogs", Nil,"POST", """""", Routes.prefix + """serviceExecutionLog/queryServiceExecutionLogs"""))
        

// @LINE:67
private[this] lazy val controllers_ServiceExecutionLogController_updateServiceExecutionLog45_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceExecutionLog/updateServiceExecutionLogs/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ServiceExecutionLogController_updateServiceExecutionLog45_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).updateServiceExecutionLog(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "updateServiceExecutionLog", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """serviceExecutionLog/updateServiceExecutionLogs/$id<[^/]+>"""))
        

// @LINE:68
private[this] lazy val controllers_ServiceExecutionLogController_deleteServiceExecutionLog46_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceExecutionLog/deleteServiceExecutionLogs/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ServiceExecutionLogController_deleteServiceExecutionLog46_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).deleteServiceExecutionLog(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "deleteServiceExecutionLog", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """serviceExecutionLog/deleteServiceExecutionLogs/$id<[^/]+>"""))
        

// @LINE:73
private[this] lazy val controllers_DatasetLogController_getAllDatasetLogs47_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("datasetLog/getAllDatasetLogs/json"))))
private[this] lazy val controllers_DatasetLogController_getAllDatasetLogs47_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).getAllDatasetLogs(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "getAllDatasetLogs", Seq(classOf[String]),"GET", """ DatasetLog""", Routes.prefix + """datasetLog/getAllDatasetLogs/json"""))
        

// @LINE:74
private[this] lazy val controllers_DatasetLogController_getDatasetLog48_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("datasetLog/getDatasetLog/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_DatasetLogController_getDatasetLog48_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).getDatasetLog(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "getDatasetLog", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """datasetLog/getDatasetLog/id/$id<[^/]+>/json"""))
        

// @LINE:75
private[this] lazy val controllers_DatasetLogController_getServiceExecutionLogsByDatasetAndUser49_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("datasetLog/getServiceExecutionLogsByDatasetAndUser/datasetId/"),DynamicPart("datasetId", """[^/]+""",true),StaticPart("/userId/"),DynamicPart("userId", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_DatasetLogController_getServiceExecutionLogsByDatasetAndUser49_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).getServiceExecutionLogsByDatasetAndUser(fakeValue[Long], fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "getServiceExecutionLogsByDatasetAndUser", Seq(classOf[Long], classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """datasetLog/getServiceExecutionLogsByDatasetAndUser/datasetId/$datasetId<[^/]+>/userId/$userId<[^/]+>/json"""))
        

// @LINE:76
private[this] lazy val controllers_DatasetLogController_getDatasetLogsByServiceAndUser50_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("datasetLog/getDatasetLogsByServiceAndUser/serviceId/"),DynamicPart("serviceId", """[^/]+""",true),StaticPart("/userId/"),DynamicPart("userId", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_DatasetLogController_getDatasetLogsByServiceAndUser50_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).getDatasetLogsByServiceAndUser(fakeValue[Long], fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "getDatasetLogsByServiceAndUser", Seq(classOf[Long], classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """datasetLog/getDatasetLogsByServiceAndUser/serviceId/$serviceId<[^/]+>/userId/$userId<[^/]+>/json"""))
        

// @LINE:77
private[this] lazy val controllers_DatasetLogController_getUsersByServiceAndDataset51_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("datasetLog/getUsersByServiceAndDataset/serviceId/"),DynamicPart("serviceId", """[^/]+""",true),StaticPart("/datasetId/"),DynamicPart("datasetId", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_DatasetLogController_getUsersByServiceAndDataset51_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).getUsersByServiceAndDataset(fakeValue[Long], fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "getUsersByServiceAndDataset", Seq(classOf[Long], classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """datasetLog/getUsersByServiceAndDataset/serviceId/$serviceId<[^/]+>/datasetId/$datasetId<[^/]+>/json"""))
        

// @LINE:78
private[this] lazy val controllers_DatasetLogController_addDatasetLog52_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("datasetLog/addDatasetLog"))))
private[this] lazy val controllers_DatasetLogController_addDatasetLog52_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).addDatasetLog,
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "addDatasetLog", Nil,"POST", """""", Routes.prefix + """datasetLog/addDatasetLog"""))
        

// @LINE:79
private[this] lazy val controllers_DatasetLogController_queryDatasets53_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("datasetLog/queryDatasets"))))
private[this] lazy val controllers_DatasetLogController_queryDatasets53_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).queryDatasets,
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "queryDatasets", Nil,"POST", """""", Routes.prefix + """datasetLog/queryDatasets"""))
        

// @LINE:80
private[this] lazy val controllers_DatasetLogController_queryVariables54_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("datasetLog/queryVariables"))))
private[this] lazy val controllers_DatasetLogController_queryVariables54_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).queryVariables,
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "queryVariables", Nil,"POST", """""", Routes.prefix + """datasetLog/queryVariables"""))
        

// @LINE:81
private[this] lazy val controllers_DatasetLogController_updateDatasetLogById55_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("datasetLog/updateDatasetLog/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_DatasetLogController_updateDatasetLogById55_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).updateDatasetLogById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "updateDatasetLogById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """datasetLog/updateDatasetLog/id/$id<[^/]+>"""))
        

// @LINE:82
private[this] lazy val controllers_DatasetLogController_deleteDatasetLog56_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("datasetLog/deleteDatasetLog/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_DatasetLogController_deleteDatasetLog56_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).deleteDatasetLog(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "deleteDatasetLog", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """datasetLog/deleteDatasetLog/id/$id<[^/]+>"""))
        

// @LINE:93
private[this] lazy val controllers_InstrumentController_getAllInstruments57_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("instrument/getAllInstruments/json"))))
private[this] lazy val controllers_InstrumentController_getAllInstruments57_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getAllInstruments(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "getAllInstruments", Seq(classOf[String]),"GET", """ Instrument""", Routes.prefix + """instrument/getAllInstruments/json"""))
        

// @LINE:94
private[this] lazy val controllers_InstrumentController_getInstrument58_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("instrument/getInstrument/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_InstrumentController_getInstrument58_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getInstrument(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "getInstrument", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """instrument/getInstrument/id/$id<[^/]+>/json"""))
        

// @LINE:95
private[this] lazy val controllers_InstrumentController_addInstrument59_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("instrument/addInstrument"))))
private[this] lazy val controllers_InstrumentController_addInstrument59_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).addInstrument,
HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "addInstrument", Nil,"POST", """""", Routes.prefix + """instrument/addInstrument"""))
        

// @LINE:96
private[this] lazy val controllers_InstrumentController_updateInstrumentById60_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("instrument/updateInstrument/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_InstrumentController_updateInstrumentById60_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).updateInstrumentById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "updateInstrumentById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """instrument/updateInstrument/id/$id<[^/]+>"""))
        

// @LINE:97
private[this] lazy val controllers_InstrumentController_deleteInstrument61_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("instrument/deleteInstrument/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_InstrumentController_deleteInstrument61_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).deleteInstrument(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "deleteInstrument", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """instrument/deleteInstrument/id/$id<[^/]+>"""))
        

// @LINE:100
private[this] lazy val controllers_DatasetController_getAllDatasets62_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataset/getAllDatasets/json"))))
private[this] lazy val controllers_DatasetController_getAllDatasets62_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getAllDatasets(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "getAllDatasets", Seq(classOf[String]),"GET", """ Dataset""", Routes.prefix + """dataset/getAllDatasets/json"""))
        

// @LINE:101
private[this] lazy val controllers_DatasetController_getDataset63_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataset/getDataset/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_DatasetController_getDataset63_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getDataset(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "getDataset", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """dataset/getDataset/id/$id<[^/]+>/json"""))
        

// @LINE:102
private[this] lazy val controllers_DatasetController_addDataset64_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataset/addDataset"))))
private[this] lazy val controllers_DatasetController_addDataset64_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).addDataset,
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "addDataset", Nil,"POST", """""", Routes.prefix + """dataset/addDataset"""))
        

// @LINE:103
private[this] lazy val controllers_DatasetController_updateDatasetById65_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataset/updateDataset/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_DatasetController_updateDatasetById65_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).updateDatasetById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "updateDatasetById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """dataset/updateDataset/id/$id<[^/]+>"""))
        

// @LINE:104
private[this] lazy val controllers_DatasetController_deleteDataset66_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataset/deleteDataset/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_DatasetController_deleteDataset66_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).deleteDataset(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "deleteDataset", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """dataset/deleteDataset/id/$id<[^/]+>"""))
        

// @LINE:105
private[this] lazy val controllers_DatasetController_queryDatasets67_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataset/queryDataset"))))
private[this] lazy val controllers_DatasetController_queryDatasets67_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).queryDatasets,
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "queryDatasets", Nil,"POST", """""", Routes.prefix + """dataset/queryDataset"""))
        

// @LINE:106
private[this] lazy val controllers_DatasetController_getMostKPopularDatasets68_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataset/getMostKPopularDatasets"))))
private[this] lazy val controllers_DatasetController_getMostKPopularDatasets68_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getMostKPopularDatasets,
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "getMostKPopularDatasets", Nil,"POST", """""", Routes.prefix + """dataset/getMostKPopularDatasets"""))
        

// @LINE:109
private[this] lazy val controllers_ParameterController_getAllParameters69_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/getAllParameters/json"))))
private[this] lazy val controllers_ParameterController_getAllParameters69_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getAllParameters(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getAllParameters", Seq(classOf[String]),"GET", """ Parameter""", Routes.prefix + """parameter/getAllParameters/json"""))
        

// @LINE:110
private[this] lazy val controllers_ParameterController_getParameterByName70_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/getParameter/service/"),DynamicPart("id", """[^/]+""",true),StaticPart("/name/"),DynamicPart("name", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_ParameterController_getParameterByName70_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterByName(fakeValue[Long], fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getParameterByName", Seq(classOf[Long], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """parameter/getParameter/service/$id<[^/]+>/name/$name<[^/]+>/json"""))
        

// @LINE:111
private[this] lazy val controllers_ParameterController_getParameterById71_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/getParameter/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_ParameterController_getParameterById71_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterById(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getParameterById", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """parameter/getParameter/id/$id<[^/]+>/json"""))
        

// @LINE:112
private[this] lazy val controllers_ParameterController_addParameter72_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/addParameter"))))
private[this] lazy val controllers_ParameterController_addParameter72_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).addParameter,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "addParameter", Nil,"POST", """""", Routes.prefix + """parameter/addParameter"""))
        

// @LINE:113
private[this] lazy val controllers_ParameterController_updateParameterById73_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/updateParameter/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ParameterController_updateParameterById73_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "updateParameterById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """parameter/updateParameter/id/$id<[^/]+>"""))
        

// @LINE:114
private[this] lazy val controllers_ParameterController_updateParameterByName74_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/updateParameter/name/"),DynamicPart("oldName", """[^/]+""",true))))
private[this] lazy val controllers_ParameterController_updateParameterByName74_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterByName(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "updateParameterByName", Seq(classOf[String]),"PUT", """""", Routes.prefix + """parameter/updateParameter/name/$oldName<[^/]+>"""))
        

// @LINE:115
private[this] lazy val controllers_ParameterController_deleteParameterByName75_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/deleteParameter/service/"),DynamicPart("id", """[^/]+""",true),StaticPart("/name/"),DynamicPart("name", """[^/]+""",true))))
private[this] lazy val controllers_ParameterController_deleteParameterByName75_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).deleteParameterByName(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "deleteParameterByName", Seq(classOf[Long], classOf[String]),"DELETE", """""", Routes.prefix + """parameter/deleteParameter/service/$id<[^/]+>/name/$name<[^/]+>"""))
        

// @LINE:118
private[this] lazy val controllers_JournalPublicationController_getAllJournalPublications76_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("journalPublication/getAllJournalPublications/json"))))
private[this] lazy val controllers_JournalPublicationController_getAllJournalPublications76_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).getAllJournalPublications(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.JournalPublicationController", "getAllJournalPublications", Seq(classOf[String]),"GET", """ JournalPublication""", Routes.prefix + """journalPublication/getAllJournalPublications/json"""))
        

// @LINE:119
private[this] lazy val controllers_JournalPublicationController_getJournalPublicationById77_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("journalPublication/getJournalPublication/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_JournalPublicationController_getJournalPublicationById77_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).getJournalPublicationById(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.JournalPublicationController", "getJournalPublicationById", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """journalPublication/getJournalPublication/id/$id<[^/]+>/json"""))
        

// @LINE:120
private[this] lazy val controllers_JournalPublicationController_addJournalPublication78_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("journalPublication/addJournalPublication"))))
private[this] lazy val controllers_JournalPublicationController_addJournalPublication78_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).addJournalPublication,
HandlerDef(this.getClass.getClassLoader, "", "controllers.JournalPublicationController", "addJournalPublication", Nil,"POST", """""", Routes.prefix + """journalPublication/addJournalPublication"""))
        

// @LINE:121
private[this] lazy val controllers_JournalPublicationController_updateJournalPublicationById79_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("journalPublication/updateJournalPublication/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_JournalPublicationController_updateJournalPublicationById79_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).updateJournalPublicationById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.JournalPublicationController", "updateJournalPublicationById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """journalPublication/updateJournalPublication/id/$id<[^/]+>"""))
        

// @LINE:122
private[this] lazy val controllers_JournalPublicationController_deleteJournalPublicationById80_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("journalPublication/deleteJournalPublication/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_JournalPublicationController_deleteJournalPublicationById80_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).deleteJournalPublicationById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.JournalPublicationController", "deleteJournalPublicationById", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """journalPublication/deleteJournalPublication/id/$id<[^/]+>"""))
        

// @LINE:125
private[this] lazy val controllers_BookPublicationController_getAllBookPublications81_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("BookPublication/getAllBookPublications/json"))))
private[this] lazy val controllers_BookPublicationController_getAllBookPublications81_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).getAllBookPublications(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BookPublicationController", "getAllBookPublications", Seq(classOf[String]),"GET", """ BookPublication""", Routes.prefix + """BookPublication/getAllBookPublications/json"""))
        

// @LINE:126
private[this] lazy val controllers_BookPublicationController_getBookPublicationById82_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("BookPublication/getBookPublication/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_BookPublicationController_getBookPublicationById82_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).getBookPublicationById(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BookPublicationController", "getBookPublicationById", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """BookPublication/getBookPublication/id/$id<[^/]+>/json"""))
        

// @LINE:127
private[this] lazy val controllers_BookPublicationController_addBookPublication83_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("BookPublication/addBookPublication"))))
private[this] lazy val controllers_BookPublicationController_addBookPublication83_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).addBookPublication,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BookPublicationController", "addBookPublication", Nil,"POST", """""", Routes.prefix + """BookPublication/addBookPublication"""))
        

// @LINE:128
private[this] lazy val controllers_BookPublicationController_updateBookPublicationById84_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("BookPublication/updateBookPublication/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_BookPublicationController_updateBookPublicationById84_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).updateBookPublicationById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BookPublicationController", "updateBookPublicationById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """BookPublication/updateBookPublication/id/$id<[^/]+>"""))
        

// @LINE:129
private[this] lazy val controllers_BookPublicationController_deleteBookPublicationById85_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("BookPublication/deleteBookPublication/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_BookPublicationController_deleteBookPublicationById85_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).deleteBookPublicationById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BookPublicationController", "deleteBookPublicationById", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """BookPublication/deleteBookPublication/id/$id<[^/]+>"""))
        

// @LINE:132
private[this] lazy val controllers_BookChapterPublicationController_getAllBookChapterPublications86_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("BookChapterPublication/getAllBookPublications/json"))))
private[this] lazy val controllers_BookChapterPublicationController_getAllBookChapterPublications86_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).getAllBookChapterPublications(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BookChapterPublicationController", "getAllBookChapterPublications", Seq(classOf[String]),"GET", """ BookChapterPublication""", Routes.prefix + """BookChapterPublication/getAllBookPublications/json"""))
        

// @LINE:133
private[this] lazy val controllers_BookChapterPublicationController_getBookChapterPublication87_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("BookChapterPublication/getBookPublication/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_BookChapterPublicationController_getBookChapterPublication87_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).getBookChapterPublication(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BookChapterPublicationController", "getBookChapterPublication", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """BookChapterPublication/getBookPublication/id/$id<[^/]+>/json"""))
        

// @LINE:134
private[this] lazy val controllers_BookChapterPublicationController_addBookChapterPublication88_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("BookChapterPublication/addBookPublication"))))
private[this] lazy val controllers_BookChapterPublicationController_addBookChapterPublication88_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).addBookChapterPublication,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BookChapterPublicationController", "addBookChapterPublication", Nil,"POST", """""", Routes.prefix + """BookChapterPublication/addBookPublication"""))
        

// @LINE:135
private[this] lazy val controllers_BookChapterPublicationController_updateBookChapterPublication89_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("BookChapterPublication/updateBookPublication/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_BookChapterPublicationController_updateBookChapterPublication89_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).updateBookChapterPublication(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BookChapterPublicationController", "updateBookChapterPublication", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """BookChapterPublication/updateBookPublication/id/$id<[^/]+>"""))
        

// @LINE:136
private[this] lazy val controllers_BookChapterPublicationController_deleteBookChapterPublication90_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("BookChapterPublication/deleteBookPublication/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_BookChapterPublicationController_deleteBookChapterPublication90_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).deleteBookChapterPublication(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BookChapterPublicationController", "deleteBookChapterPublication", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """BookChapterPublication/deleteBookPublication/id/$id<[^/]+>"""))
        

// @LINE:139
private[this] lazy val controllers_ConferencePublicationController_getAllConferencePublications91_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ConferencePublication/getAllBookPublications/json"))))
private[this] lazy val controllers_ConferencePublicationController_getAllConferencePublications91_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).getAllConferencePublications(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ConferencePublicationController", "getAllConferencePublications", Seq(classOf[String]),"GET", """ ConferencePublication""", Routes.prefix + """ConferencePublication/getAllBookPublications/json"""))
        

// @LINE:140
private[this] lazy val controllers_ConferencePublicationController_getConferencePublication92_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ConferencePublication/getBookPublication/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_ConferencePublicationController_getConferencePublication92_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).getConferencePublication(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ConferencePublicationController", "getConferencePublication", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """ConferencePublication/getBookPublication/id/$id<[^/]+>/json"""))
        

// @LINE:141
private[this] lazy val controllers_ConferencePublicationController_addConferencePublication93_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ConferencePublication/addBookPublication"))))
private[this] lazy val controllers_ConferencePublicationController_addConferencePublication93_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).addConferencePublication,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ConferencePublicationController", "addConferencePublication", Nil,"POST", """""", Routes.prefix + """ConferencePublication/addBookPublication"""))
        

// @LINE:142
private[this] lazy val controllers_ConferencePublicationController_updateConferencePublication94_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ConferencePublication/updateBookPublication/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ConferencePublicationController_updateConferencePublication94_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).updateConferencePublication(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ConferencePublicationController", "updateConferencePublication", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """ConferencePublication/updateBookPublication/id/$id<[^/]+>"""))
        

// @LINE:143
private[this] lazy val controllers_ConferencePublicationController_deleteConferencePublication95_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ConferencePublication/deleteBookPublication/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ConferencePublicationController_deleteConferencePublication95_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).deleteConferencePublication(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ConferencePublicationController", "deleteConferencePublication", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """ConferencePublication/deleteBookPublication/id/$id<[^/]+>"""))
        

// @LINE:160
private[this] lazy val controllers_AnalyticsController_getOneUserWithAllDatasetAndCount96_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("analytics/getOneUserWithAllDatasetAndCountByUserId/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_AnalyticsController_getOneUserWithAllDatasetAndCount96_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AnalyticsController]).getOneUserWithAllDatasetAndCount(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getOneUserWithAllDatasetAndCount", Seq(classOf[Long], classOf[String]),"GET", """ Analytics
GET		  /analytics/getAllDatasetAndUserWithCount/json											    @controllers.AnalyticsController.getAllDatasetAndUserWithCount(format: String="json")
GET		  /analytics/getAllServiceAndUserWithCount/json											    @controllers.AnalyticsController.getAllServiceAndUserWithCount(format: String="json")
GET		  /analytics/getAllServiceAndDatasetWithCount/json											@controllers.AnalyticsController.getAllServiceAndDatasetWithCount(format: String="json")""", Routes.prefix + """analytics/getOneUserWithAllDatasetAndCountByUserId/$id<[^/]+>/json"""))
        

// @LINE:161
private[this] lazy val controllers_AnalyticsController_getOneDatasetWithAllUserAndCount97_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("analytics/getOneDatasetWithAllUserAndCountByDatasetId/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_AnalyticsController_getOneDatasetWithAllUserAndCount97_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AnalyticsController]).getOneDatasetWithAllUserAndCount(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getOneDatasetWithAllUserAndCount", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """analytics/getOneDatasetWithAllUserAndCountByDatasetId/$id<[^/]+>/json"""))
        

// @LINE:162
private[this] lazy val controllers_AnalyticsController_getOneUserWithAllServiceAndCount98_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("analytics/getOneUserWithAllServiceAndCountByUserId/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_AnalyticsController_getOneUserWithAllServiceAndCount98_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AnalyticsController]).getOneUserWithAllServiceAndCount(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getOneUserWithAllServiceAndCount", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """analytics/getOneUserWithAllServiceAndCountByUserId/$id<[^/]+>/json"""))
        

// @LINE:163
private[this] lazy val controllers_AnalyticsController_getOneServiceWithAllUserAndCount99_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("analytics/getOneServiceWithAllUserAndCountByServiceId/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_AnalyticsController_getOneServiceWithAllUserAndCount99_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AnalyticsController]).getOneServiceWithAllUserAndCount(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getOneServiceWithAllUserAndCount", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """analytics/getOneServiceWithAllUserAndCountByServiceId/$id<[^/]+>/json"""))
        

// @LINE:164
private[this] lazy val controllers_AnalyticsController_getOneServiceWithAllDatasetAndCount100_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("analytics/getOneServiceWithAllDatasetAndCountByServiceId/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_AnalyticsController_getOneServiceWithAllDatasetAndCount100_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AnalyticsController]).getOneServiceWithAllDatasetAndCount(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getOneServiceWithAllDatasetAndCount", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """analytics/getOneServiceWithAllDatasetAndCountByServiceId/$id<[^/]+>/json"""))
        

// @LINE:165
private[this] lazy val controllers_AnalyticsController_getOneDatasetWithAllServiceAndCount101_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("analytics/getOneDatasetWithAllServiceAndCountByDatasetId/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_AnalyticsController_getOneDatasetWithAllServiceAndCount101_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AnalyticsController]).getOneDatasetWithAllServiceAndCount(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getOneDatasetWithAllServiceAndCount", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """analytics/getOneDatasetWithAllServiceAndCountByDatasetId/$id<[^/]+>/json"""))
        

// @LINE:166
private[this] lazy val controllers_AnalyticsController_getRelationalKnowledgeGraph102_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("analytics/getRelationalKnowledgeGraph/json"))))
private[this] lazy val controllers_AnalyticsController_getRelationalKnowledgeGraph102_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AnalyticsController]).getRelationalKnowledgeGraph(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getRelationalKnowledgeGraph", Seq(classOf[String]),"POST", """""", Routes.prefix + """analytics/getRelationalKnowledgeGraph/json"""))
        

// @LINE:169
private[this] lazy val controllers_UtilController_updatePicture103_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("util/uploadPicture"))))
private[this] lazy val controllers_UtilController_updatePicture103_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UtilController]).updatePicture,
HandlerDef(this.getClass.getClassLoader, "", "controllers.UtilController", "updatePicture", Nil,"POST", """ Util""", Routes.prefix + """util/uploadPicture"""))
        

// @LINE:172
private[this] lazy val controllers_GraphAlgorithmController_getShortestPath104_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("graphAlgorithm/getShortestPath/source/"),DynamicPart("source", """[^/]+""",true),StaticPart("/target/"),DynamicPart("target", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_GraphAlgorithmController_getShortestPath104_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GraphAlgorithmController]).getShortestPath(fakeValue[Integer], fakeValue[Integer], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.GraphAlgorithmController", "getShortestPath", Seq(classOf[Integer], classOf[Integer], classOf[String]),"GET", """ Graph Algorithm""", Routes.prefix + """graphAlgorithm/getShortestPath/source/$source<[^/]+>/target/$target<[^/]+>/json"""))
        

// @LINE:173
private[this] lazy val controllers_GraphAlgorithmController_getKShortestPath105_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("graphAlgorithm/getKthShortestPath/source/"),DynamicPart("source", """[^/]+""",true),StaticPart("/target/"),DynamicPart("target", """[^/]+""",true),StaticPart("/k/"),DynamicPart("k", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_GraphAlgorithmController_getKShortestPath105_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GraphAlgorithmController]).getKShortestPath(fakeValue[Integer], fakeValue[Integer], fakeValue[Integer], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.GraphAlgorithmController", "getKShortestPath", Seq(classOf[Integer], classOf[Integer], classOf[Integer], classOf[String]),"GET", """""", Routes.prefix + """graphAlgorithm/getKthShortestPath/source/$source<[^/]+>/target/$target<[^/]+>/k/$k<[^/]+>/json"""))
        

// @LINE:176
private[this] lazy val controllers_UserRecommendationController_getKSimilarUsers106_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("recommendation/getTopKSimilarUsersById/"),DynamicPart("id", """[^/]+""",true),StaticPart("/k/"),DynamicPart("k", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_UserRecommendationController_getKSimilarUsers106_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserRecommendationController]).getKSimilarUsers(fakeValue[Long], fakeValue[Integer], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserRecommendationController", "getKSimilarUsers", Seq(classOf[Long], classOf[Integer], classOf[String]),"GET", """ Recomendation Algorithm""", Routes.prefix + """recommendation/getTopKSimilarUsersById/$id<[^/]+>/k/$k<[^/]+>/json"""))
        

// @LINE:179
private[this] lazy val controllers_Assets_at107_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at107_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:184
private[this] lazy val controllers_UserController_deleteUser108_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/delete/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UserController_deleteUser108_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUser(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "deleteUser", Seq(classOf[Long]),"DELETE", """Merged from team 15&16
 Users""", Routes.prefix + """users/delete/$id<[^/]+>"""))
        

// @LINE:185
private[this] lazy val controllers_UserController_getAllUsers109_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/getAllUsers/json"))))
private[this] lazy val controllers_UserController_getAllUsers109_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getAllUsers(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getAllUsers", Seq(classOf[String]),"GET", """""", Routes.prefix + """users/getAllUsers/json"""))
        

// @LINE:186
private[this] lazy val controllers_UserController_deleteUserByUserNameandPassword110_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/delete/userName/"),DynamicPart("userName", """[^/]+""",true),StaticPart("/password/"),DynamicPart("password", """[^/]+""",true))))
private[this] lazy val controllers_UserController_deleteUserByUserNameandPassword110_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUserByUserNameandPassword(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "deleteUserByUserNameandPassword", Seq(classOf[String], classOf[String]),"DELETE", """""", Routes.prefix + """users/delete/userName/$userName<[^/]+>/password/$password<[^/]+>"""))
        

// @LINE:188
private[this] lazy val controllers_UserController_userRegister111_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/register"))))
private[this] lazy val controllers_UserController_userRegister111_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userRegister,
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "userRegister", Nil,"POST", """""", Routes.prefix + """users/register"""))
        

// @LINE:189
private[this] lazy val controllers_UserController_userLogin112_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/login"))))
private[this] lazy val controllers_UserController_userLogin112_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userLogin,
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "userLogin", Nil,"POST", """""", Routes.prefix + """users/login"""))
        

// @LINE:191
private[this] lazy val controllers_UserController_userSearch113_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/search/"),DynamicPart("display_name", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_UserController_userSearch113_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userSearch(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "userSearch", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """users/search/$display_name<[^/]+>/json"""))
        

// @LINE:193
private[this] lazy val controllers_UserController_setProfile114_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/setprofile/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UserController_setProfile114_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).setProfile(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "setProfile", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """users/setprofile/$id<[^/]+>"""))
        

// @LINE:194
private[this] lazy val controllers_UserController_getProfile115_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/getprofile/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_UserController_getProfile115_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getProfile(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getProfile", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """users/getprofile/$id<[^/]+>/json"""))
        

// @LINE:196
private[this] lazy val controllers_UserController_userFollow116_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/follow/followerId/"),DynamicPart("followerId", """[^/]+""",true),StaticPart("/followeeId/"),DynamicPart("followeeId", """[^/]+""",true))))
private[this] lazy val controllers_UserController_userFollow116_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userFollow(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "userFollow", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """users/follow/followerId/$followerId<[^/]+>/followeeId/$followeeId<[^/]+>"""))
        

// @LINE:197
private[this] lazy val controllers_UserController_userUnfollow117_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/unfollow/followerId/"),DynamicPart("followerId", """[^/]+""",true),StaticPart("/followeeId/"),DynamicPart("followeeId", """[^/]+""",true))))
private[this] lazy val controllers_UserController_userUnfollow117_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userUnfollow(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "userUnfollow", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """users/unfollow/followerId/$followerId<[^/]+>/followeeId/$followeeId<[^/]+>"""))
        

// @LINE:198
private[this] lazy val controllers_UserController_getFollowers118_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/getFollowers/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UserController_getFollowers118_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getFollowers(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getFollowers", Seq(classOf[Long]),"GET", """""", Routes.prefix + """users/getFollowers/$id<[^/]+>"""))
        

// @LINE:199
private[this] lazy val controllers_UserController_getFollowees119_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/getFollowees/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UserController_getFollowees119_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getFollowees(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getFollowees", Seq(classOf[Long]),"GET", """""", Routes.prefix + """users/getFollowees/$id<[^/]+>"""))
        

// @LINE:201
private[this] lazy val controllers_UserController_sendFriendRequest120_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/sendFriendRequest/sender/"),DynamicPart("senderId", """[^/]+""",true),StaticPart("/receiver/"),DynamicPart("receiverId", """[^/]+""",true))))
private[this] lazy val controllers_UserController_sendFriendRequest120_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).sendFriendRequest(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "sendFriendRequest", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """users/sendFriendRequest/sender/$senderId<[^/]+>/receiver/$receiverId<[^/]+>"""))
        

// @LINE:202
private[this] lazy val controllers_UserController_getFriendRequests121_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/getFriendRequests/userId/"),DynamicPart("userId", """[^/]+""",true))))
private[this] lazy val controllers_UserController_getFriendRequests121_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getFriendRequests(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getFriendRequests", Seq(classOf[Long]),"GET", """""", Routes.prefix + """users/getFriendRequests/userId/$userId<[^/]+>"""))
        

// @LINE:203
private[this] lazy val controllers_UserController_acceptFriendRequest122_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/acceptFriendRequest/userId/"),DynamicPart("userId", """[^/]+""",true),StaticPart("/sender/"),DynamicPart("senderId", """[^/]+""",true))))
private[this] lazy val controllers_UserController_acceptFriendRequest122_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).acceptFriendRequest(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "acceptFriendRequest", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """users/acceptFriendRequest/userId/$userId<[^/]+>/sender/$senderId<[^/]+>"""))
        

// @LINE:204
private[this] lazy val controllers_UserController_rejectFriendRequest123_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/rejectFriendRequest/userId/"),DynamicPart("userId", """[^/]+""",true),StaticPart("/sender/"),DynamicPart("senderId", """[^/]+""",true))))
private[this] lazy val controllers_UserController_rejectFriendRequest123_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).rejectFriendRequest(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "rejectFriendRequest", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """users/rejectFriendRequest/userId/$userId<[^/]+>/sender/$senderId<[^/]+>"""))
        

// @LINE:205
private[this] lazy val controllers_UserController_getFriends124_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/getFriends/userId/"),DynamicPart("userId", """[^/]+""",true))))
private[this] lazy val controllers_UserController_getFriends124_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getFriends(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getFriends", Seq(classOf[Long]),"GET", """""", Routes.prefix + """users/getFriends/userId/$userId<[^/]+>"""))
        

// @LINE:206
private[this] lazy val controllers_UserController_deleteFriend125_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/deleteFriend/userId/"),DynamicPart("userId", """[^/]+""",true),StaticPart("/friendId/"),DynamicPart("friendId", """[^/]+""",true))))
private[this] lazy val controllers_UserController_deleteFriend125_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteFriend(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "deleteFriend", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """users/deleteFriend/userId/$userId<[^/]+>/friendId/$friendId<[^/]+>"""))
        

// @LINE:210
private[this] lazy val controllers_WorkflowController_post126_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/post"))))
private[this] lazy val controllers_WorkflowController_post126_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).post,
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "post", Nil,"POST", """ Workflow""", Routes.prefix + """workflow/post"""))
        

// @LINE:211
private[this] lazy val controllers_WorkflowController_updateWorkflow127_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/updateWorkflow"))))
private[this] lazy val controllers_WorkflowController_updateWorkflow127_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).updateWorkflow,
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "updateWorkflow", Nil,"POST", """""", Routes.prefix + """workflow/updateWorkflow"""))
        

// @LINE:212
private[this] lazy val controllers_WorkflowController_deleteWorkflow128_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/deleteWorkflow"))))
private[this] lazy val controllers_WorkflowController_deleteWorkflow128_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).deleteWorkflow,
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "deleteWorkflow", Nil,"POST", """""", Routes.prefix + """workflow/deleteWorkflow"""))
        

// @LINE:213
private[this] lazy val controllers_WorkflowController_get129_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/get/workflowID/"),DynamicPart("wfID", """[^/]+""",true),StaticPart("/userID/"),DynamicPart("userID", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_WorkflowController_get129_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).get(fakeValue[Long], fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "get", Seq(classOf[Long], classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """workflow/get/workflowID/$wfID<[^/]+>/userID/$userID<[^/]+>/json"""))
        

// @LINE:214
private[this] lazy val controllers_WorkflowController_getTimeLine130_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getTimeline/"),DynamicPart("id", """[^/]+""",true),StaticPart("/offset/"),DynamicPart("offset", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_WorkflowController_getTimeLine130_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTimeLine(fakeValue[Long], fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getTimeLine", Seq(classOf[Long], classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """workflow/getTimeline/$id<[^/]+>/offset/$offset<[^/]+>/json"""))
        

// @LINE:215
private[this] lazy val controllers_WorkflowController_getWorkflowList131_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getWorkflowList/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_WorkflowController_getWorkflowList131_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getWorkflowList(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getWorkflowList", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """workflow/getWorkflowList/$id<[^/]+>/json"""))
        

// @LINE:216
private[this] lazy val controllers_WorkflowController_uploadImage132_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/uploadImage/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_uploadImage132_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).uploadImage(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "uploadImage", Seq(classOf[Long]),"POST", """""", Routes.prefix + """workflow/uploadImage/$id<[^/]+>"""))
        

// @LINE:217
private[this] lazy val controllers_WorkflowController_getPublicWorkflow133_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getPublicWorkflow/json"))))
private[this] lazy val controllers_WorkflowController_getPublicWorkflow133_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getPublicWorkflow(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getPublicWorkflow", Seq(classOf[String]),"GET", """""", Routes.prefix + """workflow/getPublicWorkflow/json"""))
        

// @LINE:219
private[this] lazy val controllers_WorkflowController_getTags134_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getTags/workflowId/"),DynamicPart("wfId", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_getTags134_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTags(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getTags", Seq(classOf[Long]),"GET", """""", Routes.prefix + """workflow/getTags/workflowId/$wfId<[^/]+>"""))
        

// @LINE:220
private[this] lazy val controllers_WorkflowController_setTag135_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/setTag"))))
private[this] lazy val controllers_WorkflowController_setTag135_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).setTag,
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "setTag", Nil,"POST", """""", Routes.prefix + """workflow/setTag"""))
        

// @LINE:221
private[this] lazy val controllers_WorkflowController_deleteTag136_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/deleteTag/workflowId/"),DynamicPart("wfId", """[^/]+""",true),StaticPart("/tag/"),DynamicPart("tag", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_deleteTag136_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).deleteTag(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "deleteTag", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """workflow/deleteTag/workflowId/$wfId<[^/]+>/tag/$tag<[^/]+>"""))
        

// @LINE:222
private[this] lazy val controllers_WorkflowController_getByTag137_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getByTag/tag/"),DynamicPart("tag", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_getByTag137_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getByTag(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getByTag", Seq(classOf[String]),"GET", """""", Routes.prefix + """workflow/getByTag/tag/$tag<[^/]+>"""))
        

// @LINE:223
private[this] lazy val controllers_WorkflowController_getByTitle138_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getByTitle/title/"),DynamicPart("title", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_getByTitle138_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getByTitle(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getByTitle", Seq(classOf[String]),"GET", """""", Routes.prefix + """workflow/getByTitle/title/$title<[^/]+>"""))
        

// @LINE:224
private[this] lazy val controllers_WorkflowController_getTop3WorkFlow139_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getTop3WorkFlow"))))
private[this] lazy val controllers_WorkflowController_getTop3WorkFlow139_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTop3WorkFlow(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getTop3WorkFlow", Nil,"GET", """""", Routes.prefix + """workflow/getTop3WorkFlow"""))
        

// @LINE:227
private[this] lazy val controllers_MailController_sendMail140_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mail/sendMail"))))
private[this] lazy val controllers_MailController_sendMail140_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.MailController]).sendMail,
HandlerDef(this.getClass.getClassLoader, "", "controllers.MailController", "sendMail", Nil,"POST", """ Mail""", Routes.prefix + """mail/sendMail"""))
        

// @LINE:228
private[this] lazy val controllers_MailController_readMail141_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mail/getMailDetail/mailId/"),DynamicPart("mailId", """[^/]+""",true))))
private[this] lazy val controllers_MailController_readMail141_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.MailController]).readMail(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.MailController", "readMail", Seq(classOf[Long]),"GET", """""", Routes.prefix + """mail/getMailDetail/mailId/$mailId<[^/]+>"""))
        

// @LINE:229
private[this] lazy val controllers_MailController_getInbox142_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mail/getInbox/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_MailController_getInbox142_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.MailController]).getInbox(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.MailController", "getInbox", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """mail/getInbox/$id<[^/]+>/json"""))
        

// @LINE:230
private[this] lazy val controllers_MailController_getOutbox143_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mail/getOutbox/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_MailController_getOutbox143_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.MailController]).getOutbox(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.MailController", "getOutbox", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """mail/getOutbox/$id<[^/]+>/json"""))
        

// @LINE:233
private[this] lazy val controllers_SuggestionsController_publishSuggestion144_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suggestion/publishSuggestion"))))
private[this] lazy val controllers_SuggestionsController_publishSuggestion144_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SuggestionsController]).publishSuggestion,
HandlerDef(this.getClass.getClassLoader, "", "controllers.SuggestionsController", "publishSuggestion", Nil,"POST", """Suggestion""", Routes.prefix + """suggestion/publishSuggestion"""))
        

// @LINE:234
private[this] lazy val controllers_SuggestionsController_addTag145_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suggestion/addTag"))))
private[this] lazy val controllers_SuggestionsController_addTag145_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SuggestionsController]).addTag,
HandlerDef(this.getClass.getClassLoader, "", "controllers.SuggestionsController", "addTag", Nil,"POST", """""", Routes.prefix + """suggestion/addTag"""))
        

// @LINE:235
private[this] lazy val controllers_SuggestionsController_voteToSuggestion146_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suggestion/voteToSuggestion/"),DynamicPart("suggestionId", """[^/]+""",true))))
private[this] lazy val controllers_SuggestionsController_voteToSuggestion146_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SuggestionsController]).voteToSuggestion(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.SuggestionsController", "voteToSuggestion", Seq(classOf[Long]),"GET", """""", Routes.prefix + """suggestion/voteToSuggestion/$suggestionId<[^/]+>"""))
        

// @LINE:236
private[this] lazy val controllers_SuggestionsController_getSuggestionForWorkflow147_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suggestion/getSuggestionForWorkflow/"),DynamicPart("workflowId", """[^/]+""",true))))
private[this] lazy val controllers_SuggestionsController_getSuggestionForWorkflow147_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SuggestionsController]).getSuggestionForWorkflow(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.SuggestionsController", "getSuggestionForWorkflow", Seq(classOf[Long]),"GET", """""", Routes.prefix + """suggestion/getSuggestionForWorkflow/$workflowId<[^/]+>"""))
        

// @LINE:240
private[this] lazy val controllers_TagController_createTag148_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/createTag"))))
private[this] lazy val controllers_TagController_createTag148_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.TagController]).createTag,
HandlerDef(this.getClass.getClassLoader, "", "controllers.TagController", "createTag", Nil,"POST", """ Tag
input:String tag""", Routes.prefix + """tag/createTag"""))
        

// @LINE:241
private[this] lazy val controllers_TagController_deleteTag149_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/deleteTag"))))
private[this] lazy val controllers_TagController_deleteTag149_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.TagController]).deleteTag,
HandlerDef(this.getClass.getClassLoader, "", "controllers.TagController", "deleteTag", Nil,"POST", """""", Routes.prefix + """tag/deleteTag"""))
        

// @LINE:245
private[this] lazy val controllers_GroupUsersController_createGroup150_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("group/createGroup"))))
private[this] lazy val controllers_GroupUsersController_createGroup150_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GroupUsersController]).createGroup,
HandlerDef(this.getClass.getClassLoader, "", "controllers.GroupUsersController", "createGroup", Nil,"POST", """Group""", Routes.prefix + """group/createGroup"""))
        

// @LINE:246
private[this] lazy val controllers_GroupUsersController_addMembersToGroup151_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("group/addMembersToGroup"))))
private[this] lazy val controllers_GroupUsersController_addMembersToGroup151_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GroupUsersController]).addMembersToGroup,
HandlerDef(this.getClass.getClassLoader, "", "controllers.GroupUsersController", "addMembersToGroup", Nil,"POST", """""", Routes.prefix + """group/addMembersToGroup"""))
        

// @LINE:247
private[this] lazy val controllers_GroupUsersController_getGroupList152_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("group/getGroupList/"),DynamicPart("userID", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_GroupUsersController_getGroupList152_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GroupUsersController]).getGroupList(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.GroupUsersController", "getGroupList", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """group/getGroupList/$userID<[^/]+>/json"""))
        

// @LINE:248
private[this] lazy val controllers_GroupUsersController_getGroupMember153_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("group/getGroupMember/"),DynamicPart("groupId", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_GroupUsersController_getGroupMember153_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GroupUsersController]).getGroupMember(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.GroupUsersController", "getGroupMember", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """group/getGroupMember/$groupId<[^/]+>/json"""))
        

// @LINE:252
private[this] lazy val controllers_WorkflowController_addComment154_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/addComment"))))
private[this] lazy val controllers_WorkflowController_addComment154_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).addComment,
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "addComment", Nil,"POST", """Workflow
GET            /workflow/getTimeline/:id/offset/:offset/json                                              @controllers.UserController.userSearch(id: Long, offset: Long, format: String="json")""", Routes.prefix + """workflow/addComment"""))
        

// @LINE:253
private[this] lazy val controllers_WorkflowController_getComments155_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getComments/"),DynamicPart("workflowId", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_getComments155_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getComments(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getComments", Seq(classOf[Long]),"GET", """""", Routes.prefix + """workflow/getComments/$workflowId<[^/]+>"""))
        

// @LINE:256
private[this] lazy val controllers_CommentController_addReply156_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Comment/addReply"))))
private[this] lazy val controllers_CommentController_addReply156_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).addReply,
HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "addReply", Nil,"POST", """Comment""", Routes.prefix + """Comment/addReply"""))
        

// @LINE:257
private[this] lazy val controllers_CommentController_getReply157_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Comment/getReply/"),DynamicPart("commentId", """[^/]+""",true))))
private[this] lazy val controllers_CommentController_getReply157_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).getReply(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "getReply", Seq(classOf[Long]),"GET", """""", Routes.prefix + """Comment/getReply/$commentId<[^/]+>"""))
        

// @LINE:258
private[this] lazy val controllers_CommentController_getReply158_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Comment/getReply/"),DynamicPart("commentId", """[^/]+""",true))))
private[this] lazy val controllers_CommentController_getReply158_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).getReply(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "getReply", Seq(classOf[Long]),"GET", """""", Routes.prefix + """Comment/getReply/$commentId<[^/]+>"""))
        

// @LINE:259
private[this] lazy val controllers_CommentController_thumbUp159_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Comment/thumbUp/"),DynamicPart("commentId", """[^/]+""",true))))
private[this] lazy val controllers_CommentController_thumbUp159_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).thumbUp(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "thumbUp", Seq(classOf[Long]),"GET", """""", Routes.prefix + """Comment/thumbUp/$commentId<[^/]+>"""))
        

// @LINE:260
private[this] lazy val controllers_CommentController_thumbDown160_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Comment/thumbDown/"),DynamicPart("commentId", """[^/]+""",true))))
private[this] lazy val controllers_CommentController_thumbDown160_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).thumbDown(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "thumbDown", Seq(classOf[Long]),"GET", """""", Routes.prefix + """Comment/thumbDown/$commentId<[^/]+>"""))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getClimateService/$name<[^/]+>/json""","""@controllers.ClimateServiceController@.getClimateService(name:String, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getClimateService/id/$id<[^/]+>""","""@controllers.ClimateServiceController@.getClimateServiceById(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getAllClimateServices/json""","""@controllers.ClimateServiceController@.getAllClimateServices(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getAllMostRecentClimateServicesByCreateTime/json""","""@controllers.ClimateServiceController@.getAllClimateServicesOrderByCreateTime(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getAllMostRecentClimateServicesByLatestAccessTime/json""","""@controllers.ClimateServiceController@.getAllClimateServicesOrderByLatestAccessTime(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getAllMostUsedClimateServices/json""","""@controllers.ClimateServiceController@.getAllClimateServicesOrderByCount(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getTopKUsedClimateServicesByDatasetId/$id<[^/]+>""","""@controllers.ClimateServiceController@.getTopKUsedClimateServicesByDatasetId(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/addClimateService""","""@controllers.ClimateServiceController@.addClimateService"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/queryClimateService""","""@controllers.ClimateServiceController@.queryClimateServices"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getAllServiceEntries/json""","""@controllers.ClimateServiceController@.getAllServiceEntries(format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/addServiceEntry""","""@controllers.ClimateServiceController@.addServiceEntry"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/updateClimateService/id/$id<[^/]+>""","""@controllers.ClimateServiceController@.updateClimateServiceById(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/updateClimateService/name/$oldName<[^/]+>""","""@controllers.ClimateServiceController@.updateClimateServiceByName(oldName:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/deleteClimateService/id/$id<[^/]+>""","""@controllers.ClimateServiceController@.deleteClimateServiceById(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/deleteClimateService/name/$name<[^/]+>""","""@controllers.ClimateServiceController@.deleteClimateServiceByName(name:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/savePage""","""@controllers.ClimateServiceController@.savePage"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugReport/getBugReport/id/$id<[^/]+>""","""@controllers.BugReportController@.getBugReport(id:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugReport/getAllBugReports/json""","""@controllers.BugReportController@.getAllBugReports"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugReport/getAllUnsolvedBugReports/json""","""@controllers.BugReportController@.getAllUnsolvedBugReports"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugReport/getAllSolvedBugReports/json""","""@controllers.BugReportController@.getAllSolvedBugReports"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugReport/addBugReport""","""@controllers.BugReportController@.addBugReport"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugReport/updateBugReport/id/$id<[^/]+>""","""@controllers.BugReportController@.updateBugReportById(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugReport/deleteBugReport/id/$id<[^/]+>""","""@controllers.BugReportController@.deleteBugReport(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateServiceComment/getComment/$id<[^/]+>/$email<[^/]+>/json""","""@controllers.ClimateServiceCommentController@.getComment(id:Long, email:String, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateServiceComment/searchCommentByHashTag/$hashTag<[^/]+>""","""@controllers.ClimateServiceCommentController@.searchCommentByHashTag(hashTag:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateServiceComment/getMentions/$email<[^/]+>""","""@controllers.ClimateServiceCommentController@.getMentions(email:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateServiceComment/postComment""","""@controllers.ClimateServiceCommentController@.postComment"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateServiceComment/editComment""","""@controllers.ClimateServiceCommentController@.editComment"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateServiceComment/deleteComment/$service_id<[^/]+>/$comment_id<[^/]+>""","""@controllers.ClimateServiceCommentController@.deleteComment(service_id:Long, comment_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceConfiguration/getServiceConfiguration/id/$id<[^/]+>/json""","""@controllers.ServiceConfigurationController@.getServiceConfiguration(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceConfiguration/addServiceConfiguration""","""@controllers.ServiceConfigurationController@.addServiceConfiguration"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceConfiguration/updateServiceConfiguration/id/$id<[^/]+>""","""@controllers.ServiceConfigurationController@.updateServiceConfigurationById(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceConfiguration/deleteServiceConfiguration/$id<[^/]+>""","""@controllers.ServiceConfigurationController@.deleteServiceConfiguration(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceConfiguration/getAllServiceConfigurationsByUserId/$userId<[^/]+>/json""","""@controllers.ServiceConfigurationController@.getServiceConfigurationsByUser(userId:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceConfigurationItem/serviceConfigurationItemById/$id<[^/]+>""","""@controllers.ServiceConfigurationItemController@.getServiceConfigurationItemById(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceConfigurationItem/serviceConfigurationItemByServiceConfig/$serviceConfigId<[^/]+>""","""@controllers.ServiceConfigurationItemController@.getServiceConfigurationItemsInServiceConfig(serviceConfigId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceConfigurationItem/serviceConfigurationItemByParamId/$paramId<[^/]+>""","""@controllers.ServiceConfigurationItemController@.getServiceConfigurationItemByParameterId(paramId:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceConfigurationItem/addServiceConfigurationItem""","""@controllers.ServiceConfigurationItemController@.addServiceConfigurationItem"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceConfigurationItem/updateServiceConfigurationItem/id/$id<[^/]+>""","""@controllers.ServiceConfigurationItemController@.updateServiceConfigurationItemById(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceConfigurationItem/deleteServiceConfigurationItemById/$id<[^/]+>""","""@controllers.ServiceConfigurationItemController@.deleteServiceConfigurationItemById(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceExecutionLog/getAllServiceExecutionLog""","""@controllers.ServiceExecutionLogController@.getAllServiceExecutionLogs(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceExecutionLog/getServiceExecutionLog/$id<[^/]+>""","""@controllers.ServiceExecutionLogController@.getServiceExecutionLog(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceExecutionLog/addServiceExecutionLog""","""@controllers.ServiceExecutionLogController@.addServiceExecutionLog()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceExecutionLog/queryExecutionLogsByUser""","""@controllers.ServiceExecutionLogController@.queryExecutionLogsByUser()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceExecutionLog/queryServiceExecutionLogs""","""@controllers.ServiceExecutionLogController@.queryServiceExecutionLogs()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceExecutionLog/updateServiceExecutionLogs/$id<[^/]+>""","""@controllers.ServiceExecutionLogController@.updateServiceExecutionLog(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceExecutionLog/deleteServiceExecutionLogs/$id<[^/]+>""","""@controllers.ServiceExecutionLogController@.deleteServiceExecutionLog(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """datasetLog/getAllDatasetLogs/json""","""@controllers.DatasetLogController@.getAllDatasetLogs(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """datasetLog/getDatasetLog/id/$id<[^/]+>/json""","""@controllers.DatasetLogController@.getDatasetLog(id:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """datasetLog/getServiceExecutionLogsByDatasetAndUser/datasetId/$datasetId<[^/]+>/userId/$userId<[^/]+>/json""","""@controllers.DatasetLogController@.getServiceExecutionLogsByDatasetAndUser(userId:Long, datasetId:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """datasetLog/getDatasetLogsByServiceAndUser/serviceId/$serviceId<[^/]+>/userId/$userId<[^/]+>/json""","""@controllers.DatasetLogController@.getDatasetLogsByServiceAndUser(userId:Long, serviceId:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """datasetLog/getUsersByServiceAndDataset/serviceId/$serviceId<[^/]+>/datasetId/$datasetId<[^/]+>/json""","""@controllers.DatasetLogController@.getUsersByServiceAndDataset(serviceId:Long, datasetId:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """datasetLog/addDatasetLog""","""@controllers.DatasetLogController@.addDatasetLog"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """datasetLog/queryDatasets""","""@controllers.DatasetLogController@.queryDatasets"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """datasetLog/queryVariables""","""@controllers.DatasetLogController@.queryVariables"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """datasetLog/updateDatasetLog/id/$id<[^/]+>""","""@controllers.DatasetLogController@.updateDatasetLogById(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """datasetLog/deleteDatasetLog/id/$id<[^/]+>""","""@controllers.DatasetLogController@.deleteDatasetLog(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """instrument/getAllInstruments/json""","""@controllers.InstrumentController@.getAllInstruments(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """instrument/getInstrument/id/$id<[^/]+>/json""","""@controllers.InstrumentController@.getInstrument(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """instrument/addInstrument""","""@controllers.InstrumentController@.addInstrument"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """instrument/updateInstrument/id/$id<[^/]+>""","""@controllers.InstrumentController@.updateInstrumentById(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """instrument/deleteInstrument/id/$id<[^/]+>""","""@controllers.InstrumentController@.deleteInstrument(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataset/getAllDatasets/json""","""@controllers.DatasetController@.getAllDatasets(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataset/getDataset/id/$id<[^/]+>/json""","""@controllers.DatasetController@.getDataset(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataset/addDataset""","""@controllers.DatasetController@.addDataset"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataset/updateDataset/id/$id<[^/]+>""","""@controllers.DatasetController@.updateDatasetById(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataset/deleteDataset/id/$id<[^/]+>""","""@controllers.DatasetController@.deleteDataset(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataset/queryDataset""","""@controllers.DatasetController@.queryDatasets"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataset/getMostKPopularDatasets""","""@controllers.DatasetController@.getMostKPopularDatasets"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/getAllParameters/json""","""@controllers.ParameterController@.getAllParameters(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/getParameter/service/$id<[^/]+>/name/$name<[^/]+>/json""","""@controllers.ParameterController@.getParameterByName(id:Long, name:String, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/getParameter/id/$id<[^/]+>/json""","""@controllers.ParameterController@.getParameterById(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/addParameter""","""@controllers.ParameterController@.addParameter"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/updateParameter/id/$id<[^/]+>""","""@controllers.ParameterController@.updateParameterById(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/updateParameter/name/$oldName<[^/]+>""","""@controllers.ParameterController@.updateParameterByName(oldName:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/deleteParameter/service/$id<[^/]+>/name/$name<[^/]+>""","""@controllers.ParameterController@.deleteParameterByName(id:Long, name:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """journalPublication/getAllJournalPublications/json""","""@controllers.JournalPublicationController@.getAllJournalPublications(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """journalPublication/getJournalPublication/id/$id<[^/]+>/json""","""@controllers.JournalPublicationController@.getJournalPublicationById(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """journalPublication/addJournalPublication""","""@controllers.JournalPublicationController@.addJournalPublication"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """journalPublication/updateJournalPublication/id/$id<[^/]+>""","""@controllers.JournalPublicationController@.updateJournalPublicationById(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """journalPublication/deleteJournalPublication/id/$id<[^/]+>""","""@controllers.JournalPublicationController@.deleteJournalPublicationById(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """BookPublication/getAllBookPublications/json""","""@controllers.BookPublicationController@.getAllBookPublications(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """BookPublication/getBookPublication/id/$id<[^/]+>/json""","""@controllers.BookPublicationController@.getBookPublicationById(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """BookPublication/addBookPublication""","""@controllers.BookPublicationController@.addBookPublication"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """BookPublication/updateBookPublication/id/$id<[^/]+>""","""@controllers.BookPublicationController@.updateBookPublicationById(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """BookPublication/deleteBookPublication/id/$id<[^/]+>""","""@controllers.BookPublicationController@.deleteBookPublicationById(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """BookChapterPublication/getAllBookPublications/json""","""@controllers.BookChapterPublicationController@.getAllBookChapterPublications(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """BookChapterPublication/getBookPublication/id/$id<[^/]+>/json""","""@controllers.BookChapterPublicationController@.getBookChapterPublication(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """BookChapterPublication/addBookPublication""","""@controllers.BookChapterPublicationController@.addBookChapterPublication"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """BookChapterPublication/updateBookPublication/id/$id<[^/]+>""","""@controllers.BookChapterPublicationController@.updateBookChapterPublication(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """BookChapterPublication/deleteBookPublication/id/$id<[^/]+>""","""@controllers.BookChapterPublicationController@.deleteBookChapterPublication(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ConferencePublication/getAllBookPublications/json""","""@controllers.ConferencePublicationController@.getAllConferencePublications(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ConferencePublication/getBookPublication/id/$id<[^/]+>/json""","""@controllers.ConferencePublicationController@.getConferencePublication(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ConferencePublication/addBookPublication""","""@controllers.ConferencePublicationController@.addConferencePublication"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ConferencePublication/updateBookPublication/id/$id<[^/]+>""","""@controllers.ConferencePublicationController@.updateConferencePublication(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ConferencePublication/deleteBookPublication/id/$id<[^/]+>""","""@controllers.ConferencePublicationController@.deleteConferencePublication(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """analytics/getOneUserWithAllDatasetAndCountByUserId/$id<[^/]+>/json""","""@controllers.AnalyticsController@.getOneUserWithAllDatasetAndCount(id:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """analytics/getOneDatasetWithAllUserAndCountByDatasetId/$id<[^/]+>/json""","""@controllers.AnalyticsController@.getOneDatasetWithAllUserAndCount(id:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """analytics/getOneUserWithAllServiceAndCountByUserId/$id<[^/]+>/json""","""@controllers.AnalyticsController@.getOneUserWithAllServiceAndCount(id:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """analytics/getOneServiceWithAllUserAndCountByServiceId/$id<[^/]+>/json""","""@controllers.AnalyticsController@.getOneServiceWithAllUserAndCount(id:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """analytics/getOneServiceWithAllDatasetAndCountByServiceId/$id<[^/]+>/json""","""@controllers.AnalyticsController@.getOneServiceWithAllDatasetAndCount(id:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """analytics/getOneDatasetWithAllServiceAndCountByDatasetId/$id<[^/]+>/json""","""@controllers.AnalyticsController@.getOneDatasetWithAllServiceAndCount(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """analytics/getRelationalKnowledgeGraph/json""","""@controllers.AnalyticsController@.getRelationalKnowledgeGraph(format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """util/uploadPicture""","""@controllers.UtilController@.updatePicture"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """graphAlgorithm/getShortestPath/source/$source<[^/]+>/target/$target<[^/]+>/json""","""@controllers.GraphAlgorithmController@.getShortestPath(source:Integer, target:Integer, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """graphAlgorithm/getKthShortestPath/source/$source<[^/]+>/target/$target<[^/]+>/k/$k<[^/]+>/json""","""@controllers.GraphAlgorithmController@.getKShortestPath(source:Integer, target:Integer, k:Integer, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """recommendation/getTopKSimilarUsersById/$id<[^/]+>/k/$k<[^/]+>/json""","""@controllers.UserRecommendationController@.getKSimilarUsers(id:Long, k:Integer, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/delete/$id<[^/]+>""","""@controllers.UserController@.deleteUser(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/getAllUsers/json""","""@controllers.UserController@.getAllUsers(format:String = "json")"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/delete/userName/$userName<[^/]+>/password/$password<[^/]+>""","""@controllers.UserController@.deleteUserByUserNameandPassword(userName:String, password:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/register""","""@controllers.UserController@.userRegister"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/login""","""@controllers.UserController@.userLogin"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/search/$display_name<[^/]+>/json""","""@controllers.UserController@.userSearch(display_name:String, format:String = "json")"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/setprofile/$id<[^/]+>""","""@controllers.UserController@.setProfile(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/getprofile/$id<[^/]+>/json""","""@controllers.UserController@.getProfile(id:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/follow/followerId/$followerId<[^/]+>/followeeId/$followeeId<[^/]+>""","""@controllers.UserController@.userFollow(followerId:Long, followeeId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/unfollow/followerId/$followerId<[^/]+>/followeeId/$followeeId<[^/]+>""","""@controllers.UserController@.userUnfollow(followerId:Long, followeeId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/getFollowers/$id<[^/]+>""","""@controllers.UserController@.getFollowers(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/getFollowees/$id<[^/]+>""","""@controllers.UserController@.getFollowees(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/sendFriendRequest/sender/$senderId<[^/]+>/receiver/$receiverId<[^/]+>""","""@controllers.UserController@.sendFriendRequest(senderId:Long, receiverId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/getFriendRequests/userId/$userId<[^/]+>""","""@controllers.UserController@.getFriendRequests(userId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/acceptFriendRequest/userId/$userId<[^/]+>/sender/$senderId<[^/]+>""","""@controllers.UserController@.acceptFriendRequest(userId:Long, senderId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/rejectFriendRequest/userId/$userId<[^/]+>/sender/$senderId<[^/]+>""","""@controllers.UserController@.rejectFriendRequest(userId:Long, senderId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/getFriends/userId/$userId<[^/]+>""","""@controllers.UserController@.getFriends(userId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/deleteFriend/userId/$userId<[^/]+>/friendId/$friendId<[^/]+>""","""@controllers.UserController@.deleteFriend(userId:Long, friendId:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/post""","""@controllers.WorkflowController@.post"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/updateWorkflow""","""@controllers.WorkflowController@.updateWorkflow"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/deleteWorkflow""","""@controllers.WorkflowController@.deleteWorkflow"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/get/workflowID/$wfID<[^/]+>/userID/$userID<[^/]+>/json""","""@controllers.WorkflowController@.get(wfID:Long, userID:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getTimeline/$id<[^/]+>/offset/$offset<[^/]+>/json""","""@controllers.WorkflowController@.getTimeLine(id:Long, offset:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getWorkflowList/$id<[^/]+>/json""","""@controllers.WorkflowController@.getWorkflowList(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/uploadImage/$id<[^/]+>""","""@controllers.WorkflowController@.uploadImage(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getPublicWorkflow/json""","""@controllers.WorkflowController@.getPublicWorkflow(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getTags/workflowId/$wfId<[^/]+>""","""@controllers.WorkflowController@.getTags(wfId:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/setTag""","""@controllers.WorkflowController@.setTag"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/deleteTag/workflowId/$wfId<[^/]+>/tag/$tag<[^/]+>""","""@controllers.WorkflowController@.deleteTag(wfId:Long, tag:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getByTag/tag/$tag<[^/]+>""","""@controllers.WorkflowController@.getByTag(tag:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getByTitle/title/$title<[^/]+>""","""@controllers.WorkflowController@.getByTitle(title:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getTop3WorkFlow""","""@controllers.WorkflowController@.getTop3WorkFlow()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mail/sendMail""","""@controllers.MailController@.sendMail"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mail/getMailDetail/mailId/$mailId<[^/]+>""","""@controllers.MailController@.readMail(mailId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mail/getInbox/$id<[^/]+>/json""","""@controllers.MailController@.getInbox(id:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mail/getOutbox/$id<[^/]+>/json""","""@controllers.MailController@.getOutbox(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suggestion/publishSuggestion""","""@controllers.SuggestionsController@.publishSuggestion"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suggestion/addTag""","""@controllers.SuggestionsController@.addTag"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suggestion/voteToSuggestion/$suggestionId<[^/]+>""","""@controllers.SuggestionsController@.voteToSuggestion(suggestionId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suggestion/getSuggestionForWorkflow/$workflowId<[^/]+>""","""@controllers.SuggestionsController@.getSuggestionForWorkflow(workflowId:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/createTag""","""@controllers.TagController@.createTag"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/deleteTag""","""@controllers.TagController@.deleteTag"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """group/createGroup""","""@controllers.GroupUsersController@.createGroup"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """group/addMembersToGroup""","""@controllers.GroupUsersController@.addMembersToGroup"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """group/getGroupList/$userID<[^/]+>/json""","""@controllers.GroupUsersController@.getGroupList(userID:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """group/getGroupMember/$groupId<[^/]+>/json""","""@controllers.GroupUsersController@.getGroupMember(groupId:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/addComment""","""@controllers.WorkflowController@.addComment"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getComments/$workflowId<[^/]+>""","""@controllers.WorkflowController@.getComments(workflowId:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Comment/addReply""","""@controllers.CommentController@.addReply"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Comment/getReply/$commentId<[^/]+>""","""@controllers.CommentController@.getReply(commentId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Comment/getReply/$commentId<[^/]+>""","""@controllers.CommentController@.getReply(commentId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Comment/thumbUp/$commentId<[^/]+>""","""@controllers.CommentController@.thumbUp(commentId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Comment/thumbDown/$commentId<[^/]+>""","""@controllers.CommentController@.thumbDown(commentId:Long)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:10
case controllers_ClimateServiceController_getClimateService0_route(params) => {
   call(params.fromPath[String]("name", None), Param[String]("format", Right("json"))) { (name, format) =>
        controllers_ClimateServiceController_getClimateService0_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateService(name, format))
   }
}
        

// @LINE:11
case controllers_ClimateServiceController_getClimateServiceById1_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClimateServiceController_getClimateServiceById1_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateServiceById(id))
   }
}
        

// @LINE:12
case controllers_ClimateServiceController_getAllClimateServices2_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ClimateServiceController_getAllClimateServices2_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServices(format))
   }
}
        

// @LINE:13
case controllers_ClimateServiceController_getAllClimateServicesOrderByCreateTime3_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ClimateServiceController_getAllClimateServicesOrderByCreateTime3_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCreateTime(format))
   }
}
        

// @LINE:14
case controllers_ClimateServiceController_getAllClimateServicesOrderByLatestAccessTime4_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ClimateServiceController_getAllClimateServicesOrderByLatestAccessTime4_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByLatestAccessTime(format))
   }
}
        

// @LINE:15
case controllers_ClimateServiceController_getAllClimateServicesOrderByCount5_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ClimateServiceController_getAllClimateServicesOrderByCount5_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCount(format))
   }
}
        

// @LINE:16
case controllers_ClimateServiceController_getTopKUsedClimateServicesByDatasetId6_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_ClimateServiceController_getTopKUsedClimateServicesByDatasetId6_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getTopKUsedClimateServicesByDatasetId(id, format))
   }
}
        

// @LINE:17
case controllers_ClimateServiceController_addClimateService7_route(params) => {
   call { 
        controllers_ClimateServiceController_addClimateService7_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addClimateService)
   }
}
        

// @LINE:18
case controllers_ClimateServiceController_queryClimateServices8_route(params) => {
   call { 
        controllers_ClimateServiceController_queryClimateServices8_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).queryClimateServices)
   }
}
        

// @LINE:19
case controllers_ClimateServiceController_getAllServiceEntries9_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ClimateServiceController_getAllServiceEntries9_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllServiceEntries(format))
   }
}
        

// @LINE:20
case controllers_ClimateServiceController_addServiceEntry10_route(params) => {
   call { 
        controllers_ClimateServiceController_addServiceEntry10_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addServiceEntry)
   }
}
        

// @LINE:21
case controllers_ClimateServiceController_updateClimateServiceById11_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClimateServiceController_updateClimateServiceById11_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceById(id))
   }
}
        

// @LINE:22
case controllers_ClimateServiceController_updateClimateServiceByName12_route(params) => {
   call(params.fromPath[String]("oldName", None)) { (oldName) =>
        controllers_ClimateServiceController_updateClimateServiceByName12_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceByName(oldName))
   }
}
        

// @LINE:23
case controllers_ClimateServiceController_deleteClimateServiceById13_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClimateServiceController_deleteClimateServiceById13_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceById(id))
   }
}
        

// @LINE:24
case controllers_ClimateServiceController_deleteClimateServiceByName14_route(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        controllers_ClimateServiceController_deleteClimateServiceByName14_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceByName(name))
   }
}
        

// @LINE:27
case controllers_ClimateServiceController_savePage15_route(params) => {
   call { 
        controllers_ClimateServiceController_savePage15_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).savePage)
   }
}
        

// @LINE:30
case controllers_BugReportController_getBugReport16_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_BugReportController_getBugReport16_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).getBugReport(id, format))
   }
}
        

// @LINE:31
case controllers_BugReportController_getAllBugReports17_route(params) => {
   call { 
        controllers_BugReportController_getAllBugReports17_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).getAllBugReports)
   }
}
        

// @LINE:32
case controllers_BugReportController_getAllUnsolvedBugReports18_route(params) => {
   call { 
        controllers_BugReportController_getAllUnsolvedBugReports18_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).getAllUnsolvedBugReports)
   }
}
        

// @LINE:33
case controllers_BugReportController_getAllSolvedBugReports19_route(params) => {
   call { 
        controllers_BugReportController_getAllSolvedBugReports19_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).getAllSolvedBugReports)
   }
}
        

// @LINE:34
case controllers_BugReportController_addBugReport20_route(params) => {
   call { 
        controllers_BugReportController_addBugReport20_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).addBugReport)
   }
}
        

// @LINE:35
case controllers_BugReportController_updateBugReportById21_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BugReportController_updateBugReportById21_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).updateBugReportById(id))
   }
}
        

// @LINE:36
case controllers_BugReportController_deleteBugReport22_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BugReportController_deleteBugReport22_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).deleteBugReport(id))
   }
}
        

// @LINE:39
case controllers_ClimateServiceCommentController_getComment23_route(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[String]("email", None), Param[String]("format", Right("json"))) { (id, email, format) =>
        controllers_ClimateServiceCommentController_getComment23_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceCommentController]).getComment(id, email, format))
   }
}
        

// @LINE:40
case controllers_ClimateServiceCommentController_searchCommentByHashTag24_route(params) => {
   call(params.fromPath[String]("hashTag", None)) { (hashTag) =>
        controllers_ClimateServiceCommentController_searchCommentByHashTag24_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceCommentController]).searchCommentByHashTag(hashTag))
   }
}
        

// @LINE:41
case controllers_ClimateServiceCommentController_getMentions25_route(params) => {
   call(params.fromPath[String]("email", None)) { (email) =>
        controllers_ClimateServiceCommentController_getMentions25_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceCommentController]).getMentions(email))
   }
}
        

// @LINE:42
case controllers_ClimateServiceCommentController_postComment26_route(params) => {
   call { 
        controllers_ClimateServiceCommentController_postComment26_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceCommentController]).postComment)
   }
}
        

// @LINE:43
case controllers_ClimateServiceCommentController_editComment27_route(params) => {
   call { 
        controllers_ClimateServiceCommentController_editComment27_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceCommentController]).editComment)
   }
}
        

// @LINE:44
case controllers_ClimateServiceCommentController_deleteComment28_route(params) => {
   call(params.fromPath[Long]("service_id", None), params.fromPath[Long]("comment_id", None)) { (service_id, comment_id) =>
        controllers_ClimateServiceCommentController_deleteComment28_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceCommentController]).deleteComment(service_id, comment_id))
   }
}
        

// @LINE:47
case controllers_ServiceConfigurationController_getServiceConfiguration29_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_ServiceConfigurationController_getServiceConfiguration29_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).getServiceConfiguration(id, format))
   }
}
        

// @LINE:48
case controllers_ServiceConfigurationController_addServiceConfiguration30_route(params) => {
   call { 
        controllers_ServiceConfigurationController_addServiceConfiguration30_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).addServiceConfiguration)
   }
}
        

// @LINE:49
case controllers_ServiceConfigurationController_updateServiceConfigurationById31_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ServiceConfigurationController_updateServiceConfigurationById31_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).updateServiceConfigurationById(id))
   }
}
        

// @LINE:50
case controllers_ServiceConfigurationController_deleteServiceConfiguration32_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ServiceConfigurationController_deleteServiceConfiguration32_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).deleteServiceConfiguration(id))
   }
}
        

// @LINE:51
case controllers_ServiceConfigurationController_getServiceConfigurationsByUser33_route(params) => {
   call(params.fromPath[Long]("userId", None), Param[String]("format", Right("json"))) { (userId, format) =>
        controllers_ServiceConfigurationController_getServiceConfigurationsByUser33_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).getServiceConfigurationsByUser(userId, format))
   }
}
        

// @LINE:54
case controllers_ServiceConfigurationItemController_getServiceConfigurationItemById34_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ServiceConfigurationItemController_getServiceConfigurationItemById34_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).getServiceConfigurationItemById(id))
   }
}
        

// @LINE:55
case controllers_ServiceConfigurationItemController_getServiceConfigurationItemsInServiceConfig35_route(params) => {
   call(params.fromPath[Long]("serviceConfigId", None)) { (serviceConfigId) =>
        controllers_ServiceConfigurationItemController_getServiceConfigurationItemsInServiceConfig35_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).getServiceConfigurationItemsInServiceConfig(serviceConfigId))
   }
}
        

// @LINE:56
case controllers_ServiceConfigurationItemController_getServiceConfigurationItemByParameterId36_route(params) => {
   call(params.fromPath[Long]("paramId", None)) { (paramId) =>
        controllers_ServiceConfigurationItemController_getServiceConfigurationItemByParameterId36_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).getServiceConfigurationItemByParameterId(paramId))
   }
}
        

// @LINE:57
case controllers_ServiceConfigurationItemController_addServiceConfigurationItem37_route(params) => {
   call { 
        controllers_ServiceConfigurationItemController_addServiceConfigurationItem37_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).addServiceConfigurationItem)
   }
}
        

// @LINE:58
case controllers_ServiceConfigurationItemController_updateServiceConfigurationItemById38_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ServiceConfigurationItemController_updateServiceConfigurationItemById38_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).updateServiceConfigurationItemById(id))
   }
}
        

// @LINE:59
case controllers_ServiceConfigurationItemController_deleteServiceConfigurationItemById39_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ServiceConfigurationItemController_deleteServiceConfigurationItemById39_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).deleteServiceConfigurationItemById(id))
   }
}
        

// @LINE:62
case controllers_ServiceExecutionLogController_getAllServiceExecutionLogs40_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ServiceExecutionLogController_getAllServiceExecutionLogs40_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).getAllServiceExecutionLogs(format))
   }
}
        

// @LINE:63
case controllers_ServiceExecutionLogController_getServiceExecutionLog41_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_ServiceExecutionLogController_getServiceExecutionLog41_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).getServiceExecutionLog(id, format))
   }
}
        

// @LINE:64
case controllers_ServiceExecutionLogController_addServiceExecutionLog42_route(params) => {
   call { 
        controllers_ServiceExecutionLogController_addServiceExecutionLog42_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).addServiceExecutionLog())
   }
}
        

// @LINE:65
case controllers_ServiceExecutionLogController_queryExecutionLogsByUser43_route(params) => {
   call { 
        controllers_ServiceExecutionLogController_queryExecutionLogsByUser43_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).queryExecutionLogsByUser())
   }
}
        

// @LINE:66
case controllers_ServiceExecutionLogController_queryServiceExecutionLogs44_route(params) => {
   call { 
        controllers_ServiceExecutionLogController_queryServiceExecutionLogs44_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).queryServiceExecutionLogs())
   }
}
        

// @LINE:67
case controllers_ServiceExecutionLogController_updateServiceExecutionLog45_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ServiceExecutionLogController_updateServiceExecutionLog45_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).updateServiceExecutionLog(id))
   }
}
        

// @LINE:68
case controllers_ServiceExecutionLogController_deleteServiceExecutionLog46_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ServiceExecutionLogController_deleteServiceExecutionLog46_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).deleteServiceExecutionLog(id))
   }
}
        

// @LINE:73
case controllers_DatasetLogController_getAllDatasetLogs47_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_DatasetLogController_getAllDatasetLogs47_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).getAllDatasetLogs(format))
   }
}
        

// @LINE:74
case controllers_DatasetLogController_getDatasetLog48_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_DatasetLogController_getDatasetLog48_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).getDatasetLog(id, format))
   }
}
        

// @LINE:75
case controllers_DatasetLogController_getServiceExecutionLogsByDatasetAndUser49_route(params) => {
   call(params.fromPath[Long]("userId", None), params.fromPath[Long]("datasetId", None), Param[String]("format", Right("json"))) { (userId, datasetId, format) =>
        controllers_DatasetLogController_getServiceExecutionLogsByDatasetAndUser49_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).getServiceExecutionLogsByDatasetAndUser(userId, datasetId, format))
   }
}
        

// @LINE:76
case controllers_DatasetLogController_getDatasetLogsByServiceAndUser50_route(params) => {
   call(params.fromPath[Long]("userId", None), params.fromPath[Long]("serviceId", None), Param[String]("format", Right("json"))) { (userId, serviceId, format) =>
        controllers_DatasetLogController_getDatasetLogsByServiceAndUser50_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).getDatasetLogsByServiceAndUser(userId, serviceId, format))
   }
}
        

// @LINE:77
case controllers_DatasetLogController_getUsersByServiceAndDataset51_route(params) => {
   call(params.fromPath[Long]("serviceId", None), params.fromPath[Long]("datasetId", None), Param[String]("format", Right("json"))) { (serviceId, datasetId, format) =>
        controllers_DatasetLogController_getUsersByServiceAndDataset51_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).getUsersByServiceAndDataset(serviceId, datasetId, format))
   }
}
        

// @LINE:78
case controllers_DatasetLogController_addDatasetLog52_route(params) => {
   call { 
        controllers_DatasetLogController_addDatasetLog52_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).addDatasetLog)
   }
}
        

// @LINE:79
case controllers_DatasetLogController_queryDatasets53_route(params) => {
   call { 
        controllers_DatasetLogController_queryDatasets53_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).queryDatasets)
   }
}
        

// @LINE:80
case controllers_DatasetLogController_queryVariables54_route(params) => {
   call { 
        controllers_DatasetLogController_queryVariables54_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).queryVariables)
   }
}
        

// @LINE:81
case controllers_DatasetLogController_updateDatasetLogById55_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DatasetLogController_updateDatasetLogById55_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).updateDatasetLogById(id))
   }
}
        

// @LINE:82
case controllers_DatasetLogController_deleteDatasetLog56_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DatasetLogController_deleteDatasetLog56_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).deleteDatasetLog(id))
   }
}
        

// @LINE:93
case controllers_InstrumentController_getAllInstruments57_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_InstrumentController_getAllInstruments57_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getAllInstruments(format))
   }
}
        

// @LINE:94
case controllers_InstrumentController_getInstrument58_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_InstrumentController_getInstrument58_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getInstrument(id, format))
   }
}
        

// @LINE:95
case controllers_InstrumentController_addInstrument59_route(params) => {
   call { 
        controllers_InstrumentController_addInstrument59_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).addInstrument)
   }
}
        

// @LINE:96
case controllers_InstrumentController_updateInstrumentById60_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_InstrumentController_updateInstrumentById60_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).updateInstrumentById(id))
   }
}
        

// @LINE:97
case controllers_InstrumentController_deleteInstrument61_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_InstrumentController_deleteInstrument61_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).deleteInstrument(id))
   }
}
        

// @LINE:100
case controllers_DatasetController_getAllDatasets62_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_DatasetController_getAllDatasets62_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getAllDatasets(format))
   }
}
        

// @LINE:101
case controllers_DatasetController_getDataset63_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_DatasetController_getDataset63_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getDataset(id, format))
   }
}
        

// @LINE:102
case controllers_DatasetController_addDataset64_route(params) => {
   call { 
        controllers_DatasetController_addDataset64_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).addDataset)
   }
}
        

// @LINE:103
case controllers_DatasetController_updateDatasetById65_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DatasetController_updateDatasetById65_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).updateDatasetById(id))
   }
}
        

// @LINE:104
case controllers_DatasetController_deleteDataset66_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DatasetController_deleteDataset66_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).deleteDataset(id))
   }
}
        

// @LINE:105
case controllers_DatasetController_queryDatasets67_route(params) => {
   call { 
        controllers_DatasetController_queryDatasets67_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).queryDatasets)
   }
}
        

// @LINE:106
case controllers_DatasetController_getMostKPopularDatasets68_route(params) => {
   call { 
        controllers_DatasetController_getMostKPopularDatasets68_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getMostKPopularDatasets)
   }
}
        

// @LINE:109
case controllers_ParameterController_getAllParameters69_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ParameterController_getAllParameters69_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getAllParameters(format))
   }
}
        

// @LINE:110
case controllers_ParameterController_getParameterByName70_route(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[String]("name", None), Param[String]("format", Right("json"))) { (id, name, format) =>
        controllers_ParameterController_getParameterByName70_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterByName(id, name, format))
   }
}
        

// @LINE:111
case controllers_ParameterController_getParameterById71_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_ParameterController_getParameterById71_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterById(id, format))
   }
}
        

// @LINE:112
case controllers_ParameterController_addParameter72_route(params) => {
   call { 
        controllers_ParameterController_addParameter72_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).addParameter)
   }
}
        

// @LINE:113
case controllers_ParameterController_updateParameterById73_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ParameterController_updateParameterById73_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterById(id))
   }
}
        

// @LINE:114
case controllers_ParameterController_updateParameterByName74_route(params) => {
   call(params.fromPath[String]("oldName", None)) { (oldName) =>
        controllers_ParameterController_updateParameterByName74_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterByName(oldName))
   }
}
        

// @LINE:115
case controllers_ParameterController_deleteParameterByName75_route(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[String]("name", None)) { (id, name) =>
        controllers_ParameterController_deleteParameterByName75_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).deleteParameterByName(id, name))
   }
}
        

// @LINE:118
case controllers_JournalPublicationController_getAllJournalPublications76_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_JournalPublicationController_getAllJournalPublications76_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).getAllJournalPublications(format))
   }
}
        

// @LINE:119
case controllers_JournalPublicationController_getJournalPublicationById77_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_JournalPublicationController_getJournalPublicationById77_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).getJournalPublicationById(id, format))
   }
}
        

// @LINE:120
case controllers_JournalPublicationController_addJournalPublication78_route(params) => {
   call { 
        controllers_JournalPublicationController_addJournalPublication78_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).addJournalPublication)
   }
}
        

// @LINE:121
case controllers_JournalPublicationController_updateJournalPublicationById79_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_JournalPublicationController_updateJournalPublicationById79_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).updateJournalPublicationById(id))
   }
}
        

// @LINE:122
case controllers_JournalPublicationController_deleteJournalPublicationById80_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_JournalPublicationController_deleteJournalPublicationById80_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).deleteJournalPublicationById(id))
   }
}
        

// @LINE:125
case controllers_BookPublicationController_getAllBookPublications81_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_BookPublicationController_getAllBookPublications81_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).getAllBookPublications(format))
   }
}
        

// @LINE:126
case controllers_BookPublicationController_getBookPublicationById82_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_BookPublicationController_getBookPublicationById82_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).getBookPublicationById(id, format))
   }
}
        

// @LINE:127
case controllers_BookPublicationController_addBookPublication83_route(params) => {
   call { 
        controllers_BookPublicationController_addBookPublication83_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).addBookPublication)
   }
}
        

// @LINE:128
case controllers_BookPublicationController_updateBookPublicationById84_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BookPublicationController_updateBookPublicationById84_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).updateBookPublicationById(id))
   }
}
        

// @LINE:129
case controllers_BookPublicationController_deleteBookPublicationById85_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BookPublicationController_deleteBookPublicationById85_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).deleteBookPublicationById(id))
   }
}
        

// @LINE:132
case controllers_BookChapterPublicationController_getAllBookChapterPublications86_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_BookChapterPublicationController_getAllBookChapterPublications86_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).getAllBookChapterPublications(format))
   }
}
        

// @LINE:133
case controllers_BookChapterPublicationController_getBookChapterPublication87_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_BookChapterPublicationController_getBookChapterPublication87_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).getBookChapterPublication(id, format))
   }
}
        

// @LINE:134
case controllers_BookChapterPublicationController_addBookChapterPublication88_route(params) => {
   call { 
        controllers_BookChapterPublicationController_addBookChapterPublication88_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).addBookChapterPublication)
   }
}
        

// @LINE:135
case controllers_BookChapterPublicationController_updateBookChapterPublication89_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BookChapterPublicationController_updateBookChapterPublication89_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).updateBookChapterPublication(id))
   }
}
        

// @LINE:136
case controllers_BookChapterPublicationController_deleteBookChapterPublication90_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BookChapterPublicationController_deleteBookChapterPublication90_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).deleteBookChapterPublication(id))
   }
}
        

// @LINE:139
case controllers_ConferencePublicationController_getAllConferencePublications91_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ConferencePublicationController_getAllConferencePublications91_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).getAllConferencePublications(format))
   }
}
        

// @LINE:140
case controllers_ConferencePublicationController_getConferencePublication92_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_ConferencePublicationController_getConferencePublication92_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).getConferencePublication(id, format))
   }
}
        

// @LINE:141
case controllers_ConferencePublicationController_addConferencePublication93_route(params) => {
   call { 
        controllers_ConferencePublicationController_addConferencePublication93_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).addConferencePublication)
   }
}
        

// @LINE:142
case controllers_ConferencePublicationController_updateConferencePublication94_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ConferencePublicationController_updateConferencePublication94_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).updateConferencePublication(id))
   }
}
        

// @LINE:143
case controllers_ConferencePublicationController_deleteConferencePublication95_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ConferencePublicationController_deleteConferencePublication95_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).deleteConferencePublication(id))
   }
}
        

// @LINE:160
case controllers_AnalyticsController_getOneUserWithAllDatasetAndCount96_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_AnalyticsController_getOneUserWithAllDatasetAndCount96_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AnalyticsController]).getOneUserWithAllDatasetAndCount(id, format))
   }
}
        

// @LINE:161
case controllers_AnalyticsController_getOneDatasetWithAllUserAndCount97_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_AnalyticsController_getOneDatasetWithAllUserAndCount97_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AnalyticsController]).getOneDatasetWithAllUserAndCount(id, format))
   }
}
        

// @LINE:162
case controllers_AnalyticsController_getOneUserWithAllServiceAndCount98_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_AnalyticsController_getOneUserWithAllServiceAndCount98_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AnalyticsController]).getOneUserWithAllServiceAndCount(id, format))
   }
}
        

// @LINE:163
case controllers_AnalyticsController_getOneServiceWithAllUserAndCount99_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_AnalyticsController_getOneServiceWithAllUserAndCount99_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AnalyticsController]).getOneServiceWithAllUserAndCount(id, format))
   }
}
        

// @LINE:164
case controllers_AnalyticsController_getOneServiceWithAllDatasetAndCount100_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_AnalyticsController_getOneServiceWithAllDatasetAndCount100_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AnalyticsController]).getOneServiceWithAllDatasetAndCount(id, format))
   }
}
        

// @LINE:165
case controllers_AnalyticsController_getOneDatasetWithAllServiceAndCount101_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_AnalyticsController_getOneDatasetWithAllServiceAndCount101_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AnalyticsController]).getOneDatasetWithAllServiceAndCount(id, format))
   }
}
        

// @LINE:166
case controllers_AnalyticsController_getRelationalKnowledgeGraph102_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_AnalyticsController_getRelationalKnowledgeGraph102_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AnalyticsController]).getRelationalKnowledgeGraph(format))
   }
}
        

// @LINE:169
case controllers_UtilController_updatePicture103_route(params) => {
   call { 
        controllers_UtilController_updatePicture103_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UtilController]).updatePicture)
   }
}
        

// @LINE:172
case controllers_GraphAlgorithmController_getShortestPath104_route(params) => {
   call(params.fromPath[Integer]("source", None), params.fromPath[Integer]("target", None), Param[String]("format", Right("json"))) { (source, target, format) =>
        controllers_GraphAlgorithmController_getShortestPath104_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GraphAlgorithmController]).getShortestPath(source, target, format))
   }
}
        

// @LINE:173
case controllers_GraphAlgorithmController_getKShortestPath105_route(params) => {
   call(params.fromPath[Integer]("source", None), params.fromPath[Integer]("target", None), params.fromPath[Integer]("k", None), Param[String]("format", Right("json"))) { (source, target, k, format) =>
        controllers_GraphAlgorithmController_getKShortestPath105_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GraphAlgorithmController]).getKShortestPath(source, target, k, format))
   }
}
        

// @LINE:176
case controllers_UserRecommendationController_getKSimilarUsers106_route(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Integer]("k", None), Param[String]("format", Right("json"))) { (id, k, format) =>
        controllers_UserRecommendationController_getKSimilarUsers106_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserRecommendationController]).getKSimilarUsers(id, k, format))
   }
}
        

// @LINE:179
case controllers_Assets_at107_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at107_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:184
case controllers_UserController_deleteUser108_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_deleteUser108_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUser(id))
   }
}
        

// @LINE:185
case controllers_UserController_getAllUsers109_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_UserController_getAllUsers109_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getAllUsers(format))
   }
}
        

// @LINE:186
case controllers_UserController_deleteUserByUserNameandPassword110_route(params) => {
   call(params.fromPath[String]("userName", None), params.fromPath[String]("password", None)) { (userName, password) =>
        controllers_UserController_deleteUserByUserNameandPassword110_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUserByUserNameandPassword(userName, password))
   }
}
        

// @LINE:188
case controllers_UserController_userRegister111_route(params) => {
   call { 
        controllers_UserController_userRegister111_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userRegister)
   }
}
        

// @LINE:189
case controllers_UserController_userLogin112_route(params) => {
   call { 
        controllers_UserController_userLogin112_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userLogin)
   }
}
        

// @LINE:191
case controllers_UserController_userSearch113_route(params) => {
   call(params.fromPath[String]("display_name", None), Param[String]("format", Right("json"))) { (display_name, format) =>
        controllers_UserController_userSearch113_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userSearch(display_name, format))
   }
}
        

// @LINE:193
case controllers_UserController_setProfile114_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_setProfile114_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).setProfile(id))
   }
}
        

// @LINE:194
case controllers_UserController_getProfile115_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_UserController_getProfile115_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getProfile(id, format))
   }
}
        

// @LINE:196
case controllers_UserController_userFollow116_route(params) => {
   call(params.fromPath[Long]("followerId", None), params.fromPath[Long]("followeeId", None)) { (followerId, followeeId) =>
        controllers_UserController_userFollow116_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userFollow(followerId, followeeId))
   }
}
        

// @LINE:197
case controllers_UserController_userUnfollow117_route(params) => {
   call(params.fromPath[Long]("followerId", None), params.fromPath[Long]("followeeId", None)) { (followerId, followeeId) =>
        controllers_UserController_userUnfollow117_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userUnfollow(followerId, followeeId))
   }
}
        

// @LINE:198
case controllers_UserController_getFollowers118_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_getFollowers118_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getFollowers(id))
   }
}
        

// @LINE:199
case controllers_UserController_getFollowees119_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_getFollowees119_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getFollowees(id))
   }
}
        

// @LINE:201
case controllers_UserController_sendFriendRequest120_route(params) => {
   call(params.fromPath[Long]("senderId", None), params.fromPath[Long]("receiverId", None)) { (senderId, receiverId) =>
        controllers_UserController_sendFriendRequest120_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).sendFriendRequest(senderId, receiverId))
   }
}
        

// @LINE:202
case controllers_UserController_getFriendRequests121_route(params) => {
   call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_UserController_getFriendRequests121_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getFriendRequests(userId))
   }
}
        

// @LINE:203
case controllers_UserController_acceptFriendRequest122_route(params) => {
   call(params.fromPath[Long]("userId", None), params.fromPath[Long]("senderId", None)) { (userId, senderId) =>
        controllers_UserController_acceptFriendRequest122_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).acceptFriendRequest(userId, senderId))
   }
}
        

// @LINE:204
case controllers_UserController_rejectFriendRequest123_route(params) => {
   call(params.fromPath[Long]("userId", None), params.fromPath[Long]("senderId", None)) { (userId, senderId) =>
        controllers_UserController_rejectFriendRequest123_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).rejectFriendRequest(userId, senderId))
   }
}
        

// @LINE:205
case controllers_UserController_getFriends124_route(params) => {
   call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_UserController_getFriends124_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getFriends(userId))
   }
}
        

// @LINE:206
case controllers_UserController_deleteFriend125_route(params) => {
   call(params.fromPath[Long]("userId", None), params.fromPath[Long]("friendId", None)) { (userId, friendId) =>
        controllers_UserController_deleteFriend125_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteFriend(userId, friendId))
   }
}
        

// @LINE:210
case controllers_WorkflowController_post126_route(params) => {
   call { 
        controllers_WorkflowController_post126_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).post)
   }
}
        

// @LINE:211
case controllers_WorkflowController_updateWorkflow127_route(params) => {
   call { 
        controllers_WorkflowController_updateWorkflow127_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).updateWorkflow)
   }
}
        

// @LINE:212
case controllers_WorkflowController_deleteWorkflow128_route(params) => {
   call { 
        controllers_WorkflowController_deleteWorkflow128_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).deleteWorkflow)
   }
}
        

// @LINE:213
case controllers_WorkflowController_get129_route(params) => {
   call(params.fromPath[Long]("wfID", None), params.fromPath[Long]("userID", None), Param[String]("format", Right("json"))) { (wfID, userID, format) =>
        controllers_WorkflowController_get129_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).get(wfID, userID, format))
   }
}
        

// @LINE:214
case controllers_WorkflowController_getTimeLine130_route(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Long]("offset", None), Param[String]("format", Right("json"))) { (id, offset, format) =>
        controllers_WorkflowController_getTimeLine130_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTimeLine(id, offset, format))
   }
}
        

// @LINE:215
case controllers_WorkflowController_getWorkflowList131_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_WorkflowController_getWorkflowList131_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getWorkflowList(id, format))
   }
}
        

// @LINE:216
case controllers_WorkflowController_uploadImage132_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkflowController_uploadImage132_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).uploadImage(id))
   }
}
        

// @LINE:217
case controllers_WorkflowController_getPublicWorkflow133_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_WorkflowController_getPublicWorkflow133_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getPublicWorkflow(format))
   }
}
        

// @LINE:219
case controllers_WorkflowController_getTags134_route(params) => {
   call(params.fromPath[Long]("wfId", None)) { (wfId) =>
        controllers_WorkflowController_getTags134_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTags(wfId))
   }
}
        

// @LINE:220
case controllers_WorkflowController_setTag135_route(params) => {
   call { 
        controllers_WorkflowController_setTag135_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).setTag)
   }
}
        

// @LINE:221
case controllers_WorkflowController_deleteTag136_route(params) => {
   call(params.fromPath[Long]("wfId", None), params.fromPath[String]("tag", None)) { (wfId, tag) =>
        controllers_WorkflowController_deleteTag136_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).deleteTag(wfId, tag))
   }
}
        

// @LINE:222
case controllers_WorkflowController_getByTag137_route(params) => {
   call(params.fromPath[String]("tag", None)) { (tag) =>
        controllers_WorkflowController_getByTag137_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getByTag(tag))
   }
}
        

// @LINE:223
case controllers_WorkflowController_getByTitle138_route(params) => {
   call(params.fromPath[String]("title", None)) { (title) =>
        controllers_WorkflowController_getByTitle138_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getByTitle(title))
   }
}
        

// @LINE:224
case controllers_WorkflowController_getTop3WorkFlow139_route(params) => {
   call { 
        controllers_WorkflowController_getTop3WorkFlow139_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTop3WorkFlow())
   }
}
        

// @LINE:227
case controllers_MailController_sendMail140_route(params) => {
   call { 
        controllers_MailController_sendMail140_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.MailController]).sendMail)
   }
}
        

// @LINE:228
case controllers_MailController_readMail141_route(params) => {
   call(params.fromPath[Long]("mailId", None)) { (mailId) =>
        controllers_MailController_readMail141_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.MailController]).readMail(mailId))
   }
}
        

// @LINE:229
case controllers_MailController_getInbox142_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_MailController_getInbox142_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.MailController]).getInbox(id, format))
   }
}
        

// @LINE:230
case controllers_MailController_getOutbox143_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_MailController_getOutbox143_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.MailController]).getOutbox(id, format))
   }
}
        

// @LINE:233
case controllers_SuggestionsController_publishSuggestion144_route(params) => {
   call { 
        controllers_SuggestionsController_publishSuggestion144_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SuggestionsController]).publishSuggestion)
   }
}
        

// @LINE:234
case controllers_SuggestionsController_addTag145_route(params) => {
   call { 
        controllers_SuggestionsController_addTag145_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SuggestionsController]).addTag)
   }
}
        

// @LINE:235
case controllers_SuggestionsController_voteToSuggestion146_route(params) => {
   call(params.fromPath[Long]("suggestionId", None)) { (suggestionId) =>
        controllers_SuggestionsController_voteToSuggestion146_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SuggestionsController]).voteToSuggestion(suggestionId))
   }
}
        

// @LINE:236
case controllers_SuggestionsController_getSuggestionForWorkflow147_route(params) => {
   call(params.fromPath[Long]("workflowId", None)) { (workflowId) =>
        controllers_SuggestionsController_getSuggestionForWorkflow147_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SuggestionsController]).getSuggestionForWorkflow(workflowId))
   }
}
        

// @LINE:240
case controllers_TagController_createTag148_route(params) => {
   call { 
        controllers_TagController_createTag148_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.TagController]).createTag)
   }
}
        

// @LINE:241
case controllers_TagController_deleteTag149_route(params) => {
   call { 
        controllers_TagController_deleteTag149_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.TagController]).deleteTag)
   }
}
        

// @LINE:245
case controllers_GroupUsersController_createGroup150_route(params) => {
   call { 
        controllers_GroupUsersController_createGroup150_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GroupUsersController]).createGroup)
   }
}
        

// @LINE:246
case controllers_GroupUsersController_addMembersToGroup151_route(params) => {
   call { 
        controllers_GroupUsersController_addMembersToGroup151_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GroupUsersController]).addMembersToGroup)
   }
}
        

// @LINE:247
case controllers_GroupUsersController_getGroupList152_route(params) => {
   call(params.fromPath[Long]("userID", None), Param[String]("format", Right("json"))) { (userID, format) =>
        controllers_GroupUsersController_getGroupList152_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GroupUsersController]).getGroupList(userID, format))
   }
}
        

// @LINE:248
case controllers_GroupUsersController_getGroupMember153_route(params) => {
   call(params.fromPath[Long]("groupId", None), Param[String]("format", Right("json"))) { (groupId, format) =>
        controllers_GroupUsersController_getGroupMember153_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GroupUsersController]).getGroupMember(groupId, format))
   }
}
        

// @LINE:252
case controllers_WorkflowController_addComment154_route(params) => {
   call { 
        controllers_WorkflowController_addComment154_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).addComment)
   }
}
        

// @LINE:253
case controllers_WorkflowController_getComments155_route(params) => {
   call(params.fromPath[Long]("workflowId", None)) { (workflowId) =>
        controllers_WorkflowController_getComments155_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getComments(workflowId))
   }
}
        

// @LINE:256
case controllers_CommentController_addReply156_route(params) => {
   call { 
        controllers_CommentController_addReply156_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).addReply)
   }
}
        

// @LINE:257
case controllers_CommentController_getReply157_route(params) => {
   call(params.fromPath[Long]("commentId", None)) { (commentId) =>
        controllers_CommentController_getReply157_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).getReply(commentId))
   }
}
        

// @LINE:258
case controllers_CommentController_getReply158_route(params) => {
   call(params.fromPath[Long]("commentId", None)) { (commentId) =>
        controllers_CommentController_getReply158_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).getReply(commentId))
   }
}
        

// @LINE:259
case controllers_CommentController_thumbUp159_route(params) => {
   call(params.fromPath[Long]("commentId", None)) { (commentId) =>
        controllers_CommentController_thumbUp159_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).thumbUp(commentId))
   }
}
        

// @LINE:260
case controllers_CommentController_thumbDown160_route(params) => {
   call(params.fromPath[Long]("commentId", None)) { (commentId) =>
        controllers_CommentController_thumbDown160_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).thumbDown(commentId))
   }
}
        
}

}
     