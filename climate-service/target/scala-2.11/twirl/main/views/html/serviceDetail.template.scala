
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
object serviceDetail extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,List[ServiceConfigurationItem],ServiceExecutionLog,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(servicePage: String, moreScript: String, confItems: List[ServiceConfigurationItem], serviceLog: ServiceExecutionLog):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
def /*3.2*/scripts/*3.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
"""),format.raw/*4.1*/("""<script type="text/javascript">
	
	window.onload = function() """),format.raw/*6.29*/("""{"""),format.raw/*6.30*/("""
		
		"""),format.raw/*8.3*/("""var value = "";
		var parameterPurpose = "";
		var parameterRule = "";
		
		var seperator = "  |  ";
		"""),_display_(/*13.4*/for(confItem <- confItems) yield /*13.30*/ {_display_(Seq[Any](format.raw/*13.32*/("""
			"""),format.raw/*14.4*/("""var parameterName = "";
			var parameterType = "";
			var parameterValue = "";
			var parameterDefaultValue = "";
			parameterPurpose = """"),_display_(/*18.25*/confItem/*18.33*/.getParameterPurpose()),format.raw/*18.55*/("""";
			parameterRule = """"),_display_(/*19.22*/confItem/*19.30*/.getParameterRule()),format.raw/*19.49*/("""";
			value = """"),_display_(/*20.14*/confItem/*20.22*/.getValue()),format.raw/*20.33*/("""";
			parameterName = """"),_display_(/*21.22*/confItem/*21.30*/.getParameterName()),format.raw/*21.49*/("""";
			parameterType = parameterRule.split("*|")[1].split("|*")[1];
			parameterValue = parameterRule.split("*|")[2].split("|*")[1];
			parameterDefaultValue = parameterRule.split("*|")[3].split("|*")[1];
			
			var res = parameterPurpose.split(" ");
			var name = res[0];
			for (i = 1; i < res.length; i++) """),format.raw/*28.37*/("""{"""),format.raw/*28.38*/("""
				"""),format.raw/*29.5*/("""var temp = res[i].charAt(0).toUpperCase();
				temp += res[i].substring(1);
				name += temp;
			"""),format.raw/*32.4*/("""}"""),format.raw/*32.5*/("""
			"""),format.raw/*33.4*/("""name += "_detail";
			
			
			console.log(parameterName + seperator + name + seperator + value + seperator + parameterType + seperator + parameterValue + seperator + parameterDefaultValue);

			switch (parameterType) """),format.raw/*38.27*/("""{"""),format.raw/*38.28*/("""
				case "Input text":
					document.getElementById(name).value = value;		           
		            break;
		        case "Input area":
		        	document.getElementById(name).innerHTML = value;
		            break;
		        case "Multiple selects":
		        	var paraArr = parameterValue.split(",");
		        	var checkedPara = value.split(",");		        	
		        	for (var i=0; i<paraArr.length; i++) """),format.raw/*48.49*/("""{"""),format.raw/*48.50*/("""
		        		"""),format.raw/*49.13*/("""$("#" + name + i).prop( "checked", false );
		        		for (var j=0; j<checkedPara.length; j++ ) """),format.raw/*50.55*/("""{"""),format.raw/*50.56*/("""
		        			"""),format.raw/*51.14*/("""if ($("#" + name + i).val() == checkedPara[j]) """),format.raw/*51.61*/("""{"""),format.raw/*51.62*/("""
		        				"""),format.raw/*52.15*/("""$("#" + name + i).prop( "checked", true );
		        			"""),format.raw/*53.14*/("""}"""),format.raw/*53.15*/("""
		        		"""),format.raw/*54.13*/("""}"""),format.raw/*54.14*/(""" 
		        	"""),format.raw/*55.12*/("""}"""),format.raw/*55.13*/("""
		        	
		            """),format.raw/*57.15*/("""break;
		        case "Radio button":
		        	var paraArr = parameterValue.split(",");
		        	for (var i=0; i<paraArr.length; i++) """),format.raw/*60.49*/("""{"""),format.raw/*60.50*/("""
		        		"""),format.raw/*61.13*/("""if ($("#" + name + i).val() == value) """),format.raw/*61.51*/("""{"""),format.raw/*61.52*/("""
		        			"""),format.raw/*62.14*/("""$( "#" + name + i ).prop("checked", true);
		        			break;
		        		"""),format.raw/*64.13*/("""}"""),format.raw/*64.14*/("""
		        	"""),format.raw/*65.12*/("""}"""),format.raw/*65.13*/("""
		            """),format.raw/*66.15*/("""break;
		        case "Dropdown list":		        	
		        	var allOptions = document.getElementById(parameterName + "_trID").getElementsByTagName('option');
		        	for (var i =0; i<allOptions.length; i++) """),format.raw/*69.53*/("""{"""),format.raw/*69.54*/("""
		        		"""),format.raw/*70.13*/("""if(allOptions[i].value == value) """),format.raw/*70.46*/("""{"""),format.raw/*70.47*/("""
		        			"""),format.raw/*71.14*/("""allOptions[i].selected = true;
		        		"""),format.raw/*72.13*/("""}"""),format.raw/*72.14*/("""
		        	"""),format.raw/*73.12*/("""}"""),format.raw/*73.13*/(""" 
		            """),format.raw/*74.15*/("""break;
		        default:
		            
			"""),format.raw/*77.4*/("""}"""),format.raw/*77.5*/("""					
		""")))}),format.raw/*78.4*/("""
		
		"""),format.raw/*80.3*/("""document.getElementById("purpose_detail").innerHTML = """"),_display_(/*80.59*/serviceLog/*80.69*/.getPurpose()),format.raw/*80.82*/("""";
		document.getElementById("serviceImg").src = """"),_display_(/*81.49*/serviceLog/*81.59*/.getPlotUrl()),format.raw/*81.72*/("""";
		document.getElementById("comment").value = """"),_display_(/*82.48*/serviceLog/*82.58*/.getDataUrl()),format.raw/*82.71*/("""";

	"""),format.raw/*84.2*/("""}"""),format.raw/*84.3*/("""
	"""),_display_(/*85.3*/Html(moreScript)),format.raw/*85.19*/("""
	"""),format.raw/*86.2*/("""</script>
""")))};
Seq[Any](format.raw/*1.119*/(""" 
"""),format.raw/*87.2*/(""" """),_display_(/*87.4*/main("Service Details", scripts)/*87.36*/ {_display_(Seq[Any](format.raw/*87.38*/(""" """),_display_(/*87.40*/Html(servicePage)),format.raw/*87.57*/(""" """)))}),format.raw/*87.59*/("""
"""))}
  }

  def render(servicePage:String,moreScript:String,confItems:List[ServiceConfigurationItem],serviceLog:ServiceExecutionLog): play.twirl.api.HtmlFormat.Appendable = apply(servicePage,moreScript,confItems,serviceLog)

  def f:((String,String,List[ServiceConfigurationItem],ServiceExecutionLog) => play.twirl.api.HtmlFormat.Appendable) = (servicePage,moreScript,confItems,serviceLog) => apply(servicePage,moreScript,confItems,serviceLog)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Dec 10 17:28:47 PST 2015
                  SOURCE: /Users/weiwang/climate-service/app/views/serviceDetail.scala.html
                  HASH: b23266f5f11acf19f9c3d338d6efed64c6e742a7
                  MATRIX: 789->1|992->139|1006->146|1086->150|1113->151|1202->213|1230->214|1262->220|1392->324|1434->350|1474->352|1505->356|1670->494|1687->502|1730->524|1781->548|1798->556|1838->575|1881->591|1898->599|1930->610|1981->634|1998->642|2038->661|2374->969|2403->970|2435->975|2559->1072|2587->1073|2618->1077|2863->1294|2892->1295|3331->1706|3360->1707|3401->1720|3527->1818|3556->1819|3598->1833|3673->1880|3702->1881|3745->1896|3829->1952|3858->1953|3899->1966|3928->1967|3969->1980|3998->1981|4053->2008|4219->2146|4248->2147|4289->2160|4355->2198|4384->2199|4426->2213|4529->2288|4558->2289|4598->2301|4627->2302|4670->2317|4909->2528|4938->2529|4979->2542|5040->2575|5069->2576|5111->2590|5182->2633|5211->2634|5251->2646|5280->2647|5324->2663|5395->2707|5423->2708|5462->2717|5495->2723|5578->2779|5597->2789|5631->2802|5709->2853|5728->2863|5762->2876|5839->2926|5858->2936|5892->2949|5924->2954|5952->2955|5981->2958|6018->2974|6047->2976|6098->118|6127->2987|6155->2989|6196->3021|6236->3023|6265->3025|6303->3042|6336->3044
                  LINES: 26->1|28->3|28->3|30->3|31->4|33->6|33->6|35->8|40->13|40->13|40->13|41->14|45->18|45->18|45->18|46->19|46->19|46->19|47->20|47->20|47->20|48->21|48->21|48->21|55->28|55->28|56->29|59->32|59->32|60->33|65->38|65->38|75->48|75->48|76->49|77->50|77->50|78->51|78->51|78->51|79->52|80->53|80->53|81->54|81->54|82->55|82->55|84->57|87->60|87->60|88->61|88->61|88->61|89->62|91->64|91->64|92->65|92->65|93->66|96->69|96->69|97->70|97->70|97->70|98->71|99->72|99->72|100->73|100->73|101->74|104->77|104->77|105->78|107->80|107->80|107->80|107->80|108->81|108->81|108->81|109->82|109->82|109->82|111->84|111->84|112->85|112->85|113->86|115->1|116->87|116->87|116->87|116->87|116->87|116->87|116->87
                  -- GENERATED --
              */
          