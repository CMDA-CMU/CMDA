
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
object knowledgeGraph extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(jsonData: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
def /*4.2*/scripts/*4.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.13*/("""
	"""),format.raw/*5.2*/("""<link rel="stylesheet" href='"""),_display_(/*5.32*/routes/*5.38*/.Assets.at("stylesheets/vis.css")),format.raw/*5.71*/("""'>
	<style type="text/css">
	        html, body """),format.raw/*7.21*/("""{"""),format.raw/*7.22*/("""
	            """),format.raw/*8.14*/("""font: 10pt arial;
	          """),format.raw/*9.12*/("""}"""),format.raw/*9.13*/("""
	        """),format.raw/*10.10*/("""#mynetwork """),format.raw/*10.21*/("""{"""),format.raw/*10.22*/("""
	            """),format.raw/*11.14*/("""width: 600px;
	            height: 600px;
	            border: 1px solid lightgray;
	        """),format.raw/*14.10*/("""}"""),format.raw/*14.11*/("""
	        """),format.raw/*15.10*/("""#loadingBar """),format.raw/*15.22*/("""{"""),format.raw/*15.23*/("""
	            """),format.raw/*16.14*/("""position:absolute;
	            
	            width: 610px;
	            height: 610px;
	            background-color:rgba(200,200,200,0.8);
	            -webkit-transition: all 0.5s ease;
	            -moz-transition: all 0.5s ease;
	            -ms-transition: all 0.5s ease;
	            -o-transition: all 0.5s ease;
	            transition: all 0.5s ease;
	            opacity:1;
	        """),format.raw/*27.10*/("""}"""),format.raw/*27.11*/("""
	        """),format.raw/*28.10*/("""#wrapper """),format.raw/*28.19*/("""{"""),format.raw/*28.20*/("""
	            """),format.raw/*29.14*/("""position:relative;
	            width:900px;
	            height:900px;
	        """),format.raw/*32.10*/("""}"""),format.raw/*32.11*/("""
	
	        """),format.raw/*34.10*/("""#text """),format.raw/*34.16*/("""{"""),format.raw/*34.17*/("""
	            """),format.raw/*35.14*/("""position:absolute;
	            top:0px;
	            left:530px;
	            width:30px;
	            height:50px;
	            margin:auto auto auto auto;
	            font-size:22px;
	            color: #000000;
	        """),format.raw/*43.10*/("""}"""),format.raw/*43.11*/("""
	
	
	        """),format.raw/*46.10*/("""div.outerBorder """),format.raw/*46.26*/("""{"""),format.raw/*46.27*/("""
	            """),format.raw/*47.14*/("""position:relative;
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
	        """),format.raw/*63.10*/("""}"""),format.raw/*63.11*/("""
	
	        """),format.raw/*65.10*/("""#border """),format.raw/*65.18*/("""{"""),format.raw/*65.19*/("""
	            """),format.raw/*66.14*/("""position:absolute;
	            top:2px;
	            left:2px;
	            width:500px;
	            height:23px;
	            margin:auto auto auto auto;
	            box-shadow: 0px 0px 4px rgba(0,0,0,0.2);
	            border-radius:10px;
	        """),format.raw/*74.10*/("""}"""),format.raw/*74.11*/("""
	
	        """),format.raw/*76.10*/("""#bar """),format.raw/*76.15*/("""{"""),format.raw/*76.16*/("""
	            """),format.raw/*77.14*/("""position:absolute;
	            
	            width:10px;
	            height:20px;
	            margin:auto auto auto auto;
	            border-radius:11px;
	            border:2px solid rgba(30,30,30,0.05);
	            background: rgb(153, 255, 255); /* Old browsers */
	            box-shadow: 2px 2px 4px rgba(0,0,0,0.4);
	        """),format.raw/*86.10*/("""}"""),format.raw/*86.11*/("""
	
	        """),format.raw/*88.10*/("""#config """),format.raw/*88.18*/("""{"""),format.raw/*88.19*/("""            
	            
	            """),format.raw/*90.14*/("""width: 400px;
	            height: 600px;
	
	        """),format.raw/*93.10*/("""}"""),format.raw/*93.11*/("""
	        """),format.raw/*94.10*/("""#config input """),format.raw/*94.24*/("""{"""),format.raw/*94.25*/("""
	            """),format.raw/*95.14*/("""display: inline-block;
	        """),format.raw/*96.10*/("""}"""),format.raw/*96.11*/("""
	        """),format.raw/*97.10*/("""#config input.vis-configuration.vis-config-rangeinput """),format.raw/*97.64*/("""{"""),format.raw/*97.65*/("""
	            """),format.raw/*98.14*/("""height: 15px;
	        """),format.raw/*99.10*/("""}"""),format.raw/*99.11*/("""
	        """),format.raw/*100.10*/("""#config button, input, select, textarea """),format.raw/*100.50*/("""{"""),format.raw/*100.51*/("""
	            """),format.raw/*101.14*/("""line-height: 100%;
	        """),format.raw/*102.10*/("""}"""),format.raw/*102.11*/("""
	"""),format.raw/*103.2*/("""</style>
	
	<script type="text/javascript" src='"""),_display_(/*105.39*/routes/*105.45*/.Assets.at("javascripts/exampleUtil.js")),format.raw/*105.85*/("""'></script>
	<script type="text/javascript" src='"""),_display_(/*106.39*/routes/*106.45*/.Assets.at("javascripts/vis.js")),format.raw/*106.77*/("""'></script>
	<script type="text/javascript">
	
	var responseJson = null;
    var jsonString = null;
	$(document).ready(function() """),format.raw/*111.31*/("""{"""),format.raw/*111.32*/("""  
	    """),format.raw/*112.6*/("""$("#panel").hide(); 
	    $("#config").hide();
	    $("#basicConf").hide();
	    jsonString =  $('#jsonData').text();
	    draw();
	  """),format.raw/*117.4*/("""}"""),format.raw/*117.5*/(""")
	  	
	  	var p1 = "User";
		var p2 = "Dataset";
	    var p3 = "Service";
	  
	  
		var degrees = 1;// graph level setting
	    var nodes = null;
	    var edges = null;
	    var network = null;
		var allNodes;
		var allEdges;
		var highlightActive = false;
	    var nodesDataset = new vis.DataSet(nodes); 
	    var edgesDataset = new vis.DataSet(edges); 
	    var visAdvancedConfig = 1;
	    var visBasicConfig = 1;
	    
	    function getParameters() """),format.raw/*136.31*/("""{"""),format.raw/*136.32*/("""
	    	"""),format.raw/*137.7*/("""var temp1 = document.getElementById("paramCombination").value;
	    	var choice = null;
			var temp2 = temp1.split(" ");
			p1 = temp2[0];
			p2 = temp2[1];
	    	p3 = temp2[2];
	    	if(p1 == "Dataset" || p2 == "Dataset") """),format.raw/*143.46*/("""{"""),format.raw/*143.47*/("""
	    		"""),format.raw/*144.8*/("""choice = $('input[name="customizedChoiceW"]:checked').val();
	    	"""),format.raw/*145.7*/("""}"""),format.raw/*145.8*/("""
	    	
	    	"""),format.raw/*147.7*/("""var parameters = """),format.raw/*147.24*/("""{"""),format.raw/*147.25*/("""
	    			"""),format.raw/*148.9*/("""param1:p1,
	    			param2:p2,
	    			param3:p3,
	    			choice:choice
	    	"""),format.raw/*152.7*/("""}"""),format.raw/*152.8*/("""
	    	
	    	"""),format.raw/*154.7*/("""$.ajax("""),format.raw/*154.14*/("""{"""),format.raw/*154.15*/("""
	            """),format.raw/*155.14*/("""url: "/getSpecifiedKnowledgeGraph",
	            type: "POST",
	            contentType: "application/json",
	            data: JSON.stringify(parameters),
	            dataType: "text"
	        """),format.raw/*160.10*/("""}"""),format.raw/*160.11*/(""").done(function(data1) """),format.raw/*160.34*/("""{"""),format.raw/*160.35*/("""
	        	"""),format.raw/*161.11*/("""console.log("success");
	        	jsonString = data1;
	        	if(p1 == "Dataset" || p2 == "Dataset") """),format.raw/*163.50*/("""{"""),format.raw/*163.51*/("""
		    		"""),format.raw/*164.9*/("""$("#setShownName").show();
		    	"""),format.raw/*165.8*/("""}"""),format.raw/*165.9*/("""else """),format.raw/*165.14*/("""{"""),format.raw/*165.15*/("""
		    		"""),format.raw/*166.9*/("""$("#setShownName").hide();
		    	"""),format.raw/*167.8*/("""}"""),format.raw/*167.9*/("""
	        	"""),format.raw/*168.11*/("""draw();
	        """),format.raw/*169.10*/("""}"""),format.raw/*169.11*/(""").fail(function(xhr, textStatus, errorThrown) """),format.raw/*169.57*/("""{"""),format.raw/*169.58*/("""
	        	"""),format.raw/*170.11*/("""console.log("error!");
	        	console.log(xhr);
	        	console.log(textStatus);
	            console.log(errorThrown);
	        """),format.raw/*174.10*/("""}"""),format.raw/*174.11*/(""")
	        
	    """),format.raw/*176.6*/("""}"""),format.raw/*176.7*/("""
	    
	    
	    """),format.raw/*179.6*/("""function showBasicConfig() """),format.raw/*179.33*/("""{"""),format.raw/*179.34*/("""
	        """),format.raw/*180.10*/("""if (visBasicConfig == 0) """),format.raw/*180.35*/("""{"""),format.raw/*180.36*/("""
	            """),format.raw/*181.14*/("""$("#basicConf").hide();
	            visBasicConfig =1;
	        """),format.raw/*183.10*/("""}"""),format.raw/*183.11*/("""else """),format.raw/*183.16*/("""{"""),format.raw/*183.17*/("""
	            """),format.raw/*184.14*/("""$("#basicConf").show();
	            visBasicConfig =0;
	        """),format.raw/*186.10*/("""}"""),format.raw/*186.11*/("""
	    """),format.raw/*187.6*/("""}"""),format.raw/*187.7*/("""
	    
	    """),format.raw/*189.6*/("""function showAdvancedConfig() """),format.raw/*189.36*/("""{"""),format.raw/*189.37*/("""
	        """),format.raw/*190.10*/("""if (visAdvancedConfig == 0) """),format.raw/*190.38*/("""{"""),format.raw/*190.39*/("""
	            """),format.raw/*191.14*/("""$("#config").hide();
	            visAdvancedConfig =1;
	        """),format.raw/*193.10*/("""}"""),format.raw/*193.11*/("""else """),format.raw/*193.16*/("""{"""),format.raw/*193.17*/("""
	            """),format.raw/*194.14*/("""$("#config").show();
	            visAdvancedConfig =0;
	        """),format.raw/*196.10*/("""}"""),format.raw/*196.11*/("""
	    """),format.raw/*197.6*/("""}"""),format.raw/*197.7*/("""
	    
	    """),format.raw/*199.6*/("""function setGraphLevel() """),format.raw/*199.31*/("""{"""),format.raw/*199.32*/("""
	    	"""),format.raw/*200.7*/("""degrees = $("#graphLevel").val();
	    	//alert(degrees);
	    """),format.raw/*202.6*/("""}"""),format.raw/*202.7*/("""

	    """),format.raw/*204.6*/("""function draw() """),format.raw/*204.22*/("""{"""),format.raw/*204.23*/("""
	    	"""),format.raw/*205.7*/("""console.log("draw");
	      // create people.
	      // value corresponds with the age of the person
	      var test = jsonString;
	      
	      //test = JSON.stringify(test);
	      test = JSON.parse(test);
	      var nodes = test.nodes;

	      var edges = test.edges;

		  
	      nodesDataset = new vis.DataSet(nodes); 
	      edgesDataset = new vis.DataSet(edges); 
	      
	      // Instantiate our network object.
	      var container = document.getElementById('mynetwork');
	      var data = """),format.raw/*222.19*/("""{"""),format.raw/*222.20*/("""
	        """),format.raw/*223.10*/("""nodes: nodesDataset,
	        edges: edgesDataset
	      """),format.raw/*225.8*/("""}"""),format.raw/*225.9*/(""";
	      var options = """),format.raw/*226.22*/("""{"""),format.raw/*226.23*/("""
   		  """),format.raw/*227.8*/("""nodes: """),format.raw/*227.15*/("""{"""),format.raw/*227.16*/("""
   			    """),format.raw/*228.11*/("""color: """),format.raw/*228.18*/("""{"""),format.raw/*228.19*/("""
   			      """),format.raw/*229.13*/("""highlight: """),format.raw/*229.24*/("""{"""),format.raw/*229.25*/("""
   			        """),format.raw/*230.15*/("""border: "rgba(255,0,255,0.3)",
   			        background: "rgba(255,0,255,0.3)"
   			      """),format.raw/*232.13*/("""}"""),format.raw/*232.14*/("""
   			    """),format.raw/*233.11*/("""}"""),format.raw/*233.12*/(""",
   			    scaling: """),format.raw/*234.20*/("""{"""),format.raw/*234.21*/("""
   			      """),format.raw/*235.13*/("""min: 12
   			    """),format.raw/*236.11*/("""}"""),format.raw/*236.12*/(""",
   			    shadow: """),format.raw/*237.19*/("""{"""),format.raw/*237.20*/("""
   			      """),format.raw/*238.13*/("""enabled: false,
   			      size: 8
   			    """),format.raw/*240.11*/("""}"""),format.raw/*240.12*/(""",
	   			 font: """),format.raw/*241.15*/("""{"""),format.raw/*241.16*/("""
	   		      """),format.raw/*242.13*/("""color: "rgba(52,52,52,1)",
	   		      size: 10,
	   		      strokeWidth: 4
	   		    """),format.raw/*245.11*/("""}"""),format.raw/*245.12*/(""",
   			    shape: "dot",
   			    shapeProperties: """),format.raw/*247.28*/("""{"""),format.raw/*247.29*/("""
   			      """),format.raw/*248.13*/("""borderRadius: 5
   			    """),format.raw/*249.11*/("""}"""),format.raw/*249.12*/("""
   			  """),format.raw/*250.9*/("""}"""),format.raw/*250.10*/(""",
   			  edges: """),format.raw/*251.16*/("""{"""),format.raw/*251.17*/("""
   				 """),format.raw/*252.9*/("""color: 'rgba(120,120,120,1)',
   			    arrows: """),format.raw/*253.19*/("""{"""),format.raw/*253.20*/("""
   			    	
   			      """),format.raw/*255.13*/("""to: """),format.raw/*255.17*/("""{"""),format.raw/*255.18*/("""
   			        """),format.raw/*256.15*/("""enabled: false,
   			        scaleFactor: 0.4
   			      """),format.raw/*258.13*/("""}"""),format.raw/*258.14*/("""
   			    """),format.raw/*259.11*/("""}"""),format.raw/*259.12*/(""",
 			  
		      smooth: """),format.raw/*261.17*/("""{"""),format.raw/*261.18*/("""
 			      """),format.raw/*262.11*/("""type: "continuous",
 			      forceDirection: "vertical"
 			    """),format.raw/*264.9*/("""}"""),format.raw/*264.10*/("""
   			  """),format.raw/*265.9*/("""}"""),format.raw/*265.10*/(""",
   			  interaction: """),format.raw/*266.22*/("""{"""),format.raw/*266.23*/("""
   			    """),format.raw/*267.11*/("""multiselect: true
   			  """),format.raw/*268.9*/("""}"""),format.raw/*268.10*/(""",
	         groups: """),format.raw/*269.19*/("""{"""),format.raw/*269.20*/("""
	          """),format.raw/*270.12*/("""dataset: """),format.raw/*270.21*/("""{"""),format.raw/*270.22*/("""
	            """),format.raw/*271.14*/("""color:"rgba(0,0,255,0.3)"
	          """),format.raw/*272.12*/("""}"""),format.raw/*272.13*/(""",
	          user: """),format.raw/*273.18*/("""{"""),format.raw/*273.19*/("""
	        	"""),format.raw/*274.11*/("""color:"rgba(255,0,0,0.3)"
	          """),format.raw/*275.12*/("""}"""),format.raw/*275.13*/("""
	        """),format.raw/*276.10*/("""}"""),format.raw/*276.11*/(""",
	        
	        physics: """),format.raw/*278.19*/("""{"""),format.raw/*278.20*/("""    
   			  """),format.raw/*279.9*/("""hierarchicalRepulsion: """),format.raw/*279.32*/("""{"""),format.raw/*279.33*/("""
   				  """),format.raw/*280.10*/("""springConstant: 0.01,
   		      	  centralGravity: 1.75,
   		      	  nodeDistance: 120,
   		      	  
   		      """),format.raw/*284.12*/("""}"""),format.raw/*284.13*/(""",
   			 	maxVelocity: 10,
   			    minVelocity: 0.75,
   			    solver: "hierarchicalRepulsion",
	          stabilization: """),format.raw/*288.27*/("""{"""),format.raw/*288.28*/("""
	            """),format.raw/*289.14*/("""enabled:true,
	            iterations:200,
	            updateInterval:1
	          """),format.raw/*292.12*/("""}"""),format.raw/*292.13*/("""
	        """),format.raw/*293.10*/("""}"""),format.raw/*293.11*/(""",
	        configure: """),format.raw/*294.21*/("""{"""),format.raw/*294.22*/("""
	          """),format.raw/*295.12*/("""filter:function (option, path) """),format.raw/*295.43*/("""{"""),format.raw/*295.44*/("""
	            """),format.raw/*296.14*/("""if (path.indexOf('physics') !== -1 || option === 'physics') """),format.raw/*296.74*/("""{"""),format.raw/*296.75*/("""
	              """),format.raw/*297.16*/("""return true;
	            """),format.raw/*298.14*/("""}"""),format.raw/*298.15*/("""
	            """),format.raw/*299.14*/("""if (path.indexOf('smooth') !== -1 || option === 'smooth') """),format.raw/*299.72*/("""{"""),format.raw/*299.73*/("""
	              """),format.raw/*300.16*/("""return true;
	            """),format.raw/*301.14*/("""}"""),format.raw/*301.15*/("""
	            """),format.raw/*302.14*/("""if (path.indexOf('layout') !== -1 || option === 'layout') """),format.raw/*302.72*/("""{"""),format.raw/*302.73*/("""
		              """),format.raw/*303.17*/("""return true;
		            """),format.raw/*304.15*/("""}"""),format.raw/*304.16*/("""
	            """),format.raw/*305.14*/("""return false;
	          """),format.raw/*306.12*/("""}"""),format.raw/*306.13*/(""",
	          container: document.getElementById('config')
	        """),format.raw/*308.10*/("""}"""),format.raw/*308.11*/("""
	      """),format.raw/*309.8*/("""}"""),format.raw/*309.9*/(""";

	      
	      
	      $("#config").html("");

	      network = new vis.Network(container, data, options);

	      network.on("stabilizationProgress", function(params) """),format.raw/*317.61*/("""{"""),format.raw/*317.62*/("""
	                """),format.raw/*318.18*/("""var maxWidth = 496;
	                var minWidth = 20;
	                var widthFactor = params.iterations/params.total;
	                var width = Math.max(minWidth,maxWidth * widthFactor);

	                document.getElementById('bar').style.width = width + 'px';
	                document.getElementById('text').innerHTML = Math.round(widthFactor*100) + '%';
	            """),format.raw/*325.14*/("""}"""),format.raw/*325.15*/(""");
	            network.once("stabilizationIterationsDone", function() """),format.raw/*326.69*/("""{"""),format.raw/*326.70*/("""
	                """),format.raw/*327.18*/("""document.getElementById('text').innerHTML = '100%';
	                document.getElementById('bar').style.width = '496px';
	                document.getElementById('loadingBar').style.opacity = 0;
	                // really clean the dom element
	                setTimeout(function () """),format.raw/*331.41*/("""{"""),format.raw/*331.42*/("""document.getElementById('loadingBar').style.display = 'none';"""),format.raw/*331.103*/("""}"""),format.raw/*331.104*/(""", 500);
	            """),format.raw/*332.14*/("""}"""),format.raw/*332.15*/(""");

	      allNodes = nodesDataset.get("""),format.raw/*334.36*/("""{"""),format.raw/*334.37*/("""returnType:"Object""""),format.raw/*334.56*/("""}"""),format.raw/*334.57*/(""");
	      allEdges = edgesDataset.get("""),format.raw/*335.36*/("""{"""),format.raw/*335.37*/("""returnType:"Object""""),format.raw/*335.56*/("""}"""),format.raw/*335.57*/(""");
	      //console.log(allEdges);
	      network.on('select',neighbourhoodHighlight);      
	      network.on('doubleClick',selectThatNode);      
	    """),format.raw/*339.6*/("""}"""),format.raw/*339.7*/("""
	    
	    """),format.raw/*341.6*/("""function findShortestPath() """),format.raw/*341.34*/("""{"""),format.raw/*341.35*/("""
	    	"""),format.raw/*342.7*/("""var startId = $("#startPoint").val();
	    	var endId = $("#endPoint").val();
	    	//console.log(startId + endId);
	    	
	    	var ids = """),format.raw/*346.17*/("""{"""),format.raw/*346.18*/("""
	    			"""),format.raw/*347.9*/("""startId : startId,
	    			endId : endId
	    		"""),format.raw/*349.8*/("""}"""),format.raw/*349.9*/("""
	    	
	    	"""),format.raw/*351.7*/("""$.ajax("""),format.raw/*351.14*/("""{"""),format.raw/*351.15*/("""
	            """),format.raw/*352.14*/("""url: "/getShortestPath",
	            type: "POST",
	            contentType: "application/json",
	            data: JSON.stringify(ids),
	            dataType: "text"
	        """),format.raw/*357.10*/("""}"""),format.raw/*357.11*/(""").done(function(data1) """),format.raw/*357.34*/("""{"""),format.raw/*357.35*/("""
	        	"""),format.raw/*358.11*/("""console.log("success");
	        	jsonString = data1;
	        	draw();
	        """),format.raw/*361.10*/("""}"""),format.raw/*361.11*/(""").fail(function(xhr, textStatus, errorThrown) """),format.raw/*361.57*/("""{"""),format.raw/*361.58*/("""
	        	"""),format.raw/*362.11*/("""console.log("error!");
	        	console.log(xhr);
	        	console.log(textStatus);
	            console.log(errorThrown);
	        """),format.raw/*366.10*/("""}"""),format.raw/*366.11*/(""")
	    """),format.raw/*367.6*/("""}"""),format.raw/*367.7*/("""
	    
	    """),format.raw/*369.6*/("""function findKthShortestPath() """),format.raw/*369.37*/("""{"""),format.raw/*369.38*/("""
	    	"""),format.raw/*370.7*/("""var startId = $("#startPoint").val();
	    	var endId = $("#endPoint").val();
	    	var kth = $("#kth").val();
	    	//console.log(startId + endId);
	    	var k = parseInt(kth) - 1;
	    	var ids = """),format.raw/*375.17*/("""{"""),format.raw/*375.18*/("""
	    			"""),format.raw/*376.9*/("""startId : startId,
	    			endId : endId,
	    			kth : kth
	    		"""),format.raw/*379.8*/("""}"""),format.raw/*379.9*/("""
	    	
	    	"""),format.raw/*381.7*/("""$.ajax("""),format.raw/*381.14*/("""{"""),format.raw/*381.15*/("""
	            """),format.raw/*382.14*/("""url: "/getKthShortestPath",
	            type: "POST",
	            contentType: "application/json",
	            data: JSON.stringify(ids),
	            dataType: "text"
	        """),format.raw/*387.10*/("""}"""),format.raw/*387.11*/(""").done(function(data1) """),format.raw/*387.34*/("""{"""),format.raw/*387.35*/("""
	        	"""),format.raw/*388.11*/("""console.log("success");
	        	var jsonTmp = JSON.parse(data1);
	        	jsonString = JSON.stringify(jsonTmp[k]);
	        	console.log(JSON.stringify(jsonTmp[k]));
	        	draw();
	        """),format.raw/*393.10*/("""}"""),format.raw/*393.11*/(""").fail(function(xhr, textStatus, errorThrown) """),format.raw/*393.57*/("""{"""),format.raw/*393.58*/("""
	        	"""),format.raw/*394.11*/("""console.log("error!");
	        	console.log(xhr);
	        	console.log(textStatus);
	            console.log(errorThrown);
	        """),format.raw/*398.10*/("""}"""),format.raw/*398.11*/(""")
	    """),format.raw/*399.6*/("""}"""),format.raw/*399.7*/("""
	    
	    """),format.raw/*401.6*/("""function selectThatNode(params) """),format.raw/*401.38*/("""{"""),format.raw/*401.39*/("""
	    	 """),format.raw/*402.8*/("""if (params.nodes.length > 0) """),format.raw/*402.37*/("""{"""),format.raw/*402.38*/("""
	    		"""),format.raw/*403.8*/("""console.log("TTT");		
	    		
	    		var node1 = params.nodes[0];
	    		var group = allNodes[node1].group;
	    		var startTime = "";
		    	var endTime = "";
	    		
	    		var id = null;

	    		switch(group) """),format.raw/*412.22*/("""{"""),format.raw/*412.23*/("""
	    		case "service":
	    			id = allNodes[node1].serviceId;
	    			break;
	    		case "dataset":
	    			id = allNodes[node1].datasetId;
	    			break;
	    		case "user":
	    			id = allNodes[node1].userId;
	    			break;
	    		default:
	    			break;
	    		"""),format.raw/*424.8*/("""}"""),format.raw/*424.9*/("""

	    		"""),format.raw/*426.8*/("""var parameters = """),format.raw/*426.25*/("""{"""),format.raw/*426.26*/("""
		    			"""),format.raw/*427.10*/("""param1:p1,
		    			param2:p2,
		    			id:id,
		    			groupName:group,
		    			startTime:startTime,
		    			endTime:endTime
		    	"""),format.raw/*433.8*/("""}"""),format.raw/*433.9*/("""
	    		"""),format.raw/*434.8*/("""$.ajax("""),format.raw/*434.15*/("""{"""),format.raw/*434.16*/("""
		            """),format.raw/*435.15*/("""url: "/getPartKnowledgeGraph",
		            type: "POST",
		            contentType: "application/json",
		            data: JSON.stringify(parameters),
		            dataType: "text"
		        """),format.raw/*440.11*/("""}"""),format.raw/*440.12*/(""").done(function(data1) """),format.raw/*440.35*/("""{"""),format.raw/*440.36*/("""
		        	"""),format.raw/*441.12*/("""console.log("success");
		        	jsonString = data1;
		        	draw();
		        """),format.raw/*444.11*/("""}"""),format.raw/*444.12*/(""").fail(function(xhr, textStatus, errorThrown) """),format.raw/*444.58*/("""{"""),format.raw/*444.59*/("""
		        	"""),format.raw/*445.12*/("""console.log("error!");
		        	console.log(xhr);
		        	console.log(textStatus);
		            console.log(errorThrown);
		        """),format.raw/*449.11*/("""}"""),format.raw/*449.12*/(""")
	    		  
	    	 """),format.raw/*451.8*/("""}"""),format.raw/*451.9*/("""
	    	    
	      """),format.raw/*453.8*/("""}"""),format.raw/*453.9*/("""
	    
	    """),format.raw/*455.6*/("""function selectThatNodeCustomized() """),format.raw/*455.42*/("""{"""),format.raw/*455.43*/("""
	    	
	    	 """),format.raw/*457.8*/("""var group = document.getElementById("paramCombination1").value;
	    	 var id = document.getElementById("userConfId").value;
	    	 var startTime = document.getElementById("startTime").value;
	    	 var endTime = document.getElementById("endTime").value;
	    	 var choice = $('input[name="customizedChoice"]:checked').val();
	    		
	    		var parameters = """),format.raw/*463.25*/("""{"""),format.raw/*463.26*/("""
		    			"""),format.raw/*464.10*/("""param1:p1,
		    			param2:p2,
		    			id:id,
		    			groupName:group,
		    			startTime:startTime,
		    			endTime:endTime,
		    			choice:choice
		    	"""),format.raw/*471.8*/("""}"""),format.raw/*471.9*/("""
	    		"""),format.raw/*472.8*/("""$.ajax("""),format.raw/*472.15*/("""{"""),format.raw/*472.16*/("""
		            """),format.raw/*473.15*/("""url: "/getPartKnowledgeGraph",
		            type: "POST",
		            contentType: "application/json",
		            data: JSON.stringify(parameters),
		            dataType: "text"
		        """),format.raw/*478.11*/("""}"""),format.raw/*478.12*/(""").done(function(data1) """),format.raw/*478.35*/("""{"""),format.raw/*478.36*/("""
		        	"""),format.raw/*479.12*/("""console.log("success");
		        	jsonString = data1;
		        	draw();
		        """),format.raw/*482.11*/("""}"""),format.raw/*482.12*/(""").fail(function(xhr, textStatus, errorThrown) """),format.raw/*482.58*/("""{"""),format.raw/*482.59*/("""
		        	"""),format.raw/*483.12*/("""console.log("error!");
		        	console.log(xhr);
		        	console.log(textStatus);
		            console.log(errorThrown);
		        """),format.raw/*487.11*/("""}"""),format.raw/*487.12*/(""")
	    	    
	      """),format.raw/*489.8*/("""}"""),format.raw/*489.9*/("""
	    
	    """),format.raw/*491.6*/("""function schedule(selectedValue)"""),format.raw/*491.38*/("""{"""),format.raw/*491.39*/("""
	        """),format.raw/*492.10*/("""var parameter = selectedValue.split(" ");
	        if(parameter[0] === "Dataset" || parameter[1] == "Dataset") """),format.raw/*493.70*/("""{"""),format.raw/*493.71*/("""
	        	"""),format.raw/*494.11*/("""$("#setWholeShownName").show();
	        """),format.raw/*495.10*/("""}"""),format.raw/*495.11*/("""else """),format.raw/*495.16*/("""{"""),format.raw/*495.17*/("""
	        	"""),format.raw/*496.11*/("""$("#setWholeShownName").hide();
	        """),format.raw/*497.10*/("""}"""),format.raw/*497.11*/("""
	    """),format.raw/*498.6*/("""}"""),format.raw/*498.7*/("""
	    
	    """),format.raw/*500.6*/("""function neighbourhoodHighlight(params) """),format.raw/*500.46*/("""{"""),format.raw/*500.47*/("""
    	     """),format.raw/*501.11*/("""// if something is selected:
    	    if (params.nodes.length > 0) """),format.raw/*502.39*/("""{"""),format.raw/*502.40*/("""
    	      """),format.raw/*503.12*/("""highlightActive = true;
    	      var i,j;
    	      var selectedNode = params.nodes[0];
    	      //console.log(selectedNode);
    	      
    	      // mark all nodes as hard to read.
    	      for (var nodeId in allNodes) """),format.raw/*509.41*/("""{"""),format.raw/*509.42*/("""
    	        """),format.raw/*510.14*/("""allNodes[nodeId].color = 'rgba(192,192,192,0.3)';
    	        if (allNodes[nodeId].hiddenLabel == undefined) """),format.raw/*511.61*/("""{"""),format.raw/*511.62*/("""
    	          """),format.raw/*512.16*/("""allNodes[nodeId].hiddenLabel = allNodes[nodeId].label;
    	          allNodes[nodeId].label = undefined;
    	        """),format.raw/*514.14*/("""}"""),format.raw/*514.15*/("""
    	      """),format.raw/*515.12*/("""}"""),format.raw/*515.13*/("""
    	      
    	      """),format.raw/*517.12*/("""for (var edgeId in allEdges) """),format.raw/*517.41*/("""{"""),format.raw/*517.42*/("""
    	    	  """),format.raw/*518.13*/("""allEdges[edgeId].color = 'rgba(192,192,192,0.3)';
      	        if (allEdges[edgeId].hiddenLabel == undefined) """),format.raw/*519.63*/("""{"""),format.raw/*519.64*/("""
      	        	"""),format.raw/*520.17*/("""allEdges[edgeId].hiddenLabel = allEdges[edgeId].label;
      	        	allEdges[edgeId].label = undefined;
      	        """),format.raw/*522.16*/("""}"""),format.raw/*522.17*/("""
      	      """),format.raw/*523.14*/("""}"""),format.raw/*523.15*/("""
      	      
    	      
    	      """),format.raw/*526.12*/("""allNodes[selectedNode].label = allNodes[selectedNode].hiddenLabel;
    	      
    	      var connectedNodes = network.getConnectedNodes(selectedNode);
    	      var allConnectedNodes = [];

    	      // get the second degree nodes
    	      for (i = 1; i < degrees; i++) """),format.raw/*532.42*/("""{"""),format.raw/*532.43*/("""
    	        """),format.raw/*533.14*/("""for (j = 0; j < connectedNodes.length; j++) """),format.raw/*533.58*/("""{"""),format.raw/*533.59*/("""
    	          """),format.raw/*534.16*/("""allConnectedNodes = allConnectedNodes.concat(network.getConnectedNodes(connectedNodes[j]));
    	        """),format.raw/*535.14*/("""}"""),format.raw/*535.15*/("""
    	      """),format.raw/*536.12*/("""}"""),format.raw/*536.13*/("""

    	      """),format.raw/*538.12*/("""// all second degree nodes get a different color and their label back
    	      for (i = 0; i < allConnectedNodes.length; i++) """),format.raw/*539.59*/("""{"""),format.raw/*539.60*/("""
    	        """),format.raw/*540.14*/("""allNodes[allConnectedNodes[i]].color = 'rgba(0,255,0,0.9)';
    	        if (allNodes[allConnectedNodes[i]].hiddenLabel !== undefined) """),format.raw/*541.76*/("""{"""),format.raw/*541.77*/("""
    	          """),format.raw/*542.16*/("""allNodes[allConnectedNodes[i]].label = allNodes[allConnectedNodes[i]].hiddenLabel;
    	          allNodes[allConnectedNodes[i]].hiddenLabel = undefined;
    	        """),format.raw/*544.14*/("""}"""),format.raw/*544.15*/("""
    	      """),format.raw/*545.12*/("""}"""),format.raw/*545.13*/("""

    	      """),format.raw/*547.12*/("""// all first degree nodes get their own color and their label back
    	      for (i = 0; i < connectedNodes.length; i++) """),format.raw/*548.56*/("""{"""),format.raw/*548.57*/("""
    	        """),format.raw/*549.14*/("""allNodes[connectedNodes[i]].color = 'rgba(255,255,0,0.9)';
    	        if (allNodes[connectedNodes[i]].hiddenLabel !== undefined) """),format.raw/*550.73*/("""{"""),format.raw/*550.74*/("""
    	          """),format.raw/*551.16*/("""allNodes[connectedNodes[i]].label = allNodes[connectedNodes[i]].hiddenLabel;
    	          allNodes[connectedNodes[i]].hiddenLabel = undefined;
    	        """),format.raw/*553.14*/("""}"""),format.raw/*553.15*/("""
    	      """),format.raw/*554.12*/("""}"""),format.raw/*554.13*/("""

    	      """),format.raw/*556.12*/("""var curNode = allNodes[selectedNode];
    	      var group = curNode.group;
	    		var id = null;
	    		switch(group) """),format.raw/*559.22*/("""{"""),format.raw/*559.23*/("""
	    		case "service":
	    			id = curNode.serviceId;
	    			$("#description").text("Service ");
	    			break;
	    		case "dataset":
	    			id = curNode.datasetId;
	    			$("#description").text("Dataset ");
	    			break;
	    		case "user":
	    			id = curNode.userId;
	    			$("#description").text("User");
	    			break;
	    		default:
	    			break;
	    		"""),format.raw/*574.8*/("""}"""),format.raw/*574.9*/("""  
    	      		  	      
	    	  """),format.raw/*576.9*/("""$("#groupId").text(group.charAt(0).toUpperCase()+group.substring(1) + " Id:" );
	  	      $("#nodeName").text(curNode.title);
	  	      $("#id").text(id);
		  	  $("#nodeId").text(curNode.id);
	  	      $("#cluster").text(curNode.cluster);
	  	      $("#label").text(curNode.label);
  	          $("#panel").show();
  	          
    	      // the main node gets its own color and its label back.
    	      
    	      
    	      allNodes[selectedNode].color = 'rgba(255,0,255,0.9)'
    	      if (allNodes[selectedNode].hiddenLabel !== undefined) """),format.raw/*588.66*/("""{"""),format.raw/*588.67*/("""
    	        """),format.raw/*589.14*/("""allNodes[selectedNode].label = allNodes[selectedNode].hiddenLabel;
    	        allNodes[selectedNode].hiddenLabel = undefined;
    	      """),format.raw/*591.12*/("""}"""),format.raw/*591.13*/("""
    	     
    	    """),format.raw/*593.10*/("""}"""),format.raw/*593.11*/("""    """),format.raw/*593.15*/("""else if (highlightActive === true) """),format.raw/*593.50*/("""{"""),format.raw/*593.51*/("""
    	      """),format.raw/*594.12*/("""// reset all nodes
    	       
    	      for (var nodeId in allNodes) """),format.raw/*596.41*/("""{"""),format.raw/*596.42*/("""
    	        """),format.raw/*597.14*/("""allNodes[nodeId].color = undefined;
    	       
    	        if (allNodes[nodeId].hiddenLabel !== undefined) """),format.raw/*599.62*/("""{"""),format.raw/*599.63*/("""
    	          """),format.raw/*600.16*/("""allNodes[nodeId].label = allNodes[nodeId].hiddenLabel;
    	          allNodes[nodeId].hiddenLabel = undefined;
    	        """),format.raw/*602.14*/("""}"""),format.raw/*602.15*/("""
    	      """),format.raw/*603.12*/("""}"""),format.raw/*603.13*/("""
    	      
    	      """),format.raw/*605.12*/("""for (var edgeId in allEdges) """),format.raw/*605.41*/("""{"""),format.raw/*605.42*/("""
    	    	  """),format.raw/*606.13*/("""allEdges[edgeId].color = undefined;
    	    	  
      	        
      	        	console.log(allEdges[edgeId].color);
      	        	allEdges[edgeId].label = allEdges[edgeId].hiddenLabel;
      	        	allEdges[edgeId].hiddenLabel = undefined;
      	        
      	      """),format.raw/*613.14*/("""}"""),format.raw/*613.15*/("""
    	      """),format.raw/*614.12*/("""highlightActive = false;
    	    """),format.raw/*615.10*/("""}"""),format.raw/*615.11*/(""" 	  	  

    	      
    	    """),format.raw/*618.10*/("""// transform the object into an array
    	    var updateArray = [];
    	    for (nodeId in allNodes) """),format.raw/*620.35*/("""{"""),format.raw/*620.36*/("""
    	      """),format.raw/*621.12*/("""if (allNodes.hasOwnProperty(nodeId)) """),format.raw/*621.49*/("""{"""),format.raw/*621.50*/("""
    	        """),format.raw/*622.14*/("""updateArray.push(allNodes[nodeId]);
    	      """),format.raw/*623.12*/("""}"""),format.raw/*623.13*/("""
    	    """),format.raw/*624.10*/("""}"""),format.raw/*624.11*/("""   	  
    	        	    
    	    """),format.raw/*626.10*/("""nodesDataset.update(updateArray);
    	    
    	    
    	    updateArray = [];
    	    for (edgeId in allEdges) """),format.raw/*630.35*/("""{"""),format.raw/*630.36*/("""
    	      """),format.raw/*631.12*/("""if (allEdges.hasOwnProperty(edgeId)) """),format.raw/*631.49*/("""{"""),format.raw/*631.50*/("""
    	        """),format.raw/*632.14*/("""updateArray.push(allEdges[edgeId]);
    	      """),format.raw/*633.12*/("""}"""),format.raw/*633.13*/("""
    	    """),format.raw/*634.10*/("""}"""),format.raw/*634.11*/("""
    	    
    	    """),format.raw/*636.10*/("""edgesDataset.update(updateArray);  
    	  """),format.raw/*637.8*/("""}"""),format.raw/*637.9*/("""
	    
	      
	    
	    
	  """),format.raw/*642.4*/("""//  draw();
	    
	    
	</script>
	<script type="text/javascript" src='"""),_display_(/*646.39*/routes/*646.45*/.Assets.at("javascripts/googleAnalytics.js")),format.raw/*646.89*/("""'></script>
