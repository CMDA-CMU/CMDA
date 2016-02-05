// @SOURCE:/Users/weiwang/climate-service/conf/routes
// @HASH:e5858c3d3b3a4f68f965d7093f71de0c93c56bdb
// @DATE:Thu Dec 10 17:28:46 PST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:104
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:87
// @LINE:86
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:55
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:19
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:87
// @LINE:86
class ReverseAssets {


// @LINE:87
// @LINE:86
def at(file:String): Call = {
   (file: @unchecked) match {
// @LINE:86
case (file)  =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
  Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                         
   }
}
                                                

}
                          

// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
class ReverseServiceExecutionLogController {


// @LINE:43
def getServiceLog(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "serviceLog")
}
                        

// @LINE:46
def getConfigurationByConfId(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "getConfigurationByConfId")
}
                        

// @LINE:44
def searchServiceLog(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "searchServiceLog")
}
                        

// @LINE:45
def getSearchServiceLog(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "searchServiceLogResult")
}
                        

}
                          

// @LINE:55
class ReverseDatasetLogController {


// @LINE:55
def getAllDatasetLogs(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "datasetLog/allDatasetLogs")
}
                        

}
                          

// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
class ReverseBugReportController {


// @LINE:97
def reports(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "bugs")
}
                        

// @LINE:101
def solveReport(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "solve/report")
}
                        

// @LINE:100
def deleteReport(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "delete/report")
}
                        

// @LINE:99
def list(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "bug/list")
}
                        

// @LINE:98
def newReport(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "newReport")
}
                        

}
                          

// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
class ReverseAnalyticsController {


// @LINE:62
def getSearchAndGenerateWorkflow(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "searchAndGenerateWorkflow")
}
                        

// @LINE:66
def getShortestPath(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "getShortestPath")
}
                        

// @LINE:67
def getPartKnowledgeGraph(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "getPartKnowledgeGraph")
}
                        

// @LINE:59
def getDatasetRecommend(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "datasetRecommend")
}
                        

// @LINE:64
def getRelationalKnowledgeGraph(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "relationalKnowledgeGraph")
}
                        

// @LINE:58
def getRecommend(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "serviceLogRecommend")
}
                        

// @LINE:60
def getScientistRecommend(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "profileRecommend")
}
                        

// @LINE:61
def getLogGraph(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "serviceLogGraph")
}
                        

// @LINE:65
def getSpecifiedKnowledgeGraph(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "getSpecifiedKnowledgeGraph")
}
                        

// @LINE:68
def getKthShortestPath(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "getKthShortestPath")
}
                        

// @LINE:63
def getKnowledgeGraph(param1:String = "User", param2:String = "Dataset", param3:String = "Service"): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "serviceKnowledgeGraph" + queryString(List(if(param1 == "User") None else Some(implicitly[QueryStringBindable[String]].unbind("param1", param1)), if(param2 == "Dataset") None else Some(implicitly[QueryStringBindable[String]].unbind("param2", param2)), if(param3 == "Service") None else Some(implicitly[QueryStringBindable[String]].unbind("param3", param3)))))
}
                        

}
                          

// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
class ReverseAboutController {


// @LINE:94
def FAQs(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "FAQs")
}
                        

// @LINE:92
def aboutProject(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "aboutProject")
}
                        

// @LINE:93
def tutorial(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "tutorial")
}
                        

// @LINE:91
def aboutUs(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "aboutUs")
}
                        

}
                          

// @LINE:74
// @LINE:73
// @LINE:72
class ReverseUsersController {


// @LINE:74
def getUsernamesAndServicesAutoCompleteSource(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users/getUsernamesAndServicesAutoCompleteSource")
}
                        

// @LINE:72
def getAllUsers(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "scientist/allUsers")
}
                        

// @LINE:73
def searchUser(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "scientist/searchUser")
}
                        

}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:11
def createNewUser(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "createNewUser")
}
                        

// @LINE:12
def createSuccess(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "createSuccess")
}
                        

// @LINE:13
def isEmailExisted(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "isEmailExisted")
}
                        

