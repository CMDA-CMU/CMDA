
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
object searchCommentByHashTag extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
def /*21.2*/scripts/*21.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*21.13*/("""
    """),format.raw/*22.5*/("""<script src='"""),_display_(/*22.19*/routes/*22.25*/.Assets.at("javascripts/edit_button.js")),format.raw/*22.65*/("""'></script>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css">
    <script src="//code.jquery.com/jquery-1.10.2.js"></script>
    <script src="//code.jquery.com/ui/1.11.3/jquery-ui.js"></script>
    <script src='"""),_display_(/*26.19*/routes/*26.25*/.Assets.at("javascripts/searchCommentByHashTag.js")),format.raw/*26.76*/("""'></script>
    <link rel="stylesheet" href='"""),_display_(/*27.35*/routes/*27.41*/.Assets.at("stylesheets/searchCommentByHashTag.css")),format.raw/*27.93*/("""'>
""")))};
Seq[Any](format.raw/*28.2*/("""

"""),_display_(/*30.2*/main("Search Comment by Hash Tag", scripts)/*30.45*/{_display_(Seq[Any](format.raw/*30.46*/("""
    """),format.raw/*31.5*/("""<h1 style="text-align: center">Search Comment by Hash Tag</h1>
    <div class="ui-widget col-sm-offset-3 col-sm-6">
        <div class="form-group">
	  <dl class=" " id="keywords_field">
	    <dt><label for="InputHashTag">Hashtag</label></dt>
	    <dd>
	      <input type="text" class="form-control" id="inputHashTag" name="InputHashTag" placeholder="@2-d-variable-map" size="70">
	    </dd>
	  </dl>
        </div>
	<div align="center">
        <button type="submit" class="btn btn-default" id="submitBtn">Submit</button>
	</div>

        <div id="comments-container" class="form-group">
        </div>
    </div>

""")))}),format.raw/*49.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Dec 10 17:28:47 PST 2015
                  SOURCE: /Users/weiwang/climate-service/app/views/searchCommentByHashTag.scala.html
                  HASH: ef4fcd9c9ba1317fa6d7816bcc708239f3e2ba5f
                  MATRIX: 815->1208|830->1215|911->1219|943->1224|984->1238|999->1244|1060->1284|1344->1541|1359->1547|1431->1598|1504->1644|1519->1650|1592->1702|1635->1706|1664->1709|1716->1752|1755->1753|1787->1758|2434->2376
                  LINES: 28->21|28->21|30->21|31->22|31->22|31->22|31->22|35->26|35->26|35->26|36->27|36->27|36->27|38->28|40->30|40->30|40->30|41->31|59->49
                  -- GENERATED --
              */
          