""")))};
Seq[Any](format.raw/*1.20*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*647.2*/("""

"""),_display_(/*649.2*/main("Knowledge Graph", scripts)/*649.34*/{_display_(Seq[Any](format.raw/*649.35*/("""
	"""),format.raw/*650.2*/("""<div id="jsonData" style="display: none;">"""),_display_(/*650.45*/jsonData),format.raw/*650.53*/("""</div>
	<div id="knowledgeGraph">
	
	   <div id="loadingBar" class="col-lg-3">
	    <div class="outerBorder" >
	        <div id="text">0%</div>
	        <div id="border">
	            <div id="bar"></div>
	        </div>
	    </div>	    
	   </div>
	   
	  <div id="mynetwork" class="col-lg-3"></div>
	  <div class = "col-lg-offset-7">
	        <button type="button" onclick="showBasicConfig()" class="btn btn-default  "><span class="glyphicon glyphicon-cog" aria-hidden="true">
	        </span> Show Basic Settings </button>
	        <button type="button" onclick="showAdvancedConfig()" class="btn btn-default  "><span class="glyphicon glyphicon-wrench" aria-hidden="true">
	        </span> Show Advanced Settings </button>
	  </div>
	  
	  <div id="basicConf" class="col-lg-offset-7">
	  	<br>
  			<div class="col-lg-8">
  				<label>Graph Level</label>		     
			    <div class="input-group col-lg-5">	
			    <input type="number" class="form-control" placeholder="1~2" id = "graphLevel">
			      <span class="input-group-btn">
			        <button class="btn btn-default" type="button" onclick="setGraphLevel()">Go!</button>
			      </span>
			    </div>
			    <div class="input-group col-lg-6">
					<label>Actions</label>		     
					<button type="button" onclick="selectThatNode()" class="btn btn-default  "><span class="glyphicon glyphicon-star" aria-hidden="true">
			        </span> Clear All Node </button>
	        	</div>
	        	<br>
	        	<div class="input-group">
				  <span class="input-group-addon" id="basic-addon1">Start Point</span>
				  <input type="text" class="form-control" placeholder="Type in Node Id" aria-describedby="basic-addon1" id="startPoint">
			    </div>
			    <br>
			    <div class="input-group">
				  <span class="input-group-addon" id="basic-addon2">End Point</span>
				  <input type="text" class="form-control" placeholder="Type in Node Id" aria-describedby="basic-addon2" id="endPoint">
				</div>
				<br>
				<div class="input-group">
				  <span class="input-group-addon" id="basic-addon3">Kth</span>
				  <input type="number" class="form-control" placeholder="kth" aria-describedby="basic-addon3" id="kth">
				</div>
				<br>
				<div class="text-center">
                    <button type="button" class="btn btn-primary" onclick="findShortestPath()">Shortest Path</button>
                </div>
                <br>	
                <div class="text-center">
                    <button type="button" class="btn btn-primary" onclick="findKthShortestPath()">Kth Shortest Path</button>
                </div>
				<br>
			    <div class="col-lg-offset-0">
				    <form>
					    <label>Rational Graph</label>
			                <div class="form-group">
			                    <select onchange="schedule(this.value)" class="form-control" id="paramCombination">
			                    	<option value="User Dataset Service">User × Dataset | Service</option>
			                        <option value="User Service Dataset">User × Service | Dataset</option>
			                        <option value="Dataset Service User">Dataset × Service | User</option>
			                        <option value="User User Dataset">User × User | Dataset</option>
			                        <option value="User User Service">User × User | Service</option>
			                        <option value="Dataset Dataset User">Dataset × Dataset | User</option>
			                        <option value="Dataset Dataset Service">Dataset × Dataset | Service</option>
			                        <option value="Service Service User">Service × Service | User</option>
			                        <option value="Service Service Dataset">Service × Service | Dataset</option>
			                    </select>
			                </div>
			                <div id = "setWholeShownName" class="row col-sm-offset-0 col-md-offset-0 col-lg-offset-0">
				                <div>
	             					<input type="radio" id="datasetNameW" name="customizedChoiceW" checked="checked" value="datasetNameW" /> Dataset Name
	                                &nbsp;
	             					<input type="radio" id="variableNameW" name="customizedChoiceW" value="variableNameW" /> Variable Name
	             				
	             				</div>
	             				<br>
             				</div>
			                <div class="text-center">
			                    <button type="button" class="btn btn-primary" onclick="Javascript:getParameters()">Finish</button>
			                </div>
	            	</form>
	            	<br>
	            	<br>
				</div>				
					    
			</div>
			
				
	  </div>  
  		
	  <div id="config" class="row col-lg-offset-7"></div>  
	</div>
	

	
	<div class = "row">
		<br>
		<div id="panel" class="col-lg-offset-7">  
		  <div class="well col-lg-5">
		    <div class="text-center">
		      <img class="card-img-top" style=" width:60%;" src="/assets/images/data.png">
		    </div>
		    <div class="card-block text-center">
		      <h4 class="card-title" id="nodeName">card</h4>
		      <p class="card-text text-muted" ><code id="description"></code></p>
		    </div>
		    <ul class="list-group list-group-flush">
		      <li class="list-group-item"><strong id="groupId"></strong><code id="id"></code></li>
		      <li class="list-group-item"><strong>Node Id:</strong><code id="nodeId"></code></li>
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
	<br>

	<div id="userConfig" class="col-lg-8">
	<form>
   		<label>Customized ID</label>
   			<div class="row">
   			<div class="col-sm-4 col-md-2">
	             <div class="form-group">
	                 <select class="form-control" id="paramCombination1">
	                     <option value="user">User</option>
	                     <option value="service">Service</option>
	                     <option value="dataset">Dataset</option>
	                 </select>
	             </div>
             </div>
             <div class="col-sm-4 col-md-4">
             	<input type="text" class="form-control col-lg-4" id="userConfId" placeholder="User/Dataset/Service Id">
             </div>
             </div>
             <div class="row">
             <div class="col-sm-4 col-md-4">
                <label>Start Time</label>
             	<input type="text" class="form-control col-lg-4" id="startTime" placeholder="MM/DD/YYYY hh:mm">
             </div>
             <div class="col-sm-4 col-md-4">
                <label>End Time</label>
             	<input type="text" class="form-control col-lg-4" id="endTime" placeholder="MM/DD/YYYY hh:mm">
             </div>
             </div>
             <br>
             <div class="row">
                <div id = "setShownName" class="col-sm-4 col-md-4">
             		<input type="radio" id="datasetNameC" name="customizedChoice" checked="checked" value="datasetName" /> Dataset Name
             		&nbsp;
             		<input type="radio" id="variableNameC" name="customizedChoice" value="variableName" /> Variable Name
             	</div>
	             <div class="col-sm-4 col-md-4">
	                 <button type="button" class="btn btn-primary col-lg-3" onclick="Javascript:selectThatNodeCustomized()">Show</button>
	             </div>
             </div>
       	</form>
	</div>
  
