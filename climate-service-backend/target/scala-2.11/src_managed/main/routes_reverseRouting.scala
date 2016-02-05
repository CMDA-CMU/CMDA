// @SOURCE:/Users/weiwang/climate-service-backend/conf/routes
// @HASH:4088b6f2c67503eb4c2067f861a839393dcbcc17
// @DATE:Fri Jan 15 17:00:21 PST 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:260
// @LINE:259
// @LINE:258
// @LINE:257
// @LINE:256
// @LINE:253
// @LINE:252
// @LINE:248
// @LINE:247
// @LINE:246
// @LINE:245
// @LINE:241
// @LINE:240
// @LINE:236
// @LINE:235
// @LINE:234
// @LINE:233
// @LINE:230
// @LINE:229
// @LINE:228
// @LINE:227
// @LINE:224
// @LINE:223
// @LINE:222
// @LINE:221
// @LINE:220
// @LINE:219
// @LINE:217
// @LINE:216
// @LINE:215
// @LINE:214
// @LINE:213
// @LINE:212
// @LINE:211
// @LINE:210
// @LINE:206
// @LINE:205
// @LINE:204
// @LINE:203
// @LINE:202
// @LINE:201
// @LINE:199
// @LINE:198
// @LINE:197
// @LINE:196
// @LINE:194
// @LINE:193
// @LINE:191
// @LINE:189
// @LINE:188
// @LINE:186
// @LINE:185
// @LINE:184
// @LINE:179
// @LINE:176
// @LINE:173
// @LINE:172
// @LINE:169
// @LINE:166
// @LINE:165
// @LINE:164
// @LINE:163
// @LINE:162
// @LINE:161
// @LINE:160
// @LINE:143
// @LINE:142
// @LINE:141
// @LINE:140
// @LINE:139
// @LINE:136
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:129
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:122
// @LINE:121
// @LINE:120
// @LINE:119
// @LINE:118
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:106
// @LINE:105
// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
package controllers {

// @LINE:179
class ReverseAssets {


// @LINE:179
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:241
// @LINE:240
class ReverseTagController {


// @LINE:241
def deleteTag(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "tag/deleteTag")
}
                        

// @LINE:240
def createTag(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "tag/createTag")
}
                        

}
                          

// @LINE:136
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
class ReverseBookChapterPublicationController {


// @LINE:135
def updateBookChapterPublication(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "BookChapterPublication/updateBookPublication/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:133
def getBookChapterPublication(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "BookChapterPublication/getBookPublication/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:136
def deleteBookChapterPublication(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "BookChapterPublication/deleteBookPublication/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:132
def getAllBookChapterPublications(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "BookChapterPublication/getAllBookPublications/json")
}
                        

// @LINE:134
def addBookChapterPublication(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "BookChapterPublication/addBookPublication")
}
                        

}
                          

// @LINE:169
class ReverseUtilController {


// @LINE:169
def updatePicture(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "util/uploadPicture")
}
                        

}
                          

// @LINE:173
// @LINE:172
class ReverseGraphAlgorithmController {


// @LINE:173
def getKShortestPath(source:Integer, target:Integer, k:Integer): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "graphAlgorithm/getKthShortestPath/source/" + implicitly[PathBindable[Integer]].unbind("source", source) + "/target/" + implicitly[PathBindable[Integer]].unbind("target", target) + "/k/" + implicitly[PathBindable[Integer]].unbind("k", k) + "/json")
}
                        

// @LINE:172
def getShortestPath(source:Integer, target:Integer): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "graphAlgorithm/getShortestPath/source/" + implicitly[PathBindable[Integer]].unbind("source", source) + "/target/" + implicitly[PathBindable[Integer]].unbind("target", target) + "/json")
}
                        

}
                          

// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
class ReverseServiceConfigurationController {


// @LINE:51
def getServiceConfigurationsByUser(userId:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "serviceConfiguration/getAllServiceConfigurationsByUserId/" + implicitly[PathBindable[Long]].unbind("userId", userId) + "/json")
}
                        

// @LINE:47
def getServiceConfiguration(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "serviceConfiguration/getServiceConfiguration/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:49
def updateServiceConfigurationById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "serviceConfiguration/updateServiceConfiguration/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:48
def addServiceConfiguration(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "serviceConfiguration/addServiceConfiguration")
}
                        

// @LINE:50
def deleteServiceConfiguration(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "serviceConfiguration/deleteServiceConfiguration/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:230
// @LINE:229
// @LINE:228
// @LINE:227
class ReverseMailController {


// @LINE:229
def getInbox(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "mail/getInbox/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:227
def sendMail(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "mail/sendMail")
}
                        

// @LINE:228
def readMail(mailId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mail/getMailDetail/mailId/" + implicitly[PathBindable[Long]].unbind("mailId", mailId))
}
                        

// @LINE:230
def getOutbox(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "mail/getOutbox/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

}
                          

// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
class ReverseInstrumentController {


// @LINE:93
def getAllInstruments(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "instrument/getAllInstruments/json")
}
                        

// @LINE:94
def getInstrument(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "instrument/getInstrument/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:95
def addInstrument(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "instrument/addInstrument")
}
                        

// @LINE:96
def updateInstrumentById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "instrument/updateInstrument/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:97
def deleteInstrument(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "instrument/deleteInstrument/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:253
// @LINE:252
// @LINE:224
// @LINE:223
// @LINE:222
// @LINE:221
// @LINE:220
// @LINE:219
// @LINE:217
// @LINE:216
// @LINE:215
// @LINE:214
// @LINE:213
// @LINE:212
// @LINE:211
// @LINE:210
class ReverseWorkflowController {


// @LINE:215
def getWorkflowList(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "workflow/getWorkflowList/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:210
def post(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "workflow/post")
}
                        

// @LINE:221
def deleteTag(wfId:Long, tag:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "workflow/deleteTag/workflowId/" + implicitly[PathBindable[Long]].unbind("wfId", wfId) + "/tag/" + implicitly[PathBindable[String]].unbind("tag", dynamicString(tag)))
}
                        

// @LINE:213
def get(wfID:Long, userID:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "workflow/get/workflowID/" + implicitly[PathBindable[Long]].unbind("wfID", wfID) + "/userID/" + implicitly[PathBindable[Long]].unbind("userID", userID) + "/json")
}
                        

// @LINE:222
def getByTag(tag:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "workflow/getByTag/tag/" + implicitly[PathBindable[String]].unbind("tag", dynamicString(tag)))
}
                        

// @LINE:217
def getPublicWorkflow(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "workflow/getPublicWorkflow/json")
}
                        

// @LINE:216
def uploadImage(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "workflow/uploadImage/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:252
def addComment(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "workflow/addComment")
}
                        

// @LINE:223
def getByTitle(title:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "workflow/getByTitle/title/" + implicitly[PathBindable[String]].unbind("title", dynamicString(title)))
}
                        

// @LINE:214
def getTimeLine(id:Long, offset:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "workflow/getTimeline/" + implicitly[PathBindable[Long]].unbind("id", id) + "/offset/" + implicitly[PathBindable[Long]].unbind("offset", offset) + "/json")
}
                        

// @LINE:253
def getComments(workflowId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "workflow/getComments/" + implicitly[PathBindable[Long]].unbind("workflowId", workflowId))
}
                        

// @LINE:224
def getTop3WorkFlow(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "workflow/getTop3WorkFlow")
}
                        

// @LINE:211
def updateWorkflow(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "workflow/updateWorkflow")
}
                        

// @LINE:212
def deleteWorkflow(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "workflow/deleteWorkflow")
}
                        

// @LINE:220
def setTag(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "workflow/setTag")
}
                        

// @LINE:219
def getTags(wfId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "workflow/getTags/workflowId/" + implicitly[PathBindable[Long]].unbind("wfId", wfId))
}
                        

}
                          

// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
class ReverseServiceExecutionLogController {


// @LINE:68
def deleteServiceExecutionLog(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "serviceExecutionLog/deleteServiceExecutionLogs/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:65
def queryExecutionLogsByUser(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "serviceExecutionLog/queryExecutionLogsByUser")
}
                        

// @LINE:64
def addServiceExecutionLog(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "serviceExecutionLog/addServiceExecutionLog")
}
                        

// @LINE:66
def queryServiceExecutionLogs(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "serviceExecutionLog/queryServiceExecutionLogs")
}
                        

// @LINE:63
def getServiceExecutionLog(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "serviceExecutionLog/getServiceExecutionLog/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:62
def getAllServiceExecutionLogs(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "serviceExecutionLog/getAllServiceExecutionLog")
}
                        

// @LINE:67
def updateServiceExecutionLog(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "serviceExecutionLog/updateServiceExecutionLogs/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:143
// @LINE:142
// @LINE:141
// @LINE:140
// @LINE:139
class ReverseConferencePublicationController {


// @LINE:142
def updateConferencePublication(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "ConferencePublication/updateBookPublication/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:140
def getConferencePublication(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "ConferencePublication/getBookPublication/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:141
def addConferencePublication(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "ConferencePublication/addBookPublication")
}
                        

// @LINE:143
def deleteConferencePublication(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "ConferencePublication/deleteBookPublication/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:139
def getAllConferencePublications(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "ConferencePublication/getAllBookPublications/json")
}
                        

}
                          

// @LINE:176
class ReverseUserRecommendationController {


// @LINE:176
def getKSimilarUsers(id:Long, k:Integer): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "recommendation/getTopKSimilarUsersById/" + implicitly[PathBindable[Long]].unbind("id", id) + "/k/" + implicitly[PathBindable[Integer]].unbind("k", k) + "/json")
}
                        

}
                          

// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
class ReverseDatasetLogController {


// @LINE:73
def getAllDatasetLogs(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "datasetLog/getAllDatasetLogs/json")
}
                        

// @LINE:77
def getUsersByServiceAndDataset(serviceId:Long, datasetId:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "datasetLog/getUsersByServiceAndDataset/serviceId/" + implicitly[PathBindable[Long]].unbind("serviceId", serviceId) + "/datasetId/" + implicitly[PathBindable[Long]].unbind("datasetId", datasetId) + "/json")
}
                        

// @LINE:79
def queryDatasets(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "datasetLog/queryDatasets")
}
                        

// @LINE:81
def updateDatasetLogById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "datasetLog/updateDatasetLog/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:78
def addDatasetLog(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "datasetLog/addDatasetLog")
}
                        

// @LINE:74
def getDatasetLog(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "datasetLog/getDatasetLog/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:82
def deleteDatasetLog(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "datasetLog/deleteDatasetLog/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:80
def queryVariables(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "datasetLog/queryVariables")
}
                        

// @LINE:75
def getServiceExecutionLogsByDatasetAndUser(userId:Long, datasetId:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "datasetLog/getServiceExecutionLogsByDatasetAndUser/datasetId/" + implicitly[PathBindable[Long]].unbind("datasetId", datasetId) + "/userId/" + implicitly[PathBindable[Long]].unbind("userId", userId) + "/json")
}
                        

// @LINE:76
def getDatasetLogsByServiceAndUser(userId:Long, serviceId:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "datasetLog/getDatasetLogsByServiceAndUser/serviceId/" + implicitly[PathBindable[Long]].unbind("serviceId", serviceId) + "/userId/" + implicitly[PathBindable[Long]].unbind("userId", userId) + "/json")
}
                        

}
                          

// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
class ReverseBugReportController {


// @LINE:30
def getBugReport(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "bugReport/getBugReport/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:31
def getAllBugReports(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "bugReport/getAllBugReports/json")
}
                        

// @LINE:34
def addBugReport(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "bugReport/addBugReport")
}
                        

// @LINE:32
def getAllUnsolvedBugReports(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "bugReport/getAllUnsolvedBugReports/json")
}
                        

// @LINE:36
def deleteBugReport(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "bugReport/deleteBugReport/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:35
def updateBugReportById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "bugReport/updateBugReport/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:33
def getAllSolvedBugReports(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "bugReport/getAllSolvedBugReports/json")
}
                        

}
                          

