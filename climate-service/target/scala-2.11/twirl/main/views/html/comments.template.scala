
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
object comments extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
def /*20.2*/scripts/*20.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*20.13*/("""
	"""),format.raw/*21.2*/("""<script src="//code.jquery.com/jquery-migrate-1.1.1.min.js"></script>
	<script src="//code.jquery.com/ui/1.9.2/jquery-ui.min.js"></script>
	<script src='"""),_display_(/*23.16*/routes/*23.22*/.Assets.at("javascripts/jquery.timeago.js")),format.raw/*23.65*/("""'></script>
	<script src='"""),_display_(/*24.16*/routes/*24.22*/.Assets.at("javascripts/jquery.autogrow-textarea.js")),format.raw/*24.75*/("""'></script>
	<script src='"""),_display_(/*25.16*/routes/*25.22*/.Assets.at("javascripts/jquery.comment.js")),format.raw/*25.65*/("""'></script>
	<script src='"""),_display_(/*26.16*/routes/*26.22*/.Assets.at("javascripts/edit_button.js")),format.raw/*26.62*/("""'></script>

	<link rel="stylesheet" href='"""),_display_(/*28.32*/routes/*28.38*/.Assets.at("stylesheets/jquery.comment.css")),format.raw/*28.82*/("""'>
	<link rel="stylesheet" href="//code.jquery.com/ui/1.9.1/themes/base/jquery-ui.css">
	<script type="text/javascript">

    $(document).ready(function()"""),format.raw/*32.33*/("""{"""),format.raw/*32.34*/("""
	"""),format.raw/*33.2*/("""var commentHTML= function (comment) """),format.raw/*33.38*/("""{"""),format.raw/*33.39*/("""
	    """),format.raw/*34.6*/("""return '<li>' +
		'<div class="avatar pull-left"><img src="/assets/images/user_blank_picture.png" border="0" class="ui-corner-all"></div>' +
		'<div class="posted-comment-container pull-left">' +
		'<div class="posted-comment-head">' +
		'<span class="posted-comment-author">' + comment.fullname + 
		'</span><span class="dot">•</span><span>' + comment.posted_date +
		'</span></div><div class="posted-comment-body">' +
		'<div class="posted-comment-txt">' + comment.text +
		'</div></div></div>' + '<div class="clear"></div>' +
		'</li><li></li>';
	"""),format.raw/*44.2*/("""}"""),format.raw/*44.3*/(""";
	$.ajaxPrefilter(function(options, originalOptions, jqXHR)"""),format.raw/*45.59*/("""{"""),format.raw/*45.60*/("""
	    """),format.raw/*46.6*/("""options.async = true;
	"""),format.raw/*47.2*/("""}"""),format.raw/*47.3*/(""");

	$.getJSON('/getMentions',function(data) """),format.raw/*49.42*/("""{"""),format.raw/*49.43*/("""
	    """),format.raw/*50.6*/("""$("#commentNum").text(data.results.total_comment + " Mention(s)");
	    $("#comments-container").empty();

	    data.results.comments.forEach(function(comment)"""),format.raw/*53.53*/("""{"""),format.raw/*53.54*/("""
		"""),format.raw/*54.3*/("""$('#comment-list').append(commentHTML(comment));
	    """),format.raw/*55.6*/("""}"""),format.raw/*55.7*/(""");
	"""),format.raw/*56.2*/("""}"""),format.raw/*56.3*/(""");
    """),format.raw/*57.5*/("""}"""),format.raw/*57.6*/(""");
    </script>
""")))};
Seq[Any](format.raw/*59.2*/("""

"""),_display_(/*61.2*/main("Comment", scripts)/*61.26*/ {_display_(Seq[Any](format.raw/*61.28*/("""

	"""),format.raw/*63.2*/("""<h1 id="commentNum"></h1>
	
    	<div class="comment-container" style="display:block;">
	<div class="comments-display">
	
	<ul class="posted-comments" id="comment-list">
	</ul>
	</div>
	</div>
""")))}),format.raw/*72.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Dec 10 17:28:46 PST 2015
                  SOURCE: /Users/weiwang/climate-service/app/views/comments.scala.html
                  HASH: 809d1ec18f2b5d189efadf4473ca7bbc1ff593aa
                  MATRIX: 801->1267|816->1274|897->1278|926->1280|1107->1434|1122->1440|1186->1483|1240->1510|1255->1516|1329->1569|1383->1596|1398->1602|1462->1645|1516->1672|1531->1678|1592->1718|1663->1762|1678->1768|1743->1812|1925->1966|1954->1967|1983->1969|2047->2005|2076->2006|2109->2012|2686->2562|2714->2563|2802->2623|2831->2624|2864->2630|2914->2653|2942->2654|3015->2699|3044->2700|3077->2706|3264->2865|3293->2866|3323->2869|3404->2923|3432->2924|3463->2928|3491->2929|3525->2936|3553->2937|3610->2955|3639->2958|3672->2982|3712->2984|3742->2987|3966->3181
                  LINES: 28->20|28->20|30->20|31->21|33->23|33->23|33->23|34->24|34->24|34->24|35->25|35->25|35->25|36->26|36->26|36->26|38->28|38->28|38->28|42->32|42->32|43->33|43->33|43->33|44->34|54->44|54->44|55->45|55->45|56->46|57->47|57->47|59->49|59->49|60->50|63->53|63->53|64->54|65->55|65->55|66->56|66->56|67->57|67->57|70->59|72->61|72->61|72->61|74->63|83->72
                  -- GENERATED --
              */
          