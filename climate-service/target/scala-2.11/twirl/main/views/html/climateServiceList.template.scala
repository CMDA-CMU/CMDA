
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
object climateServiceList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[ClimateService],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(climateServices: List[ClimateService]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.41*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("All Climate Services")/*4.30*/ {_display_(Seq[Any](format.raw/*4.32*/("""

    """),format.raw/*6.5*/("""<h1>"""),_display_(/*6.10*/climateServices/*6.25*/.size()),format.raw/*6.32*/(""" """),format.raw/*6.33*/("""Climate Services</h1>
		<table class="table table-striped table-bordered table-condensed ex2 tablesorter" id = "csTable">
	<thead>
	<tr class="text-center">
		<th style = "vertical-align: middle;" class="col-md-2">Climate Service Name</th>
		<th style = "vertical-align: middle;" class="col-md-4">Purpose</th>
		<th style = "vertical-align: middle;" class="col-md-4">URL</th>
		<th style = "vertical-align: middle;" class="col-md-3">Scenario</th>
		<th style = "vertical-align: middle;" class="col-md-3">Version No</th>
		<th style = "vertical-align: middle;" class="col-md-3">Root Service_Id</th>
		 """),_display_(/*16.5*/if(true)/*16.13*/{_display_(Seq[Any](format.raw/*16.14*/("""
			"""),format.raw/*17.4*/("""<th style = "vertical-align: middle;" class="col-md-2">Operation</th> 
	     """)))}),format.raw/*18.8*/(""" 
	     """),format.raw/*19.7*/("""<th style = "vertical-align: middle;" class="col-md-2">Operation</th>
	</tr>
	</thead>
	<tbody>
	"""),_display_(/*23.3*/for(climateService <- climateServices) yield /*23.41*/ {_display_(Seq[Any](format.raw/*23.43*/("""
	"""),format.raw/*24.2*/("""<tr>
		<td><a href = """"),_display_(/*25.19*/climateService/*25.33*/.getUrl()),format.raw/*25.42*/("""">"""),_display_(/*25.45*/climateService/*25.59*/.getName()),format.raw/*25.69*/("""</a></td>

		<td><span class=""""),_display_(/*27.21*/climateService/*27.35*/.getName()),format.raw/*27.45*/(""" """),format.raw/*27.46*/("""editable" data-name='purpose'>
				"""),_display_(/*28.6*/{
					if (climateService.getPurpose().length > 5 ) {
						climateService.getPurpose().substring(0,5) + "...";
					}else {
						climateService.getPurpose();
					}
				}),format.raw/*34.6*/("""  """),format.raw/*34.8*/("""</span></td>
		
		<td><span class=""""),_display_(/*36.21*/climateService/*36.35*/.getName()),format.raw/*36.45*/(""" """),format.raw/*36.46*/("""editable" id = "url" data-name='url'>
				<a href = """"),_display_(/*37.17*/climateService/*37.31*/.getUrl()),format.raw/*37.40*/("""">
				"""),_display_(/*38.6*/{
					if (climateService.getUrl().length > 5 ) {
						"..." + climateService.getUrl().substring(31);
					}else {
						climateService.getUrl();
					}
				}),format.raw/*44.6*/("""</a></span></td>
				
		<td><span class=""""),_display_(/*46.21*/climateService/*46.35*/.getName()),format.raw/*46.45*/(""" """),format.raw/*46.46*/("""editable" data-name='scenario'>
				"""),_display_(/*47.6*/climateService/*47.20*/.getScenario()),format.raw/*47.34*/(""" """),format.raw/*47.35*/("""</span></td>
				
		<td><span class=""""),_display_(/*49.21*/climateService/*49.35*/.getName()),format.raw/*49.45*/(""" """),format.raw/*49.46*/("""editable" data-name='versionNo'>
				"""),_display_(/*50.6*/climateService/*50.20*/.getVersionNo()),format.raw/*50.35*/(""" """),format.raw/*50.36*/("""</span></td>
				
		<td><span class=""""),_display_(/*52.21*/climateService/*52.35*/.getName()),format.raw/*52.45*/(""" """),format.raw/*52.46*/("""editable" data-name='rootServiceId'>
				"""),_display_(/*53.6*/climateService/*53.20*/.getRootServiceId()),format.raw/*53.39*/(""" """),format.raw/*53.40*/("""</span></td>
				
		<td><input type="file" class="btn btn-info" id ="upload """),_display_(/*55.60*/climateService/*55.74*/.getName()),format.raw/*55.84*/("""" ></button></td>
		<td><button type="button" class="btn btn-danger" id ="doReplace"  onclick="Javascript:replaceFile('upload '+'"""),_display_(/*56.113*/climateService/*56.127*/.getName()),format.raw/*56.137*/("""')" >Execute</button></td>
	
	</tr>
	""")))}),format.raw/*59.3*/("""
	"""),format.raw/*60.2*/("""</tbody>
    </table>
""")))}),format.raw/*62.2*/("""
"""))}
  }

  def render(climateServices:List[ClimateService]): play.twirl.api.HtmlFormat.Appendable = apply(climateServices)

  def f:((List[ClimateService]) => play.twirl.api.HtmlFormat.Appendable) = (climateServices) => apply(climateServices)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Dec 10 17:28:46 PST 2015
                  SOURCE: /Users/weiwang/climate-service/app/views/climateServiceList.scala.html
                  HASH: b541c4b58cdfe2769b8777da52fb3caaba37d6b7
                  MATRIX: 750->1|892->40|919->58|946->60|982->88|1021->90|1053->96|1084->101|1107->116|1134->123|1162->124|1790->726|1807->734|1846->735|1877->739|1985->817|2020->825|2144->923|2198->961|2238->963|2267->965|2317->988|2340->1002|2370->1011|2400->1014|2423->1028|2454->1038|2512->1069|2535->1083|2566->1093|2595->1094|2657->1130|2849->1302|2878->1304|2941->1340|2964->1354|2995->1364|3024->1365|3105->1419|3128->1433|3158->1442|3192->1450|3371->1609|3440->1651|3463->1665|3494->1675|3523->1676|3586->1713|3609->1727|3644->1741|3673->1742|3738->1780|3761->1794|3792->1804|3821->1805|3885->1843|3908->1857|3944->1872|3973->1873|4038->1911|4061->1925|4092->1935|4121->1936|4189->1978|4212->1992|4252->2011|4281->2012|4385->2089|4408->2103|4439->2113|4597->2243|4621->2257|4653->2267|4721->2305|4750->2307|4803->2330
                  LINES: 26->1|29->1|30->3|31->4|31->4|31->4|33->6|33->6|33->6|33->6|33->6|43->16|43->16|43->16|44->17|45->18|46->19|50->23|50->23|50->23|51->24|52->25|52->25|52->25|52->25|52->25|52->25|54->27|54->27|54->27|54->27|55->28|61->34|61->34|63->36|63->36|63->36|63->36|64->37|64->37|64->37|65->38|71->44|73->46|73->46|73->46|73->46|74->47|74->47|74->47|74->47|76->49|76->49|76->49|76->49|77->50|77->50|77->50|77->50|79->52|79->52|79->52|79->52|80->53|80->53|80->53|80->53|82->55|82->55|82->55|83->56|83->56|83->56|86->59|87->60|89->62
                  -- GENERATED --
              */
          