// @LINE:10
def signup(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                        

// @LINE:8
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:6
def home(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:9
def authenticate(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "authenticate")
}
                        

// @LINE:7
def login(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                        

}
                          

// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
class ReverseCommentController {


// @LINE:82
def searchCommentByHashTagPage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "comment/searchCommentByHashTagPage")
}
                        

// @LINE:81
def searchCommentByHashTag(hashTag:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "comment/searchCommentByHashTag/" + implicitly[PathBindable[String]].unbind("hashTag", dynamicString(hashTag)))
}
                        

// @LINE:78
def postComment(url:String, version:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "comment/postComment/" + implicitly[PathBindable[String]].unbind("url", dynamicString(url)) + "/" + implicitly[PathBindable[Long]].unbind("version", version))
}
                        

// @LINE:80
def deleteComment(url:String, version:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "comment/deleteComment/" + implicitly[PathBindable[String]].unbind("url", dynamicString(url)) + "/" + implicitly[PathBindable[Long]].unbind("version", version))
}
                        

// @LINE:79
def editComment(url:String, version:Long, id:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "comment/postComment/" + implicitly[PathBindable[String]].unbind("url", dynamicString(url)) + "/" + implicitly[PathBindable[Long]].unbind("version", version) + "/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                        

// @LINE:77
def getComment(url:String, version:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "comment/getComment/" + implicitly[PathBindable[String]].unbind("url", dynamicString(url)) + "/" + implicitly[PathBindable[Long]].unbind("version", version))
}
                        

}
                          

// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
class ReverseDatasetController {


// @LINE:51
def getSearchResult(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "dataSet/getSearchResult")
}
                        

// @LINE:49
def showAllDatasets(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "dataSet/allDatasets")
}
                        

// @LINE:52
def mostPopularDatasets(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "dataSet/mostPopularDatasets")
}
                        

// @LINE:50
def searchDataset(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "dataSet/searchDataSet")
}
                        

}
                          

// @LINE:104
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:19
class ReverseClimateServiceController {


// @LINE:32
def mostPopularServices(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "climateService/mostPopularServices")
}
                        

// @LINE:34
def mostRecentlyAddedClimateServices(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "climateService/mostRecentlyAddedClimateServices")
}
                        

// @LINE:29
// @LINE:28
def serviceModels(): Call = {
   () match {
// @LINE:28
case ()  =>
  import ReverseRouteContext.empty
  Call("POST", _prefix + { _defaultPrefix } + "assets/html/climateService/serviceModels")
                                         
   }
}
                                                

// @LINE:25
def addClimateService(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "climateService/add")
}
                        

// @LINE:24
def showAllClimateServices(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "climateService/allServices")
}
                        

// @LINE:27
def passPageStr(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "climateService/savePage")
}
                        

// @LINE:39
def replaceFile(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "climateService/replaceFile")
}
                        

// @LINE:19
def recommendationSummary(userId:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "climateService/recommendationSummary/" + implicitly[PathBindable[String]].unbind("userId", dynamicString(userId)))
}
                        

// @LINE:33
def mostRecentlyUsedClimateServices(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "climateService/mostRecentlyUsedClimateServices")
}
                        

// @LINE:35
def searchClimateServices(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "climateService/searchClimateService")
}
                        

// @LINE:26
def addAClimateService(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "climateService/addAClimateService")
}
                        

// @LINE:36
def getSearchResult(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getSearchResult")
}
                        

// @LINE:30
def ruleEngineData(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "climateService/ruleEngineData")
}
                        

// @LINE:104
def addAllParameters(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "climateService/addAllParameters")
}
                        

}
                          
}
                  


// @LINE:104
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:87
// @LINE:86
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:55
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:19
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:87
// @LINE:86
class ReverseAssets {


// @LINE:87
// @LINE:86
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      }
   """
)
                        

}
              

// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
class ReverseServiceExecutionLogController {


// @LINE:43
def getServiceLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceExecutionLogController.getServiceLog",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceLog"})
      }
   """
)
                        