// @LINE:166
// @LINE:165
// @LINE:164
// @LINE:163
// @LINE:162
// @LINE:161
// @LINE:160
class ReverseAnalyticsController {


// @LINE:162
def getOneUserWithAllServiceAndCount(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "analytics/getOneUserWithAllServiceAndCountByUserId/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:163
def getOneServiceWithAllUserAndCount(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "analytics/getOneServiceWithAllUserAndCountByServiceId/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:166
def getRelationalKnowledgeGraph(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("POST", _prefix + { _defaultPrefix } + "analytics/getRelationalKnowledgeGraph/json")
}
                        

// @LINE:164
def getOneServiceWithAllDatasetAndCount(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "analytics/getOneServiceWithAllDatasetAndCountByServiceId/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:165
def getOneDatasetWithAllServiceAndCount(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "analytics/getOneDatasetWithAllServiceAndCountByDatasetId/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:161
def getOneDatasetWithAllUserAndCount(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "analytics/getOneDatasetWithAllUserAndCountByDatasetId/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:160
def getOneUserWithAllDatasetAndCount(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "analytics/getOneUserWithAllDatasetAndCountByUserId/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

}
                          

// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
class ReverseClimateServiceCommentController {


// @LINE:39
def getComment(id:Long, email:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateServiceComment/getComment/" + implicitly[PathBindable[Long]].unbind("id", id) + "/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)) + "/json")
}
                        

// @LINE:40
def searchCommentByHashTag(hashTag:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "climateServiceComment/searchCommentByHashTag/" + implicitly[PathBindable[String]].unbind("hashTag", dynamicString(hashTag)))
}
                        

// @LINE:43
def editComment(): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "climateServiceComment/editComment")
}
                        

// @LINE:41
def getMentions(email:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "climateServiceComment/getMentions/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)))
}
                        

// @LINE:44
def deleteComment(service_id:Long, comment_id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "climateServiceComment/deleteComment/" + implicitly[PathBindable[Long]].unbind("service_id", service_id) + "/" + implicitly[PathBindable[Long]].unbind("comment_id", comment_id))
}
                        

// @LINE:42
def postComment(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "climateServiceComment/postComment")
}
                        

}
                          

// @LINE:122
// @LINE:121
// @LINE:120
// @LINE:119
// @LINE:118
class ReverseJournalPublicationController {


// @LINE:119
def getJournalPublicationById(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "journalPublication/getJournalPublication/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:118
def getAllJournalPublications(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "journalPublication/getAllJournalPublications/json")
}
                        

// @LINE:122
def deleteJournalPublicationById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "journalPublication/deleteJournalPublication/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:121
def updateJournalPublicationById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "journalPublication/updateJournalPublication/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:120
def addJournalPublication(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "journalPublication/addJournalPublication")
}
                        

}
                          

// @LINE:206
// @LINE:205
// @LINE:204
// @LINE:203
// @LINE:202
// @LINE:201
// @LINE:199
// @LINE:198
// @LINE:197
// @LINE:196
// @LINE:194
// @LINE:193
// @LINE:191
// @LINE:189
// @LINE:188
// @LINE:186
// @LINE:185
// @LINE:184
class ReverseUserController {


// @LINE:198
def getFollowers(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users/getFollowers/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:205
def getFriends(userId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users/getFriends/userId/" + implicitly[PathBindable[Long]].unbind("userId", userId))
}
                        

// @LINE:203
def acceptFriendRequest(userId:Long, senderId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users/acceptFriendRequest/userId/" + implicitly[PathBindable[Long]].unbind("userId", userId) + "/sender/" + implicitly[PathBindable[Long]].unbind("senderId", senderId))
}
                        

// @LINE:199
def getFollowees(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users/getFollowees/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:189
def userLogin(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "users/login")
}
                        

// @LINE:188
def userRegister(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "users/register")
}
                        

// @LINE:197
def userUnfollow(followerId:Long, followeeId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users/unfollow/followerId/" + implicitly[PathBindable[Long]].unbind("followerId", followerId) + "/followeeId/" + implicitly[PathBindable[Long]].unbind("followeeId", followeeId))
}
                        

// @LINE:185
def getAllUsers(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "users/getAllUsers/json")
}
                        

// @LINE:201
def sendFriendRequest(senderId:Long, receiverId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users/sendFriendRequest/sender/" + implicitly[PathBindable[Long]].unbind("senderId", senderId) + "/receiver/" + implicitly[PathBindable[Long]].unbind("receiverId", receiverId))
}
                        

// @LINE:184
def deleteUser(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "users/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:202
def getFriendRequests(userId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users/getFriendRequests/userId/" + implicitly[PathBindable[Long]].unbind("userId", userId))
}
                        

// @LINE:191
def userSearch(display_name:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "users/search/" + implicitly[PathBindable[String]].unbind("display_name", dynamicString(display_name)) + "/json")
}
                        

// @LINE:196
def userFollow(followerId:Long, followeeId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users/follow/followerId/" + implicitly[PathBindable[Long]].unbind("followerId", followerId) + "/followeeId/" + implicitly[PathBindable[Long]].unbind("followeeId", followeeId))
}
                        

// @LINE:186
def deleteUserByUserNameandPassword(userName:String, password:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "users/delete/userName/" + implicitly[PathBindable[String]].unbind("userName", dynamicString(userName)) + "/password/" + implicitly[PathBindable[String]].unbind("password", dynamicString(password)))
}
                        

// @LINE:204
def rejectFriendRequest(userId:Long, senderId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users/rejectFriendRequest/userId/" + implicitly[PathBindable[Long]].unbind("userId", userId) + "/sender/" + implicitly[PathBindable[Long]].unbind("senderId", senderId))
}
                        

// @LINE:206
def deleteFriend(userId:Long, friendId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users/deleteFriend/userId/" + implicitly[PathBindable[Long]].unbind("userId", userId) + "/friendId/" + implicitly[PathBindable[Long]].unbind("friendId", friendId))
}
                        

// @LINE:194
def getProfile(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "users/getprofile/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:193
def setProfile(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "users/setprofile/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:236
// @LINE:235
// @LINE:234
// @LINE:233
class ReverseSuggestionsController {


// @LINE:235
def voteToSuggestion(suggestionId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "suggestion/voteToSuggestion/" + implicitly[PathBindable[Long]].unbind("suggestionId", suggestionId))
}
                        

// @LINE:234
def addTag(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "suggestion/addTag")
}
                        

// @LINE:236
def getSuggestionForWorkflow(workflowId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "suggestion/getSuggestionForWorkflow/" + implicitly[PathBindable[Long]].unbind("workflowId", workflowId))
}
                        

// @LINE:233
def publishSuggestion(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "suggestion/publishSuggestion")
}
                        

}
                          

// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:109
class ReverseParameterController {


// @LINE:109
def getAllParameters(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "parameter/getAllParameters/json")
}
                        

// @LINE:111
def getParameterById(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "parameter/getParameter/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:113
def updateParameterById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "parameter/updateParameter/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:110
def getParameterByName(id:Long, name:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "parameter/getParameter/service/" + implicitly[PathBindable[Long]].unbind("id", id) + "/name/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/json")
}
                        

// @LINE:114
def updateParameterByName(oldName:String): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "parameter/updateParameter/name/" + implicitly[PathBindable[String]].unbind("oldName", dynamicString(oldName)))
}
                        

// @LINE:115
def deleteParameterByName(id:Long, name:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "parameter/deleteParameter/service/" + implicitly[PathBindable[Long]].unbind("id", id) + "/name/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                        

// @LINE:112
def addParameter(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "parameter/addParameter")
}
                        

}
                          

// @LINE:248
// @LINE:247
// @LINE:246
// @LINE:245
class ReverseGroupUsersController {


// @LINE:248
def getGroupMember(groupId:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "group/getGroupMember/" + implicitly[PathBindable[Long]].unbind("groupId", groupId) + "/json")
}
                        

// @LINE:247
def getGroupList(userID:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "group/getGroupList/" + implicitly[PathBindable[Long]].unbind("userID", userID) + "/json")
}
                        

// @LINE:245
def createGroup(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "group/createGroup")
}
                        

// @LINE:246
def addMembersToGroup(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "group/addMembersToGroup")
}
                        

}
                          

// @LINE:260
// @LINE:259
// @LINE:258
// @LINE:257
// @LINE:256
class ReverseCommentController {


// @LINE:259
def thumbUp(commentId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Comment/thumbUp/" + implicitly[PathBindable[Long]].unbind("commentId", commentId))
}
                        

// @LINE:260
def thumbDown(commentId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Comment/thumbDown/" + implicitly[PathBindable[Long]].unbind("commentId", commentId))
}
                        

// @LINE:256
def addReply(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "Comment/addReply")
}
                        

// @LINE:258
// @LINE:257
def getReply(commentId:Long): Call = {
   (commentId: @unchecked) match {
// @LINE:257
case (commentId)  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + "Comment/getReply/" + implicitly[PathBindable[Long]].unbind("commentId", commentId))
                                         
   }
}
                                                

}
                          

// @LINE:106
// @LINE:105
// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
class ReverseDatasetController {


// @LINE:101
def getDataset(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "dataset/getDataset/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:100
def getAllDatasets(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "dataset/getAllDatasets/json")
}
                        

// @LINE:105
def queryDatasets(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "dataset/queryDataset")
}
                        

// @LINE:104
def deleteDataset(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "dataset/deleteDataset/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:102
def addDataset(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "dataset/addDataset")
}
                        

// @LINE:103
def updateDatasetById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "dataset/updateDataset/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:106
def getMostKPopularDatasets(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "dataset/getMostKPopularDatasets")
}
                        

}
                          

// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
class ReverseServiceConfigurationItemController {


// @LINE:55
def getServiceConfigurationItemsInServiceConfig(serviceConfigId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "serviceConfigurationItem/serviceConfigurationItemByServiceConfig/" + implicitly[PathBindable[Long]].unbind("serviceConfigId", serviceConfigId))
}
                        

// @LINE:58
def updateServiceConfigurationItemById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "serviceConfigurationItem/updateServiceConfigurationItem/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:54
def getServiceConfigurationItemById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "serviceConfigurationItem/serviceConfigurationItemById/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:57
def addServiceConfigurationItem(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "serviceConfigurationItem/addServiceConfigurationItem")
}
                        

// @LINE:59
def deleteServiceConfigurationItemById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "serviceConfigurationItem/deleteServiceConfigurationItemById/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:56
def getServiceConfigurationItemByParameterId(paramId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "serviceConfigurationItem/serviceConfigurationItemByParamId/" + implicitly[PathBindable[Long]].unbind("paramId", paramId))
}
                        

}
                          

// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseClimateServiceController {


// @LINE:13
def getAllClimateServicesOrderByCreateTime(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getAllMostRecentClimateServicesByCreateTime/json")
}
                        

// @LINE:23
def deleteClimateServiceById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "climateService/deleteClimateService/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:15
def getAllClimateServicesOrderByCount(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getAllMostUsedClimateServices/json")
}
                        

// @LINE:20
def addServiceEntry(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "climateService/addServiceEntry")
}
                        

// @LINE:27
def savePage(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "climateService/savePage")
}
                        

// @LINE:17
def addClimateService(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "climateService/addClimateService")
}
                        

// @LINE:16
def getTopKUsedClimateServicesByDatasetId(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getTopKUsedClimateServicesByDatasetId/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:12
def getAllClimateServices(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getAllClimateServices/json")
}
                        

// @LINE:10
def getClimateService(name:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getClimateService/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/json")
}
                        

// @LINE:21
def updateClimateServiceById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "climateService/updateClimateService/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:11
def getClimateServiceById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getClimateService/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:14
def getAllClimateServicesOrderByLatestAccessTime(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getAllMostRecentClimateServicesByLatestAccessTime/json")
}
                        

// @LINE:19
def getAllServiceEntries(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getAllServiceEntries/json")
}
                        

// @LINE:22
def updateClimateServiceByName(oldName:String): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "climateService/updateClimateService/name/" + implicitly[PathBindable[String]].unbind("oldName", dynamicString(oldName)))
}
                        

// @LINE:18
def queryClimateServices(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "climateService/queryClimateService")
}
                        

