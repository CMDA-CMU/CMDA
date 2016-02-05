
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
object relationalKnowledgeGraph extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
def /*3.2*/scripts/*3.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
	"""),format.raw/*4.2*/("""<link rel="stylesheet" href='"""),_display_(/*4.32*/routes/*4.38*/.Assets.at("stylesheets/vis.css")),format.raw/*4.71*/("""'>
	<style type="text/css">
	        html, body """),format.raw/*6.21*/("""{"""),format.raw/*6.22*/("""
	            """),format.raw/*7.14*/("""font: 10pt arial;
	          """),format.raw/*8.12*/("""}"""),format.raw/*8.13*/("""
	        """),format.raw/*9.10*/("""#mynetwork """),format.raw/*9.21*/("""{"""),format.raw/*9.22*/("""
	            """),format.raw/*10.14*/("""width: 600px;
	            height: 600px;
	            border: 1px solid lightgray;
	        """),format.raw/*13.10*/("""}"""),format.raw/*13.11*/("""
	        """),format.raw/*14.10*/("""#loadingBar """),format.raw/*14.22*/("""{"""),format.raw/*14.23*/("""
	            """),format.raw/*15.14*/("""position:absolute;
	            
	            width: 610px;
	            height: 610px;
	            background-color:rgba(200,200,200,0.8);
	            -webkit-transition: all 0.5s ease;
	            -moz-transition: all 0.5s ease;
	            -ms-transition: all 0.5s ease;
	            -o-transition: all 0.5s ease;
	            transition: all 0.5s ease;
	            opacity:1;
	        """),format.raw/*26.10*/("""}"""),format.raw/*26.11*/("""
	        """),format.raw/*27.10*/("""#wrapper """),format.raw/*27.19*/("""{"""),format.raw/*27.20*/("""
	            """),format.raw/*28.14*/("""position:relative;
	            width:900px;
	            height:900px;
	        """),format.raw/*31.10*/("""}"""),format.raw/*31.11*/("""
	
	        """),format.raw/*33.10*/("""#text """),format.raw/*33.16*/("""{"""),format.raw/*33.17*/("""
	            """),format.raw/*34.14*/("""position:absolute;
	            top:0px;
	            left:530px;
	            width:30px;
	            height:50px;
	            margin:auto auto auto auto;
	            font-size:22px;
	            color: #000000;
	        """),format.raw/*42.10*/("""}"""),format.raw/*42.11*/("""
	
	
	        """),format.raw/*45.10*/("""div.outerBorder """),format.raw/*45.26*/("""{"""),format.raw/*45.27*/("""
	            """),format.raw/*46.14*/("""position:relative;
	            top:300px;
	            width:600px;
	            height:44px;
	            margin:auto auto auto auto;
	            border:8px solid rgba(0,0,0,0.1);
	            background: rgb(252,252,252); /* Old browsers */
	            background: -moz-linear-gradient(top,  rgba(252,252,252,1) 0%, rgba(237,237,237,1) 100%); /* FF3.6+ */
	            background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgba(252,252,252,1)), color-stop(100%,rgba(237,237,237,1))); /* Chrome,Safari4+ */
	            background: -webkit-linear-gradient(top,  rgba(252,252,252,1) 0%,rgba(237,237,237,1) 100%); /* Chrome10+,Safari5.1+ */
	            background: -o-linear-gradient(top,  rgba(252,252,252,1) 0%,rgba(237,237,237,1) 100%); /* Opera 11.10+ */
	            background: -ms-linear-gradient(top,  rgba(252,252,252,1) 0%,rgba(237,237,237,1) 100%); /* IE10+ */
	            background: linear-gradient(to bottom,  rgba(252,252,252,1) 0%,rgba(237,237,237,1) 100%); /* W3C */
	            filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#fcfcfc', endColorstr='#ededed',GradientType=0 ); /* IE6-9 */
	            border-radius:72px;
	            box-shadow: 0px 0px 10px rgba(0,0,0,0.2);
	        """),format.raw/*62.10*/("""}"""),format.raw/*62.11*/("""
	
	        """),format.raw/*64.10*/("""#border """),format.raw/*64.18*/("""{"""),format.raw/*64.19*/("""
	            """),format.raw/*65.14*/("""position:absolute;
	            top:2px;
	            left:2px;
	            width:500px;
	            height:23px;
	            margin:auto auto auto auto;
	            box-shadow: 0px 0px 4px rgba(0,0,0,0.2);
	            border-radius:10px;
	        """),format.raw/*73.10*/("""}"""),format.raw/*73.11*/("""
	
	        """),format.raw/*75.10*/("""#bar """),format.raw/*75.15*/("""{"""),format.raw/*75.16*/("""
	            """),format.raw/*76.14*/("""position:absolute;
	            
	            width:10px;
	            height:20px;
	            margin:auto auto auto auto;
	            border-radius:11px;
	            border:2px solid rgba(30,30,30,0.05);
	            background: rgb(153, 255, 255); /* Old browsers */
	            box-shadow: 2px 2px 4px rgba(0,0,0,0.4);
	        """),format.raw/*85.10*/("""}"""),format.raw/*85.11*/("""
	
	        """),format.raw/*87.10*/("""#config """),format.raw/*87.18*/("""{"""),format.raw/*87.19*/("""            
	            
	            """),format.raw/*89.14*/("""width: 400px;
	            height: 600px;
	
	        """),format.raw/*92.10*/("""}"""),format.raw/*92.11*/("""
	        """),format.raw/*93.10*/("""#config input """),format.raw/*93.24*/("""{"""),format.raw/*93.25*/("""
	            """),format.raw/*94.14*/("""display: inline-block;
	        """),format.raw/*95.10*/("""}"""),format.raw/*95.11*/("""
	        """),format.raw/*96.10*/("""#config input.vis-configuration.vis-config-rangeinput """),format.raw/*96.64*/("""{"""),format.raw/*96.65*/("""
	            """),format.raw/*97.14*/("""height: 15px;
	        """),format.raw/*98.10*/("""}"""),format.raw/*98.11*/("""
	        """),format.raw/*99.10*/("""#config button, input, select, textarea """),format.raw/*99.50*/("""{"""),format.raw/*99.51*/("""
	            """),format.raw/*100.14*/("""line-height: 100%;
	        """),format.raw/*101.10*/("""}"""),format.raw/*101.11*/("""
	"""),format.raw/*102.2*/("""</style>
	
	<script type="text/javascript" src='"""),_display_(/*104.39*/routes/*104.45*/.Assets.at("javascripts/exampleUtil.js")),format.raw/*104.85*/("""'></script>
	<script type="text/javascript" src='"""),_display_(/*105.39*/routes/*105.45*/.Assets.at("javascripts/vis.js")),format.raw/*105.77*/("""'></script>
	<script type="text/javascript">
	$(document).ready(function() """),format.raw/*107.31*/("""{"""),format.raw/*107.32*/("""  
	    """),format.raw/*108.6*/("""$("#panel").hide(); 
	    $("#config").hide();
	    
	  """),format.raw/*111.4*/("""}"""),format.raw/*111.5*/(""")

	    var responseJson = null;
	    var nodes = null;
	    var edges = null;
	    var network = null;

	    var visConfig = 1;
	    
	    function getParameters() """),format.raw/*120.31*/("""{"""),format.raw/*120.32*/("""
	    	"""),format.raw/*121.7*/("""var temp1 = document.getElementById("paramCombination").value;
			var temp2 = temp1.split(" ");
			var p1 = temp2[0];
			var p2 = temp2[1];
	    	var p3 = temp2[2];
	    	
	    	var parameters = """),format.raw/*127.24*/("""{"""),format.raw/*127.25*/("""
	    			"""),format.raw/*128.9*/("""param1:p1,
	    			param2:p2,
	    			param3:p3
	    	"""),format.raw/*131.7*/("""}"""),format.raw/*131.8*/("""
	    	
	    	"""),format.raw/*133.7*/("""$.ajax("""),format.raw/*133.14*/("""{"""),format.raw/*133.15*/("""
	            """),format.raw/*134.14*/("""url: "/getSpecifiedKnowledgeGraph",
	            type: "POST",
	            contentType: "application/json",
	            data: JSON.stringify(parameters),
	            dataType: "text"
	        """),format.raw/*139.10*/("""}"""),format.raw/*139.11*/(""").done(function(data1) """),format.raw/*139.34*/("""{"""),format.raw/*139.35*/("""
	        	"""),format.raw/*140.11*/("""console.log("success");
	        	responseJson = data1;
	        	draw();
	        """),format.raw/*143.10*/("""}"""),format.raw/*143.11*/(""").fail(function(xhr, textStatus, errorThrown) """),format.raw/*143.57*/("""{"""),format.raw/*143.58*/("""
	        	"""),format.raw/*144.11*/("""console.log("error!");
	        	console.log(xhr);
	        	console.log(textStatus);
	            console.log(errorThrown);
	        """),format.raw/*148.10*/("""}"""),format.raw/*148.11*/(""")
	        
	    """),format.raw/*150.6*/("""}"""),format.raw/*150.7*/("""
	    

	    """),format.raw/*153.6*/("""function hideConfig() """),format.raw/*153.28*/("""{"""),format.raw/*153.29*/("""
	        """),format.raw/*154.10*/("""if (visConfig == 0) """),format.raw/*154.30*/("""{"""),format.raw/*154.31*/("""
	            """),format.raw/*155.14*/("""$("#config").hide();
	            visConfig =1;
	        """),format.raw/*157.10*/("""}"""),format.raw/*157.11*/("""else """),format.raw/*157.16*/("""{"""),format.raw/*157.17*/("""
	            """),format.raw/*158.14*/("""$("#config").show();
	            visConfig =0;
	        """),format.raw/*160.10*/("""}"""),format.raw/*160.11*/("""
	    """),format.raw/*161.6*/("""}"""),format.raw/*161.7*/("""

	    """),format.raw/*163.6*/("""function draw() """),format.raw/*163.22*/("""{"""),format.raw/*163.23*/("""
	    	"""),format.raw/*164.7*/("""console.log("draw");
	      // create people.
	      // value corresponds with the age of the person
	      var test = responseJson;
	      
	      //test = JSON.stringify(test);
	      console.log("test: " + test);
	      test = JSON.parse(test);
	      var nodes = test.nodes;
	      console.log("nodes: " + nodes);
	      var edges = test.edges;
	      console.log("edges: " + edges); 

	      // Instantiate our network object.
	      var container = document.getElementById('mynetwork');
	      var data = """),format.raw/*179.19*/("""{"""),format.raw/*179.20*/("""
	        """),format.raw/*180.10*/("""nodes: nodes,
	        edges: edges
	      """),format.raw/*182.8*/("""}"""),format.raw/*182.9*/(""";
	      var options = """),format.raw/*183.22*/("""{"""),format.raw/*183.23*/("""
   		  """),format.raw/*184.8*/("""nodes: """),format.raw/*184.15*/("""{"""),format.raw/*184.16*/("""
   			    """),format.raw/*185.11*/("""color: """),format.raw/*185.18*/("""{"""),format.raw/*185.19*/("""
   			      """),format.raw/*186.13*/("""highlight: """),format.raw/*186.24*/("""{"""),format.raw/*186.25*/("""
   			        """),format.raw/*187.15*/("""border: "red",
   			        background: "pink"
   			      """),format.raw/*189.13*/("""}"""),format.raw/*189.14*/("""
   			    """),format.raw/*190.11*/("""}"""),format.raw/*190.12*/(""",
   			    scaling: """),format.raw/*191.20*/("""{"""),format.raw/*191.21*/("""
   			      """),format.raw/*192.13*/("""min: 12
   			    """),format.raw/*193.11*/("""}"""),format.raw/*193.12*/(""",
   			    shadow: """),format.raw/*194.19*/("""{"""),format.raw/*194.20*/("""
   			      """),format.raw/*195.13*/("""enabled: true,
   			      size: 8
   			    """),format.raw/*197.11*/("""}"""),format.raw/*197.12*/(""",
	   			 font: """),format.raw/*198.15*/("""{"""),format.raw/*198.16*/("""
	   		      """),format.raw/*199.13*/("""color: "rgba(52,52,52,1)",
	   		      size: 10,
	   		      strokeWidth: 4
	   		    """),format.raw/*202.11*/("""}"""),format.raw/*202.12*/(""",
   			    shape: "dot",
   			    shapeProperties: """),format.raw/*204.28*/("""{"""),format.raw/*204.29*/("""
   			      """),format.raw/*205.13*/("""borderRadius: 5
   			    """),format.raw/*206.11*/("""}"""),format.raw/*206.12*/("""
   			  """),format.raw/*207.9*/("""}"""),format.raw/*207.10*/(""",
   			  edges: """),format.raw/*208.16*/("""{"""),format.raw/*208.17*/("""
   			    """),format.raw/*209.11*/("""arrows: """),format.raw/*209.19*/("""{"""),format.raw/*209.20*/("""
   			      """),format.raw/*210.13*/("""to: """),format.raw/*210.17*/("""{"""),format.raw/*210.18*/("""
   			        """),format.raw/*211.15*/("""enabled: true,
   			        scaleFactor: 0.4
   			      """),format.raw/*213.13*/("""}"""),format.raw/*213.14*/("""
   			    """),format.raw/*214.11*/("""}"""),format.raw/*214.12*/(""",
 			  color: """),format.raw/*215.14*/("""{"""),format.raw/*215.15*/("""
 			      """),format.raw/*216.11*/("""highlight: "rgba(244,1,0,1)",
 			      hover: "rgba(0,0,0,1)",
 			      inherit: false
 			    """),format.raw/*219.9*/("""}"""),format.raw/*219.10*/(""",
		      smooth: """),format.raw/*220.17*/("""{"""),format.raw/*220.18*/("""
 			      """),format.raw/*221.11*/("""type: "continuous",
 			      forceDirection: "vertical"
 			    """),format.raw/*223.9*/("""}"""),format.raw/*223.10*/("""
   			  """),format.raw/*224.9*/("""}"""),format.raw/*224.10*/(""",
   			  interaction: """),format.raw/*225.22*/("""{"""),format.raw/*225.23*/("""
   			    """),format.raw/*226.11*/("""hover: true,
   			    multiselect: true
   			  """),format.raw/*228.9*/("""}"""),format.raw/*228.10*/(""",
	         groups: """),format.raw/*229.19*/("""{"""),format.raw/*229.20*/("""
	          """),format.raw/*230.12*/("""dataset: """),format.raw/*230.21*/("""{"""),format.raw/*230.22*/("""
	            """),format.raw/*231.14*/("""color:"#A9E2F3"
	          """),format.raw/*232.12*/("""}"""),format.raw/*232.13*/(""",
	          user: """),format.raw/*233.18*/("""{"""),format.raw/*233.19*/("""
	        	"""),format.raw/*234.11*/("""color:"#F781F3"
	          """),format.raw/*235.12*/("""}"""),format.raw/*235.13*/("""
	        """),format.raw/*236.10*/("""}"""),format.raw/*236.11*/(""",
	        
	        physics: """),format.raw/*238.19*/("""{"""),format.raw/*238.20*/("""    
	          """),format.raw/*239.12*/("""barnesHut: """),format.raw/*239.23*/("""{"""),format.raw/*239.24*/("""
	        	  """),format.raw/*240.13*/("""centralGravity: 1.95,	              
	        	  springLength: 195,
	              springConstant: 0.185,
	        	  damping: 0.25,
	              avoidOverlap: 0.2
   			    """),format.raw/*245.11*/("""}"""),format.raw/*245.12*/(""",
   			 	maxVelocity: 10,
   			    minVelocity: 0.75,
	          stabilization: """),format.raw/*248.27*/("""{"""),format.raw/*248.28*/("""
	            """),format.raw/*249.14*/("""enabled:true,
	            iterations:200,
	            updateInterval:1
	          """),format.raw/*252.12*/("""}"""),format.raw/*252.13*/("""
	        """),format.raw/*253.10*/("""}"""),format.raw/*253.11*/(""",
	        configure: """),format.raw/*254.21*/("""{"""),format.raw/*254.22*/("""
	          """),format.raw/*255.12*/("""filter:function (option, path) """),format.raw/*255.43*/("""{"""),format.raw/*255.44*/("""
	            """),format.raw/*256.14*/("""if (path.indexOf('physics') !== -1 || option === 'physics') """),format.raw/*256.74*/("""{"""),format.raw/*256.75*/("""
	              """),format.raw/*257.16*/("""return true;
	            """),format.raw/*258.14*/("""}"""),format.raw/*258.15*/("""
	            """),format.raw/*259.14*/("""if (path.indexOf('smooth') !== -1 || option === 'smooth') """),format.raw/*259.72*/("""{"""),format.raw/*259.73*/("""
	              """),format.raw/*260.16*/("""return true;
	            """),format.raw/*261.14*/("""}"""),format.raw/*261.15*/("""
	            """),format.raw/*262.14*/("""return true;
	          """),format.raw/*263.12*/("""}"""),format.raw/*263.13*/(""",
	          container: document.getElementById('config')
	        """),format.raw/*265.10*/("""}"""),format.raw/*265.11*/("""
	      """),format.raw/*266.8*/("""}"""),format.raw/*266.9*/(""";
	      network = new vis.Network(container, data, options);

	      network.on("stabilizationProgress", function(params) """),format.raw/*269.61*/("""{"""),format.raw/*269.62*/("""
	                """),format.raw/*270.18*/("""var maxWidth = 496;
	                var minWidth = 20;
	                var widthFactor = params.iterations/params.total;
	                var width = Math.max(minWidth,maxWidth * widthFactor);

	                document.getElementById('bar').style.width = width + 'px';
	                document.getElementById('text').innerHTML = Math.round(widthFactor*100) + '%';
	            """),format.raw/*277.14*/("""}"""),format.raw/*277.15*/(""");
	            network.once("stabilizationIterationsDone", function() """),format.raw/*278.69*/("""{"""),format.raw/*278.70*/("""
	                """),format.raw/*279.18*/("""document.getElementById('text').innerHTML = '100%';
	                document.getElementById('bar').style.width = '496px';
	                document.getElementById('loadingBar').style.opacity = 0;
	                // really clean the dom element
	                setTimeout(function () """),format.raw/*283.41*/("""{"""),format.raw/*283.42*/("""document.getElementById('loadingBar').style.display = 'none';"""),format.raw/*283.103*/("""}"""),format.raw/*283.104*/(""", 500);
	            """),format.raw/*284.14*/("""}"""),format.raw/*284.15*/(""");

	      //network.focusOnNode(19);
	      network.on('select', function(properties) """),format.raw/*287.50*/("""{"""),format.raw/*287.51*/("""
	        """),format.raw/*288.10*/("""var select_node = $.grep(data.nodes, function(e)"""),format.raw/*288.58*/("""{"""),format.raw/*288.59*/("""
	          """),format.raw/*289.12*/("""return e["id"] == properties.nodes[0];
	        """),format.raw/*290.10*/("""}"""),format.raw/*290.11*/(""")[0];

	        $("#nodeName").text(select_node["title"]);
	        //alert(select_node["title"]);
	        $("#id").text(select_node["id"]);
	        $("#cluster").text(select_node["cluster"]);
	        $("#label").text(select_node["label"]);

	        $("#panel").show();
	      """),format.raw/*299.8*/("""}"""),format.raw/*299.9*/(""");
	    """),format.raw/*300.6*/("""}"""),format.raw/*300.7*/("""
	    
	"""),format.raw/*302.2*/("""</script>
	<script type="text/javascript" src='"""),_display_(/*303.39*/routes/*303.45*/.Assets.at("javascripts/googleAnalytics.js")),format.raw/*303.89*/("""'></script>
""")))};
Seq[Any](format.raw/*304.2*/("""

"""),_display_(/*306.2*/main("Relational Knowledge Graph", scripts)/*306.45*/{_display_(Seq[Any](format.raw/*306.46*/("""
	"""),format.raw/*307.2*/("""<div id="knowledgeGraph">
	
	   <div id="loadingBar" class="col-lg-3">
	    <div class="outerBorder" >
	        <div id="text">0%</div>
	        <div id="border">
	            <div id="bar"></div>
	        </div>
	    </div>	    
	   </div>
	   
	  <div id="mynetwork" class="col-lg-3"></div>
	  
	  <div>
	  <div class = "col-lg-offset-1 col-lg-4">
	  <div class="well">
            <h4>Configure Inputs</h4>
            <br>
            <form>
                <div class="form-group">
                    <label>Parameter Type1</label>
                    <select class="form-control" id="paramCombination">
                        <option value="User User Dataset">User × User | Dataset</option>
                        <option value="User User Service">User × User | Service</option>
                        <option value="Dataset Dataset User">Dataset × Dataset | User</option>
                        <option value="Dataset Dataset Service">Dataset × Dataset | Service</option>
                        <option value="Service Service User">Service × Service | User</option>
                        <option value="Service Service Dataset">Service × Service | Dataset</option>
                        <option value="User Dataset Service">User × Dataset | Service</option>
                        <option value="User Service Dataset">User × Service | Dataset</option>
                        <option value="Dataset Service User">Dataset × Service | User</option>
                    </select>
                </div>
                <div class="text-center">
                    <button type="button" class="btn btn-primary" onclick="Javascript:getParameters()">Finish</button>
                </div>
            </form>
        </div> 
	</div>
	<br>
	  
	  
	  
	  <div class = "col-lg-offset-1 col-lg-4">
	        <button type="button" onclick="hideConfig()" class="btn btn-default btn-lg "><span class="glyphicon glyphicon-star" aria-hidden="true">
	        </span> Show Advanced Settings </button>
	  </div>
	  <div id="config" class="col-lg-offset-7"></div>  
	  </div>
	
	<div id="panel" class="col-lg-offset-7">  
	  <div class="well col-lg-5">
	    <div class="text-center">
	      <img class="card-img-top" style=" width:60%;" src="/assets/images/data.png">
	    </div>
	    <div class="card-block text-center">
	      <h4 class="card-title" id="nodeName">card</h4>
	      <p class="card-text text-muted" >A data set (or dataset) is a collection of data.</p>
	    </div>
	    <ul class="list-group list-group-flush">
	      <li class="list-group-item"><strong>Id:</strong><code id="id"></code></li>
	      <li class="list-group-item"><strong>Cluster:</strong><code id="cluster"></code></li>
	      <li class="list-group-item"><strong>Label:</strong><code id="label"></code></li>
	    </ul>
	    <div class="card-block">
	      <a href="#" class="card-link col-lg-offset-0 col-lg-6">Card link</a> 
	      <a href="#" class="card-link col-lg-6">Another link</a>
	    </div>    
	  </div>  
	</div>
	</div>
  
""")))}),format.raw/*379.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Dec 10 17:28:47 PST 2015
                  SOURCE: /Users/weiwang/climate-service/app/views/relationalKnowledgeGraph.scala.html
                  HASH: 955d0b362bf0b82d177ec6410de1fcbe275ee5c5
                  MATRIX: 816->19|830->26|910->30|938->32|994->62|1008->68|1061->101|1136->149|1164->150|1205->164|1261->193|1289->194|1326->204|1364->215|1392->216|1434->230|1555->323|1584->324|1622->334|1662->346|1691->347|1733->361|2155->755|2184->756|2222->766|2259->775|2288->776|2330->790|2439->871|2468->872|2508->884|2542->890|2571->891|2613->905|2866->1130|2895->1131|2937->1145|2981->1161|3010->1162|3052->1176|4327->2423|4356->2424|4396->2436|4432->2444|4461->2445|4503->2459|4784->2712|4813->2713|4853->2725|4886->2730|4915->2731|4957->2745|5321->3081|5350->3082|5390->3094|5426->3102|5455->3103|5523->3143|5604->3196|5633->3197|5671->3207|5713->3221|5742->3222|5784->3236|5844->3268|5873->3269|5911->3279|5993->3333|6022->3334|6064->3348|6115->3371|6144->3372|6182->3382|6250->3422|6279->3423|6322->3437|6379->3465|6409->3466|6439->3468|6516->3517|6532->3523|6594->3563|6672->3613|6688->3619|6742->3651|6846->3726|6876->3727|6912->3735|6996->3791|7025->3792|7219->3957|7249->3958|7284->3965|7508->4160|7538->4161|7575->4170|7657->4224|7686->4225|7728->4239|7764->4246|7794->4247|7837->4261|8061->4456|8091->4457|8143->4480|8173->4481|8213->4492|8325->4575|8355->4576|8430->4622|8460->4623|8500->4634|8663->4768|8693->4769|8738->4786|8767->4787|8808->4800|8859->4822|8889->4823|8928->4833|8977->4853|9007->4854|9050->4868|9136->4925|9166->4926|9200->4931|9230->4932|9273->4946|9359->5003|9389->5004|9423->5010|9452->5011|9487->5018|9532->5034|9562->5035|9597->5042|10137->5553|10167->5554|10206->5564|10277->5607|10306->5608|10358->5631|10388->5632|10424->5640|10460->5647|10490->5648|10530->5659|10566->5666|10596->5667|10638->5680|10678->5691|10708->5692|10752->5707|10841->5767|10871->5768|10911->5779|10941->5780|10991->5801|11021->5802|11063->5815|11110->5833|11140->5834|11189->5854|11219->5855|11261->5868|11335->5913|11365->5914|11410->5930|11440->5931|11482->5944|11597->6030|11627->6031|11709->6084|11739->6085|11781->6098|11836->6124|11866->6125|11903->6134|11933->6135|11979->6152|12009->6153|12049->6164|12086->6172|12116->6173|12158->6186|12191->6190|12221->6191|12265->6206|12352->6264|12382->6265|12422->6276|12452->6277|12496->6292|12526->6293|12566->6304|12691->6401|12721->6402|12768->6420|12798->6421|12838->6432|12931->6497|12961->6498|12998->6507|13028->6508|13080->6531|13110->6532|13150->6543|13227->6592|13257->6593|13306->6613|13336->6614|13377->6626|13415->6635|13445->6636|13488->6650|13544->6677|13574->6678|13622->6697|13652->6698|13692->6709|13748->6736|13778->6737|13817->6747|13847->6748|13906->6778|13936->6779|13981->6795|14021->6806|14051->6807|14093->6820|14298->6996|14328->6997|14439->7079|14469->7080|14512->7094|14625->7178|14655->7179|14694->7189|14724->7190|14775->7212|14805->7213|14846->7225|14906->7256|14936->7257|14979->7271|15068->7331|15098->7332|15143->7348|15198->7374|15228->7375|15271->7389|15358->7447|15388->7448|15433->7464|15488->7490|15518->7491|15561->7505|15614->7529|15644->7530|15740->7597|15770->7598|15806->7606|15835->7607|15987->7730|16017->7731|16064->7749|16474->8130|16504->8131|16604->8202|16634->8203|16681->8221|16996->8507|17026->8508|17117->8569|17148->8570|17198->8591|17228->8592|17344->8679|17374->8680|17413->8690|17490->8738|17520->8739|17561->8751|17638->8799|17668->8800|17977->9081|18006->9082|18042->9090|18071->9091|18107->9099|18183->9147|18199->9153|18265->9197|18318->9210|18348->9213|18401->9256|18441->9257|18471->9259|21520->12277
                  LINES: 28->3|28->3|30->3|31->4|31->4|31->4|31->4|33->6|33->6|34->7|35->8|35->8|36->9|36->9|36->9|37->10|40->13|40->13|41->14|41->14|41->14|42->15|53->26|53->26|54->27|54->27|54->27|55->28|58->31|58->31|60->33|60->33|60->33|61->34|69->42|69->42|72->45|72->45|72->45|73->46|89->62|89->62|91->64|91->64|91->64|92->65|100->73|100->73|102->75|102->75|102->75|103->76|112->85|112->85|114->87|114->87|114->87|116->89|119->92|119->92|120->93|120->93|120->93|121->94|122->95|122->95|123->96|123->96|123->96|124->97|125->98|125->98|126->99|126->99|126->99|127->100|128->101|128->101|129->102|131->104|131->104|131->104|132->105|132->105|132->105|134->107|134->107|135->108|138->111|138->111|147->120|147->120|148->121|154->127|154->127|155->128|158->131|158->131|160->133|160->133|160->133|161->134|166->139|166->139|166->139|166->139|167->140|170->143|170->143|170->143|170->143|171->144|175->148|175->148|177->150|177->150|180->153|180->153|180->153|181->154|181->154|181->154|182->155|184->157|184->157|184->157|184->157|185->158|187->160|187->160|188->161|188->161|190->163|190->163|190->163|191->164|206->179|206->179|207->180|209->182|209->182|210->183|210->183|211->184|211->184|211->184|212->185|212->185|212->185|213->186|213->186|213->186|214->187|216->189|216->189|217->190|217->190|218->191|218->191|219->192|220->193|220->193|221->194|221->194|222->195|224->197|224->197|225->198|225->198|226->199|229->202|229->202|231->204|231->204|232->205|233->206|233->206|234->207|234->207|235->208|235->208|236->209|236->209|236->209|237->210|237->210|237->210|238->211|240->213|240->213|241->214|241->214|242->215|242->215|243->216|246->219|246->219|247->220|247->220|248->221|250->223|250->223|251->224|251->224|252->225|252->225|253->226|255->228|255->228|256->229|256->229|257->230|257->230|257->230|258->231|259->232|259->232|260->233|260->233|261->234|262->235|262->235|263->236|263->236|265->238|265->238|266->239|266->239|266->239|267->240|272->245|272->245|275->248|275->248|276->249|279->252|279->252|280->253|280->253|281->254|281->254|282->255|282->255|282->255|283->256|283->256|283->256|284->257|285->258|285->258|286->259|286->259|286->259|287->260|288->261|288->261|289->262|290->263|290->263|292->265|292->265|293->266|293->266|296->269|296->269|297->270|304->277|304->277|305->278|305->278|306->279|310->283|310->283|310->283|310->283|311->284|311->284|314->287|314->287|315->288|315->288|315->288|316->289|317->290|317->290|326->299|326->299|327->300|327->300|329->302|330->303|330->303|330->303|332->304|334->306|334->306|334->306|335->307|407->379
                  -- GENERATED --
              */
          