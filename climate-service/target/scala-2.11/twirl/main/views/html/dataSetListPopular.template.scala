
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
object dataSetListPopular extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[Dataset],List[Dataset],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(dataSetForm: play.data.Form[Dataset], dataSets: List[Dataset]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import java.math.BigInteger;var k=1;var n = 0;
def /*6.2*/scripts/*6.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.13*/("""
	"""),format.raw/*7.2*/("""<script src='"""),_display_(/*7.16*/routes/*7.22*/.Assets.at("javascripts/edit_button.js")),format.raw/*7.62*/("""'></script>
	<script type="text/javascript">
	$(document).ready(function()"""),format.raw/*9.30*/("""{"""),format.raw/*9.31*/("""
		"""),format.raw/*10.3*/("""//alert($("#url").text());
	"""),format.raw/*11.2*/("""}"""),format.raw/*11.3*/(""");
	</script>
""")))};
Seq[Any](format.raw/*1.65*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*13.2*/("""

"""),_display_(/*15.2*/main("Dataset List", scripts)/*15.31*/ {_display_(Seq[Any](format.raw/*15.33*/(""" 
	 
    """),format.raw/*17.5*/("""<h1>Datasets List</h1>
    <h2>"""),_display_(/*18.10*/dataSets/*18.18*/.size()),format.raw/*18.25*/(""" """),format.raw/*18.26*/("""Datasets Found</h2>
<div style="overflow-y:scroll">
		<table class="table table-striped table-bordered table-condensed tablesorter" id ="myTable">
		<thead>
	<tr >
		<!-- 
		<th style = "vertical-align: top;" class="col-md-1 header">Id</th>
		-->
		<th style = "vertical-align: top;" class="col-md-2">Dataset Name</th>
		<th style = "vertical-align: top;" class="col-md-1">Agency</th>
		<th style = "vertical-align: top;" class="col-md-1">Instrument/Model Experiment</th>
		<th style = "vertical-align: top;" class="col-md-2">Physical variable</th>
		<th style = "vertical-align: top;" class="col-md-1">Variable short name</th>
		<th style = "vertical-align: top;" class="col-md-1">Units</th>
		<th style = "vertical-align: top;" class="col-md-1">Grid Dimension</th>
		
		<th style = "vertical-align: top;" class="col-md-2">Variable Name in Web Interface</th>
		<th style = "vertical-align: top;" class="col-md-1">Data Source Input Parameter</th>
		
		<th style = "vertical-align: top;" class="col-md-1">Dataset Start Time</th>
		<th style = "vertical-align: top;"class="col-md-1">Dataset End Time</th>
		<th style = "vertical-align: top;"class="col-md-1">Duration</th>

	</tr>
	</thead>
	<tbody>
"""),_display_(/*44.2*/for(dataSet <- dataSets) yield /*44.26*/{_display_(Seq[Any](format.raw/*44.27*/("""
							"""),format.raw/*45.8*/("""<tr>
								<!-- 
								<td><font size="2">"""),_display_(/*47.29*/dataSet/*47.36*/.getId()),format.raw/*47.44*/("""</font></td>
								-->
								<td><font size="2">"""),_display_(/*49.29*/dataSet/*49.36*/.getName()),format.raw/*49.46*/("""</font></td>
								<td><font size="2">"""),_display_(/*50.29*/dataSet/*50.36*/.getAgencyId()),format.raw/*50.50*/("""</font></td>
								<td><font size="2">"""),_display_(/*51.29*/dataSet/*51.36*/.getInstrument()),format.raw/*51.52*/("""</font></td>
								<td><font size="2">"""),_display_(/*52.29*/dataSet/*52.36*/.getPhysicalVariable()),format.raw/*52.58*/("""</font></td>
								<td><font size="2">"""),_display_(/*53.29*/dataSet/*53.36*/.getCMIP5VarName()),format.raw/*53.54*/("""</font></td>
								<td><font size="2">"""),_display_(/*54.29*/dataSet/*54.36*/.getUnits()),format.raw/*54.47*/("""</font></td>
								<td><font size="2">"""),_display_(/*55.29*/dataSet/*55.36*/.getGridDimension()),format.raw/*55.55*/("""</font></td>
								<td><font size="2">"""),_display_(/*56.29*/dataSet/*56.36*/.getVariableNameInWebInterface()),format.raw/*56.68*/("""</font></td>
								<td><font size="2">"""),_display_(/*57.29*/dataSet/*57.36*/.getDataSourceInputParameterToCallScienceApplicationCode()),format.raw/*57.94*/("""</font></td>
								<td><font size="2">"""),_display_(/*58.29*/dataSet/*58.36*/.getStartTime()),format.raw/*58.51*/("""</font></td>
								<td><font size="2">"""),_display_(/*59.29*/dataSet/*59.36*/.getEndTime()),format.raw/*59.49*/("""</font></td>
								<td><font size="2">"""),_display_(/*60.29*/dataSet/*60.36*/.getDuration()),format.raw/*60.50*/("""</font></td>
							</tr>
							""")))}),format.raw/*62.9*/("""

	
	"""),format.raw/*65.2*/("""</tbody>
    </table>
    </div>
""")))}),format.raw/*68.2*/("""
"""))}
  }

  def render(dataSetForm:play.data.Form[Dataset],dataSets:List[Dataset]): play.twirl.api.HtmlFormat.Appendable = apply(dataSetForm,dataSets)

  def f:((play.data.Form[Dataset],List[Dataset]) => play.twirl.api.HtmlFormat.Appendable) = (dataSetForm,dataSets) => apply(dataSetForm,dataSets)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Dec 10 17:28:46 PST 2015
                  SOURCE: /Users/weiwang/climate-service/app/views/dataSetListPopular.scala.html
                  HASH: fbe6bb627739370bd87be8cbcf1d3abe69c9ad7e
                  MATRIX: 767->1|963->133|977->140|1057->144|1085->146|1125->160|1139->166|1199->206|1300->280|1328->281|1358->284|1413->312|1441->313|1495->64|1523->131|1551->328|1580->331|1618->360|1658->362|1694->371|1753->403|1770->411|1798->418|1827->419|3051->1617|3091->1641|3130->1642|3165->1650|3239->1697|3255->1704|3284->1712|3364->1765|3380->1772|3411->1782|3479->1823|3495->1830|3530->1844|3598->1885|3614->1892|3651->1908|3719->1949|3735->1956|3778->1978|3846->2019|3862->2026|3901->2044|3969->2085|3985->2092|4017->2103|4085->2144|4101->2151|4141->2170|4209->2211|4225->2218|4278->2250|4346->2291|4362->2298|4441->2356|4509->2397|4525->2404|4561->2419|4629->2460|4645->2467|4679->2480|4747->2521|4763->2528|4798->2542|4862->2576|4894->2581|4958->2615
                  LINES: 26->1|29->6|29->6|31->6|32->7|32->7|32->7|32->7|34->9|34->9|35->10|36->11|36->11|39->1|41->5|42->13|44->15|44->15|44->15|46->17|47->18|47->18|47->18|47->18|73->44|73->44|73->44|74->45|76->47|76->47|76->47|78->49|78->49|78->49|79->50|79->50|79->50|80->51|80->51|80->51|81->52|81->52|81->52|82->53|82->53|82->53|83->54|83->54|83->54|84->55|84->55|84->55|85->56|85->56|85->56|86->57|86->57|86->57|87->58|87->58|87->58|88->59|88->59|88->59|89->60|89->60|89->60|91->62|94->65|97->68
                  -- GENERATED --
              */
          