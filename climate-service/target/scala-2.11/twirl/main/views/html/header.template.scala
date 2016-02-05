
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

/**/
object header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!-- Header -->
	<div class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" style="padding-bottom: 0;" href="/">
					<div>
					<img src='"""),_display_(/*13.17*/routes/*13.23*/.Assets.at("images/NASA_JPL_logo.png")),format.raw/*13.61*/("""' style="height: 24px; width: 144px;">
					<img src='"""),_display_(/*14.17*/routes/*14.23*/.Assets.at("images/logo.png")),format.raw/*14.52*/("""' style="height: 12px; width: 160px;">
					</div>
				</a>
			</div>
			<div class="navbar-collapse collapse" style="height:">
				<ul class="nav navbar-nav navbar-right">
					
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="text-danger">Recommendation</span><b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href='"""),_display_(/*24.22*/routes/*24.28*/.ClimateServiceController.recommendationSummary("ochimborazo")),format.raw/*24.90*/("""'>Summary</a></li>							
						</ul>				
					</li>
					
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">Web Service<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(/*31.22*/routes/*31.28*/.ClimateServiceController.mostRecentlyAddedClimateServices()),format.raw/*31.88*/("""">Most Recently Added</a></li>
							<li><a href=""""),_display_(/*32.22*/routes/*32.28*/.ClimateServiceController.mostRecentlyUsedClimateServices),format.raw/*32.85*/("""">Most Recently Used</a></li>
							<li><a href=""""),_display_(/*33.22*/routes/*33.28*/.ClimateServiceController.mostPopularServices()),format.raw/*33.75*/("""">Most Popular</a></li>
							<li><a href=""""),_display_(/*34.22*/routes/*34.28*/.ClimateServiceController.showAllClimateServices()),format.raw/*34.78*/("""">Service List</a></li>
							"""),_display_(/*35.9*/if(true)/*35.17*/ {_display_(Seq[Any](format.raw/*35.19*/("""
								"""),format.raw/*36.9*/("""<li><a href=""""),_display_(/*36.23*/routes/*36.29*/.ClimateServiceController.addAClimateService()),format.raw/*36.75*/("""">Register A Service</a></li>
							""")))}),format.raw/*37.9*/("""
							"""),format.raw/*38.8*/("""<li><a href=""""),_display_(/*38.22*/routes/*38.28*/.ClimateServiceController.searchClimateServices()),format.raw/*38.77*/("""">Search Service</a></li>
						</ul>				
					</li>
					
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">Dataset<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(/*45.22*/routes/*45.28*/.DatasetController.mostPopularDatasets()),format.raw/*45.68*/("""">Most Popular</a></li>
							<li><a href=""""),_display_(/*46.22*/routes/*46.28*/.DatasetController.showAllDatasets()),format.raw/*46.64*/("""">Dataset List</a></li>
							"""),_display_(/*47.9*/if(true)/*47.17*/ {_display_(Seq[Any](format.raw/*47.19*/("""
								"""),format.raw/*48.9*/("""<li><a href="#">Register A Dataset</a></li>
							""")))}),format.raw/*49.9*/("""
							"""),format.raw/*50.8*/("""<li><a href=""""),_display_(/*50.22*/routes/*50.28*/.DatasetController.searchDataset()),format.raw/*50.62*/("""">Search Dataset</a></li>
						</ul>
					</li>
					
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">Analytics<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(/*57.22*/routes/*57.28*/.ServiceExecutionLogController.getServiceLog),format.raw/*57.72*/("""">Service Execution Log</a></li>
							<li><a href=""""),_display_(/*58.22*/routes/*58.28*/.ServiceExecutionLogController.searchServiceLog),format.raw/*58.75*/("""">Search Service Log</a></li>
							<li><a href=""""),_display_(/*59.22*/routes/*59.28*/.DatasetLogController.getAllDatasetLogs),format.raw/*59.67*/("""">Dataset Log</a></li>
							<li><a href=""""),_display_(/*60.22*/routes/*60.28*/.AnalyticsController.getKnowledgeGraph()),format.raw/*60.68*/("""">Knowledge Graph</a></li>
							<li><a href=""""),_display_(/*61.22*/routes/*61.28*/.AnalyticsController.getRelationalKnowledgeGraph),format.raw/*61.76*/("""">Relational Knowledge Graph</a></li>
							<li><a href=""""),_display_(/*62.22*/routes/*62.28*/.AnalyticsController.getDatasetRecommend),format.raw/*62.68*/("""">Semantic Dataset Analytics</a></li>
							<li><a href=""""),_display_(/*63.22*/routes/*63.28*/.AnalyticsController.getScientistRecommend),format.raw/*63.70*/("""">User Analytics</a></li>
							<li><a href=""""),_display_(/*64.22*/routes/*64.28*/.AnalyticsController.getLogGraph),format.raw/*64.60*/("""">Service Execution Log Analytics</a></li>
							<li><a href=""""),_display_(/*65.22*/routes/*65.28*/.AnalyticsController.getSearchAndGenerateWorkflow),format.raw/*65.77*/("""">Generate Workflow</a></li>
						</ul>
					</li>
					
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">Scientist<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(/*72.22*/routes/*72.28*/.UsersController.getAllUsers()),format.raw/*72.58*/("""">All Users</a></li>
							<li><a href=""""),_display_(/*73.22*/routes/*73.28*/.UsersController.searchUser()),format.raw/*73.57*/("""">Search User</a></li>
							"""),_display_(/*74.9*/if(true)/*74.17*/ {_display_(Seq[Any](format.raw/*74.19*/("""
								"""),format.raw/*75.9*/("""<li><a href="#">Most Active Users</a></li>
								<li><a href=""""),_display_(/*76.23*/routes/*76.29*/.BugReportController.reports),format.raw/*76.57*/("""">Bug Report</a></li>
								<li><a href=""""),_display_(/*77.23*/routes/*77.29*/.BugReportController.list),format.raw/*77.54*/("""">Bug List</a></li>
							""")))}),format.raw/*78.9*/("""
						"""),format.raw/*79.7*/("""</ul>
					</li>
					
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">About<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(/*85.22*/routes/*85.28*/.Application.home()),format.raw/*85.47*/("""">Home</a></li>
							<li><a href=""""),_display_(/*86.22*/routes/*86.28*/.AboutController.aboutUs()),format.raw/*86.54*/("""">About Us</a></li>
							<li><a href=""""),_display_(/*87.22*/routes/*87.28*/.AboutController.aboutProject()),format.raw/*87.59*/("""">About project</a></li>
							<li><a href=""""),_display_(/*88.22*/routes/*88.28*/.AboutController.FAQs()),format.raw/*88.51*/("""">FRQs</a></li>
							<li><a href=""""),_display_(/*89.22*/routes/*89.28*/.AboutController.tutorial()),format.raw/*89.55*/("""">Tutorial</a></li>
						</ul>
					</li>
					
					"""),_display_(/*93.7*/if(!session.get("email"))/*93.32*/ {_display_(Seq[Any](format.raw/*93.34*/("""
						"""),format.raw/*94.7*/("""<form class="navbar-form navbar-right" action=""""),_display_(/*94.55*/routes/*94.61*/.Application.login()),format.raw/*94.81*/("""">
							<button type="submit" class="btn btn-success">Log in</button>
						</form>
					""")))}/*97.8*/else/*97.13*/{_display_(Seq[Any](format.raw/*97.14*/("""
						"""),format.raw/*98.7*/("""<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">My Services<b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="#">My climate services</a></li>
								<li><a href="#">My datasets</a></li>
							</ul>
						</li>
						
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">"""),_display_(/*107.68*/session/*107.75*/.get("email")),format.raw/*107.88*/("""<b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href=""""),_display_(/*109.23*/routes/*109.29*/.Application.logout()),format.raw/*109.50*/("""">Log out</a></li>
							</ul>
						</li>
					""")))}),format.raw/*112.7*/("""	
										
					"""),_display_(/*114.7*/if(false)/*114.16*/ {_display_(Seq[Any](format.raw/*114.18*/("""
						"""),format.raw/*115.7*/("""<form class="navbar-form navbar-right" action="#">
							<button type="submit" class="btn btn-success">Admin Console</button>
						</form>
					""")))}),format.raw/*118.7*/("""						
					
				"""),format.raw/*120.5*/("""</ul>
			</div>
		</div>
	</div>
	
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Dec 10 17:28:46 PST 2015
                  SOURCE: /Users/weiwang/climate-service/app/views/header.scala.html
                  HASH: 8b7be4cb772e7ce6fe0d35c13311f9361cd5bc2d
                  MATRIX: 799->0|1342->516|1357->522|1416->560|1498->615|1513->621|1563->650|1988->1048|2003->1054|2086->1116|2355->1358|2370->1364|2451->1424|2530->1476|2545->1482|2623->1539|2701->1590|2716->1596|2784->1643|2856->1688|2871->1694|2942->1744|3000->1776|3017->1784|3057->1786|3093->1795|3134->1809|3149->1815|3216->1861|3284->1899|3319->1907|3360->1921|3375->1927|3445->1976|3710->2214|3725->2220|3786->2260|3858->2305|3873->2311|3930->2347|3988->2379|4005->2387|4045->2389|4081->2398|4163->2450|4198->2458|4239->2472|4254->2478|4309->2512|4572->2748|4587->2754|4652->2798|4733->2852|4748->2858|4816->2905|4894->2956|4909->2962|4969->3001|5040->3045|5055->3051|5116->3091|5191->3139|5206->3145|5275->3193|5361->3252|5376->3258|5437->3298|5523->3357|5538->3363|5601->3405|5675->3452|5690->3458|5743->3490|5834->3554|5849->3560|5919->3609|6185->3848|6200->3854|6251->3884|6320->3926|6335->3932|6385->3961|6442->3992|6459->4000|6499->4002|6535->4011|6627->4076|6642->4082|6691->4110|6762->4154|6777->4160|6823->4185|6881->4213|6915->4220|7142->4420|7157->4426|7197->4445|7261->4482|7276->4488|7323->4514|7391->4555|7406->4561|7458->4592|7531->4638|7546->4644|7590->4667|7654->4704|7669->4710|7717->4737|7798->4792|7832->4817|7872->4819|7906->4826|7981->4874|7996->4880|8037->4900|8147->4993|8160->4998|8199->4999|8233->5006|8645->5390|8662->5397|8697->5410|8807->5492|8823->5498|8866->5519|8947->5569|8993->5588|9012->5597|9053->5599|9088->5606|9266->5753|9311->5770
                  LINES: 29->1|41->13|41->13|41->13|42->14|42->14|42->14|52->24|52->24|52->24|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|62->34|62->34|63->35|63->35|63->35|64->36|64->36|64->36|64->36|65->37|66->38|66->38|66->38|66->38|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|76->48|77->49|78->50|78->50|78->50|78->50|85->57|85->57|85->57|86->58|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|89->61|89->61|89->61|90->62|90->62|90->62|91->63|91->63|91->63|92->64|92->64|92->64|93->65|93->65|93->65|100->72|100->72|100->72|101->73|101->73|101->73|102->74|102->74|102->74|103->75|104->76|104->76|104->76|105->77|105->77|105->77|106->78|107->79|113->85|113->85|113->85|114->86|114->86|114->86|115->87|115->87|115->87|116->88|116->88|116->88|117->89|117->89|117->89|121->93|121->93|121->93|122->94|122->94|122->94|122->94|125->97|125->97|125->97|126->98|135->107|135->107|135->107|137->109|137->109|137->109|140->112|142->114|142->114|142->114|143->115|146->118|148->120
                  -- GENERATED --
              */
          