// @LINE:24
def deleteClimateServiceByName(name:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "climateService/deleteClimateService/name/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                        

}
                          

// @LINE:129
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
class ReverseBookPublicationController {


// @LINE:127
def addBookPublication(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "BookPublication/addBookPublication")
}
                        

// @LINE:125
def getAllBookPublications(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "BookPublication/getAllBookPublications/json")
}
                        

// @LINE:129
def deleteBookPublicationById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "BookPublication/deleteBookPublication/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:126
def getBookPublicationById(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "BookPublication/getBookPublication/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:128
def updateBookPublicationById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "BookPublication/updateBookPublication/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          
}
                  


// @LINE:260
// @LINE:259
// @LINE:258
// @LINE:257
// @LINE:256
// @LINE:253
// @LINE:252
// @LINE:248
// @LINE:247
// @LINE:246
// @LINE:245
// @LINE:241
// @LINE:240
// @LINE:236
// @LINE:235
// @LINE:234
// @LINE:233
// @LINE:230
// @LINE:229
// @LINE:228
// @LINE:227
// @LINE:224
// @LINE:223
// @LINE:222
// @LINE:221
// @LINE:220
// @LINE:219
// @LINE:217
// @LINE:216
// @LINE:215
// @LINE:214
// @LINE:213
// @LINE:212
// @LINE:211
// @LINE:210
// @LINE:206
// @LINE:205
// @LINE:204
// @LINE:203
// @LINE:202
// @LINE:201
// @LINE:199
// @LINE:198
// @LINE:197
// @LINE:196
// @LINE:194
// @LINE:193
// @LINE:191
// @LINE:189
// @LINE:188
// @LINE:186
// @LINE:185
// @LINE:184
// @LINE:179
// @LINE:176
// @LINE:173
// @LINE:172
// @LINE:169
// @LINE:166
// @LINE:165
// @LINE:164
// @LINE:163
// @LINE:162
// @LINE:161
// @LINE:160
// @LINE:143
// @LINE:142
// @LINE:141
// @LINE:140
// @LINE:139
// @LINE:136
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:129
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:122
// @LINE:121
// @LINE:120
// @LINE:119
// @LINE:118
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:106
// @LINE:105
// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:179
class ReverseAssets {


// @LINE:179
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:241
// @LINE:240
class ReverseTagController {


// @LINE:241
def deleteTag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TagController.deleteTag",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tag/deleteTag"})
      }
   """
)
                        

// @LINE:240
def createTag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TagController.createTag",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tag/createTag"})
      }
   """
)
                        

}
              

// @LINE:136
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
class ReverseBookChapterPublicationController {


// @LINE:135
def updateBookChapterPublication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BookChapterPublicationController.updateBookChapterPublication",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "BookChapterPublication/updateBookPublication/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:133
def getBookChapterPublication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BookChapterPublicationController.getBookChapterPublication",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "BookChapterPublication/getBookPublication/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:136
def deleteBookChapterPublication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BookChapterPublicationController.deleteBookChapterPublication",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "BookChapterPublication/deleteBookPublication/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:132
def getAllBookChapterPublications : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BookChapterPublicationController.getAllBookChapterPublications",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "BookChapterPublication/getAllBookPublications/json"})
      }
   """
)
                        

// @LINE:134
def addBookChapterPublication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BookChapterPublicationController.addBookChapterPublication",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "BookChapterPublication/addBookPublication"})
      }
   """
)
                        

}
              

// @LINE:169
class ReverseUtilController {


// @LINE:169
def updatePicture : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UtilController.updatePicture",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "util/uploadPicture"})
      }
   """
)
                        

}
              

// @LINE:173
// @LINE:172
class ReverseGraphAlgorithmController {


// @LINE:173
def getKShortestPath : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.GraphAlgorithmController.getKShortestPath",
   """
      function(source,target,k) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "graphAlgorithm/getKthShortestPath/source/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("source", source) + "/target/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("target", target) + "/k/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("k", k) + "/json"})
      }
   """
)
                        

// @LINE:172
def getShortestPath : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.GraphAlgorithmController.getShortestPath",
   """
      function(source,target) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "graphAlgorithm/getShortestPath/source/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("source", source) + "/target/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("target", target) + "/json"})
      }
   """
)
                        

}
              

// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
class ReverseServiceConfigurationController {


// @LINE:51
def getServiceConfigurationsByUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceConfigurationController.getServiceConfigurationsByUser",
   """
      function(userId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceConfiguration/getAllServiceConfigurationsByUserId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId) + "/json"})
      }
   """
)
                        

// @LINE:47
def getServiceConfiguration : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceConfigurationController.getServiceConfiguration",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceConfiguration/getServiceConfiguration/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:49
def updateServiceConfigurationById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceConfigurationController.updateServiceConfigurationById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceConfiguration/updateServiceConfiguration/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:48
def addServiceConfiguration : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceConfigurationController.addServiceConfiguration",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceConfiguration/addServiceConfiguration"})
      }
   """
)
                        

// @LINE:50
def deleteServiceConfiguration : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceConfigurationController.deleteServiceConfiguration",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceConfiguration/deleteServiceConfiguration/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:230
// @LINE:229
// @LINE:228
// @LINE:227
class ReverseMailController {


// @LINE:229
def getInbox : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MailController.getInbox",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mail/getInbox/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:227
def sendMail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MailController.sendMail",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mail/sendMail"})
      }
   """
)
                        

// @LINE:228
def readMail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MailController.readMail",
   """
      function(mailId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mail/getMailDetail/mailId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("mailId", mailId)})
      }
   """
)
                        

// @LINE:230
def getOutbox : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MailController.getOutbox",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mail/getOutbox/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

}
              

// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
class ReverseInstrumentController {


// @LINE:93
def getAllInstruments : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InstrumentController.getAllInstruments",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "instrument/getAllInstruments/json"})
      }
   """
)
                        

// @LINE:94
def getInstrument : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InstrumentController.getInstrument",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "instrument/getInstrument/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:95
def addInstrument : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InstrumentController.addInstrument",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "instrument/addInstrument"})
      }
   """
)
                        

// @LINE:96
def updateInstrumentById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InstrumentController.updateInstrumentById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "instrument/updateInstrument/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:97
def deleteInstrument : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InstrumentController.deleteInstrument",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "instrument/deleteInstrument/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:253
// @LINE:252
// @LINE:224
// @LINE:223
// @LINE:222
// @LINE:221
// @LINE:220
// @LINE:219
// @LINE:217
// @LINE:216
// @LINE:215
// @LINE:214
// @LINE:213
// @LINE:212
// @LINE:211
// @LINE:210
class ReverseWorkflowController {


// @LINE:215
def getWorkflowList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.getWorkflowList",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/getWorkflowList/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:210
def post : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.post",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/post"})
      }
   """
)
                        

// @LINE:221
def deleteTag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.deleteTag",
   """
      function(wfId,tag) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/deleteTag/workflowId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("wfId", wfId) + "/tag/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("tag", encodeURIComponent(tag))})
      }
   """
)
                        

// @LINE:213
def get : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.get",
   """
      function(wfID,userID) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/get/workflowID/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("wfID", wfID) + "/userID/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userID", userID) + "/json"})
      }
   """
)
                        

// @LINE:222
def getByTag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.getByTag",
   """
      function(tag) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/getByTag/tag/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("tag", encodeURIComponent(tag))})
      }
   """
)
                        

// @LINE:217
def getPublicWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.getPublicWorkflow",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/getPublicWorkflow/json"})
      }
   """
)
                        

// @LINE:216
def uploadImage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.uploadImage",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/uploadImage/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:252
def addComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.addComment",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/addComment"})
      }
   """
)
                        

// @LINE:223
def getByTitle : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.getByTitle",
   """
      function(title) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/getByTitle/title/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("title", encodeURIComponent(title))})
      }
   """
)
                        

// @LINE:214
def getTimeLine : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.getTimeLine",
   """
      function(id,offset) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/getTimeline/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/offset/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("offset", offset) + "/json"})
      }
   """
)
                        

// @LINE:253
def getComments : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.getComments",
   """
      function(workflowId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/getComments/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("workflowId", workflowId)})
      }
   """
)
                        

// @LINE:224
def getTop3WorkFlow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.getTop3WorkFlow",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/getTop3WorkFlow"})
      }
   """
)
                        

// @LINE:211
def updateWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.updateWorkflow",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/updateWorkflow"})
      }
   """
)
                        

// @LINE:212
def deleteWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.deleteWorkflow",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/deleteWorkflow"})
      }
   """
)
                        

// @LINE:220
def setTag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.setTag",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/setTag"})
      }
   """
)
                        

// @LINE:219
def getTags : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.getTags",
   """
      function(wfId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/getTags/workflowId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("wfId", wfId)})
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
class ReverseServiceExecutionLogController {


// @LINE:68
def deleteServiceExecutionLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceExecutionLogController.deleteServiceExecutionLog",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceExecutionLog/deleteServiceExecutionLogs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:65
def queryExecutionLogsByUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceExecutionLogController.queryExecutionLogsByUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceExecutionLog/queryExecutionLogsByUser"})
      }
   """
)
                        

// @LINE:64
def addServiceExecutionLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceExecutionLogController.addServiceExecutionLog",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceExecutionLog/addServiceExecutionLog"})
      }
   """
)
                        

// @LINE:66
def queryServiceExecutionLogs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceExecutionLogController.queryServiceExecutionLogs",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceExecutionLog/queryServiceExecutionLogs"})
      }
   """
)
                        

// @LINE:63
def getServiceExecutionLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceExecutionLogController.getServiceExecutionLog",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceExecutionLog/getServiceExecutionLog/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:62
def getAllServiceExecutionLogs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceExecutionLogController.getAllServiceExecutionLogs",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceExecutionLog/getAllServiceExecutionLog"})
      }
   """
)
                        

// @LINE:67
def updateServiceExecutionLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceExecutionLogController.updateServiceExecutionLog",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceExecutionLog/updateServiceExecutionLogs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:143
// @LINE:142
// @LINE:141
// @LINE:140
// @LINE:139
class ReverseConferencePublicationController {


// @LINE:142
def updateConferencePublication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ConferencePublicationController.updateConferencePublication",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "ConferencePublication/updateBookPublication/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:140
def getConferencePublication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ConferencePublicationController.getConferencePublication",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ConferencePublication/getBookPublication/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:141
def addConferencePublication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ConferencePublicationController.addConferencePublication",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ConferencePublication/addBookPublication"})
      }
   """
)
                        

// @LINE:143
def deleteConferencePublication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ConferencePublicationController.deleteConferencePublication",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "ConferencePublication/deleteBookPublication/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:139
def getAllConferencePublications : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ConferencePublicationController.getAllConferencePublications",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ConferencePublication/getAllBookPublications/json"})
      }
   """
)
                        

}
              

// @LINE:176
class ReverseUserRecommendationController {


// @LINE:176
def getKSimilarUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserRecommendationController.getKSimilarUsers",
   """
      function(id,k) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recommendation/getTopKSimilarUsersById/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/k/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("k", k) + "/json"})
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
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
class ReverseDatasetLogController {


// @LINE:73
def getAllDatasetLogs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetLogController.getAllDatasetLogs",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "datasetLog/getAllDatasetLogs/json"})
      }
   """
)
                        

// @LINE:77
def getUsersByServiceAndDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetLogController.getUsersByServiceAndDataset",
   """
      function(serviceId,datasetId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "datasetLog/getUsersByServiceAndDataset/serviceId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("serviceId", serviceId) + "/datasetId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("datasetId", datasetId) + "/json"})
      }
   """
)
                        

// @LINE:79
def queryDatasets : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetLogController.queryDatasets",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "datasetLog/queryDatasets"})
      }
   """
)
                        

// @LINE:81
def updateDatasetLogById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetLogController.updateDatasetLogById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "datasetLog/updateDatasetLog/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:78
def addDatasetLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetLogController.addDatasetLog",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "datasetLog/addDatasetLog"})
      }
   """
)
                        

// @LINE:74
def getDatasetLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetLogController.getDatasetLog",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "datasetLog/getDatasetLog/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:82
def deleteDatasetLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetLogController.deleteDatasetLog",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "datasetLog/deleteDatasetLog/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:80
def queryVariables : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetLogController.queryVariables",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "datasetLog/queryVariables"})
      }
   """
)
                        