// @LINE:46
def getConfigurationByConfId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceExecutionLogController.getConfigurationByConfId",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getConfigurationByConfId"})
      }
   """
)
                        

// @LINE:44
def searchServiceLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceExecutionLogController.searchServiceLog",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchServiceLog"})
      }
   """
)
                        

// @LINE:45
def getSearchServiceLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceExecutionLogController.getSearchServiceLog",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchServiceLogResult"})
      }
   """
)
                        

}
              

// @LINE:55
class ReverseDatasetLogController {


// @LINE:55
def getAllDatasetLogs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetLogController.getAllDatasetLogs",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "datasetLog/allDatasetLogs"})
      }
   """
)
                        

}
              

// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
class ReverseBugReportController {


// @LINE:97
def reports : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.reports",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugs"})
      }
   """
)
                        

// @LINE:101
def solveReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.solveReport",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "solve/report"})
      }
   """
)
                        

// @LINE:100
def deleteReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.deleteReport",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/report"})
      }
   """
)
                        

// @LINE:99
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bug/list"})
      }
   """
)
                        

// @LINE:98
def newReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.newReport",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newReport"})
      }
   """
)
                        

}
              

// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
class ReverseAnalyticsController {


// @LINE:62
def getSearchAndGenerateWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnalyticsController.getSearchAndGenerateWorkflow",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchAndGenerateWorkflow"})
      }
   """
)
                        

// @LINE:66
def getShortestPath : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnalyticsController.getShortestPath",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getShortestPath"})
      }
   """
)
                        

// @LINE:67
def getPartKnowledgeGraph : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnalyticsController.getPartKnowledgeGraph",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getPartKnowledgeGraph"})
      }
   """
)
                        

// @LINE:59
def getDatasetRecommend : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnalyticsController.getDatasetRecommend",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "datasetRecommend"})
      }
   """
)
                        

// @LINE:64
def getRelationalKnowledgeGraph : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnalyticsController.getRelationalKnowledgeGraph",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "relationalKnowledgeGraph"})
      }
   """
)
                        

// @LINE:58
def getRecommend : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnalyticsController.getRecommend",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceLogRecommend"})
      }
   """
)
                        

// @LINE:60
def getScientistRecommend : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnalyticsController.getScientistRecommend",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profileRecommend"})
      }
   """
)
                        

// @LINE:61
def getLogGraph : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnalyticsController.getLogGraph",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceLogGraph"})
      }
   """
)
                        

// @LINE:65
def getSpecifiedKnowledgeGraph : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnalyticsController.getSpecifiedKnowledgeGraph",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getSpecifiedKnowledgeGraph"})
      }
   """
)
                        

// @LINE:68
def getKthShortestPath : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnalyticsController.getKthShortestPath",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getKthShortestPath"})
      }
   """
)
                        

// @LINE:63
def getKnowledgeGraph : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnalyticsController.getKnowledgeGraph",
   """
      function(param1,param2,param3) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceKnowledgeGraph" + _qS([(param1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("param1", param1)), (param2 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("param2", param2)), (param3 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("param3", param3))])})
      }
   """
)
                        

}
              

// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
class ReverseAboutController {


// @LINE:94
def FAQs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutController.FAQs",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "FAQs"})
      }
   """
)
                        

// @LINE:92
def aboutProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutController.aboutProject",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutProject"})
      }
   """
)
                        

// @LINE:93
def tutorial : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutController.tutorial",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tutorial"})
      }
   """
)
                        

// @LINE:91
def aboutUs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutController.aboutUs",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutUs"})
      }
   """
)
                        

}
              

// @LINE:74
// @LINE:73
// @LINE:72
class ReverseUsersController {


// @LINE:74
def getUsernamesAndServicesAutoCompleteSource : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsersController.getUsernamesAndServicesAutoCompleteSource",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getUsernamesAndServicesAutoCompleteSource"})
      }
   """
)
                        

// @LINE:72
def getAllUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsersController.getAllUsers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scientist/allUsers"})
      }
   """
)
                        

// @LINE:73
def searchUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsersController.searchUser",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scientist/searchUser"})
      }
   """
)
                        

}
              

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:11
def createNewUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createNewUser",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createNewUser"})
      }
   """
)
                        

// @LINE:12
def createSuccess : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createSuccess",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createSuccess"})
      }
   """
)
                        