""")))}),format.raw/*819.2*/("""
"""))}
  }

  def render(jsonData:String): play.twirl.api.HtmlFormat.Appendable = apply(jsonData)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (jsonData) => apply(jsonData)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Dec 10 17:28:47 PST 2015
                  SOURCE: /Users/weiwang/climate-service/app/views/knowledgeGraph.scala.html
                  HASH: 3aa472336c0150ea72c6affd986230e87286547b
                  MATRIX: 732->1|836->39|850->46|930->50|958->52|1014->82|1028->88|1081->121|1156->169|1184->170|1225->184|1281->213|1309->214|1347->224|1386->235|1415->236|1457->250|1578->343|1607->344|1645->354|1685->366|1714->367|1756->381|2178->775|2207->776|2245->786|2282->795|2311->796|2353->810|2462->891|2491->892|2531->904|2565->910|2594->911|2636->925|2889->1150|2918->1151|2960->1165|3004->1181|3033->1182|3075->1196|4350->2443|4379->2444|4419->2456|4455->2464|4484->2465|4526->2479|4807->2732|4836->2733|4876->2745|4909->2750|4938->2751|4980->2765|5344->3101|5373->3102|5413->3114|5449->3122|5478->3123|5546->3163|5627->3216|5656->3217|5694->3227|5736->3241|5765->3242|5807->3256|5867->3288|5896->3289|5934->3299|6016->3353|6045->3354|6087->3368|6138->3391|6167->3392|6206->3402|6275->3442|6305->3443|6348->3457|6405->3485|6435->3486|6465->3488|6542->3537|6558->3543|6620->3583|6698->3633|6714->3639|6768->3671|6927->3801|6957->3802|6993->3810|7155->3944|7184->3945|7666->4398|7696->4399|7731->4406|7983->4629|8013->4630|8049->4638|8144->4705|8173->4706|8215->4720|8261->4737|8291->4738|8328->4747|8433->4824|8462->4825|8504->4839|8540->4846|8570->4847|8613->4861|8837->5056|8867->5057|8919->5080|8949->5081|8989->5092|9121->5195|9151->5196|9188->5205|9250->5239|9279->5240|9313->5245|9343->5246|9380->5255|9442->5289|9471->5290|9511->5301|9557->5318|9587->5319|9662->5365|9692->5366|9732->5377|9895->5511|9925->5512|9970->5529|9999->5530|10045->5548|10101->5575|10131->5576|10170->5586|10224->5611|10254->5612|10297->5626|10391->5691|10421->5692|10455->5697|10485->5698|10528->5712|10622->5777|10652->5778|10686->5784|10715->5785|10755->5797|10814->5827|10844->5828|10883->5838|10940->5866|10970->5867|11013->5881|11107->5946|11137->5947|11171->5952|11201->5953|11244->5967|11338->6032|11368->6033|11402->6039|11431->6040|11471->6052|11525->6077|11555->6078|11590->6085|11681->6148|11710->6149|11745->6156|11790->6172|11820->6173|11855->6180|12385->6681|12415->6682|12454->6692|12539->6749|12568->6750|12620->6773|12650->6774|12686->6782|12722->6789|12752->6790|12792->6801|12828->6808|12858->6809|12900->6822|12940->6833|12970->6834|13014->6849|13134->6940|13164->6941|13204->6952|13234->6953|13284->6974|13314->6975|13356->6988|13403->7006|13433->7007|13482->7027|13512->7028|13554->7041|13629->7087|13659->7088|13704->7104|13734->7105|13776->7118|13891->7204|13921->7205|14003->7258|14033->7259|14075->7272|14130->7298|14160->7299|14197->7308|14227->7309|14273->7326|14303->7327|14340->7336|14417->7384|14447->7385|14501->7410|14534->7414|14564->7415|14608->7430|14696->7489|14726->7490|14766->7501|14796->7502|14850->7527|14880->7528|14920->7539|15013->7604|15043->7605|15080->7614|15110->7615|15162->7638|15192->7639|15232->7650|15286->7676|15316->7677|15365->7697|15395->7698|15436->7710|15474->7719|15504->7720|15547->7734|15613->7771|15643->7772|15691->7791|15721->7792|15761->7803|15827->7840|15857->7841|15896->7851|15926->7852|15985->7882|16015->7883|16056->7896|16108->7919|16138->7920|16177->7930|16323->8047|16353->8048|16507->8173|16537->8174|16580->8188|16693->8272|16723->8273|16762->8283|16792->8284|16843->8306|16873->8307|16914->8319|16974->8350|17004->8351|17047->8365|17136->8425|17166->8426|17211->8442|17266->8468|17296->8469|17339->8483|17426->8541|17456->8542|17501->8558|17556->8584|17586->8585|17629->8599|17716->8657|17746->8658|17792->8675|17848->8702|17878->8703|17921->8717|17975->8742|18005->8743|18101->8810|18131->8811|18167->8819|18196->8820|18396->8991|18426->8992|18473->9010|18883->9391|18913->9392|19013->9463|19043->9464|19090->9482|19405->9768|19435->9769|19526->9830|19557->9831|19607->9852|19637->9853|19705->9892|19735->9893|19783->9912|19813->9913|19880->9951|19910->9952|19958->9971|19988->9972|20169->10125|20198->10126|20238->10138|20295->10166|20325->10167|20360->10174|20528->10313|20558->10314|20595->10323|20671->10371|20700->10372|20742->10386|20778->10393|20808->10394|20851->10408|21057->10585|21087->10586|21139->10609|21169->10610|21209->10621|21319->10702|21349->10703|21424->10749|21454->10750|21494->10761|21657->10895|21687->10896|21722->10903|21751->10904|21791->10916|21851->10947|21881->10948|21916->10955|22143->11153|22173->11154|22210->11163|22305->11230|22334->11231|22376->11245|22412->11252|22442->11253|22485->11267|22694->11447|22724->11448|22776->11471|22806->11472|22846->11483|23071->11679|23101->11680|23176->11726|23206->11727|23246->11738|23409->11872|23439->11873|23474->11880|23503->11881|23543->11893|23604->11925|23634->11926|23670->11934|23728->11963|23758->11964|23794->11972|24035->12184|24065->12185|24360->12452|24389->12453|24426->12462|24472->12479|24502->12480|24541->12490|24704->12625|24733->12626|24769->12634|24805->12641|24835->12642|24879->12657|25103->12852|25133->12853|25185->12876|25215->12877|25256->12889|25369->12973|25399->12974|25474->13020|25504->13021|25545->13033|25712->13171|25742->13172|25789->13191|25818->13192|25865->13211|25894->13212|25934->13224|25999->13260|26029->13261|26072->13276|26459->13634|26489->13635|26528->13645|26715->13804|26744->13805|26780->13813|26816->13820|26846->13821|26890->13836|27114->14031|27144->14032|27196->14055|27226->14056|27267->14068|27380->14152|27410->14153|27485->14199|27515->14200|27556->14212|27723->14350|27753->14351|27801->14371|27830->14372|27870->14384|27931->14416|27961->14417|28000->14427|28140->14538|28170->14539|28210->14550|28280->14591|28310->14592|28344->14597|28374->14598|28414->14609|28484->14650|28514->14651|28548->14657|28577->14658|28617->14670|28686->14710|28716->14711|28756->14722|28852->14789|28882->14790|28923->14802|29181->15031|29211->15032|29254->15046|29393->15156|29423->15157|29468->15173|29616->15292|29646->15293|29687->15305|29717->15306|29770->15330|29828->15359|29858->15360|29900->15373|30041->15485|30071->15486|30117->15503|30268->15625|30298->15626|30341->15640|30371->15641|30438->15679|30742->15954|30772->15955|30815->15969|30888->16013|30918->16014|30963->16030|31097->16135|31127->16136|31168->16148|31198->16149|31240->16162|31397->16290|31427->16291|31470->16305|31634->16440|31664->16441|31709->16457|31905->16624|31935->16625|31976->16637|32006->16638|32048->16651|32199->16773|32229->16774|32272->16788|32432->16919|32462->16920|32507->16936|32694->17094|32724->17095|32765->17107|32795->17108|32837->17121|32985->17240|33015->17241|33414->17612|33443->17613|33505->17647|34084->18197|34114->18198|34157->18212|34325->18351|34355->18352|34405->18373|34435->18374|34468->18378|34532->18413|34562->18414|34603->18426|34704->18498|34734->18499|34777->18513|34916->18623|34946->18624|34991->18640|35145->18765|35175->18766|35216->18778|35246->18779|35299->18803|35357->18832|35387->18833|35429->18846|35734->19122|35764->19123|35805->19135|35868->19169|35898->19170|35957->19200|36089->19303|36119->19304|36160->19316|36226->19353|36256->19354|36299->19368|36375->19415|36405->19416|36444->19426|36474->19427|36538->19462|36682->19577|36712->19578|36753->19590|36819->19627|36849->19628|36892->19642|36968->19689|36998->19690|37037->19700|37067->19701|37116->19721|37187->19764|37216->19765|37274->19795|37375->19868|37391->19874|37457->19918|37509->19|37536->37|37565->19931|37595->19934|37637->19966|37677->19967|37707->19969|37778->20012|37808->20020|45431->27612
                  LINES: 26->1|28->4|28->4|30->4|31->5|31->5|31->5|31->5|33->7|33->7|34->8|35->9|35->9|36->10|36->10|36->10|37->11|40->14|40->14|41->15|41->15|41->15|42->16|53->27|53->27|54->28|54->28|54->28|55->29|58->32|58->32|60->34|60->34|60->34|61->35|69->43|69->43|72->46|72->46|72->46|73->47|89->63|89->63|91->65|91->65|91->65|92->66|100->74|100->74|102->76|102->76|102->76|103->77|112->86|112->86|114->88|114->88|114->88|116->90|119->93|119->93|120->94|120->94|120->94|121->95|122->96|122->96|123->97|123->97|123->97|124->98|125->99|125->99|126->100|126->100|126->100|127->101|128->102|128->102|129->103|131->105|131->105|131->105|132->106|132->106|132->106|137->111|137->111|138->112|143->117|143->117|162->136|162->136|163->137|169->143|169->143|170->144|171->145|171->145|173->147|173->147|173->147|174->148|178->152|178->152|180->154|180->154|180->154|181->155|186->160|186->160|186->160|186->160|187->161|189->163|189->163|190->164|191->165|191->165|191->165|191->165|192->166|193->167|193->167|194->168|195->169|195->169|195->169|195->169|196->170|200->174|200->174|202->176|202->176|205->179|205->179|205->179|206->180|206->180|206->180|207->181|209->183|209->183|209->183|209->183|210->184|212->186|212->186|213->187|213->187|215->189|215->189|215->189|216->190|216->190|216->190|217->191|219->193|219->193|219->193|219->193|220->194|222->196|222->196|223->197|223->197|225->199|225->199|225->199|226->200|228->202|228->202|230->204|230->204|230->204|231->205|248->222|248->222|249->223|251->225|251->225|252->226|252->226|253->227|253->227|253->227|254->228|254->228|254->228|255->229|255->229|255->229|256->230|258->232|258->232|259->233|259->233|260->234|260->234|261->235|262->236|262->236|263->237|263->237|264->238|266->240|266->240|267->241|267->241|268->242|271->245|271->245|273->247|273->247|274->248|275->249|275->249|276->250|276->250|277->251|277->251|278->252|279->253|279->253|281->255|281->255|281->255|282->256|284->258|284->258|285->259|285->259|287->261|287->261|288->262|290->264|290->264|291->265|291->265|292->266|292->266|293->267|294->268|294->268|295->269|295->269|296->270|296->270|296->270|297->271|298->272|298->272|299->273|299->273|300->274|301->275|301->275|302->276|302->276|304->278|304->278|305->279|305->279|305->279|306->280|310->284|310->284|314->288|314->288|315->289|318->292|318->292|319->293|319->293|320->294|320->294|321->295|321->295|321->295|322->296|322->296|322->296|323->297|324->298|324->298|325->299|325->299|325->299|326->300|327->301|327->301|328->302|328->302|328->302|329->303|330->304|330->304|331->305|332->306|332->306|334->308|334->308|335->309|335->309|343->317|343->317|344->318|351->325|351->325|352->326|352->326|353->327|357->331|357->331|357->331|357->331|358->332|358->332|360->334|360->334|360->334|360->334|361->335|361->335|361->335|361->335|365->339|365->339|367->341|367->341|367->341|368->342|372->346|372->346|373->347|375->349|375->349|377->351|377->351|377->351|378->352|383->357|383->357|383->357|383->357|384->358|387->361|387->361|387->361|387->361|388->362|392->366|392->366|393->367|393->367|395->369|395->369|395->369|396->370|401->375|401->375|402->376|405->379|405->379|407->381|407->381|407->381|408->382|413->387|413->387|413->387|413->387|414->388|419->393|419->393|419->393|419->393|420->394|424->398|424->398|425->399|425->399|427->401|427->401|427->401|428->402|428->402|428->402|429->403|438->412|438->412|450->424|450->424|452->426|452->426|452->426|453->427|459->433|459->433|460->434|460->434|460->434|461->435|466->440|466->440|466->440|466->440|467->441|470->444|470->444|470->444|470->444|471->445|475->449|475->449|477->451|477->451|479->453|479->453|481->455|481->455|481->455|483->457|489->463|489->463|490->464|497->471|497->471|498->472|498->472|498->472|499->473|504->478|504->478|504->478|504->478|505->479|508->482|508->482|508->482|508->482|509->483|513->487|513->487|515->489|515->489|517->491|517->491|517->491|518->492|519->493|519->493|520->494|521->495|521->495|521->495|521->495|522->496|523->497|523->497|524->498|524->498|526->500|526->500|526->500|527->501|528->502|528->502|529->503|535->509|535->509|536->510|537->511|537->511|538->512|540->514|540->514|541->515|541->515|543->517|543->517|543->517|544->518|545->519|545->519|546->520|548->522|548->522|549->523|549->523|552->526|558->532|558->532|559->533|559->533|559->533|560->534|561->535|561->535|562->536|562->536|564->538|565->539|565->539|566->540|567->541|567->541|568->542|570->544|570->544|571->545|571->545|573->547|574->548|574->548|575->549|576->550|576->550|577->551|579->553|579->553|580->554|580->554|582->556|585->559|585->559|600->574|600->574|602->576|614->588|614->588|615->589|617->591|617->591|619->593|619->593|619->593|619->593|619->593|620->594|622->596|622->596|623->597|625->599|625->599|626->600|628->602|628->602|629->603|629->603|631->605|631->605|631->605|632->606|639->613|639->613|640->614|641->615|641->615|644->618|646->620|646->620|647->621|647->621|647->621|648->622|649->623|649->623|650->624|650->624|652->626|656->630|656->630|657->631|657->631|657->631|658->632|659->633|659->633|660->634|660->634|662->636|663->637|663->637|668->642|672->646|672->646|672->646|674->1|675->3|676->647|678->649|678->649|678->649|679->650|679->650|679->650|848->819
                  -- GENERATED --
              */
          