// @LINE:75
def getServiceExecutionLogsByDatasetAndUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetLogController.getServiceExecutionLogsByDatasetAndUser",
   """
      function(userId,datasetId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "datasetLog/getServiceExecutionLogsByDatasetAndUser/datasetId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("datasetId", datasetId) + "/userId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId) + "/json"})
      }
   """
)
                        

// @LINE:76
def getDatasetLogsByServiceAndUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetLogController.getDatasetLogsByServiceAndUser",
   """
      function(userId,serviceId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "datasetLog/getDatasetLogsByServiceAndUser/serviceId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("serviceId", serviceId) + "/userId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId) + "/json"})
      }
   """
)
                        

}
              

// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
class ReverseBugReportController {


// @LINE:30
def getBugReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.getBugReport",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/getBugReport/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:31
def getAllBugReports : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.getAllBugReports",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/getAllBugReports/json"})
      }
   """
)
                        

// @LINE:34
def addBugReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.addBugReport",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/addBugReport"})
      }
   """
)
                        

// @LINE:32
def getAllUnsolvedBugReports : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.getAllUnsolvedBugReports",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/getAllUnsolvedBugReports/json"})
      }
   """
)
                        

// @LINE:36
def deleteBugReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.deleteBugReport",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/deleteBugReport/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:35
def updateBugReportById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.updateBugReportById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/updateBugReport/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:33
def getAllSolvedBugReports : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.getAllSolvedBugReports",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/getAllSolvedBugReports/json"})
      }
   """
)
                        

}
              

// @LINE:166
// @LINE:165
// @LINE:164
// @LINE:163
// @LINE:162
// @LINE:161
// @LINE:160
class ReverseAnalyticsController {


// @LINE:162
def getOneUserWithAllServiceAndCount : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnalyticsController.getOneUserWithAllServiceAndCount",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "analytics/getOneUserWithAllServiceAndCountByUserId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:163
def getOneServiceWithAllUserAndCount : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnalyticsController.getOneServiceWithAllUserAndCount",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "analytics/getOneServiceWithAllUserAndCountByServiceId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:166
def getRelationalKnowledgeGraph : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnalyticsController.getRelationalKnowledgeGraph",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "analytics/getRelationalKnowledgeGraph/json"})
      }
   """
)
                        

// @LINE:164
def getOneServiceWithAllDatasetAndCount : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnalyticsController.getOneServiceWithAllDatasetAndCount",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "analytics/getOneServiceWithAllDatasetAndCountByServiceId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:165
def getOneDatasetWithAllServiceAndCount : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnalyticsController.getOneDatasetWithAllServiceAndCount",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "analytics/getOneDatasetWithAllServiceAndCountByDatasetId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:161
def getOneDatasetWithAllUserAndCount : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnalyticsController.getOneDatasetWithAllUserAndCount",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "analytics/getOneDatasetWithAllUserAndCountByDatasetId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:160
def getOneUserWithAllDatasetAndCount : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnalyticsController.getOneUserWithAllDatasetAndCount",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "analytics/getOneUserWithAllDatasetAndCountByUserId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

}
              

// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
class ReverseClimateServiceCommentController {


// @LINE:39
def getComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceCommentController.getComment",
   """
      function(id,email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateServiceComment/getComment/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email)) + "/json"})
      }
   """
)
                        

// @LINE:40
def searchCommentByHashTag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceCommentController.searchCommentByHashTag",
   """
      function(hashTag) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateServiceComment/searchCommentByHashTag/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("hashTag", encodeURIComponent(hashTag))})
      }
   """
)
                        

// @LINE:43
def editComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceCommentController.editComment",
   """
      function() {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "climateServiceComment/editComment"})
      }
   """
)
                        

// @LINE:41
def getMentions : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceCommentController.getMentions",
   """
      function(email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateServiceComment/getMentions/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email))})
      }
   """
)
                        

// @LINE:44
def deleteComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceCommentController.deleteComment",
   """
      function(service_id,comment_id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "climateServiceComment/deleteComment/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("service_id", service_id) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("comment_id", comment_id)})
      }
   """
)
                        

// @LINE:42
def postComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceCommentController.postComment",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateServiceComment/postComment"})
      }
   """
)
                        

}
              

// @LINE:122
// @LINE:121
// @LINE:120
// @LINE:119
// @LINE:118
class ReverseJournalPublicationController {


// @LINE:119
def getJournalPublicationById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.JournalPublicationController.getJournalPublicationById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "journalPublication/getJournalPublication/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:118
def getAllJournalPublications : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.JournalPublicationController.getAllJournalPublications",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "journalPublication/getAllJournalPublications/json"})
      }
   """
)
                        

// @LINE:122
def deleteJournalPublicationById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.JournalPublicationController.deleteJournalPublicationById",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "journalPublication/deleteJournalPublication/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:121
def updateJournalPublicationById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.JournalPublicationController.updateJournalPublicationById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "journalPublication/updateJournalPublication/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:120
def addJournalPublication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.JournalPublicationController.addJournalPublication",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "journalPublication/addJournalPublication"})
      }
   """
)
                        

}
              

// @LINE:206
// @LINE:205
// @LINE:204
// @LINE:203
// @LINE:202
// @LINE:201
// @LINE:199
// @LINE:198
// @LINE:197
// @LINE:196
// @LINE:194
// @LINE:193
// @LINE:191
// @LINE:189
// @LINE:188
// @LINE:186
// @LINE:185
// @LINE:184
class ReverseUserController {


// @LINE:198
def getFollowers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getFollowers",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getFollowers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:205
def getFriends : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getFriends",
   """
      function(userId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getFriends/userId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId)})
      }
   """
)
                        

// @LINE:203
def acceptFriendRequest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.acceptFriendRequest",
   """
      function(userId,senderId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/acceptFriendRequest/userId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId) + "/sender/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("senderId", senderId)})
      }
   """
)
                        

// @LINE:199
def getFollowees : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getFollowees",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getFollowees/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:189
def userLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.userLogin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/login"})
      }
   """
)
                        

// @LINE:188
def userRegister : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.userRegister",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/register"})
      }
   """
)
                        

// @LINE:197
def userUnfollow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.userUnfollow",
   """
      function(followerId,followeeId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/unfollow/followerId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("followerId", followerId) + "/followeeId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("followeeId", followeeId)})
      }
   """
)
                        

// @LINE:185
def getAllUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getAllUsers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getAllUsers/json"})
      }
   """
)
                        

// @LINE:201
def sendFriendRequest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.sendFriendRequest",
   """
      function(senderId,receiverId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/sendFriendRequest/sender/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("senderId", senderId) + "/receiver/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("receiverId", receiverId)})
      }
   """
)
                        

// @LINE:184
def deleteUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.deleteUser",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "users/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:202
def getFriendRequests : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getFriendRequests",
   """
      function(userId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getFriendRequests/userId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId)})
      }
   """
)
                        

// @LINE:191
def userSearch : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.userSearch",
   """
      function(display_name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/search/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("display_name", encodeURIComponent(display_name)) + "/json"})
      }
   """
)
                        

// @LINE:196
def userFollow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.userFollow",
   """
      function(followerId,followeeId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/follow/followerId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("followerId", followerId) + "/followeeId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("followeeId", followeeId)})
      }
   """
)
                        

// @LINE:186
def deleteUserByUserNameandPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.deleteUserByUserNameandPassword",
   """
      function(userName,password) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "users/delete/userName/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userName", encodeURIComponent(userName)) + "/password/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("password", encodeURIComponent(password))})
      }
   """
)
                        

// @LINE:204
def rejectFriendRequest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.rejectFriendRequest",
   """
      function(userId,senderId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/rejectFriendRequest/userId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId) + "/sender/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("senderId", senderId)})
      }
   """
)
                        

// @LINE:206
def deleteFriend : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.deleteFriend",
   """
      function(userId,friendId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/deleteFriend/userId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId) + "/friendId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("friendId", friendId)})
      }
   """
)
                        

// @LINE:194
def getProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getProfile",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getprofile/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:193
def setProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.setProfile",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "users/setprofile/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:236
// @LINE:235
// @LINE:234
// @LINE:233
class ReverseSuggestionsController {


// @LINE:235
def voteToSuggestion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SuggestionsController.voteToSuggestion",
   """
      function(suggestionId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestion/voteToSuggestion/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("suggestionId", suggestionId)})
      }
   """
)
                        

// @LINE:234
def addTag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SuggestionsController.addTag",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestion/addTag"})
      }
   """
)
                        

// @LINE:236
def getSuggestionForWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SuggestionsController.getSuggestionForWorkflow",
   """
      function(workflowId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestion/getSuggestionForWorkflow/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("workflowId", workflowId)})
      }
   """
)
                        

// @LINE:233
def publishSuggestion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SuggestionsController.publishSuggestion",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestion/publishSuggestion"})
      }
   """
)
                        

}
              

// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:109
class ReverseParameterController {


// @LINE:109
def getAllParameters : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.getAllParameters",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/getAllParameters/json"})
      }
   """
)
                        

// @LINE:111
def getParameterById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.getParameterById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/getParameter/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:113
def updateParameterById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.updateParameterById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/updateParameter/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:110
def getParameterByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.getParameterByName",
   """
      function(id,name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/getParameter/service/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/json"})
      }
   """
)
                        

// @LINE:114
def updateParameterByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.updateParameterByName",
   """
      function(oldName) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/updateParameter/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("oldName", encodeURIComponent(oldName))})
      }
   """
)
                        

// @LINE:115
def deleteParameterByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.deleteParameterByName",
   """
      function(id,name) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/deleteParameter/service/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        

// @LINE:112
def addParameter : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.addParameter",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/addParameter"})
      }
   """
)
                        

}
              

// @LINE:248
// @LINE:247
// @LINE:246
// @LINE:245
class ReverseGroupUsersController {


// @LINE:248
def getGroupMember : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.GroupUsersController.getGroupMember",
   """
      function(groupId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "group/getGroupMember/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("groupId", groupId) + "/json"})
      }
   """
)
                        

// @LINE:247
def getGroupList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.GroupUsersController.getGroupList",
   """
      function(userID) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "group/getGroupList/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userID", userID) + "/json"})
      }
   """
)
                        

// @LINE:245
def createGroup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.GroupUsersController.createGroup",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "group/createGroup"})
      }
   """
)
                        

// @LINE:246
def addMembersToGroup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.GroupUsersController.addMembersToGroup",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "group/addMembersToGroup"})
      }
   """
)
                        

}
              

// @LINE:260
// @LINE:259
// @LINE:258
// @LINE:257
// @LINE:256
class ReverseCommentController {


// @LINE:259
def thumbUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CommentController.thumbUp",
   """
      function(commentId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Comment/thumbUp/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("commentId", commentId)})
      }
   """
)
                        

// @LINE:260
def thumbDown : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CommentController.thumbDown",
   """
      function(commentId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Comment/thumbDown/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("commentId", commentId)})
      }
   """
)
                        

// @LINE:256
def addReply : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CommentController.addReply",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Comment/addReply"})
      }
   """
)
                        

// @LINE:258
// @LINE:257
def getReply : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CommentController.getReply",
   """
      function(commentId) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Comment/getReply/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("commentId", commentId)})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Comment/getReply/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("commentId", commentId)})
      }
      }
   """
)
                        

}
              

// @LINE:106
// @LINE:105
// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
class ReverseDatasetController {


// @LINE:101
def getDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.getDataset",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/getDataset/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:100
def getAllDatasets : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.getAllDatasets",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/getAllDatasets/json"})
      }
   """
)
                        

// @LINE:105
def queryDatasets : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.queryDatasets",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/queryDataset"})
      }
   """
)
                        

// @LINE:104
def deleteDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.deleteDataset",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/deleteDataset/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:102
def addDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.addDataset",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/addDataset"})
      }
   """
)
                        