// @LINE:13
def isEmailExisted : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.isEmailExisted",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "isEmailExisted"})
      }
   """
)
                        

// @LINE:10
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signup",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:8
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:6
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.home",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:9
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate"})
      }
   """
)
                        

// @LINE:7
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

}
              

// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
class ReverseCommentController {


// @LINE:82
def searchCommentByHashTagPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CommentController.searchCommentByHashTagPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comment/searchCommentByHashTagPage"})
      }
   """
)
                        

// @LINE:81
def searchCommentByHashTag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CommentController.searchCommentByHashTag",
   """
      function(hashTag) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comment/searchCommentByHashTag/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("hashTag", encodeURIComponent(hashTag))})
      }
   """
)
                        

// @LINE:78
def postComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CommentController.postComment",
   """
      function(url,version) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "comment/postComment/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("url", encodeURIComponent(url)) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("version", version)})
      }
   """
)
                        

// @LINE:80
def deleteComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CommentController.deleteComment",
   """
      function(url,version) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "comment/deleteComment/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("url", encodeURIComponent(url)) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("version", version)})
      }
   """
)
                        

// @LINE:79
def editComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CommentController.editComment",
   """
      function(url,version,id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "comment/postComment/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("url", encodeURIComponent(url)) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("version", version) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:77
def getComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CommentController.getComment",
   """
      function(url,version) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comment/getComment/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("url", encodeURIComponent(url)) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("version", version)})
      }
   """
)
                        

}
              

// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
class ReverseDatasetController {


// @LINE:51
def getSearchResult : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.getSearchResult",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dataSet/getSearchResult"})
      }
   """
)
                        

// @LINE:49
def showAllDatasets : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.showAllDatasets",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dataSet/allDatasets"})
      }
   """
)
                        

// @LINE:52
def mostPopularDatasets : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.mostPopularDatasets",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dataSet/mostPopularDatasets"})
      }
   """
)
                        

// @LINE:50
def searchDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.searchDataset",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dataSet/searchDataSet"})
      }
   """
)
                        

}
              

// @LINE:104
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:19
class ReverseClimateServiceController {


// @LINE:32
def mostPopularServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostPopularServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/mostPopularServices"})
      }
   """
)
                        

// @LINE:34
def mostRecentlyAddedClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostRecentlyAddedClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/mostRecentlyAddedClimateServices"})
      }
   """
)
                        

// @LINE:29
// @LINE:28
def serviceModels : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.serviceModels",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/html/climateService/serviceModels"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/serviceModels"})
      }
      }
   """
)
                        

// @LINE:25
def addClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.addClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/add"})
      }
   """
)
                        

// @LINE:24
def showAllClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.showAllClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/allServices"})
      }
   """
)
                        

// @LINE:27
def passPageStr : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.passPageStr",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/savePage"})
      }
   """
)
                        

// @LINE:39
def replaceFile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.replaceFile",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/replaceFile"})
      }
   """
)
                        

// @LINE:19
def recommendationSummary : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.recommendationSummary",
   """
      function(userId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/recommendationSummary/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userId", encodeURIComponent(userId))})
      }
   """
)
                        

// @LINE:33
def mostRecentlyUsedClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostRecentlyUsedClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/mostRecentlyUsedClimateServices"})
      }
   """
)
                        

// @LINE:35
def searchClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.searchClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/searchClimateService"})
      }
   """
)
                        

// @LINE:26
def addAClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.addAClimateService",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/addAClimateService"})
      }
   """
)
                        

// @LINE:36
def getSearchResult : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getSearchResult",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getSearchResult"})
      }
   """
)
                        

// @LINE:30
def ruleEngineData : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.ruleEngineData",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/ruleEngineData"})
      }
   """
)
                        

