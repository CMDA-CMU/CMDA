
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
object recommendationSummary extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[List[ClimateService],List[Dataset],List[User],List[String],List[String],List[String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(climateServices: List[ClimateService], dataSets: List[Dataset], users:
List[User], userBasedDataset: List[String], featureBasedDataset :
List[String], itemBasedDataset : List[String], currentUser: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
def /*6.2*/scripts/*6.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.13*/("""
	"""),format.raw/*7.2*/("""<script type="text/javascript">
		$(document).ready(function() """),format.raw/*8.32*/("""{"""),format.raw/*8.33*/("""
			"""),format.raw/*9.4*/("""$('#myTabs a').click(function(e) """),format.raw/*9.37*/("""{"""),format.raw/*9.38*/("""
				"""),format.raw/*10.5*/("""e.preventDefault()
				$(this).tab('show')
			"""),format.raw/*12.4*/("""}"""),format.raw/*12.5*/(""")
		"""),format.raw/*13.3*/("""}"""),format.raw/*13.4*/(""");
		
		
		
		function sendUserId() """),format.raw/*17.25*/("""{"""),format.raw/*17.26*/("""
			"""),format.raw/*18.4*/("""var userIdSent = $("#UserIdForRecommend").val();
			window.location = "/climateService/recommendationSummary/" + userIdSent;
		"""),format.raw/*20.3*/("""}"""),format.raw/*20.4*/("""
	"""),format.raw/*21.2*/("""</script>
""")))};
Seq[Any](format.raw/*3.68*/("""

"""),format.raw/*22.2*/(""" 

"""),_display_(/*24.2*/main("Climate Services", scripts)/*24.35*/ {_display_(Seq[Any](format.raw/*24.37*/("""

"""),format.raw/*26.1*/("""<h1>Recommendation</h1>

<div>
	<!-- Nav tabs -->
	<ul class="nav nav-tabs" role="tablist">
		<li role="presentation"><a href="#mostPopService" aria-controls="home" role="tab" data-toggle="tab">Most Popular Service</a></li>
		<li role="presentation"><a href="#mostPopDataset" aria-controls="profile" role="tab" data-toggle="tab">Most Popular Dataset</a></li>
		<li role="presentation"><a href="#mostActUsers" aria-controls="messages" role="tab" data-toggle="tab">Most Active User</a></li>
		<li role="presentation" class="active"><a href="#settings"	aria-controls="settings" role="tab" data-toggle="tab">ML Based Recommendation</a></li>
	</ul>
	<!-- Tab panes -->
	<div class="tab-content">
		<div role="tabpanel" class="tab-pane " id="mostPopService">
			<br>
			<table class="table table-striped table-bordered table-condensed tablesorter" id = "mostPopServiceTable">
				<thead>
					<tr>
						<th class="col-md-3 ">Climate Service Name</th>
						<th class="col-md-2">Purpose</th>
						<th class="col-md-4">Url</th>
						<th class="col-md-2">Scenario</th>
						<th class="col-md-2">Version</th>
						<th class="col-md-2">Root_Service</th>
					</tr>
				</thead>
				<tbody>
					"""),_display_(/*52.7*/for(climateService <- climateServices) yield /*52.45*/{_display_(Seq[Any](format.raw/*52.46*/("""
					"""),format.raw/*53.6*/("""<tr>
						<td><a href=""""),_display_(/*54.21*/climateService/*54.35*/.getUrl()),format.raw/*54.44*/("""">"""),_display_(/*54.47*/climateService/*54.61*/.getName()),format.raw/*54.71*/("""</a></td>
						<td>"""),_display_(/*55.12*/climateService/*55.26*/.getPurpose()),format.raw/*55.39*/("""</td>
						<td><a href=""""),_display_(/*56.21*/climateService/*56.35*/.getUrl()),format.raw/*56.44*/("""">"""),_display_(/*56.47*/climateService/*56.61*/.getUrl()),format.raw/*56.70*/("""</a></td>
						<td>"""),_display_(/*57.12*/climateService/*57.26*/.getScenario()),format.raw/*57.40*/("""</td>
						<td>"""),_display_(/*58.12*/climateService/*58.26*/.getVersionNo()),format.raw/*58.41*/("""</td>
						<td>"""),_display_(/*59.12*/climateService/*59.26*/.getRootServiceId()),format.raw/*59.45*/("""</td>
					</tr>
					""")))}),format.raw/*61.7*/("""
				"""),format.raw/*62.5*/("""</tbody>
			</table>
		</div>

		<div role="tabpanel" class="tab-pane" id="mostPopDataset">
			<br>
			<table class="table table-striped table-bordered table-condensed tablesorter" id = "mostPopDatasetTable">
				<thead>
					<tr>
						<th style="vertical-align: top;" class="col-md-2">Dataset Name</th>
						<th style="vertical-align: top;" class="col-md-1">Agency</th>
						<th style="vertical-align: top;" class="col-md-1">Instrument/Model Experiment</th>
						<th style="vertical-align: top;" class="col-md-2">Physical variable</th>
						<th style="vertical-align: top;" class="col-md-1">Variable short name</th>
						<th style="vertical-align: top;" class="col-md-1">Units</th>
						<th style="vertical-align: top;" class="col-md-1">Grid	Dimension</th>
						<th style="vertical-align: top;" class="col-md-2">Variable Name in Web Interface</th>
						<th style="vertical-align: top;" class="col-md-1">Data Source 	Input Parameter</th>
						<th style="vertical-align: top;" class="col-md-1">Dataset Start Time</th>
						<th style="vertical-align: top;" class="col-md-1">Dataset End Time</th>
						<th style="vertical-align: top;" class="col-md-1">Duration</th>
					</tr>
				</thead>
				<tbody>
					"""),_display_(/*86.7*/for(dataSet <- dataSets) yield /*86.31*/{_display_(Seq[Any](format.raw/*86.32*/("""
					"""),format.raw/*87.6*/("""<tr>
						<td><font size="2">"""),_display_(/*88.27*/dataSet/*88.34*/.getName()),format.raw/*88.44*/("""</font></td>
						<td><font size="2">"""),_display_(/*89.27*/dataSet/*89.34*/.getAgencyId()),format.raw/*89.48*/("""</font></td>
						<td><font size="2">"""),_display_(/*90.27*/dataSet/*90.34*/.getInstrument()),format.raw/*90.50*/("""</font></td>
						<td><font size="2">"""),_display_(/*91.27*/dataSet/*91.34*/.getPhysicalVariable()),format.raw/*91.56*/("""</font></td>
						<td><font size="2">"""),_display_(/*92.27*/dataSet/*92.34*/.getCMIP5VarName()),format.raw/*92.52*/("""</font></td>
						<td><font size="2">"""),_display_(/*93.27*/dataSet/*93.34*/.getUnits()),format.raw/*93.45*/("""</font></td>
						<td><font size="2">"""),_display_(/*94.27*/dataSet/*94.34*/.getGridDimension()),format.raw/*94.53*/("""</font></td>
						<td><font size="2">"""),_display_(/*95.27*/dataSet/*95.34*/.getVariableNameInWebInterface()),format.raw/*95.66*/("""</font></td>
						<td><font size="2">"""),_display_(/*96.27*/dataSet/*96.34*/.getDataSourceInputParameterToCallScienceApplicationCode()),format.raw/*96.92*/("""</font></td>
						<td><font size="2">"""),_display_(/*97.27*/dataSet/*97.34*/.getStartTime()),format.raw/*97.49*/("""</font></td>
						<td><font size="2">"""),_display_(/*98.27*/dataSet/*98.34*/.getEndTime()),format.raw/*98.47*/("""</font></td>
						<td><font size="2">"""),_display_(/*99.27*/dataSet/*99.34*/.getDuration()),format.raw/*99.48*/("""</font></td>
					</tr>
					""")))}),format.raw/*101.7*/("""
				"""),format.raw/*102.5*/("""</tbody>
			</table>
		</div>
		<div role="tabpanel" class="tab-pane" id="mostActUsers">
			<br>
			<table class="table table-striped table-bordered table-condensed tablesorter" id="mostActUsersTable">
				<thead>
					<tr>
						<th class="col-md-1">Id</th>
						<th class="col-md-1">User Name</th>
						<th class="col-md-1">First Name</th>
						<th class="col-md-2">Middle Name</th>
						<th class="col-md-1">Last Name</th>
						<th class="col-md-1">Afflication</th>
						<th class="col-md-2">Email</th>
						<th class="col-md-2">Research Area</th>
					</tr>
				</thead>
				<tbody>
				"""),_display_(/*121.6*/for(user <- users) yield /*121.24*/{_display_(Seq[Any](format.raw/*121.25*/("""
				"""),format.raw/*122.5*/("""<tr>
					<td>"""),_display_(/*123.11*/user/*123.15*/.getId()),format.raw/*123.23*/("""</td>
					<td><span class=""""),_display_(/*124.24*/user/*124.28*/.getId()),format.raw/*124.36*/(""" """),format.raw/*124.37*/("""editable" data-name='username'>"""),_display_(/*124.69*/user/*124.73*/.getUserName()),format.raw/*124.87*/("""</span></td>
					<td><span class=""""),_display_(/*125.24*/user/*125.28*/.getId()),format.raw/*125.36*/(""" """),format.raw/*125.37*/("""editable" data-name='firstName'>"""),_display_(/*125.70*/user/*125.74*/.getFirstName()),format.raw/*125.89*/("""</span></td>
					<td><span class=""""),_display_(/*126.24*/user/*126.28*/.getId()),format.raw/*126.36*/(""" """),format.raw/*126.37*/("""editable" data-name='middleInitial'>"""),_display_(/*126.74*/user/*126.78*/.getMiddleInitial()),format.raw/*126.97*/("""</span></td>
					<td><span class=""""),_display_(/*127.24*/user/*127.28*/.getId()),format.raw/*127.36*/(""" """),format.raw/*127.37*/("""editable" data-name='lastName'>"""),_display_(/*127.69*/user/*127.73*/.getLastName()),format.raw/*127.87*/("""</span></td>
					<td><span class=""""),_display_(/*128.24*/user/*128.28*/.getId()),format.raw/*128.36*/(""" """),format.raw/*128.37*/("""editable" data-name='affiliation'>"""),_display_(/*128.72*/user/*128.76*/.getAffiliation()),format.raw/*128.93*/("""</span></td>
					<td><span class=""""),_display_(/*129.24*/user/*129.28*/.getId()),format.raw/*129.36*/(""" """),format.raw/*129.37*/("""editable" data-name='email'>"""),_display_(/*129.66*/user/*129.70*/.getEmail()),format.raw/*129.81*/("""</span></td>
					<td><span class=""""),_display_(/*130.24*/user/*130.28*/.getId()),format.raw/*130.36*/(""" """),format.raw/*130.37*/("""editable" data-name='researchFields'>"""),_display_(/*130.75*/user/*130.79*/.getResearchFields()),format.raw/*130.99*/("""</span></td>
				</tr>
				""")))}),format.raw/*132.6*/("""
				"""),format.raw/*133.5*/("""</tbody>
			</table>
		</div>

		<div role="tabpanel" class="tab-pane active " id="settings">
			<br>
			<form class="form-inline" role="form">
				<div class="form-group">
					<label>User Id:</label> <select class="form-control"
						id="UserIdForRecommend">
						<option value="ochimborazo">ochimborazo</option>
						<option value="fcannon">fcannon</option>
						<option value="kwillmot">kwillmot</option>
						<option value="nkille">nkille</option>
						<option value="jnanteza">jnanteza</option>
						<option value="ksauter">ksauter</option>
						<option value="jgristey">jgristey</option>
						<option value="caquilinger">caquilinger</option>
						<option value="fpolverari">fpolverari</option>
						<option value="kneff">kneff</option>
						<option value="emaroon">emaroon</option>
						<option value="rbuchholz">rbuchholz</option>
						<option value="abeatriz">abeatriz</option>
						<option value="htseng">htseng</option>
						<option value="mlinz">mlinz</option>
						<option value="kzhang">kzhang</option>
						<option value="jbrodie">jbrodie</option>
						<option value="dzermenodia">dzermenodia</option>
						<option value="cmartinezvi">cmartinezvi</option>
						<option value="mclavner">mclavner</option>
						<option value="hwei">hwei</option>
						<option value="gmarques">gmarques</option>
						<option value="mroge">mroge</option>
					</select>
				</div>
				<button type="button" class="btn btn-info" onclick="sendUserId()">Recommend</button>
			</form>

			<br>

			<h4>Current User: """),_display_(/*173.23*/currentUser),format.raw/*173.34*/("""</h4>
			<div class="row well col-lg-10">
				<div class="col-lg-offset-0 col-lg-6">
					<div class="panel panel-success">
						<!-- Default panel contents -->
						<div class="panel-heading">Recommended based on dataset
							similarity and the user's past behavior</div>
						<div class="panel-body">
							<p>The supporting algorithms are Latent Dirichlet Allocation
								(LDA) and Collaborative Filtering (CF), which take into account
								of semetic meaning of dataset as well as the user's past dataset
								usage history.</p>
						</div>

						<!-- Table -->
						<table class="table">
							<thead>
								<tr>
									<th>Dataset Name</th>
									<th>...</th>
									<th>...</th>
								</tr>
							</thead>
							<tbody>
								"""),_display_(/*197.10*/for(String <- featureBasedDataset) yield /*197.44*/{_display_(Seq[Any](format.raw/*197.45*/("""
								"""),format.raw/*198.9*/("""<tr>
									<td>"""),_display_(/*199.15*/String/*199.21*/.substring(1, String.length-1)),format.raw/*199.51*/("""</td>
									<td>...</td>
									<td>...</td>
								</tr>
								""")))}),format.raw/*203.10*/("""

							"""),format.raw/*205.8*/("""</tbody>
						</table>
					</div>
				</div>

				<div class=" col-lg-6">
					<div class="panel panel-danger ">
						<!-- Default panel contents -->
						<div class="panel-heading">Recommended based on peer scientists' dataset usage behavior</div>
						<div class="panel-body">
							<p>The supporting algorithm is User-based Collaborative
								Filtering, which takes into account the dataset usage
								preferences from other scientists with similar profiles and
								background.</p>
						</div>

						<!-- Table -->
						<table class="table">
							<thead>
								<tr>
									<th>Dataset Name</th>
									<th>...</th>
									<th>...</th>
								</tr>
							</thead>
							<tbody>
								"""),_display_(/*231.10*/for(String <- userBasedDataset) yield /*231.41*/{_display_(Seq[Any](format.raw/*231.42*/("""
								"""),format.raw/*232.9*/("""<tr>
									<td>"""),_display_(/*233.15*/String/*233.21*/.substring(1, String.length-1)),format.raw/*233.51*/("""</td>
									<td>...</td>
									<td>...</td>
								</tr>
								""")))}),format.raw/*237.10*/("""
							"""),format.raw/*238.8*/("""</tbody>
						</table>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="well col-lg-offset-0 col-lg-5">
					<div class="panel panel-info">
						<!-- Default panel contents -->
						<div class="panel-heading">Recommended based on past dataset
							usage history</div>
						<div class="panel-body">
							<p>The supporting algorithm is Item-based Collaborative
								Filtering, which takes into account the dataset usage
								preferences from the user.</p>
						</div>

						<!-- Table -->
						<table class="table">
							<thead>
								<tr>
									<th>Dataset Name</th>
									<th>...</th>
									<th>...</th>
								</tr>
							</thead>
							<tbody>
								"""),_display_(/*266.10*/for(String <- itemBasedDataset) yield /*266.41*/{_display_(Seq[Any](format.raw/*266.42*/("""
								"""),format.raw/*267.9*/("""<tr>
									<td>"""),_display_(/*268.15*/String/*268.21*/.substring(1, String.length-1)),format.raw/*268.51*/("""</td>
									<td>...</td>
									<td>...</td>
								</tr>
								""")))}),format.raw/*272.10*/("""
							"""),format.raw/*273.8*/("""</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>

	</div>
</div>
</div>





""")))}),format.raw/*288.2*/("""
"""))}
  }

  def render(climateServices:List[ClimateService],dataSets:List[Dataset],users:List[User],userBasedDataset:List[String],featureBasedDataset:List[String],itemBasedDataset:List[String],currentUser:String): play.twirl.api.HtmlFormat.Appendable = apply(climateServices,dataSets,users,userBasedDataset,featureBasedDataset,itemBasedDataset,currentUser)

  def f:((List[ClimateService],List[Dataset],List[User],List[String],List[String],List[String],String) => play.twirl.api.HtmlFormat.Appendable) = (climateServices,dataSets,users,userBasedDataset,featureBasedDataset,itemBasedDataset,currentUser) => apply(climateServices,dataSets,users,userBasedDataset,featureBasedDataset,itemBasedDataset,currentUser)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Dec 10 17:28:47 PST 2015
                  SOURCE: /Users/weiwang/climate-service/app/views/recommendationSummary.scala.html
                  HASH: 6e31302d2f356f00d7ad95dee46763db0612f3f5
                  MATRIX: 824->1|1115->227|1129->234|1209->238|1237->240|1327->303|1355->304|1385->308|1445->341|1473->342|1505->347|1578->393|1606->394|1637->398|1665->399|1729->435|1758->436|1789->440|1943->567|1971->568|2000->570|2050->206|2079->581|2109->585|2151->618|2191->620|2220->622|3436->1812|3490->1850|3529->1851|3562->1857|3614->1882|3637->1896|3667->1905|3697->1908|3720->1922|3751->1932|3799->1953|3822->1967|3856->1980|3909->2006|3932->2020|3962->2029|3992->2032|4015->2046|4045->2055|4093->2076|4116->2090|4151->2104|4195->2121|4218->2135|4254->2150|4298->2167|4321->2181|4361->2200|4414->2223|4446->2228|5689->3445|5729->3469|5768->3470|5801->3476|5859->3507|5875->3514|5906->3524|5972->3563|5988->3570|6023->3584|6089->3623|6105->3630|6142->3646|6208->3685|6224->3692|6267->3714|6333->3753|6349->3760|6388->3778|6454->3817|6470->3824|6502->3835|6568->3874|6584->3881|6624->3900|6690->3939|6706->3946|6759->3978|6825->4017|6841->4024|6920->4082|6986->4121|7002->4128|7038->4143|7104->4182|7120->4189|7154->4202|7220->4241|7236->4248|7271->4262|7332->4292|7365->4297|7991->4896|8026->4914|8066->4915|8099->4920|8142->4935|8156->4939|8186->4947|8243->4976|8257->4980|8287->4988|8317->4989|8377->5021|8391->5025|8427->5039|8491->5075|8505->5079|8535->5087|8565->5088|8626->5121|8640->5125|8677->5140|8741->5176|8755->5180|8785->5188|8815->5189|8880->5226|8894->5230|8935->5249|8999->5285|9013->5289|9043->5297|9073->5298|9133->5330|9147->5334|9183->5348|9247->5384|9261->5388|9291->5396|9321->5397|9384->5432|9398->5436|9437->5453|9501->5489|9515->5493|9545->5501|9575->5502|9632->5531|9646->5535|9679->5546|9743->5582|9757->5586|9787->5594|9817->5595|9883->5633|9897->5637|9939->5657|9998->5685|10031->5690|11590->7221|11623->7232|12419->8000|12470->8034|12510->8035|12547->8044|12594->8063|12610->8069|12662->8099|12767->8172|12804->8181|13553->8902|13601->8933|13641->8934|13678->8943|13725->8962|13741->8968|13793->8998|13898->9071|13934->9079|14672->9789|14720->9820|14760->9821|14797->9830|14844->9849|14860->9855|14912->9885|15017->9958|15053->9966|15179->10061
                  LINES: 26->1|30->6|30->6|32->6|33->7|34->8|34->8|35->9|35->9|35->9|36->10|38->12|38->12|39->13|39->13|43->17|43->17|44->18|46->20|46->20|47->21|49->3|51->22|53->24|53->24|53->24|55->26|81->52|81->52|81->52|82->53|83->54|83->54|83->54|83->54|83->54|83->54|84->55|84->55|84->55|85->56|85->56|85->56|85->56|85->56|85->56|86->57|86->57|86->57|87->58|87->58|87->58|88->59|88->59|88->59|90->61|91->62|115->86|115->86|115->86|116->87|117->88|117->88|117->88|118->89|118->89|118->89|119->90|119->90|119->90|120->91|120->91|120->91|121->92|121->92|121->92|122->93|122->93|122->93|123->94|123->94|123->94|124->95|124->95|124->95|125->96|125->96|125->96|126->97|126->97|126->97|127->98|127->98|127->98|128->99|128->99|128->99|130->101|131->102|150->121|150->121|150->121|151->122|152->123|152->123|152->123|153->124|153->124|153->124|153->124|153->124|153->124|153->124|154->125|154->125|154->125|154->125|154->125|154->125|154->125|155->126|155->126|155->126|155->126|155->126|155->126|155->126|156->127|156->127|156->127|156->127|156->127|156->127|156->127|157->128|157->128|157->128|157->128|157->128|157->128|157->128|158->129|158->129|158->129|158->129|158->129|158->129|158->129|159->130|159->130|159->130|159->130|159->130|159->130|159->130|161->132|162->133|202->173|202->173|226->197|226->197|226->197|227->198|228->199|228->199|228->199|232->203|234->205|260->231|260->231|260->231|261->232|262->233|262->233|262->233|266->237|267->238|295->266|295->266|295->266|296->267|297->268|297->268|297->268|301->272|302->273|317->288
                  -- GENERATED --
              */
          