// @LINE:103
def updateDatasetById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.updateDatasetById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/updateDataset/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:106
def getMostKPopularDatasets : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.getMostKPopularDatasets",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/getMostKPopularDatasets"})
      }
   """
)
                        

}
              

// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
class ReverseServiceConfigurationItemController {


// @LINE:55
def getServiceConfigurationItemsInServiceConfig : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceConfigurationItemController.getServiceConfigurationItemsInServiceConfig",
   """
      function(serviceConfigId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceConfigurationItem/serviceConfigurationItemByServiceConfig/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("serviceConfigId", serviceConfigId)})
      }
   """
)
                        

// @LINE:58
def updateServiceConfigurationItemById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceConfigurationItemController.updateServiceConfigurationItemById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceConfigurationItem/updateServiceConfigurationItem/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:54
def getServiceConfigurationItemById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceConfigurationItemController.getServiceConfigurationItemById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceConfigurationItem/serviceConfigurationItemById/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:57
def addServiceConfigurationItem : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceConfigurationItemController.addServiceConfigurationItem",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceConfigurationItem/addServiceConfigurationItem"})
      }
   """
)
                        

// @LINE:59
def deleteServiceConfigurationItemById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceConfigurationItemController.deleteServiceConfigurationItemById",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceConfigurationItem/deleteServiceConfigurationItemById/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:56
def getServiceConfigurationItemByParameterId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceConfigurationItemController.getServiceConfigurationItemByParameterId",
   """
      function(paramId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceConfigurationItem/serviceConfigurationItemByParamId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("paramId", paramId)})
      }
   """
)
                        

}
              

// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseClimateServiceController {


// @LINE:13
def getAllClimateServicesOrderByCreateTime : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getAllClimateServicesOrderByCreateTime",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getAllMostRecentClimateServicesByCreateTime/json"})
      }
   """
)
                        

// @LINE:23
def deleteClimateServiceById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.deleteClimateServiceById",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/deleteClimateService/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:15
def getAllClimateServicesOrderByCount : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getAllClimateServicesOrderByCount",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getAllMostUsedClimateServices/json"})
      }
   """
)
                        

// @LINE:20
def addServiceEntry : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.addServiceEntry",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/addServiceEntry"})
      }
   """
)
                        

// @LINE:27
def savePage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.savePage",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/savePage"})
      }
   """
)
                        

// @LINE:17
def addClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.addClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/addClimateService"})
      }
   """
)
                        

// @LINE:16
def getTopKUsedClimateServicesByDatasetId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getTopKUsedClimateServicesByDatasetId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getTopKUsedClimateServicesByDatasetId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:12
def getAllClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getAllClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getAllClimateServices/json"})
      }
   """
)
                        

// @LINE:10
def getClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getClimateService",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getClimateService/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/json"})
      }
   """
)
                        

// @LINE:21
def updateClimateServiceById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.updateClimateServiceById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/updateClimateService/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:11
def getClimateServiceById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getClimateServiceById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getClimateService/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:14
def getAllClimateServicesOrderByLatestAccessTime : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getAllClimateServicesOrderByLatestAccessTime",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getAllMostRecentClimateServicesByLatestAccessTime/json"})
      }
   """
)
                        

// @LINE:19
def getAllServiceEntries : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getAllServiceEntries",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getAllServiceEntries/json"})
      }
   """
)
                        

// @LINE:22
def updateClimateServiceByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.updateClimateServiceByName",
   """
      function(oldName) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/updateClimateService/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("oldName", encodeURIComponent(oldName))})
      }
   """
)
                        

// @LINE:18
def queryClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.queryClimateServices",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/queryClimateService"})
      }
   """
)
                        

// @LINE:24
def deleteClimateServiceByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.deleteClimateServiceByName",
   """
      function(name) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/deleteClimateService/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        

}
              

// @LINE:129
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
class ReverseBookPublicationController {


// @LINE:127
def addBookPublication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BookPublicationController.addBookPublication",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "BookPublication/addBookPublication"})
      }
   """
)
                        

