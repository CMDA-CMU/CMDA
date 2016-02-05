
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
object serviceLog extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[ServiceExecutionLog],play.data.Form[ServiceExecutionLog],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(serviceLogs: List[ServiceExecutionLog], serviceLogForm: play.data.Form[ServiceExecutionLog]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.95*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Service Logs")/*5.22*/{_display_(Seq[Any](format.raw/*5.23*/(""" 
	 
    """),format.raw/*7.5*/("""<h1>"""),_display_(/*7.10*/serviceLogs/*7.21*/.size()),format.raw/*7.28*/(""" """),format.raw/*7.29*/("""Service Logs</h1>
   
    
    """),_display_(/*10.6*/helper/*10.12*/.form(routes.Application.home())/*10.44*/ {_display_(Seq[Any](format.raw/*10.46*/("""
    """),format.raw/*11.5*/("""<div class = "container">
    	<div class = "col-sm-offset-2 col-sm-1">
    		<!-- """),_display_(/*13.13*/inputText(serviceLogForm("User Id"),  'class -> "form-control", 'id -> "userId", '_label -> Messages("User Id"), 'placeholder -> "123")),format.raw/*13.148*/(""" """),format.raw/*13.149*/("""-->
    	</div>
    	<div class = "col-sm-4" >
    		"""),_display_(/*16.8*/inputText(serviceLogForm("Start Time"), 'class -> "form-control", 'id -> "startTime", 'type -> "datetime-local", '_label -> Messages("Execution Start Time"))),format.raw/*16.165*/("""
    	"""),format.raw/*17.6*/("""</div>
    	<div class = "col-sm-4">
	    	"""),_display_(/*19.8*/inputText(serviceLogForm("End Time"),  'class -> "form-control", 'id -> "endTime", 'type -> "datetime-local", '_label -> Messages("Execution End Time"))),format.raw/*19.160*/("""
    	"""),format.raw/*20.6*/("""</div>
    	<input class="btn" type="submit" value="Search" style="margin-top:23px">
    </div>
    """)))}),format.raw/*23.6*/("""
    
    """),format.raw/*25.5*/("""<table class="table table-striped table-bordered table-condensed tablesorter" id ="myTable2">
    <thead>
	<tr>
		<th style = "vertical-align: top;" class="col-sm-1">Service Id</th>
		<th style = "vertical-align: top;" class="col-sm-3">Service Name</th>
 		<th style = "vertical-align: top;" class="col-sm-2">User Name</th> 
		<th style = "vertical-align: top;" class="col-sm-2">Purpose</th>
		<th style = "vertical-align: top;" class="col-sm-2">Execution Start Time</th>
		<th style = "vertical-align: top;" class="col-sm-2">Execution End Time</th>		
		<th style = "vertical-align: top;" class="col-sm-1">DataSet Start Time</th>
		<th style = "vertical-align: top;" class="col-sm-1">DataSet End Time</th>
		<th style = "vertical-align: top;" class="col-sm-1">Details</th>		
	</tr>
	</thead>
	<tbody>
	"""),_display_(/*40.3*/for(serviceLog <- serviceLogs) yield /*40.33*/ {_display_(Seq[Any](format.raw/*40.35*/("""
	"""),format.raw/*41.2*/("""<tr>
	<td><font size="2">"""),_display_(/*42.22*/serviceLog/*42.32*/.getServiceId),format.raw/*42.45*/("""</font></td>
	<td><font size="2">"""),_display_(/*43.22*/serviceLog/*43.32*/.getServiceName),format.raw/*43.47*/("""</font></td>
 	<td><font size="2">"""),_display_(/*44.23*/serviceLog/*44.33*/.getUserName),format.raw/*44.45*/("""</font></td>
	<td><font size="2">"""),_display_(/*45.22*/serviceLog/*45.32*/.getPurpose),format.raw/*45.43*/("""</font></td>
	<td><font size="2">"""),_display_(/*46.22*/serviceLog/*46.32*/.getExecutionStartTime),format.raw/*46.54*/("""</font></td>
	<td><font size="2">"""),_display_(/*47.22*/serviceLog/*47.32*/.getExecutionEndTime),format.raw/*47.52*/("""</font></td>
	<td><font size="2">"""),_display_(/*48.22*/serviceLog/*48.32*/.getDataSetStartTime),format.raw/*48.52*/("""</font></td>
	<td><font size="2">"""),_display_(/*49.22*/serviceLog/*49.32*/.getDataSetEndTime),format.raw/*49.50*/("""</font></td>
	<td>
	"""),_display_(/*51.3*/if(serviceLog.getUrl() != null)/*51.34*/{_display_(Seq[Any](format.raw/*51.35*/("""
		"""),format.raw/*52.3*/("""<form method="post" action=""""),_display_(/*52.32*/serviceLog/*52.42*/.getUrl),format.raw/*52.49*/("""">
			<input type="submit"  value="see details">
		</form>
	
	""")))}/*56.3*/else/*56.7*/{_display_(Seq[Any](format.raw/*56.8*/("""
		"""),_display_(/*57.4*/form(routes.ServiceExecutionLogController.getConfigurationByConfId())/*57.73*/{_display_(Seq[Any](format.raw/*57.74*/("""
			"""),format.raw/*58.4*/("""<input
				name="logId" class="hidden" type="hidden"
				value=""""),_display_(/*60.13*/serviceLog/*60.23*/.getId),format.raw/*60.29*/("""">
			<input
				type="submit"  value="see details">
		""")))}),format.raw/*63.4*/("""
	""")))}),format.raw/*64.3*/("""
	"""),format.raw/*65.2*/("""</td>
	<!--
	<td>
	"""),_display_(/*68.3*/form(routes.Application.home())/*68.34*/{_display_(Seq[Any](format.raw/*68.35*/(""" 
		"""),format.raw/*69.3*/("""<input
			name="idHolder" class="hidden" type="hidden"
			value=""""),_display_(/*71.12*/serviceLog/*71.22*/.getId),format.raw/*71.28*/("""">
		<input
			type="submit" class="btn btn-primary delete-btn span2" value="Delete"
			onclick="return confirm('Are you sure you want to delete this log?')">
		""")))}),format.raw/*75.4*/("""
	"""),format.raw/*76.2*/("""</td>
	-->
	</tr>
	""")))}),format.raw/*79.3*/("""
	"""),format.raw/*80.2*/("""</tbody>
    </table>
""")))}),format.raw/*82.2*/("""
	"""))}
  }

  def render(serviceLogs:List[ServiceExecutionLog],serviceLogForm:play.data.Form[ServiceExecutionLog]): play.twirl.api.HtmlFormat.Appendable = apply(serviceLogs,serviceLogForm)

  def f:((List[ServiceExecutionLog],play.data.Form[ServiceExecutionLog]) => play.twirl.api.HtmlFormat.Appendable) = (serviceLogs,serviceLogForm) => apply(serviceLogs,serviceLogForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Dec 10 17:28:47 PST 2015
                  SOURCE: /Users/weiwang/climate-service/app/views/serviceLog.scala.html
                  HASH: b663a51f83be9c088f7d3eb00f0a73b3b7b5bb19
                  MATRIX: 783->1|979->94|1007->113|1034->115|1062->135|1100->136|1135->145|1166->150|1185->161|1212->168|1240->169|1298->201|1313->207|1354->239|1394->241|1426->246|1537->330|1694->465|1724->466|1804->520|1983->677|2016->683|2086->727|2260->879|2293->885|2424->986|2461->996|3290->1799|3336->1829|3376->1831|3405->1833|3458->1859|3477->1869|3511->1882|3572->1916|3591->1926|3627->1941|3689->1976|3708->1986|3741->1998|3802->2032|3821->2042|3853->2053|3914->2087|3933->2097|3976->2119|4037->2153|4056->2163|4097->2183|4158->2217|4177->2227|4218->2247|4279->2281|4298->2291|4337->2309|4384->2330|4424->2361|4463->2362|4493->2365|4549->2394|4568->2404|4596->2411|4677->2474|4689->2478|4727->2479|4757->2483|4835->2552|4874->2553|4905->2557|4997->2622|5016->2632|5043->2638|5129->2694|5162->2697|5191->2699|5237->2719|5277->2750|5316->2751|5347->2755|5440->2821|5459->2831|5486->2837|5678->2999|5707->3001|5757->3021|5786->3023|5839->3046
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|34->7|34->7|34->7|34->7|37->10|37->10|37->10|37->10|38->11|40->13|40->13|40->13|43->16|43->16|44->17|46->19|46->19|47->20|50->23|52->25|67->40|67->40|67->40|68->41|69->42|69->42|69->42|70->43|70->43|70->43|71->44|71->44|71->44|72->45|72->45|72->45|73->46|73->46|73->46|74->47|74->47|74->47|75->48|75->48|75->48|76->49|76->49|76->49|78->51|78->51|78->51|79->52|79->52|79->52|79->52|83->56|83->56|83->56|84->57|84->57|84->57|85->58|87->60|87->60|87->60|90->63|91->64|92->65|95->68|95->68|95->68|96->69|98->71|98->71|98->71|102->75|103->76|106->79|107->80|109->82
                  -- GENERATED --
              */
          