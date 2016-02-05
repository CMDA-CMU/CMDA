
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, moreScripts: Html = Html(""))(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.62*/(""" 

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
<head>

<title>"""),_display_(/*8.9*/title),format.raw/*8.14*/("""</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet"
	href='"""),_display_(/*14.9*/routes/*14.15*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*14.54*/("""'>
<link rel="stylesheet"
	href='"""),_display_(/*16.9*/routes/*16.15*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*16.58*/("""'>	
<link rel="stylesheet"
	href='"""),_display_(/*18.9*/routes/*18.15*/.Assets.at("stylesheets/navbar-fixed-top.css")),format.raw/*18.61*/("""'>
<link rel="stylesheet"
	href='"""),_display_(/*20.9*/routes/*20.15*/.Assets.at("stylesheets/custom.css")),format.raw/*20.51*/("""'>
<link rel="stylesheet" media="screen"
	href='"""),_display_(/*22.9*/routes/*22.15*/.Assets.at("stylesheets/main.css")),format.raw/*22.49*/("""'>
<link rel="shortcut icon" type="image/png"
	href='"""),_display_(/*24.9*/routes/*24.15*/.Assets.at("images/favicon.png")),format.raw/*24.47*/("""'>
<link rel="stylesheet"
	href='"""),_display_(/*26.9*/routes/*26.15*/.Assets.at("stylesheets/bootstrap-editable.css")),format.raw/*26.63*/("""'>
<link href='"""),_display_(/*27.14*/routes/*27.20*/.Assets.at("stylesheets/jquery.tablesorter.pager.css")),format.raw/*27.74*/("""'
	rel="stylesheet" />
<link href='"""),_display_(/*29.14*/routes/*29.20*/.Assets.at("stylesheets/style.css")),format.raw/*29.55*/("""'
	rel="stylesheet" />
<link rel="stylesheet"
	href='"""),_display_(/*32.9*/routes/*32.15*/.Assets.at("stylesheets/livefitler.css")),format.raw/*32.55*/("""'>
<link rel="stylesheet"
    href='"""),_display_(/*34.12*/routes/*34.18*/.Assets.at("stylesheets/custom_recommend.css")),format.raw/*34.64*/("""'>
<link rel="stylesheet" 
	href="http://code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css">


<script type="text/javascript" src='"""),_display_(/*39.38*/routes/*39.44*/.Assets.at("javascripts/jquery-1.11.3.min.js")),format.raw/*39.90*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*40.38*/routes/*40.44*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*40.86*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*41.38*/routes/*41.44*/.Assets.at("javascripts/parameter.js")),format.raw/*41.82*/("""'></script>
<script type='text/javascript' src='"""),_display_(/*42.38*/routes/*42.44*/.Assets.at("javascripts/lastLoader.js")),format.raw/*42.83*/("""'></script>
<script type='text/javascript' src='"""),_display_(/*43.38*/routes/*43.44*/.Assets.at("javascripts/jquery.metadata.js")),format.raw/*43.88*/("""'></script>
<script type='text/javascript' src='"""),_display_(/*44.38*/routes/*44.44*/.Assets.at("javascripts/jquery.tablesorter.js")),format.raw/*44.91*/("""'></script>
<script type='text/javascript' src='"""),_display_(/*45.38*/routes/*45.44*/.Assets.at("javascripts/bootstrap-editable.min.js")),format.raw/*45.95*/("""'></script>

<!--  
<script type="text/javascript" src='"""),_display_(/*48.38*/routes/*48.44*/.Assets.at("javascripts/edit_button.js")),format.raw/*48.84*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*49.38*/routes/*49.44*/.Assets.at("javascripts/livefitler.js")),format.raw/*49.83*/("""'></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.2.js"></script>
-->
<script type="text/javascript" src="http://code.jquery.com/ui/1.11.3/jquery-ui.js"></script>

"""),_display_(/*54.2*/moreScripts),format.raw/*54.13*/("""

"""),format.raw/*56.1*/("""</head>

<body>
	
	"""),_display_(/*60.3*/header()),format.raw/*60.11*/("""

	"""),format.raw/*62.2*/("""<div class="container">

		"""),_display_(/*64.4*/content),format.raw/*64.11*/("""

	"""),format.raw/*66.2*/("""</div>
	
	"""),_display_(/*68.3*/footer()),format.raw/*68.11*/("""

"""),format.raw/*70.1*/("""</body>
</html>


"""))}
  }

  def render(title:String,moreScripts:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,moreScripts)(content)

  def f:((String,Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,moreScripts) => (content) => apply(title,moreScripts)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Dec 10 17:28:47 PST 2015
                  SOURCE: /Users/weiwang/climate-service/app/views/main.scala.html
                  HASH: ebd67c06e0104ef3b00a9b14cae1374a0980064f
                  MATRIX: 732->1|880->61|909->64|974->104|999->109|1214->298|1229->304|1289->343|1349->377|1364->383|1428->426|1489->461|1504->467|1571->513|1631->547|1646->553|1703->589|1778->638|1793->644|1848->678|1928->732|1943->738|1996->770|2056->804|2071->810|2140->858|2183->874|2198->880|2273->934|2336->970|2351->976|2407->1011|2487->1065|2502->1071|2563->1111|2627->1148|2642->1154|2709->1200|2876->1340|2891->1346|2958->1392|3034->1441|3049->1447|3112->1489|3188->1538|3203->1544|3262->1582|3338->1631|3353->1637|3413->1676|3489->1725|3504->1731|3569->1775|3645->1824|3660->1830|3728->1877|3804->1926|3819->1932|3891->1983|3975->2040|3990->2046|4051->2086|4127->2135|4142->2141|4202->2180|4426->2378|4458->2389|4487->2391|4533->2411|4562->2419|4592->2422|4646->2450|4674->2457|4704->2460|4741->2471|4770->2479|4799->2481
                  LINES: 26->1|29->1|31->3|36->8|36->8|42->14|42->14|42->14|44->16|44->16|44->16|46->18|46->18|46->18|48->20|48->20|48->20|50->22|50->22|50->22|52->24|52->24|52->24|54->26|54->26|54->26|55->27|55->27|55->27|57->29|57->29|57->29|60->32|60->32|60->32|62->34|62->34|62->34|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45|76->48|76->48|76->48|77->49|77->49|77->49|82->54|82->54|84->56|88->60|88->60|90->62|92->64|92->64|94->66|96->68|96->68|98->70
                  -- GENERATED --
              */
          