// @LINE:125
def getAllBookPublications : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BookPublicationController.getAllBookPublications",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "BookPublication/getAllBookPublications/json"})
      }
   """
)
                        

// @LINE:129
def deleteBookPublicationById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BookPublicationController.deleteBookPublicationById",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "BookPublication/deleteBookPublication/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:126
def getBookPublicationById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BookPublicationController.getBookPublicationById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "BookPublication/getBookPublication/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:128
def updateBookPublicationById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BookPublicationController.updateBookPublicationById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "BookPublication/updateBookPublication/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              
}
        


// @LINE:260
// @LINE:259
// @LINE:258
// @LINE:257
// @LINE:256
// @LINE:253
// @LINE:252
// @LINE:248
// @LINE:247
// @LINE:246
// @LINE:245
// @LINE:241
// @LINE:240
// @LINE:236
// @LINE:235
// @LINE:234
// @LINE:233
// @LINE:230
// @LINE:229
// @LINE:228
// @LINE:227
// @LINE:224
// @LINE:223
// @LINE:222
// @LINE:221
// @LINE:220
// @LINE:219
// @LINE:217
// @LINE:216
// @LINE:215
// @LINE:214
// @LINE:213
// @LINE:212
// @LINE:211
// @LINE:210
// @LINE:206
// @LINE:205
// @LINE:204
// @LINE:203
// @LINE:202
// @LINE:201
// @LINE:199
// @LINE:198
// @LINE:197
// @LINE:196
// @LINE:194
// @LINE:193
// @LINE:191
// @LINE:189
// @LINE:188
// @LINE:186
// @LINE:185
// @LINE:184
// @LINE:179
// @LINE:176
// @LINE:173
// @LINE:172
// @LINE:169
// @LINE:166
// @LINE:165
// @LINE:164
// @LINE:163
// @LINE:162
// @LINE:161
// @LINE:160
// @LINE:143
// @LINE:142
// @LINE:141
// @LINE:140
// @LINE:139
// @LINE:136
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:129
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:122
// @LINE:121
// @LINE:120
// @LINE:119
// @LINE:118
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:106
// @LINE:105
// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
package controllers.ref {


// @LINE:179
class ReverseAssets {


// @LINE:179
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:241
// @LINE:240
class ReverseTagController {


// @LINE:241
def deleteTag(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.TagController]).deleteTag(), HandlerDef(this.getClass.getClassLoader, "", "controllers.TagController", "deleteTag", Seq(), "POST", """""", _prefix + """tag/deleteTag""")
)
                      

// @LINE:240
def createTag(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.TagController]).createTag(), HandlerDef(this.getClass.getClassLoader, "", "controllers.TagController", "createTag", Seq(), "POST", """ Tag
input:String tag""", _prefix + """tag/createTag""")
)
                      

}
                          

// @LINE:136
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
class ReverseBookChapterPublicationController {


// @LINE:135
def updateBookChapterPublication(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).updateBookChapterPublication(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.BookChapterPublicationController", "updateBookChapterPublication", Seq(classOf[Long]), "PUT", """""", _prefix + """BookChapterPublication/updateBookPublication/id/$id<[^/]+>""")
)
                      

// @LINE:133
def getBookChapterPublication(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).getBookChapterPublication(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.BookChapterPublicationController", "getBookChapterPublication", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """BookChapterPublication/getBookPublication/id/$id<[^/]+>/json""")
)
                      

// @LINE:136
def deleteBookChapterPublication(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).deleteBookChapterPublication(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.BookChapterPublicationController", "deleteBookChapterPublication", Seq(classOf[Long]), "DELETE", """""", _prefix + """BookChapterPublication/deleteBookPublication/id/$id<[^/]+>""")
)
                      

// @LINE:132
def getAllBookChapterPublications(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).getAllBookChapterPublications(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.BookChapterPublicationController", "getAllBookChapterPublications", Seq(classOf[String]), "GET", """ BookChapterPublication""", _prefix + """BookChapterPublication/getAllBookPublications/json""")
)
                      

// @LINE:134
def addBookChapterPublication(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).addBookChapterPublication(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BookChapterPublicationController", "addBookChapterPublication", Seq(), "POST", """""", _prefix + """BookChapterPublication/addBookPublication""")
)
                      

}
                          

// @LINE:169
class ReverseUtilController {


// @LINE:169
def updatePicture(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UtilController]).updatePicture(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UtilController", "updatePicture", Seq(), "POST", """ Util""", _prefix + """util/uploadPicture""")
)
                      

}
                          

// @LINE:173
// @LINE:172
class ReverseGraphAlgorithmController {


// @LINE:173
def getKShortestPath(source:Integer, target:Integer, k:Integer, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GraphAlgorithmController]).getKShortestPath(source, target, k, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.GraphAlgorithmController", "getKShortestPath", Seq(classOf[Integer], classOf[Integer], classOf[Integer], classOf[String]), "GET", """""", _prefix + """graphAlgorithm/getKthShortestPath/source/$source<[^/]+>/target/$target<[^/]+>/k/$k<[^/]+>/json""")
)
                      

// @LINE:172
def getShortestPath(source:Integer, target:Integer, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GraphAlgorithmController]).getShortestPath(source, target, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.GraphAlgorithmController", "getShortestPath", Seq(classOf[Integer], classOf[Integer], classOf[String]), "GET", """ Graph Algorithm""", _prefix + """graphAlgorithm/getShortestPath/source/$source<[^/]+>/target/$target<[^/]+>/json""")
)
                      

}
                          

// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
class ReverseServiceConfigurationController {


// @LINE:51
def getServiceConfigurationsByUser(userId:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).getServiceConfigurationsByUser(userId, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationController", "getServiceConfigurationsByUser", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """serviceConfiguration/getAllServiceConfigurationsByUserId/$userId<[^/]+>/json""")
)
                      

// @LINE:47
def getServiceConfiguration(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).getServiceConfiguration(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationController", "getServiceConfiguration", Seq(classOf[Long], classOf[String]), "GET", """ Service Configuration""", _prefix + """serviceConfiguration/getServiceConfiguration/id/$id<[^/]+>/json""")
)
                      

// @LINE:49
def updateServiceConfigurationById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).updateServiceConfigurationById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationController", "updateServiceConfigurationById", Seq(classOf[Long]), "PUT", """""", _prefix + """serviceConfiguration/updateServiceConfiguration/id/$id<[^/]+>""")
)
                      

// @LINE:48
def addServiceConfiguration(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).addServiceConfiguration(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationController", "addServiceConfiguration", Seq(), "POST", """""", _prefix + """serviceConfiguration/addServiceConfiguration""")
)
                      

// @LINE:50
def deleteServiceConfiguration(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).deleteServiceConfiguration(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationController", "deleteServiceConfiguration", Seq(classOf[Long]), "DELETE", """""", _prefix + """serviceConfiguration/deleteServiceConfiguration/$id<[^/]+>""")
)
                      

}
                          

// @LINE:230
// @LINE:229
// @LINE:228
// @LINE:227
class ReverseMailController {


// @LINE:229
def getInbox(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.MailController]).getInbox(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.MailController", "getInbox", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """mail/getInbox/$id<[^/]+>/json""")
)
                      

// @LINE:227
def sendMail(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.MailController]).sendMail(), HandlerDef(this.getClass.getClassLoader, "", "controllers.MailController", "sendMail", Seq(), "POST", """ Mail""", _prefix + """mail/sendMail""")
)
                      

// @LINE:228
def readMail(mailId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.MailController]).readMail(mailId), HandlerDef(this.getClass.getClassLoader, "", "controllers.MailController", "readMail", Seq(classOf[Long]), "GET", """""", _prefix + """mail/getMailDetail/mailId/$mailId<[^/]+>""")
)
                      

// @LINE:230
def getOutbox(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.MailController]).getOutbox(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.MailController", "getOutbox", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """mail/getOutbox/$id<[^/]+>/json""")
)
                      

}
                          

// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
class ReverseInstrumentController {


// @LINE:93
def getAllInstruments(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getAllInstruments(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "getAllInstruments", Seq(classOf[String]), "GET", """ Instrument""", _prefix + """instrument/getAllInstruments/json""")
)
                      

// @LINE:94
def getInstrument(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getInstrument(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "getInstrument", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """instrument/getInstrument/id/$id<[^/]+>/json""")
)
                      

// @LINE:95
def addInstrument(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).addInstrument(), HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "addInstrument", Seq(), "POST", """""", _prefix + """instrument/addInstrument""")
)
                      

// @LINE:96
def updateInstrumentById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).updateInstrumentById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "updateInstrumentById", Seq(classOf[Long]), "PUT", """""", _prefix + """instrument/updateInstrument/id/$id<[^/]+>""")
)
                      

// @LINE:97
def deleteInstrument(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).deleteInstrument(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "deleteInstrument", Seq(classOf[Long]), "DELETE", """""", _prefix + """instrument/deleteInstrument/id/$id<[^/]+>""")
)
                      

}
                          

// @LINE:253
// @LINE:252
// @LINE:224
// @LINE:223
// @LINE:222
// @LINE:221
// @LINE:220
// @LINE:219
// @LINE:217
// @LINE:216
// @LINE:215
// @LINE:214
// @LINE:213
// @LINE:212
// @LINE:211
// @LINE:210
class ReverseWorkflowController {


// @LINE:215
def getWorkflowList(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getWorkflowList(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getWorkflowList", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """workflow/getWorkflowList/$id<[^/]+>/json""")
)
                      

// @LINE:210
def post(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).post(), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "post", Seq(), "POST", """ Workflow""", _prefix + """workflow/post""")
)
                      

// @LINE:221
def deleteTag(wfId:Long, tag:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).deleteTag(wfId, tag), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "deleteTag", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """workflow/deleteTag/workflowId/$wfId<[^/]+>/tag/$tag<[^/]+>""")
)
                      

// @LINE:213
def get(wfID:Long, userID:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).get(wfID, userID, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "get", Seq(classOf[Long], classOf[Long], classOf[String]), "GET", """""", _prefix + """workflow/get/workflowID/$wfID<[^/]+>/userID/$userID<[^/]+>/json""")
)
                      

// @LINE:222
def getByTag(tag:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getByTag(tag), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getByTag", Seq(classOf[String]), "GET", """""", _prefix + """workflow/getByTag/tag/$tag<[^/]+>""")
)
                      

// @LINE:217
def getPublicWorkflow(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getPublicWorkflow(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getPublicWorkflow", Seq(classOf[String]), "GET", """""", _prefix + """workflow/getPublicWorkflow/json""")
)
                      

// @LINE:216
def uploadImage(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).uploadImage(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "uploadImage", Seq(classOf[Long]), "POST", """""", _prefix + """workflow/uploadImage/$id<[^/]+>""")
)
                      

// @LINE:252
def addComment(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).addComment(), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "addComment", Seq(), "POST", """Workflow
GET            /workflow/getTimeline/:id/offset/:offset/json                                              @controllers.UserController.userSearch(id: Long, offset: Long, format: String="json")""", _prefix + """workflow/addComment""")
)
                      

// @LINE:223
def getByTitle(title:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getByTitle(title), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getByTitle", Seq(classOf[String]), "GET", """""", _prefix + """workflow/getByTitle/title/$title<[^/]+>""")
)
                      

// @LINE:214
def getTimeLine(id:Long, offset:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTimeLine(id, offset, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getTimeLine", Seq(classOf[Long], classOf[Long], classOf[String]), "GET", """""", _prefix + """workflow/getTimeline/$id<[^/]+>/offset/$offset<[^/]+>/json""")
)
                      

// @LINE:253
def getComments(workflowId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getComments(workflowId), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getComments", Seq(classOf[Long]), "GET", """""", _prefix + """workflow/getComments/$workflowId<[^/]+>""")
)
                      

// @LINE:224
def getTop3WorkFlow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTop3WorkFlow(), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getTop3WorkFlow", Seq(), "GET", """""", _prefix + """workflow/getTop3WorkFlow""")
)
                      

// @LINE:211
def updateWorkflow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).updateWorkflow(), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "updateWorkflow", Seq(), "POST", """""", _prefix + """workflow/updateWorkflow""")
)
                      

// @LINE:212
def deleteWorkflow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).deleteWorkflow(), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "deleteWorkflow", Seq(), "POST", """""", _prefix + """workflow/deleteWorkflow""")
)
                      

// @LINE:220
def setTag(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).setTag(), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "setTag", Seq(), "POST", """""", _prefix + """workflow/setTag""")
)
                      

// @LINE:219
def getTags(wfId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTags(wfId), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getTags", Seq(classOf[Long]), "GET", """""", _prefix + """workflow/getTags/workflowId/$wfId<[^/]+>""")
)
                      

}
                          

// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
class ReverseServiceExecutionLogController {


// @LINE:68
def deleteServiceExecutionLog(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).deleteServiceExecutionLog(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "deleteServiceExecutionLog", Seq(classOf[Long]), "DELETE", """""", _prefix + """serviceExecutionLog/deleteServiceExecutionLogs/$id<[^/]+>""")
)
                      

// @LINE:65
def queryExecutionLogsByUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).queryExecutionLogsByUser(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "queryExecutionLogsByUser", Seq(), "POST", """""", _prefix + """serviceExecutionLog/queryExecutionLogsByUser""")
)
                      

// @LINE:64
def addServiceExecutionLog(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).addServiceExecutionLog(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "addServiceExecutionLog", Seq(), "POST", """""", _prefix + """serviceExecutionLog/addServiceExecutionLog""")
)
                      

// @LINE:66
def queryServiceExecutionLogs(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).queryServiceExecutionLogs(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "queryServiceExecutionLogs", Seq(), "POST", """""", _prefix + """serviceExecutionLog/queryServiceExecutionLogs""")
)
                      

// @LINE:63
def getServiceExecutionLog(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).getServiceExecutionLog(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "getServiceExecutionLog", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """serviceExecutionLog/getServiceExecutionLog/$id<[^/]+>""")
)
                      

// @LINE:62
def getAllServiceExecutionLogs(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).getAllServiceExecutionLogs(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "getAllServiceExecutionLogs", Seq(classOf[String]), "GET", """ Service Execution Log""", _prefix + """serviceExecutionLog/getAllServiceExecutionLog""")
)
                      

// @LINE:67
def updateServiceExecutionLog(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).updateServiceExecutionLog(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "updateServiceExecutionLog", Seq(classOf[Long]), "PUT", """""", _prefix + """serviceExecutionLog/updateServiceExecutionLogs/$id<[^/]+>""")
)
                      

}
                          

// @LINE:143
// @LINE:142
// @LINE:141
// @LINE:140
// @LINE:139
class ReverseConferencePublicationController {


// @LINE:142
def updateConferencePublication(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).updateConferencePublication(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ConferencePublicationController", "updateConferencePublication", Seq(classOf[Long]), "PUT", """""", _prefix + """ConferencePublication/updateBookPublication/id/$id<[^/]+>""")
)
                      

// @LINE:140
def getConferencePublication(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).getConferencePublication(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ConferencePublicationController", "getConferencePublication", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """ConferencePublication/getBookPublication/id/$id<[^/]+>/json""")
)
                      

// @LINE:141
def addConferencePublication(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).addConferencePublication(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ConferencePublicationController", "addConferencePublication", Seq(), "POST", """""", _prefix + """ConferencePublication/addBookPublication""")
)
                      

// @LINE:143
def deleteConferencePublication(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).deleteConferencePublication(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ConferencePublicationController", "deleteConferencePublication", Seq(classOf[Long]), "DELETE", """""", _prefix + """ConferencePublication/deleteBookPublication/id/$id<[^/]+>""")
)
                      

// @LINE:139
def getAllConferencePublications(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).getAllConferencePublications(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ConferencePublicationController", "getAllConferencePublications", Seq(classOf[String]), "GET", """ ConferencePublication""", _prefix + """ConferencePublication/getAllBookPublications/json""")
)
                      

}
                          

// @LINE:176
class ReverseUserRecommendationController {


// @LINE:176
def getKSimilarUsers(id:Long, k:Integer, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserRecommendationController]).getKSimilarUsers(id, k, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserRecommendationController", "getKSimilarUsers", Seq(classOf[Long], classOf[Integer], classOf[String]), "GET", """ Recomendation Algorithm""", _prefix + """recommendation/getTopKSimilarUsersById/$id<[^/]+>/k/$k<[^/]+>/json""")
)
                      

}
                          

// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
class ReverseDatasetLogController {


// @LINE:73
def getAllDatasetLogs(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).getAllDatasetLogs(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "getAllDatasetLogs", Seq(classOf[String]), "GET", """ DatasetLog""", _prefix + """datasetLog/getAllDatasetLogs/json""")
)
                      

// @LINE:77
def getUsersByServiceAndDataset(serviceId:Long, datasetId:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).getUsersByServiceAndDataset(serviceId, datasetId, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "getUsersByServiceAndDataset", Seq(classOf[Long], classOf[Long], classOf[String]), "GET", """""", _prefix + """datasetLog/getUsersByServiceAndDataset/serviceId/$serviceId<[^/]+>/datasetId/$datasetId<[^/]+>/json""")
)
                      

// @LINE:79
def queryDatasets(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).queryDatasets(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "queryDatasets", Seq(), "POST", """""", _prefix + """datasetLog/queryDatasets""")
)
                      

// @LINE:81
def updateDatasetLogById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).updateDatasetLogById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "updateDatasetLogById", Seq(classOf[Long]), "PUT", """""", _prefix + """datasetLog/updateDatasetLog/id/$id<[^/]+>""")
)
                      

// @LINE:78
def addDatasetLog(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).addDatasetLog(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "addDatasetLog", Seq(), "POST", """""", _prefix + """datasetLog/addDatasetLog""")
)
                      

// @LINE:74
def getDatasetLog(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).getDatasetLog(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "getDatasetLog", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """datasetLog/getDatasetLog/id/$id<[^/]+>/json""")
)
                      

// @LINE:82
def deleteDatasetLog(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).deleteDatasetLog(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "deleteDatasetLog", Seq(classOf[Long]), "DELETE", """""", _prefix + """datasetLog/deleteDatasetLog/id/$id<[^/]+>""")
)
                      

// @LINE:80
def queryVariables(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).queryVariables(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "queryVariables", Seq(), "POST", """""", _prefix + """datasetLog/queryVariables""")
)
                      

// @LINE:75
def getServiceExecutionLogsByDatasetAndUser(userId:Long, datasetId:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).getServiceExecutionLogsByDatasetAndUser(userId, datasetId, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "getServiceExecutionLogsByDatasetAndUser", Seq(classOf[Long], classOf[Long], classOf[String]), "GET", """""", _prefix + """datasetLog/getServiceExecutionLogsByDatasetAndUser/datasetId/$datasetId<[^/]+>/userId/$userId<[^/]+>/json""")
)
                      

// @LINE:76
def getDatasetLogsByServiceAndUser(userId:Long, serviceId:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).getDatasetLogsByServiceAndUser(userId, serviceId, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "getDatasetLogsByServiceAndUser", Seq(classOf[Long], classOf[Long], classOf[String]), "GET", """""", _prefix + """datasetLog/getDatasetLogsByServiceAndUser/serviceId/$serviceId<[^/]+>/userId/$userId<[^/]+>/json""")
)
                      

}
                          

// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
class ReverseBugReportController {


// @LINE:30
def getBugReport(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).getBugReport(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "getBugReport", Seq(classOf[Long], classOf[String]), "GET", """ Bug Report""", _prefix + """bugReport/getBugReport/id/$id<[^/]+>""")
)
                      

// @LINE:31
def getAllBugReports(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).getAllBugReports(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "getAllBugReports", Seq(), "GET", """""", _prefix + """bugReport/getAllBugReports/json""")
)
                      

// @LINE:34
def addBugReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).addBugReport(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "addBugReport", Seq(), "POST", """""", _prefix + """bugReport/addBugReport""")
)
                      

// @LINE:32
def getAllUnsolvedBugReports(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).getAllUnsolvedBugReports(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "getAllUnsolvedBugReports", Seq(), "GET", """""", _prefix + """bugReport/getAllUnsolvedBugReports/json""")
)
                      

// @LINE:36
def deleteBugReport(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).deleteBugReport(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "deleteBugReport", Seq(classOf[Long]), "DELETE", """""", _prefix + """bugReport/deleteBugReport/id/$id<[^/]+>""")
)
                      

// @LINE:35
def updateBugReportById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).updateBugReportById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "updateBugReportById", Seq(classOf[Long]), "PUT", """""", _prefix + """bugReport/updateBugReport/id/$id<[^/]+>""")
)
                      

// @LINE:33
def getAllSolvedBugReports(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).getAllSolvedBugReports(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "getAllSolvedBugReports", Seq(), "GET", """""", _prefix + """bugReport/getAllSolvedBugReports/json""")
)
                      

}
                          

// @LINE:166
// @LINE:165
// @LINE:164
// @LINE:163
// @LINE:162
// @LINE:161
// @LINE:160
class ReverseAnalyticsController {


// @LINE:162
def getOneUserWithAllServiceAndCount(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AnalyticsController]).getOneUserWithAllServiceAndCount(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getOneUserWithAllServiceAndCount", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """analytics/getOneUserWithAllServiceAndCountByUserId/$id<[^/]+>/json""")
)
                      

// @LINE:163
def getOneServiceWithAllUserAndCount(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AnalyticsController]).getOneServiceWithAllUserAndCount(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getOneServiceWithAllUserAndCount", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """analytics/getOneServiceWithAllUserAndCountByServiceId/$id<[^/]+>/json""")
)
                      

// @LINE:166
def getRelationalKnowledgeGraph(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AnalyticsController]).getRelationalKnowledgeGraph(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getRelationalKnowledgeGraph", Seq(classOf[String]), "POST", """""", _prefix + """analytics/getRelationalKnowledgeGraph/json""")
)
                      

// @LINE:164
def getOneServiceWithAllDatasetAndCount(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AnalyticsController]).getOneServiceWithAllDatasetAndCount(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getOneServiceWithAllDatasetAndCount", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """analytics/getOneServiceWithAllDatasetAndCountByServiceId/$id<[^/]+>/json""")
)
                      

// @LINE:165
def getOneDatasetWithAllServiceAndCount(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AnalyticsController]).getOneDatasetWithAllServiceAndCount(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getOneDatasetWithAllServiceAndCount", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """analytics/getOneDatasetWithAllServiceAndCountByDatasetId/$id<[^/]+>/json""")
)
                      

// @LINE:161
def getOneDatasetWithAllUserAndCount(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AnalyticsController]).getOneDatasetWithAllUserAndCount(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getOneDatasetWithAllUserAndCount", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """analytics/getOneDatasetWithAllUserAndCountByDatasetId/$id<[^/]+>/json""")
)
                      

// @LINE:160
def getOneUserWithAllDatasetAndCount(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.AnalyticsController]).getOneUserWithAllDatasetAndCount(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getOneUserWithAllDatasetAndCount", Seq(classOf[Long], classOf[String]), "GET", """ Analytics
GET		  /analytics/getAllDatasetAndUserWithCount/json											    @controllers.AnalyticsController.getAllDatasetAndUserWithCount(format: String="json")
GET		  /analytics/getAllServiceAndUserWithCount/json											    @controllers.AnalyticsController.getAllServiceAndUserWithCount(format: String="json")
GET		  /analytics/getAllServiceAndDatasetWithCount/json											@controllers.AnalyticsController.getAllServiceAndDatasetWithCount(format: String="json")""", _prefix + """analytics/getOneUserWithAllDatasetAndCountByUserId/$id<[^/]+>/json""")
)
                      

}
                          

// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
class ReverseClimateServiceCommentController {


// @LINE:39
def getComment(id:Long, email:String, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceCommentController]).getComment(id, email, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceCommentController", "getComment", Seq(classOf[Long], classOf[String], classOf[String]), "GET", """ ClimateServiceComment""", _prefix + """climateServiceComment/getComment/$id<[^/]+>/$email<[^/]+>/json""")
)
                      

// @LINE:40
def searchCommentByHashTag(hashTag:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceCommentController]).searchCommentByHashTag(hashTag), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceCommentController", "searchCommentByHashTag", Seq(classOf[String]), "GET", """""", _prefix + """climateServiceComment/searchCommentByHashTag/$hashTag<[^/]+>""")
)
                      

// @LINE:43
def editComment(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceCommentController]).editComment(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceCommentController", "editComment", Seq(), "PUT", """""", _prefix + """climateServiceComment/editComment""")
)
                      

// @LINE:41
def getMentions(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceCommentController]).getMentions(email), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceCommentController", "getMentions", Seq(classOf[String]), "GET", """""", _prefix + """climateServiceComment/getMentions/$email<[^/]+>""")
)
                      

// @LINE:44
def deleteComment(service_id:Long, comment_id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceCommentController]).deleteComment(service_id, comment_id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceCommentController", "deleteComment", Seq(classOf[Long], classOf[Long]), "DELETE", """""", _prefix + """climateServiceComment/deleteComment/$service_id<[^/]+>/$comment_id<[^/]+>""")
)
                      

// @LINE:42
def postComment(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceCommentController]).postComment(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceCommentController", "postComment", Seq(), "POST", """""", _prefix + """climateServiceComment/postComment""")
)
                      

}
                          

// @LINE:122
// @LINE:121
// @LINE:120
// @LINE:119
// @LINE:118
class ReverseJournalPublicationController {


// @LINE:119
def getJournalPublicationById(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).getJournalPublicationById(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.JournalPublicationController", "getJournalPublicationById", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """journalPublication/getJournalPublication/id/$id<[^/]+>/json""")
)
                      

// @LINE:118
def getAllJournalPublications(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).getAllJournalPublications(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.JournalPublicationController", "getAllJournalPublications", Seq(classOf[String]), "GET", """ JournalPublication""", _prefix + """journalPublication/getAllJournalPublications/json""")
)
                      

// @LINE:122
def deleteJournalPublicationById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).deleteJournalPublicationById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.JournalPublicationController", "deleteJournalPublicationById", Seq(classOf[Long]), "DELETE", """""", _prefix + """journalPublication/deleteJournalPublication/id/$id<[^/]+>""")
)
                      

// @LINE:121
def updateJournalPublicationById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).updateJournalPublicationById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.JournalPublicationController", "updateJournalPublicationById", Seq(classOf[Long]), "PUT", """""", _prefix + """journalPublication/updateJournalPublication/id/$id<[^/]+>""")
)
                      

// @LINE:120
def addJournalPublication(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).addJournalPublication(), HandlerDef(this.getClass.getClassLoader, "", "controllers.JournalPublicationController", "addJournalPublication", Seq(), "POST", """""", _prefix + """journalPublication/addJournalPublication""")
)
                      

}
                          

// @LINE:206
// @LINE:205
// @LINE:204
// @LINE:203
// @LINE:202
// @LINE:201
// @LINE:199
// @LINE:198
// @LINE:197
// @LINE:196
// @LINE:194
// @LINE:193
// @LINE:191
// @LINE:189
// @LINE:188
// @LINE:186
// @LINE:185
// @LINE:184
class ReverseUserController {


// @LINE:198
def getFollowers(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getFollowers(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getFollowers", Seq(classOf[Long]), "GET", """""", _prefix + """users/getFollowers/$id<[^/]+>""")
)
                      

// @LINE:205
def getFriends(userId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getFriends(userId), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getFriends", Seq(classOf[Long]), "GET", """""", _prefix + """users/getFriends/userId/$userId<[^/]+>""")
)
                      

// @LINE:203
def acceptFriendRequest(userId:Long, senderId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).acceptFriendRequest(userId, senderId), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "acceptFriendRequest", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """users/acceptFriendRequest/userId/$userId<[^/]+>/sender/$senderId<[^/]+>""")
)
                      

// @LINE:199
def getFollowees(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getFollowees(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getFollowees", Seq(classOf[Long]), "GET", """""", _prefix + """users/getFollowees/$id<[^/]+>""")
)
                      

// @LINE:189
def userLogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userLogin(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "userLogin", Seq(), "POST", """""", _prefix + """users/login""")
)
                      

// @LINE:188
def userRegister(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userRegister(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "userRegister", Seq(), "POST", """""", _prefix + """users/register""")
)
                      

// @LINE:197
def userUnfollow(followerId:Long, followeeId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userUnfollow(followerId, followeeId), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "userUnfollow", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """users/unfollow/followerId/$followerId<[^/]+>/followeeId/$followeeId<[^/]+>""")
)
                      

// @LINE:185
def getAllUsers(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getAllUsers(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getAllUsers", Seq(classOf[String]), "GET", """""", _prefix + """users/getAllUsers/json""")
)
                      

// @LINE:201
def sendFriendRequest(senderId:Long, receiverId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).sendFriendRequest(senderId, receiverId), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "sendFriendRequest", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """users/sendFriendRequest/sender/$senderId<[^/]+>/receiver/$receiverId<[^/]+>""")
)
                      

// @LINE:184
def deleteUser(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUser(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "deleteUser", Seq(classOf[Long]), "DELETE", """Merged from team 15&16
 Users""", _prefix + """users/delete/$id<[^/]+>""")
)
                      

// @LINE:202
def getFriendRequests(userId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getFriendRequests(userId), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getFriendRequests", Seq(classOf[Long]), "GET", """""", _prefix + """users/getFriendRequests/userId/$userId<[^/]+>""")
)
                      

// @LINE:191
def userSearch(display_name:String, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userSearch(display_name, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "userSearch", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """users/search/$display_name<[^/]+>/json""")
)
                      

// @LINE:196
def userFollow(followerId:Long, followeeId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userFollow(followerId, followeeId), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "userFollow", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """users/follow/followerId/$followerId<[^/]+>/followeeId/$followeeId<[^/]+>""")
)
                      

// @LINE:186
def deleteUserByUserNameandPassword(userName:String, password:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUserByUserNameandPassword(userName, password), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "deleteUserByUserNameandPassword", Seq(classOf[String], classOf[String]), "DELETE", """""", _prefix + """users/delete/userName/$userName<[^/]+>/password/$password<[^/]+>""")
)
                      

// @LINE:204
def rejectFriendRequest(userId:Long, senderId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).rejectFriendRequest(userId, senderId), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "rejectFriendRequest", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """users/rejectFriendRequest/userId/$userId<[^/]+>/sender/$senderId<[^/]+>""")
)
                      

// @LINE:206
def deleteFriend(userId:Long, friendId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteFriend(userId, friendId), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "deleteFriend", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """users/deleteFriend/userId/$userId<[^/]+>/friendId/$friendId<[^/]+>""")
)
                      

// @LINE:194
def getProfile(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getProfile(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getProfile", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """users/getprofile/$id<[^/]+>/json""")
)
                      

// @LINE:193
def setProfile(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).setProfile(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "setProfile", Seq(classOf[Long]), "PUT", """""", _prefix + """users/setprofile/$id<[^/]+>""")
)
                      

}
                          

// @LINE:236
// @LINE:235
// @LINE:234
// @LINE:233
class ReverseSuggestionsController {


// @LINE:235
def voteToSuggestion(suggestionId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SuggestionsController]).voteToSuggestion(suggestionId), HandlerDef(this.getClass.getClassLoader, "", "controllers.SuggestionsController", "voteToSuggestion", Seq(classOf[Long]), "GET", """""", _prefix + """suggestion/voteToSuggestion/$suggestionId<[^/]+>""")
)
                      

// @LINE:234
def addTag(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SuggestionsController]).addTag(), HandlerDef(this.getClass.getClassLoader, "", "controllers.SuggestionsController", "addTag", Seq(), "POST", """""", _prefix + """suggestion/addTag""")
)
                      

// @LINE:236
def getSuggestionForWorkflow(workflowId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SuggestionsController]).getSuggestionForWorkflow(workflowId), HandlerDef(this.getClass.getClassLoader, "", "controllers.SuggestionsController", "getSuggestionForWorkflow", Seq(classOf[Long]), "GET", """""", _prefix + """suggestion/getSuggestionForWorkflow/$workflowId<[^/]+>""")
)
                      

// @LINE:233
def publishSuggestion(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SuggestionsController]).publishSuggestion(), HandlerDef(this.getClass.getClassLoader, "", "controllers.SuggestionsController", "publishSuggestion", Seq(), "POST", """Suggestion""", _prefix + """suggestion/publishSuggestion""")
)
                      

}
                          

// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:109
class ReverseParameterController {


// @LINE:109
def getAllParameters(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getAllParameters(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getAllParameters", Seq(classOf[String]), "GET", """ Parameter""", _prefix + """parameter/getAllParameters/json""")
)
                      

// @LINE:111
def getParameterById(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterById(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getParameterById", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """parameter/getParameter/id/$id<[^/]+>/json""")
)
                      

// @LINE:113
def updateParameterById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "updateParameterById", Seq(classOf[Long]), "PUT", """""", _prefix + """parameter/updateParameter/id/$id<[^/]+>""")
)
                      

// @LINE:110
def getParameterByName(id:Long, name:String, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterByName(id, name, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getParameterByName", Seq(classOf[Long], classOf[String], classOf[String]), "GET", """""", _prefix + """parameter/getParameter/service/$id<[^/]+>/name/$name<[^/]+>/json""")
)
                      

// @LINE:114
def updateParameterByName(oldName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterByName(oldName), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "updateParameterByName", Seq(classOf[String]), "PUT", """""", _prefix + """parameter/updateParameter/name/$oldName<[^/]+>""")
)
                      

// @LINE:115
def deleteParameterByName(id:Long, name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).deleteParameterByName(id, name), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "deleteParameterByName", Seq(classOf[Long], classOf[String]), "DELETE", """""", _prefix + """parameter/deleteParameter/service/$id<[^/]+>/name/$name<[^/]+>""")
)
                      

// @LINE:112
def addParameter(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).addParameter(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "addParameter", Seq(), "POST", """""", _prefix + """parameter/addParameter""")
)
                      

}
                          

// @LINE:248
// @LINE:247
// @LINE:246
// @LINE:245
class ReverseGroupUsersController {


// @LINE:248
def getGroupMember(groupId:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GroupUsersController]).getGroupMember(groupId, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.GroupUsersController", "getGroupMember", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """group/getGroupMember/$groupId<[^/]+>/json""")
)
                      

// @LINE:247
def getGroupList(userID:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GroupUsersController]).getGroupList(userID, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.GroupUsersController", "getGroupList", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """group/getGroupList/$userID<[^/]+>/json""")
)
                      

// @LINE:245
def createGroup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GroupUsersController]).createGroup(), HandlerDef(this.getClass.getClassLoader, "", "controllers.GroupUsersController", "createGroup", Seq(), "POST", """Group""", _prefix + """group/createGroup""")
)
                      

// @LINE:246
def addMembersToGroup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GroupUsersController]).addMembersToGroup(), HandlerDef(this.getClass.getClassLoader, "", "controllers.GroupUsersController", "addMembersToGroup", Seq(), "POST", """""", _prefix + """group/addMembersToGroup""")
)
                      

}
                          

// @LINE:260
// @LINE:259
// @LINE:258
// @LINE:257
// @LINE:256
class ReverseCommentController {


// @LINE:259
def thumbUp(commentId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).thumbUp(commentId), HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "thumbUp", Seq(classOf[Long]), "GET", """""", _prefix + """Comment/thumbUp/$commentId<[^/]+>""")
)
                      

// @LINE:260
def thumbDown(commentId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).thumbDown(commentId), HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "thumbDown", Seq(classOf[Long]), "GET", """""", _prefix + """Comment/thumbDown/$commentId<[^/]+>""")
)
                      

// @LINE:256
def addReply(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).addReply(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "addReply", Seq(), "POST", """Comment""", _prefix + """Comment/addReply""")
)
                      

// @LINE:257
def getReply(commentId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).getReply(commentId), HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "getReply", Seq(classOf[Long]), "GET", """""", _prefix + """Comment/getReply/$commentId<[^/]+>""")
)
                      

}
                          

// @LINE:106
// @LINE:105
// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
class ReverseDatasetController {


// @LINE:101
def getDataset(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getDataset(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "getDataset", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """dataset/getDataset/id/$id<[^/]+>/json""")
)
                      

// @LINE:100
def getAllDatasets(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getAllDatasets(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "getAllDatasets", Seq(classOf[String]), "GET", """ Dataset""", _prefix + """dataset/getAllDatasets/json""")
)
                      

// @LINE:105
def queryDatasets(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).queryDatasets(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "queryDatasets", Seq(), "POST", """""", _prefix + """dataset/queryDataset""")
)
                      

// @LINE:104
def deleteDataset(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).deleteDataset(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "deleteDataset", Seq(classOf[Long]), "DELETE", """""", _prefix + """dataset/deleteDataset/id/$id<[^/]+>""")
)
                      

// @LINE:102
def addDataset(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).addDataset(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "addDataset", Seq(), "POST", """""", _prefix + """dataset/addDataset""")
)
                      

// @LINE:103
def updateDatasetById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).updateDatasetById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "updateDatasetById", Seq(classOf[Long]), "PUT", """""", _prefix + """dataset/updateDataset/id/$id<[^/]+>""")
)
                      

// @LINE:106
def getMostKPopularDatasets(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getMostKPopularDatasets(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "getMostKPopularDatasets", Seq(), "POST", """""", _prefix + """dataset/getMostKPopularDatasets""")
)
                      

}
                          

// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
class ReverseServiceConfigurationItemController {


// @LINE:55
def getServiceConfigurationItemsInServiceConfig(serviceConfigId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).getServiceConfigurationItemsInServiceConfig(serviceConfigId), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationItemController", "getServiceConfigurationItemsInServiceConfig", Seq(classOf[Long]), "GET", """""", _prefix + """serviceConfigurationItem/serviceConfigurationItemByServiceConfig/$serviceConfigId<[^/]+>""")
)
                      

// @LINE:58
def updateServiceConfigurationItemById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).updateServiceConfigurationItemById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationItemController", "updateServiceConfigurationItemById", Seq(classOf[Long]), "PUT", """""", _prefix + """serviceConfigurationItem/updateServiceConfigurationItem/id/$id<[^/]+>""")
)
                      

// @LINE:54
def getServiceConfigurationItemById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).getServiceConfigurationItemById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationItemController", "getServiceConfigurationItemById", Seq(classOf[Long]), "GET", """ Service Configuration Item""", _prefix + """serviceConfigurationItem/serviceConfigurationItemById/$id<[^/]+>""")
)
                      

// @LINE:57
def addServiceConfigurationItem(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).addServiceConfigurationItem(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationItemController", "addServiceConfigurationItem", Seq(), "POST", """""", _prefix + """serviceConfigurationItem/addServiceConfigurationItem""")
)
                      

// @LINE:59
def deleteServiceConfigurationItemById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).deleteServiceConfigurationItemById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationItemController", "deleteServiceConfigurationItemById", Seq(classOf[Long]), "DELETE", """""", _prefix + """serviceConfigurationItem/deleteServiceConfigurationItemById/$id<[^/]+>""")
)
                      

// @LINE:56
def getServiceConfigurationItemByParameterId(paramId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).getServiceConfigurationItemByParameterId(paramId), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationItemController", "getServiceConfigurationItemByParameterId", Seq(classOf[Long]), "GET", """""", _prefix + """serviceConfigurationItem/serviceConfigurationItemByParamId/$paramId<[^/]+>""")
)
                      

}
                          

// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseClimateServiceController {


// @LINE:13
def getAllClimateServicesOrderByCreateTime(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCreateTime(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByCreateTime", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getAllMostRecentClimateServicesByCreateTime/json""")
)
                      