// @LINE:104
def addAllParameters : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.addAllParameters",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/addAllParameters"})
      }
   """
)
                        

}
              
}
        


// @LINE:104
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:87
// @LINE:86
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:55
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:19
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:87
// @LINE:86
class ReverseAssets {


// @LINE:86
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
class ReverseServiceExecutionLogController {


// @LINE:43
def getServiceLog(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ServiceExecutionLogController.getServiceLog(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "getServiceLog", Seq(), "GET", """ Service Execution Log""", _prefix + """serviceLog""")
)
                      

// @LINE:46
def getConfigurationByConfId(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ServiceExecutionLogController.getConfigurationByConfId(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "getConfigurationByConfId", Seq(), "GET", """""", _prefix + """getConfigurationByConfId""")
)
                      

// @LINE:44
def searchServiceLog(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ServiceExecutionLogController.searchServiceLog(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "searchServiceLog", Seq(), "GET", """""", _prefix + """searchServiceLog""")
)
                      

// @LINE:45
def getSearchServiceLog(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ServiceExecutionLogController.getSearchServiceLog(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "getSearchServiceLog", Seq(), "GET", """""", _prefix + """searchServiceLogResult""")
)
                      

}
                          

// @LINE:55
class ReverseDatasetLogController {


// @LINE:55
def getAllDatasetLogs(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetLogController.getAllDatasetLogs(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "getAllDatasetLogs", Seq(), "GET", """ Dataset Log""", _prefix + """datasetLog/allDatasetLogs""")
)
                      

}
                          

// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
class ReverseBugReportController {


// @LINE:97
def reports(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.reports(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "reports", Seq(), "GET", """ BugReporting""", _prefix + """bugs""")
)
                      

// @LINE:101
def solveReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.solveReport(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "solveReport", Seq(), "POST", """""", _prefix + """solve/report""")
)
                      

// @LINE:100
def deleteReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.deleteReport(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "deleteReport", Seq(), "POST", """""", _prefix + """delete/report""")
)
                      

// @LINE:99
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.list(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "list", Seq(), "GET", """""", _prefix + """bug/list""")
)
                      

// @LINE:98
def newReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.newReport(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "newReport", Seq(), "GET", """""", _prefix + """newReport""")
)
                      

}
                          

// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
class ReverseAnalyticsController {


// @LINE:62
def getSearchAndGenerateWorkflow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AnalyticsController.getSearchAndGenerateWorkflow(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getSearchAndGenerateWorkflow", Seq(), "GET", """""", _prefix + """searchAndGenerateWorkflow""")
)
                      

// @LINE:66
def getShortestPath(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AnalyticsController.getShortestPath(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getShortestPath", Seq(), "POST", """""", _prefix + """getShortestPath""")
)
                      

// @LINE:67
def getPartKnowledgeGraph(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AnalyticsController.getPartKnowledgeGraph(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getPartKnowledgeGraph", Seq(), "POST", """""", _prefix + """getPartKnowledgeGraph""")
)
                      

// @LINE:59
def getDatasetRecommend(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AnalyticsController.getDatasetRecommend(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getDatasetRecommend", Seq(), "GET", """""", _prefix + """datasetRecommend""")
)
                      

// @LINE:64
def getRelationalKnowledgeGraph(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AnalyticsController.getRelationalKnowledgeGraph(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getRelationalKnowledgeGraph", Seq(), "GET", """""", _prefix + """relationalKnowledgeGraph""")
)
                      

// @LINE:58
def getRecommend(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AnalyticsController.getRecommend(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getRecommend", Seq(), "GET", """ Analytics""", _prefix + """serviceLogRecommend""")
)
                      

// @LINE:60
def getScientistRecommend(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AnalyticsController.getScientistRecommend(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getScientistRecommend", Seq(), "GET", """""", _prefix + """profileRecommend""")
)
                      

// @LINE:61
def getLogGraph(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AnalyticsController.getLogGraph(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getLogGraph", Seq(), "GET", """""", _prefix + """serviceLogGraph""")
)
                      

// @LINE:65
def getSpecifiedKnowledgeGraph(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AnalyticsController.getSpecifiedKnowledgeGraph(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getSpecifiedKnowledgeGraph", Seq(), "POST", """""", _prefix + """getSpecifiedKnowledgeGraph""")
)
                      

// @LINE:68
def getKthShortestPath(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AnalyticsController.getKthShortestPath(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getKthShortestPath", Seq(), "POST", """""", _prefix + """getKthShortestPath""")
)
                      

// @LINE:63
def getKnowledgeGraph(param1:String, param2:String, param3:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AnalyticsController.getKnowledgeGraph(param1, param2, param3), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getKnowledgeGraph", Seq(classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """serviceKnowledgeGraph""")
)
                      

}
                          

// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
class ReverseAboutController {


// @LINE:94
def FAQs(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutController.FAQs(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AboutController", "FAQs", Seq(), "GET", """""", _prefix + """FAQs""")
)
                      

// @LINE:92
def aboutProject(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutController.aboutProject(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AboutController", "aboutProject", Seq(), "GET", """""", _prefix + """aboutProject""")
)
                      

// @LINE:93
def tutorial(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutController.tutorial(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AboutController", "tutorial", Seq(), "GET", """""", _prefix + """tutorial""")
)
                      

// @LINE:91
def aboutUs(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutController.aboutUs(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AboutController", "aboutUs", Seq(), "GET", """ About""", _prefix + """aboutUs""")
)
                      

}
                          

// @LINE:74
// @LINE:73
// @LINE:72
class ReverseUsersController {


// @LINE:74
def getUsernamesAndServicesAutoCompleteSource(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsersController.getUsernamesAndServicesAutoCompleteSource(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsersController", "getUsernamesAndServicesAutoCompleteSource", Seq(), "GET", """""", _prefix + """users/getUsernamesAndServicesAutoCompleteSource""")
)
                      

// @LINE:72
def getAllUsers(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsersController.getAllUsers(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsersController", "getAllUsers", Seq(), "GET", """ Users""", _prefix + """scientist/allUsers""")
)
                      

// @LINE:73
def searchUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsersController.searchUser(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsersController", "searchUser", Seq(), "GET", """""", _prefix + """scientist/searchUser""")
)
                      

}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:11
def createNewUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createNewUser(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createNewUser", Seq(), "GET", """""", _prefix + """createNewUser""")
)
                      

// @LINE:12
def createSuccess(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createSuccess(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createSuccess", Seq(), "GET", """""", _prefix + """createSuccess""")
)
                      

// @LINE:13
def isEmailExisted(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.isEmailExisted(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "isEmailExisted", Seq(), "POST", """""", _prefix + """isEmailExisted""")
)
                      

// @LINE:10
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signup(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "signup", Seq(), "GET", """""", _prefix + """signup""")
)
                      

// @LINE:8
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:6
def home(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.home(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "home", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:9
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "authenticate", Seq(), "GET", """""", _prefix + """authenticate""")
)
                      

// @LINE:7
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      

}
                          

// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
class ReverseCommentController {


// @LINE:82
def searchCommentByHashTagPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CommentController.searchCommentByHashTagPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "searchCommentByHashTagPage", Seq(), "GET", """""", _prefix + """comment/searchCommentByHashTagPage""")
)
                      

// @LINE:81
def searchCommentByHashTag(hashTag:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CommentController.searchCommentByHashTag(hashTag), HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "searchCommentByHashTag", Seq(classOf[String]), "GET", """""", _prefix + """comment/searchCommentByHashTag/$hashTag<[^/]+>""")
)
                      

// @LINE:78
def postComment(url:String, version:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CommentController.postComment(url, version), HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "postComment", Seq(classOf[String], classOf[Long]), "POST", """""", _prefix + """comment/postComment/$url<[^/]+>/$version<[^/]+>""")
)
                      

// @LINE:80
def deleteComment(url:String, version:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CommentController.deleteComment(url, version), HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "deleteComment", Seq(classOf[String], classOf[Long]), "DELETE", """""", _prefix + """comment/deleteComment/$url<[^/]+>/$version<[^/]+>""")
)
                      

// @LINE:79
def editComment(url:String, version:Long, id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CommentController.editComment(url, version, id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "editComment", Seq(classOf[String], classOf[Long], classOf[String]), "POST", """""", _prefix + """comment/postComment/$url<[^/]+>/$version<[^/]+>/$id<[^/]+>""")
)
                      

// @LINE:77
def getComment(url:String, version:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CommentController.getComment(url, version), HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "getComment", Seq(classOf[String], classOf[Long]), "GET", """ Comment""", _prefix + """comment/getComment/$url<[^/]+>/$version<[^/]+>""")
)
                      

}
                          

// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
class ReverseDatasetController {


// @LINE:51
def getSearchResult(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.getSearchResult(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "getSearchResult", Seq(), "GET", """""", _prefix + """dataSet/getSearchResult""")
)
                      

// @LINE:49
def showAllDatasets(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.showAllDatasets(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "showAllDatasets", Seq(), "GET", """ Dataset""", _prefix + """dataSet/allDatasets""")
)
                      

// @LINE:52
def mostPopularDatasets(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.mostPopularDatasets(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "mostPopularDatasets", Seq(), "GET", """""", _prefix + """dataSet/mostPopularDatasets""")
)
                      

// @LINE:50
def searchDataset(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.searchDataset(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "searchDataset", Seq(), "GET", """""", _prefix + """dataSet/searchDataSet""")
)
                      

}
                          

// @LINE:104
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:19
class ReverseClimateServiceController {


// @LINE:32
def mostPopularServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostPopularServices(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "mostPopularServices", Seq(), "GET", """""", _prefix + """climateService/mostPopularServices""")
)
                      

// @LINE:34
def mostRecentlyAddedClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostRecentlyAddedClimateServices(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "mostRecentlyAddedClimateServices", Seq(), "GET", """""", _prefix + """climateService/mostRecentlyAddedClimateServices""")
)
                      

// @LINE:28
def serviceModels(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.serviceModels(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "serviceModels", Seq(), "POST", """""", _prefix + """assets/html/climateService/serviceModels""")
)
                      

// @LINE:25
def addClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.addClimateService(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addClimateService", Seq(), "POST", """""", _prefix + """climateService/add""")
)
                      

// @LINE:24
def showAllClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.showAllClimateServices(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "showAllClimateServices", Seq(), "GET", """ Climate Service""", _prefix + """climateService/allServices""")
)
                      

// @LINE:27
def passPageStr(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.passPageStr(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "passPageStr", Seq(), "POST", """""", _prefix + """climateService/savePage""")
)
                      

// @LINE:39
def replaceFile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.replaceFile(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "replaceFile", Seq(), "POST", """replace page""", _prefix + """climateService/replaceFile""")
)
                      

// @LINE:19
def recommendationSummary(userId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.recommendationSummary(userId), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "recommendationSummary", Seq(classOf[String]), "GET", """recommendation overview""", _prefix + """climateService/recommendationSummary/$userId<[^/]+>""")
)
                      

// @LINE:33
def mostRecentlyUsedClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostRecentlyUsedClimateServices(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "mostRecentlyUsedClimateServices", Seq(), "GET", """""", _prefix + """climateService/mostRecentlyUsedClimateServices""")
)
                      

// @LINE:35
def searchClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.searchClimateServices(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "searchClimateServices", Seq(), "GET", """""", _prefix + """climateService/searchClimateService""")
)
                      

// @LINE:26
def addAClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.addAClimateService(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addAClimateService", Seq(), "GET", """""", _prefix + """climateService/addAClimateService""")
)
                      

// @LINE:36
def getSearchResult(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.getSearchResult(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getSearchResult", Seq(), "GET", """""", _prefix + """climateService/getSearchResult""")
)
                      

// @LINE:30
def ruleEngineData(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.ruleEngineData(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "ruleEngineData", Seq(), "POST", """""", _prefix + """climateService/ruleEngineData""")
)
                      

// @LINE:104
def addAllParameters(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.addAllParameters(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addAllParameters", Seq(), "POST", """ AddParameters""", _prefix + """climateService/addAllParameters""")
)
                      

}
                          
}
        
    