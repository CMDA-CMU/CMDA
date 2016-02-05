
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
object searchClimateService extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[ClimateService],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(climateServiceForm: play.data.Form[ClimateService]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
def /*5.2*/scripts/*5.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.13*/("""
	"""),format.raw/*6.2*/("""<script src='"""),_display_(/*6.16*/routes/*6.22*/.Assets.at("javascripts/edit_button.js")),format.raw/*6.62*/("""'></script>
	<link rel="stylesheet" href="//code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css">
	<script src="//code.jquery.com/jquery-1.10.2.js"></script>
  	<script src="//code.jquery.com/ui/1.11.3/jquery-ui.js"></script>
	<script type="text/javascript">
		$(document)
				.ready(
						function() """),format.raw/*13.18*/("""{"""),format.raw/*13.19*/("""
							"""),format.raw/*14.8*/("""$("#preview")
									.click(
											function() """),format.raw/*16.23*/("""{"""),format.raw/*16.24*/("""
												"""),format.raw/*17.13*/("""var target = document
														.getElementById("show");
												if (target.style.display == "none") """),format.raw/*19.49*/("""{"""),format.raw/*19.50*/("""
													"""),format.raw/*20.14*/("""target.style.display = "block";
													$("#preview").text("Hide");
													var climateServiceName = $(
															"#climateServiceName")
															.val();
													var purpose = $("#purpose")
															.val();
													var scenario = $(
															"#scenario")
															.val();
													var url = $(
															"#url")
															.val();
													var versionNo = $(
															"#versionNo")
															.val();
												
													if (climateServiceName != "") """),format.raw/*37.44*/("""{"""),format.raw/*37.45*/("""
														"""),format.raw/*38.15*/("""$("#content")
																.append(
																		" Climate Service Name = "
																				+ climateServiceName);
													"""),format.raw/*42.14*/("""}"""),format.raw/*42.15*/("""
													"""),format.raw/*43.14*/("""if (purpose != ""
															&& purpose != null) """),format.raw/*44.36*/("""{"""),format.raw/*44.37*/("""
														"""),format.raw/*45.15*/("""$("#content")
																.append(
																		" Purpose = "
																				+ purpose);
													"""),format.raw/*49.14*/("""}"""),format.raw/*49.15*/("""
												
													"""),format.raw/*51.14*/("""if (scenario != ""
															&& scenario != null) """),format.raw/*52.37*/("""{"""),format.raw/*52.38*/("""
														"""),format.raw/*53.15*/("""$("#content")
																.append(
																		" Scenario = "
																				+ scenario);
													"""),format.raw/*57.14*/("""}"""),format.raw/*57.15*/("""
													"""),format.raw/*58.14*/("""if (url != ""
															&& url != null) """),format.raw/*59.32*/("""{"""),format.raw/*59.33*/("""
														"""),format.raw/*60.15*/("""$("#content")
																.append(
																		" URL = "
																				+ url);
													"""),format.raw/*64.14*/("""}"""),format.raw/*64.15*/("""
													"""),format.raw/*65.14*/("""if (versionNo != ""
															&& versionNo != null) """),format.raw/*66.38*/("""{"""),format.raw/*66.39*/("""
														"""),format.raw/*67.15*/("""$("#content")
																.append(
																		" Version Number = "
																				+ versionNo);
													"""),format.raw/*71.14*/("""}"""),format.raw/*71.15*/("""

												"""),format.raw/*73.13*/("""}"""),format.raw/*73.14*/(""" """),format.raw/*73.15*/("""else """),format.raw/*73.20*/("""{"""),format.raw/*73.21*/("""
													"""),format.raw/*74.14*/("""$("#content").val('');
													target.style.display = "none";
													$("#preview").text(
															"Preview");
												"""),format.raw/*78.13*/("""}"""),format.raw/*78.14*/("""
											"""),format.raw/*79.12*/("""}"""),format.raw/*79.13*/(""");
						"""),format.raw/*80.7*/("""}"""),format.raw/*80.8*/(""");
	</script>
""")))};
Seq[Any](format.raw/*1.54*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*82.2*/("""

"""),_display_(/*84.2*/main("Search Climate Service", scripts)/*84.41*/{_display_(Seq[Any](format.raw/*84.42*/(""" 
	 
    """),format.raw/*86.5*/("""<h1 style="margin-left:420px">Search Climate Service</h1>
    """),_display_(/*87.6*/helper/*87.12*/.form(routes.ClimateServiceController.getSearchResult())/*87.68*/ {_display_(Seq[Any](format.raw/*87.70*/("""
    	"""),format.raw/*88.6*/("""<div class="ui-widget col-sm-offset-3 col-sm-7">
    	<div class = "form-group">
    		"""),_display_(/*90.8*/inputText(climateServiceForm("Climate Service Name"), 'class -> "form-control", 'id -> "climateServiceName", '_label -> Messages("Climate Service Name"), 'placeholder -> "twoDimSlice3D", 'size->70)),format.raw/*90.205*/(""" 
    	"""),format.raw/*91.6*/("""</div>
    	<div class = "form-group">
    		"""),_display_(/*93.8*/inputText(climateServiceForm("Purpose"), 'class -> "form-control", 'id -> "purpose", '_label -> Messages("Purpose"), 'placeholder -> "service purpose", 'size->70)),format.raw/*93.170*/(""" 
    	"""),format.raw/*94.6*/("""</div>
    	
       	<div class = "form-group">
       		"""),_display_(/*97.11*/inputText(climateServiceForm("Scenario"), 'class -> "form-control", 'id -> "scenario", '_label -> Messages("Scenario"), 'placeholder -> "1", 'size->70)),format.raw/*97.162*/("""
	    """),format.raw/*98.6*/("""</div>
	    <div class = "form-group">
	    	"""),_display_(/*100.8*/inputText(climateServiceForm("Url"), 'class -> "form-control", 'id -> "url", '_label -> Messages("Url"), 'placeholder -> "http://", 'size->70)),format.raw/*100.150*/("""
	    	
	    """),format.raw/*102.6*/("""</div>
	    <div class = "form-group">
       		"""),_display_(/*104.11*/inputText(climateServiceForm("Version Number"), 'class -> "form-control", 'id -> "versionNo", '_label -> Messages("Version Number"), 'placeholder -> "1", 'size->70)),format.raw/*104.175*/("""
	    
	    	"""),format.raw/*106.7*/("""<div id="show" style="display: none;">
	    		<textarea style="width: 640px" rows="4" id="content"></textarea>
	    	</div>
	    </div>
	    <div align="center">
	    	<button id="preview" type="button" class="btn btn-info"> Preview</button>
	    	<input class="btn" type="submit" value="Search">
	    </div>
	    </div>
	    
	    """)))}),format.raw/*116.7*/("""
	 """)))}))}
  }

  def render(climateServiceForm:play.data.Form[ClimateService]): play.twirl.api.HtmlFormat.Appendable = apply(climateServiceForm)

  def f:((play.data.Form[ClimateService]) => play.twirl.api.HtmlFormat.Appendable) = (climateServiceForm) => apply(climateServiceForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Dec 10 17:28:47 PST 2015
                  SOURCE: /Users/weiwang/climate-service/app/views/searchClimateService.scala.html
                  HASH: fe8cb0dd0844afac4ea4cad950991d115ae0a6e1
                  MATRIX: 762->1|900->74|914->81|994->85|1022->87|1062->101|1076->107|1136->147|1472->455|1501->456|1536->464|1617->517|1646->518|1687->531|1824->640|1853->641|1895->655|2456->1188|2485->1189|2528->1204|2696->1344|2725->1345|2767->1359|2848->1412|2877->1413|2920->1428|3064->1544|3093->1545|3148->1572|3231->1627|3260->1628|3303->1643|3449->1761|3478->1762|3520->1776|3593->1821|3622->1822|3665->1837|3801->1945|3830->1946|3872->1960|3957->2017|3986->2018|4029->2033|4182->2158|4211->2159|4253->2173|4282->2174|4311->2175|4344->2180|4373->2181|4415->2195|4582->2334|4611->2335|4651->2347|4680->2348|4716->2357|4744->2358|4798->53|4826->72|4854->2373|4883->2376|4931->2415|4970->2416|5006->2425|5095->2488|5110->2494|5175->2550|5215->2552|5248->2558|5362->2646|5581->2843|5615->2850|5687->2896|5871->3058|5905->3065|5990->3123|6163->3274|6196->3280|6269->3326|6434->3468|6475->3481|6552->3530|6739->3694|6780->3707|7144->4040
                  LINES: 26->1|28->5|28->5|30->5|31->6|31->6|31->6|31->6|38->13|38->13|39->14|41->16|41->16|42->17|44->19|44->19|45->20|62->37|62->37|63->38|67->42|67->42|68->43|69->44|69->44|70->45|74->49|74->49|76->51|77->52|77->52|78->53|82->57|82->57|83->58|84->59|84->59|85->60|89->64|89->64|90->65|91->66|91->66|92->67|96->71|96->71|98->73|98->73|98->73|98->73|98->73|99->74|103->78|103->78|104->79|104->79|105->80|105->80|108->1|110->4|111->82|113->84|113->84|113->84|115->86|116->87|116->87|116->87|116->87|117->88|119->90|119->90|120->91|122->93|122->93|123->94|126->97|126->97|127->98|129->100|129->100|131->102|133->104|133->104|135->106|145->116
                  -- GENERATED --
              */
          