// @LINE:23
def deleteClimateServiceById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "deleteClimateServiceById", Seq(classOf[Long]), "DELETE", """""", _prefix + """climateService/deleteClimateService/id/$id<[^/]+>""")
)
                      

// @LINE:15
def getAllClimateServicesOrderByCount(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCount(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByCount", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getAllMostUsedClimateServices/json""")
)
                      

// @LINE:20
def addServiceEntry(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addServiceEntry(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addServiceEntry", Seq(), "POST", """""", _prefix + """climateService/addServiceEntry""")
)
                      

// @LINE:27
def savePage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).savePage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "savePage", Seq(), "POST", """ Save Climate Service Page""", _prefix + """climateService/savePage""")
)
                      

// @LINE:17
def addClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addClimateService(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addClimateService", Seq(), "POST", """""", _prefix + """climateService/addClimateService""")
)
                      

// @LINE:16
def getTopKUsedClimateServicesByDatasetId(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getTopKUsedClimateServicesByDatasetId(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getTopKUsedClimateServicesByDatasetId", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """climateService/getTopKUsedClimateServicesByDatasetId/$id<[^/]+>""")
)
                      

// @LINE:12
def getAllClimateServices(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServices(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServices", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getAllClimateServices/json""")
)
                      

// @LINE:10
def getClimateService(name:String, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateService(name, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getClimateService", Seq(classOf[String], classOf[String]), "GET", """ Climate Service""", _prefix + """climateService/getClimateService/$name<[^/]+>/json""")
)
                      

// @LINE:21
def updateClimateServiceById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "updateClimateServiceById", Seq(classOf[Long]), "PUT", """""", _prefix + """climateService/updateClimateService/id/$id<[^/]+>""")
)
                      

// @LINE:11
def getClimateServiceById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateServiceById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getClimateServiceById", Seq(classOf[Long]), "GET", """""", _prefix + """climateService/getClimateService/id/$id<[^/]+>""")
)
                      

// @LINE:14
def getAllClimateServicesOrderByLatestAccessTime(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByLatestAccessTime(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByLatestAccessTime", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getAllMostRecentClimateServicesByLatestAccessTime/json""")
)
                      

