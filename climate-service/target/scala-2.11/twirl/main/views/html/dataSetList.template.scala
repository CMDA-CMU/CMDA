
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
object dataSetList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[Dataset],play.data.Form[Dataset],List[Dataset],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(dataSets: List[Dataset], dataSetForm: play.data.Form[Dataset], datasetsTopK: List[Dataset]):play.twirl.api.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*1.94*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*13.2*/("""

"""),_display_(/*15.2*/main("Dataset List", scripts)/*15.31*/ {_display_(Seq[Any](format.raw/*15.33*/(""" 
	 
    """),format.raw/*17.5*/("""<h1>Climate Datasets</h1>
    <h2>"""),_display_(/*18.10*/dataSets/*18.18*/.size()),format.raw/*18.25*/(""" """),format.raw/*18.26*/("""Datasets Found</h2>
    
<!-- 
		<div style="overflow-y:scroll">
		<table class="table table-striped table-bordered table-condensed tablesorter" id ="myTable">
		<thead>
	<tr >
		<th style = "vertical-align: top;" class="col-md-1 header">Id</th>
		<th style = "vertical-align: top;" class="col-md-2">Dataset Name</th>
		<th style = "vertical-align: top;" class="col-md-1">Agency</th>
		<th style = "vertical-align: top;" class="col-md-1">Instrument</th>
		<th style = "vertical-align: top;" class="col-md-2">Physical variable</th>
		<th style = "vertical-align: top;" class="col-md-1">Variable short name</th>
		<th style = "vertical-align: top;" class="col-md-1">Units</th>
		<th style = "vertical-align: top;" class="col-md-1">Grid Dimension</th>
		
		<th style = "vertical-align: top;" class="col-md-2">Variable Name in Web Interface</th>
		<th style = "vertical-align: top;" class="col-md-1">Data Source Input Parameter</th>
		
		<th style = "vertical-align: top;" class="col-md-1">Dataset Start Time</th>
		<th style = "vertical-align: top;"class="col-md-1">Dataset End Time</th>

	</tr>
	</thead>
	<tbody>
-->


<section id="courses">
    <div id="carousel1" class="carousel slide" data-ride="carousel" > 
        <!-- Indicators -->         

        <ol class="carousel-indicators"> 
        """),_display_(/*51.10*/for(dataSet <- datasetsTopK) yield /*51.38*/ {_display_(Seq[Any](format.raw/*51.40*/("""
	        """),_display_(/*52.11*/if(n == 0)/*52.21*/ {_display_(Seq[Any](format.raw/*52.23*/("""
	        	"""),format.raw/*53.11*/("""<li data-target="#carousel1" data-slide-to=""""),_display_(/*53.56*/n),format.raw/*53.57*/("""" class="active"></li>	        	
	        """)))}/*54.11*/else/*54.15*/{_display_(Seq[Any](format.raw/*54.16*/("""
	        	"""),format.raw/*55.11*/("""<li data-target="#carousel1" data-slide-to=""""),_display_(/*55.56*/n),format.raw/*55.57*/(""""></li>  	        	
	        """)))}),format.raw/*56.11*/("""
	        """),_display_(/*57.11*/{n = n + 1}),format.raw/*57.22*/("""
        """)))}),format.raw/*58.10*/("""    
        """),format.raw/*59.9*/("""</ol>         

        <!-- Wrapper for slides -->         

        <div class="carousel-inner" style="background: url('"""),_display_(/*63.62*/routes/*63.68*/.Assets.at("images/newData.jpg")),format.raw/*63.100*/("""') no-repeat left center; background-size: cover; -webkit-filter: blur(0px);  -moz-filter: blur(2px);  -o-filter: blur(2px);  -ms-filter: blur(2px);  filter: blur(2px);"> 
				   """),_display_(/*64.9*/for(dataSet <- datasetsTopK) yield /*64.37*/{_display_(Seq[Any](format.raw/*64.38*/("""
				   """),_display_(/*65.9*/if(k == 1)/*65.19*/ {_display_(Seq[Any](format.raw/*65.21*/("""
				    """),format.raw/*66.9*/("""<div class="item active" >
				    """),_display_(/*67.10*/{k=0}),format.raw/*67.15*/("""				    
				    """)))}/*68.10*/else/*68.14*/{_display_(Seq[Any](format.raw/*68.15*/("""
				    """),format.raw/*69.9*/("""<div class="item" > 
				    """)))}),format.raw/*70.10*/("""
						"""),format.raw/*71.7*/("""<div class="text-left " >
								<div class="well col-lg-offset-4 col-lg-4 col-sm-offset-3 col-sm-6">
									<div class="text-center">
										<img class="card-img-top" style=" width:60%;"
											src='"""),_display_(/*75.18*/routes/*75.24*/.Assets.at("images/giphy.gif")),format.raw/*75.54*/("""' >
									</div>
									<div class="card-block text-center">
										<h4 class="card-title">"""),_display_(/*78.35*/dataSet/*78.42*/.getName()),format.raw/*78.52*/("""</h4>
										<p class="card-text text-muted">A data set (or dataset) is a collection of data.</p>
									</div>
									<ul class="list-group list-group-flush">
										<li class="list-group-item"><strong>Agency:</strong> <a href=""""),_display_(/*82.74*/dataSet/*82.81*/.getAgencyURL()),format.raw/*82.96*/("""" target="_blank"><code><u>"""),_display_(/*82.124*/dataSet/*82.131*/.getAgencyId()),format.raw/*82.145*/("""</u></code></a></li>
										<li class="list-group-item"><strong>Instrument/Model Experiment:</strong> <a href=""""),_display_(/*83.95*/dataSet/*83.102*/.getInstrumentURL()),format.raw/*83.121*/("""" target="_blank"><code><u>"""),_display_(/*83.149*/dataSet/*83.156*/.getInstrument()),format.raw/*83.172*/("""</u></code></a></li>
										<li class="list-group-item"><strong>Units:</strong> <code>"""),_display_(/*84.70*/dataSet/*84.77*/.getUnits()),format.raw/*84.88*/("""</code></li>
										<li class="list-group-item"><strong>Start Time:</strong> <code>"""),_display_(/*85.75*/dataSet/*85.82*/.getStartTime()),format.raw/*85.97*/("""</code></li>
										<li class="list-group-item"><strong>End Time:</strong> <code>"""),_display_(/*86.73*/dataSet/*86.80*/.getEndTime()),format.raw/*86.93*/("""</code></li>
										<li class="list-group-item"><strong>Physical Variable:</strong> <code>"""),_display_(/*87.82*/dataSet/*87.89*/.getPhysicalVariable()),format.raw/*87.111*/("""</code></li>
										
										<!--  
										<li class="list-group-item"><strong>Start Time:</strong> <code>"""),_display_(/*90.75*/dataSet/*90.82*/.getStartTime()),format.raw/*90.97*/("""</code></li>
										<li class="list-group-item"><strong>End Time::</strong> <code>"""),_display_(/*91.74*/dataSet/*91.81*/.getEndTime),format.raw/*91.92*/("""</code></li>
										-->
									</ul>
									<div class="card-block">
										<a href="#" class="card-link col-lg-offset-2 col-lg-4">Card link</a> 
										<a href="#" class="card-link col-lg-4">Another link</a>
									</div>
									
									<br>
									<div>
										<h4 class="card-title text-center"><strong>People also research:</strong></h4>
									</div>
									
									<div class="row">
									"""),_display_(/*105.11*/for(climateService <- dataSet.getClimateServices()) yield /*105.62*/ {_display_(Seq[Any](format.raw/*105.64*/("""
									  """),format.raw/*106.12*/("""<div class="col-md-6">
									    <div class="thumbnail">
									    <a href=""""),_display_(/*108.24*/climateService/*108.38*/.getUrl()),format.raw/*108.47*/("""">
									      <img src=""""),_display_(/*109.27*/climateService/*109.41*/.getImageURL()),format.raw/*109.55*/("""" style="height: 150px; width: 150px">
								      	</a>
									      <div class="caption">
									        <h5>"""),_display_(/*112.23*/climateService/*112.37*/.getName()),format.raw/*112.47*/("""</h5>				        
									        
									      </div>				      
									    </div>
									  </div>
									  """)))}),format.raw/*117.13*/("""
									  """),format.raw/*118.12*/("""<!--  
									  <div class="col-md-6">
									    <div class="thumbnail">
									      <img src='"""),_display_(/*121.27*/routes/*121.33*/.Assets.at("images/bug.png")),format.raw/*121.61*/("""' >
									      <div class="caption">
									        <h5>ARGO</h5>				        
									        <p><a href="#" class="btn btn-primary" role="button">Go</a> <a href="#" class="btn btn-default" role="button">Ignore</a></p>
									      </div>				      
									    </div>
									  </div>
									  -->
									</div>
									
								</div>
						</div>
					</div>
				<!--  
							<tr>
								<td><font size="2">"""),_display_(/*136.29*/dataSet/*136.36*/.getId()),format.raw/*136.44*/("""</font></td>
								<td><font size="2">"""),_display_(/*137.29*/dataSet/*137.36*/.getName()),format.raw/*137.46*/("""</font></td>
								<td><font size="2">"""),_display_(/*138.29*/dataSet/*138.36*/.getAgencyId()),format.raw/*138.50*/("""</font></td>
								<td><font size="2">"""),_display_(/*139.29*/dataSet/*139.36*/.getInstrument()),format.raw/*139.52*/("""</font></td>
								<td><font size="2">"""),_display_(/*140.29*/dataSet/*140.36*/.getPhysicalVariable()),format.raw/*140.58*/("""</font></td>
								<td><font size="2">"""),_display_(/*141.29*/dataSet/*141.36*/.getCMIP5VarName()),format.raw/*141.54*/("""</font></td>
								<td><font size="2">"""),_display_(/*142.29*/dataSet/*142.36*/.getUnits()),format.raw/*142.47*/("""</font></td>
								<td><font size="2">"""),_display_(/*143.29*/dataSet/*143.36*/.getGridDimension()),format.raw/*143.55*/("""</font></td>
								<td><font size="2">"""),_display_(/*144.29*/dataSet/*144.36*/.getVariableNameInWebInterface()),format.raw/*144.68*/("""</font></td>
								<td><font size="2">"""),_display_(/*145.29*/dataSet/*145.36*/.getDataSourceInputParameterToCallScienceApplicationCode()),format.raw/*145.94*/("""</font></td>
								<td><font size="2">"""),_display_(/*146.29*/dataSet/*146.36*/.getStartTime()),format.raw/*146.51*/("""</font></td>
								<td><font size="2">"""),_display_(/*147.29*/dataSet/*147.36*/.getEndTime()),format.raw/*147.49*/("""</font></td>
							</tr>
				-->
					""")))}),format.raw/*150.7*/("""
        """),format.raw/*151.9*/("""</div>         

        <!-- Controls -->         

        <a class="left carousel-control" href="#carousel1" data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"></span> </a>
        <a class="right carousel-control" href="#carousel1" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span>  </a>          
    </div>          
</section>


<h1>Datasets List</h1>
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
"""),_display_(/*187.2*/for(dataSet <- dataSets) yield /*187.26*/{_display_(Seq[Any](format.raw/*187.27*/("""
							"""),format.raw/*188.8*/("""<tr>
								<!-- 
								<td><font size="2">"""),_display_(/*190.29*/dataSet/*190.36*/.getId()),format.raw/*190.44*/("""</font></td>
								-->
								<td><font size="2">"""),_display_(/*192.29*/dataSet/*192.36*/.getName()),format.raw/*192.46*/("""</font></td>
								<td><font size="2">"""),_display_(/*193.29*/dataSet/*193.36*/.getAgencyId()),format.raw/*193.50*/("""</font></td>
								<td><font size="2">"""),_display_(/*194.29*/dataSet/*194.36*/.getInstrument()),format.raw/*194.52*/("""</font></td>
								<td><font size="2">"""),_display_(/*195.29*/dataSet/*195.36*/.getPhysicalVariable()),format.raw/*195.58*/("""</font></td>
								<td><font size="2">"""),_display_(/*196.29*/dataSet/*196.36*/.getCMIP5VarName()),format.raw/*196.54*/("""</font></td>
								<td><font size="2">"""),_display_(/*197.29*/dataSet/*197.36*/.getUnits()),format.raw/*197.47*/("""</font></td>
								<td><font size="2">"""),_display_(/*198.29*/dataSet/*198.36*/.getGridDimension()),format.raw/*198.55*/("""</font></td>
								<td><font size="2">"""),_display_(/*199.29*/dataSet/*199.36*/.getVariableNameInWebInterface()),format.raw/*199.68*/("""</font></td>
								<td><font size="2">"""),_display_(/*200.29*/dataSet/*200.36*/.getDataSourceInputParameterToCallScienceApplicationCode()),format.raw/*200.94*/("""</font></td>
								<td><font size="2">"""),_display_(/*201.29*/dataSet/*201.36*/.getStartTime()),format.raw/*201.51*/("""</font></td>
								<td><font size="2">"""),_display_(/*202.29*/dataSet/*202.36*/.getEndTime()),format.raw/*202.49*/("""</font></td>
								<td><font size="2">"""),_display_(/*203.29*/dataSet/*203.36*/.getDuration()),format.raw/*203.50*/("""</font></td>
							</tr>
							""")))}),format.raw/*205.9*/("""

	
	"""),format.raw/*208.2*/("""</tbody>
    </table>
    </div>
""")))}),format.raw/*211.2*/("""
"""))}
  }

  def render(dataSets:List[Dataset],dataSetForm:play.data.Form[Dataset],datasetsTopK:List[Dataset]): play.twirl.api.HtmlFormat.Appendable = apply(dataSets,dataSetForm,datasetsTopK)

  def f:((List[Dataset],play.data.Form[Dataset],List[Dataset]) => play.twirl.api.HtmlFormat.Appendable) = (dataSets,dataSetForm,datasetsTopK) => apply(dataSets,dataSetForm,datasetsTopK)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Dec 10 17:28:46 PST 2015
                  SOURCE: /Users/weiwang/climate-service/app/views/dataSetList.scala.html
                  HASH: f2be831c2716bbe41b54ba1cc5f10f11dffdb539
                  MATRIX: 774->1|999->162|1013->169|1093->173|1121->175|1161->189|1175->195|1235->235|1336->309|1364->310|1394->313|1449->341|1477->342|1531->93|1559->160|1587->357|1616->360|1654->389|1694->391|1730->400|1792->435|1809->443|1837->450|1866->451|3194->1752|3238->1780|3278->1782|3316->1793|3335->1803|3375->1805|3414->1816|3486->1861|3508->1862|3570->1905|3583->1909|3622->1910|3661->1921|3733->1966|3755->1967|3816->1997|3854->2008|3886->2019|3927->2029|3967->2042|4117->2165|4132->2171|4186->2203|4392->2383|4436->2411|4475->2412|4510->2421|4529->2431|4569->2433|4605->2442|4668->2478|4694->2483|4731->2501|4744->2505|4783->2506|4819->2515|4880->2545|4914->2552|5152->2763|5167->2769|5218->2799|5345->2899|5361->2906|5392->2916|5659->3156|5675->3163|5711->3178|5767->3206|5784->3213|5820->3227|5962->3342|5979->3349|6020->3368|6076->3396|6093->3403|6131->3419|6248->3509|6264->3516|6296->3527|6410->3614|6426->3621|6462->3636|6574->3721|6590->3728|6624->3741|6745->3835|6761->3842|6805->3864|6947->3979|6963->3986|6999->4001|7112->4087|7128->4094|7160->4105|7617->4534|7685->4585|7726->4587|7767->4599|7878->4682|7902->4696|7933->4705|7990->4734|8014->4748|8050->4762|8196->4880|8220->4894|8252->4904|8402->5022|8443->5034|8575->5138|8591->5144|8641->5172|9097->5600|9114->5607|9144->5615|9213->5656|9230->5663|9262->5673|9331->5714|9348->5721|9384->5735|9453->5776|9470->5783|9508->5799|9577->5840|9594->5847|9638->5869|9707->5910|9724->5917|9764->5935|9833->5976|9850->5983|9883->5994|9952->6035|9969->6042|10010->6061|10079->6102|10096->6109|10150->6141|10219->6182|10236->6189|10316->6247|10385->6288|10402->6295|10439->6310|10508->6351|10525->6358|10560->6371|10631->6411|10668->6420|12271->7996|12312->8020|12352->8021|12388->8029|12463->8076|12480->8083|12510->8091|12591->8144|12608->8151|12640->8161|12709->8202|12726->8209|12762->8223|12831->8264|12848->8271|12886->8287|12955->8328|12972->8335|13016->8357|13085->8398|13102->8405|13142->8423|13211->8464|13228->8471|13261->8482|13330->8523|13347->8530|13388->8549|13457->8590|13474->8597|13528->8629|13597->8670|13614->8677|13694->8735|13763->8776|13780->8783|13817->8798|13886->8839|13903->8846|13938->8859|14007->8900|14024->8907|14060->8921|14125->8955|14158->8960|14223->8994
                  LINES: 26->1|29->6|29->6|31->6|32->7|32->7|32->7|32->7|34->9|34->9|35->10|36->11|36->11|39->1|41->5|42->13|44->15|44->15|44->15|46->17|47->18|47->18|47->18|47->18|80->51|80->51|80->51|81->52|81->52|81->52|82->53|82->53|82->53|83->54|83->54|83->54|84->55|84->55|84->55|85->56|86->57|86->57|87->58|88->59|92->63|92->63|92->63|93->64|93->64|93->64|94->65|94->65|94->65|95->66|96->67|96->67|97->68|97->68|97->68|98->69|99->70|100->71|104->75|104->75|104->75|107->78|107->78|107->78|111->82|111->82|111->82|111->82|111->82|111->82|112->83|112->83|112->83|112->83|112->83|112->83|113->84|113->84|113->84|114->85|114->85|114->85|115->86|115->86|115->86|116->87|116->87|116->87|119->90|119->90|119->90|120->91|120->91|120->91|134->105|134->105|134->105|135->106|137->108|137->108|137->108|138->109|138->109|138->109|141->112|141->112|141->112|146->117|147->118|150->121|150->121|150->121|165->136|165->136|165->136|166->137|166->137|166->137|167->138|167->138|167->138|168->139|168->139|168->139|169->140|169->140|169->140|170->141|170->141|170->141|171->142|171->142|171->142|172->143|172->143|172->143|173->144|173->144|173->144|174->145|174->145|174->145|175->146|175->146|175->146|176->147|176->147|176->147|179->150|180->151|216->187|216->187|216->187|217->188|219->190|219->190|219->190|221->192|221->192|221->192|222->193|222->193|222->193|223->194|223->194|223->194|224->195|224->195|224->195|225->196|225->196|225->196|226->197|226->197|226->197|227->198|227->198|227->198|228->199|228->199|228->199|229->200|229->200|229->200|230->201|230->201|230->201|231->202|231->202|231->202|232->203|232->203|232->203|234->205|237->208|240->211
                  -- GENERATED --
              */
          