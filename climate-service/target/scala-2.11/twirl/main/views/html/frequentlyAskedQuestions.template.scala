
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
import helper._
/**/
object frequentlyAskedQuestions extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*3.2*/main("Frequently Requested Queries")/*3.38*/ {_display_(Seq[Any](format.raw/*3.40*/("""

   """),format.raw/*5.4*/("""<h2>Frequently Requested Queries</h2>
   <div class="container">
   <h3>Visualize Relationship in Knowledge Graph</h3>
   <ul>
   <li style="margin-bottom: 5px;">
   <a href='"""),_display_(/*10.14*/routes/*10.20*/.AnalyticsController.getKnowledgeGraph()),format.raw/*10.60*/("""'>Visualize relationship between user and dataset, based on service usage</a>
   </li>
   <li style="margin-bottom: 5px;">
   <a href='"""),_display_(/*13.14*/routes/*13.20*/.AnalyticsController.getKnowledgeGraph("User", "Service", "Dataset")),format.raw/*13.88*/("""'>Visualize relationship between user and service, based on dataset usage</a>
   </li>
   <li style="margin-bottom: 5px;">
   <a href='"""),_display_(/*16.14*/routes/*16.20*/.AnalyticsController.getKnowledgeGraph("Dataset", "Service", "User")),format.raw/*16.88*/("""'>Visualize relationship between dataset and service, based on user</a>
   </li>
   <li style="margin-bottom: 5px;">
   <a href='"""),_display_(/*19.14*/routes/*19.20*/.AnalyticsController.getKnowledgeGraph("User", "User", "Dataset")),format.raw/*19.85*/("""'>Visualize relationship between user and user, based on dataset usage</a>
   </li>
   <li style="margin-bottom: 5px;">
   <a href='"""),_display_(/*22.14*/routes/*22.20*/.AnalyticsController.getKnowledgeGraph("User", "User", "Service")),format.raw/*22.85*/("""'>Visualize relationship between user and user, based on service usage</a>
   </li>
   <li style="margin-bottom: 5px;">
   <a href='"""),_display_(/*25.14*/routes/*25.20*/.AnalyticsController.getKnowledgeGraph("Dataset", "Dataset", "Service")),format.raw/*25.91*/("""'>Visualize relationship between dataset and dataset, based on service usage</a>
   </li>
   <li style="margin-bottom: 5px;">
   <a href='"""),_display_(/*28.14*/routes/*28.20*/.AnalyticsController.getKnowledgeGraph("Dataset", "Dataset", "User")),format.raw/*28.88*/("""'>Visualize relationship between dataset and dataset, based on user</a>
   </li>
   <li style="margin-bottom: 5px;">
   <a href='"""),_display_(/*31.14*/routes/*31.20*/.AnalyticsController.getKnowledgeGraph("Service", "Service", "Dataset")),format.raw/*31.91*/("""'>Visualize relationship between service and service, based on dataset usage</a>
   </li>
   <li style="margin-bottom: 5px;">
   <a href='"""),_display_(/*34.14*/routes/*34.20*/.AnalyticsController.getKnowledgeGraph("Service", "Service", "User")),format.raw/*34.88*/("""'>Visualize relationship between service and service, based on user</a>
   </li>
   </ul>
   
   <h3>Search in Knowledge Graph</h3>
   <ul>
   <li style="margin-bottom: 5px;">
   <a href='"""),_display_(/*41.14*/routes/*41.20*/.ClimateServiceController.searchClimateServices()),format.raw/*41.69*/("""'>Search on service based on features</a>
   </li>
   <li style="margin-bottom: 5px;">
   <a href='"""),_display_(/*44.14*/routes/*44.20*/.DatasetController.searchDataset()),format.raw/*44.54*/("""'>Search on dataset based on features</a>
   </li>
   <li style="margin-bottom: 5px;">
   <a href='"""),_display_(/*47.14*/routes/*47.20*/.ServiceExecutionLogController.searchServiceLog),format.raw/*47.67*/("""'>Search on service execution log based on criteria</a>
   </li>
   <li style="margin-bottom: 5px;">
   <a href='"""),_display_(/*50.14*/routes/*50.20*/.AnalyticsController.getKnowledgeGraph()),format.raw/*50.60*/("""'>Visualize user behavior on dataset within a time range</a>
   </li>
   </ul>
   
   <h3>Dynamic Statistics</h3>
   <ul>
   <li style="margin-bottom: 5px;">
   <a href='"""),_display_(/*57.14*/routes/*57.20*/.ClimateServiceController.mostPopularServices()),format.raw/*57.67*/("""'>Most popular service</a>
   </li>
   <li style="margin-bottom: 5px;">
   <a href='"""),_display_(/*60.14*/routes/*60.20*/.DatasetController.mostPopularDatasets()),format.raw/*60.60*/("""'>Most popular dataset</a>
   </li>
   <li style="margin-bottom: 5px;">
   <a href='"""),_display_(/*63.14*/routes/*63.20*/.UsersController.getAllUsers()),format.raw/*63.50*/("""'>Most active user</a>
   </li>
   <li style="margin-bottom: 5px;">
   <a href='"""),_display_(/*66.14*/routes/*66.20*/.ClimateServiceController.recommendationSummary("ochimborazo")),format.raw/*66.82*/("""'>ML Based Recommendation</a>
   </li>
   </ul>
   
	</div>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Dec 10 17:28:46 PST 2015
                  SOURCE: /Users/weiwang/climate-service/app/views/frequentlyAskedQuestions.scala.html
                  HASH: 65efaf847a6773772f2cc31f1d5549880637ed3f
                  MATRIX: 832->19|876->55|915->57|946->62|1149->238|1164->244|1225->284|1388->420|1403->426|1492->494|1655->630|1670->636|1759->704|1916->834|1931->840|2017->905|2177->1038|2192->1044|2278->1109|2438->1242|2453->1248|2545->1319|2711->1458|2726->1464|2815->1532|2972->1662|2987->1668|3079->1739|3245->1878|3260->1884|3349->1952|3565->2141|3580->2147|3650->2196|3777->2296|3792->2302|3847->2336|3974->2436|3989->2442|4057->2489|4198->2603|4213->2609|4274->2649|4472->2820|4487->2826|4555->2873|4667->2958|4682->2964|4743->3004|4855->3089|4870->3095|4921->3125|5029->3206|5044->3212|5127->3274
                  LINES: 29->3|29->3|29->3|31->5|36->10|36->10|36->10|39->13|39->13|39->13|42->16|42->16|42->16|45->19|45->19|45->19|48->22|48->22|48->22|51->25|51->25|51->25|54->28|54->28|54->28|57->31|57->31|57->31|60->34|60->34|60->34|67->41|67->41|67->41|70->44|70->44|70->44|73->47|73->47|73->47|76->50|76->50|76->50|83->57|83->57|83->57|86->60|86->60|86->60|89->63|89->63|89->63|92->66|92->66|92->66
                  -- GENERATED --
              */
          