// @LINE:19
def getAllServiceEntries(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllServiceEntries(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllServiceEntries", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getAllServiceEntries/json""")
)
                      

// @LINE:22
def updateClimateServiceByName(oldName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceByName(oldName), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "updateClimateServiceByName", Seq(classOf[String]), "PUT", """""", _prefix + """climateService/updateClimateService/name/$oldName<[^/]+>""")
)
                      

// @LINE:18
def queryClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).queryClimateServices(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "queryClimateServices", Seq(), "POST", """""", _prefix + """climateService/queryClimateService""")
)
                      

// @LINE:24
def deleteClimateServiceByName(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceByName(name), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "deleteClimateServiceByName", Seq(classOf[String]), "DELETE", """""", _prefix + """climateService/deleteClimateService/name/$name<[^/]+>""")
)
                      

}
                          

// @LINE:129
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
class ReverseBookPublicationController {


// @LINE:127
def addBookPublication(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).addBookPublication(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BookPublicationController", "addBookPublication", Seq(), "POST", """""", _prefix + """BookPublication/addBookPublication""")
)
                      

// @LINE:125
def getAllBookPublications(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).getAllBookPublications(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.BookPublicationController", "getAllBookPublications", Seq(classOf[String]), "GET", """ BookPublication""", _prefix + """BookPublication/getAllBookPublications/json""")
)
                      

// @LINE:129
def deleteBookPublicationById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).deleteBookPublicationById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.BookPublicationController", "deleteBookPublicationById", Seq(classOf[Long]), "DELETE", """""", _prefix + """BookPublication/deleteBookPublication/id/$id<[^/]+>""")
)
                      

// @LINE:126
def getBookPublicationById(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).getBookPublicationById(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.BookPublicationController", "getBookPublicationById", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """BookPublication/getBookPublication/id/$id<[^/]+>/json""")
)
                      

// @LINE:128
def updateBookPublicationById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).updateBookPublicationById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.BookPublicationController", "updateBookPublicationById", Seq(classOf[Long]), "PUT", """""", _prefix + """BookPublication/updateBookPublication/id/$id<[^/]+>""")
)
                      

}
                          
}
        
    