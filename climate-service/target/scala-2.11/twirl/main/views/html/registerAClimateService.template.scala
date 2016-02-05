
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
object registerAClimateService extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[models.ClimateService],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(climateServiceForm: play.data.Form[models.ClimateService]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
def /*3.2*/scripts/*3.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""

"""),format.raw/*5.1*/("""<script type="text/javascript">	
	$(document).ready(function()"""),format.raw/*6.30*/("""{"""),format.raw/*6.31*/("""
		"""),format.raw/*7.3*/("""$("#msg").hide();
		$("#dependencyDetailForm").hide();
		$("#cacheForm").hide();
	"""),format.raw/*10.2*/("""}"""),format.raw/*10.3*/(""");
		
	</script>
""")))};
Seq[Any](format.raw/*1.61*/("""
"""),format.raw/*13.2*/(""" 
"""),_display_(/*14.2*/main("Register A New Climate Service", scripts)/*14.49*/ {_display_(Seq[Any](format.raw/*14.51*/("""
"""),format.raw/*15.1*/("""<script type="text/javascript">
console.log("register started");
$(window).load(function()"""),format.raw/*17.26*/("""{"""),format.raw/*17.27*/("""
    """),format.raw/*18.5*/("""var fixHelperModified = function(e, tr) """),format.raw/*18.45*/("""{"""),format.raw/*18.46*/("""
        """),format.raw/*19.9*/("""var $originals = tr.children();
        var $helper = tr.clone();
        $helper.children().each(function(index) """),format.raw/*21.49*/("""{"""),format.raw/*21.50*/("""
            """),format.raw/*22.13*/("""$(this).width($originals.eq(index).width())
        """),format.raw/*23.9*/("""}"""),format.raw/*23.10*/(""");
        return $helper;
    """),format.raw/*25.5*/("""}"""),format.raw/*25.6*/(""",
        updateIndex = function(e, ui) """),format.raw/*26.39*/("""{"""),format.raw/*26.40*/("""
            """),format.raw/*27.13*/("""$('td.index', ui.item.parent()).each(function (i) """),format.raw/*27.63*/("""{"""),format.raw/*27.64*/("""
                """),format.raw/*28.17*/("""$(this).html(i + 1);
            """),format.raw/*29.13*/("""}"""),format.raw/*29.14*/(""");
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/(""";

    $("#parameterPreview tbody").sortable("""),format.raw/*32.43*/("""{"""),format.raw/*32.44*/("""
        """),format.raw/*33.9*/("""helper: fixHelperModified,
        stop: updateIndex
    """),format.raw/*35.5*/("""}"""),format.raw/*35.6*/(""").disableSelection();
"""),format.raw/*36.1*/("""}"""),format.raw/*36.2*/(""");
</script>
<h2 class="text-center">Register a New Climate Service</h2>
<br>

<div class="container col-md-6">
    

    
    """),_display_(/*45.6*/form(routes.ClimateServiceController.addClimateService())/*45.63*/ {_display_(Seq[Any](format.raw/*45.65*/("""
    """),format.raw/*46.5*/("""<div class="well">
    	<h4>Step 1 : Add Climate Service Metadata</h3>
    	<br>
        <div class="form-group">
            <label>Name<font color="red"> *</font></label>
            <input type="text" class="form-control" id="name" name="name" placeholder="2-D-Variable-Map">
        </div>
        <div class="form-group">
            <label>Purpose<font color="red"> *</font></label>
            <input type="text" class="form-control" id="purpose" name="purpose" placeholder="climate service description">
        </div>
        <div class="form-group">
            <label>Web Service API<font color="red"> *</font></label>
            <input type="text" class="form-control" id="url" name="url" placeholder="cmac/web/twoDimMap">
        </div>
        <div class="form-group">
            <label>Scenario<font color="red"> *</font></label>
            <input type="text" class="form-control" id="scenario" name="scenario" placeholder="12">
        </div>
        <div class="form-group">
            <label>Version<font color="red"> *</font></label>
            <input type="text" class="form-control" id="version" name="version" placeholder="1">
        </div>
        <div class="form-group">
            <label>Root Service Id<font color="red"> *</font></label>
            <input type="text" class="form-control" id="rootServiceId" name="rootServiceId" placeholder="2">
        </div>
        <div class="form-group">
            <label>Homepage URL</label>
            <input type="text" class="form-control" id="homepage" placeholder="http://www.google.com">
        </div>
        <div class="form-group">
            <label>Developers</label>
            <input type="text" class="form-control" id="delevopers" placeholder="Tom Smith, Mary Brown">
        </div>        
        <div class="text-center">
        	<div class="form-group">            
            	<button type="reset" class="btn btn-success">Reset</button>
        	</div>
        </div>
     </div>   
        <div class="well">
            <h4>Step 2 : Configure Input Parameters</h4>
            <br>
            <form>
                <div class="form-group">
                    <label>Descriptive Parameter Name</label>
                    <input type="text" class="form-control" id="parameterNameDescriptive" placeholder="descriptive">
                </div>
                <div class="form-group">
                    <label>API Parameter Name</label>
                    <input type="text" class="form-control" id="parameterNameFunctional" placeholder="functional">
                </div>
                <div class="form-group">
                    <label>Parameter Type</label>
                    <select class="form-control" id="parameterType" onchange="Javascript:disableItem()">
                        <option value="Input text">Input text</option>
                        <option value="Input area">Input area</option>
                        <option value="Multiple selects">Multiple selects</option>
                        <option value="Radio button">Radio button</option>
                        <option value="Dropdown list">Dropdown list</option>
                    </select>                

                    <div class="col-log-12 " id = "dropdownNameDataDiv">
                    
                    <div class="radio">                   
					      <label>
						    <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" onchange="disableDropdownItem()" checked>
						    Load backend API names <span class="glyphicon glyphicon-question-sign" data-toggle="tooltip" data-placement="right" title="Here API names mean..."></span>
						  <button type="button" class="btn btn-primary btn-sm" onclick="showDropdownExample1()">Show example</button>
						  </label>
					 </div>
					 <div class="radio">
						  <label>
						    <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2" onchange = "disableDropdownItem()">
						    Display descriptive names, embed backend API names <span class="glyphicon glyphicon-question-sign" data-toggle="tooltip" data-placement="right" title="Here API names mean... and Descriptive names mean..."></span>
					 		<button type="button" class="btn btn-primary btn-sm" onclick="showDropdownExample2()">Show example</button>
					 		</label>
					 </div>					 
                      		<textarea class="form-control" rows="3" id="dropdownNameData" placeholder ="Placeholder for the js format data"></textarea>
                     </div>
                </div>
                <div class="form-group">
                    <label>Parameter Values</label>
                    <input type="text" class="form-control" id="parameterValues" placeholder="2" disabled>
                </div>
                <div class="form-group">
                    <label>Default Values</label>
                    <input type="text" class="form-control" id="defaultValues" placeholder="2">
                </div>
                <div class="text-center">
                    <button type="button" class="btn btn-primary" onclick="Javascript:addRow()">Add Input Parameter</button>
                    <button type="reset" class="btn btn-success">Reset</button>
                </div>
            </form>
        </div>        
        <div class="well">

            <h4>Step 3 : Rule Generator</h4>
            <br>
            
            <div id= "ruleAlert" class="alert alert-success">
                <strong>Successfully added!</strong>
            </div>
            <div class="well">
					<div class="form-group">
	                    <label>Parameter1</label> (API Parameter Name)
	                    <input type="text" class="form-control" id="dependence1" placeholder="Enter dependence1 API Name" value="test">
	                </div>
	                <div class="form-group">
	                    <label>Will decide parameter2 </label> (API Parameter Name)
	                    <input type="text" class="form-control" id="dependence2" placeholder="Enter dependence2 API Name" value="test1">
	                </div>
	                <div class="text-center" id = "dependencyBtnGroup">
	                    <button type="button" class="btn btn-primary" onclick="Javascript:addDependency()">Add dropdown-dropdown dependency</button>
	                    <br>
	                    <br>
	                    <button type="button" class="btn btn-primary" onclick="Javascript:addDependencyInputArea()">Add dropdown-input dependency</button>
	                    <br>
	                    <br>
	                    <button type="button" class="btn btn-success" onclick="">Reset dependency</button>
	                </div> 
             </div>
             
             <div class="radio">                   
			      <label>
				    <input type="radio" name="dependencyRadio" id="dependencyRadio1" value="option1" onchange="disableDependencyItem()" checked>
				    Disable Smart Input<span class="glyphicon glyphicon-question-sign" data-toggle="tooltip" data-placement="right" title="Here I mean..."></span>
				  <button type="button" class="btn btn-primary btn-sm" onclick="showDependencyExample1()">Show example</button>
				  </label>
			 </div>
             <div class="radio">
				  <label>
				    <input type="radio" name="dependencyRadio" id="dependencyRadio2" value="option2" onchange = "disableDependencyItem()">
				    Enable Smart Input<span class="glyphicon glyphicon-question-sign" data-toggle="tooltip" data-placement="right" title="Here I mean..."></span>
			 		<button type="button" class="btn btn-primary btn-sm" onclick="showDependencyExample2()">Show example</button>
			 		</label>
			 </div>	
					 
			<div class="well" id = "dependencyDetailForm">					
	            <form>
	            	<div class="form-group">
	                    <label>Data source</label>
	                    <input type="text" class="form-control" id="dataSource" placeholder="Enter Data Source" value="GFDL/ESM2G">
	                </div>
	                <div class="text-center">
	                    <button type="button" class="btn btn-primary" onclick="Javascript:addDataSource()">Add data source</button>
	                    <button type="button" class="btn btn-success" onclick="Javascript:resetDataSource()">Reset data source</button>
	                </div>
	                <div class="form-group">
	                    <label>Data group</label>
	                    <input type="text" class="form-control" id="dataGroup" placeholder="Enter Data Group" value="Default Group">
	                </div>
	                <div class="text-center">
	                    <button type="button" class="btn btn-primary" onclick="Javascript:addGroup()">Add group</button>
	                </div>
	                <div class="form-group">
	                    <label>Enabled variable</label>
	                    <input type="text" class="form-control" id="variable" placeholder="Enter Variable" value="clt">
	                </div>
	                <div class="text-center">
	                    <button type="button" class="btn btn-primary" onclick="Javascript:addVariable()">Add variable</button>
	                    <button type="button" class="btn btn-success" onclick="Javascript:resetVariable()">Reset variable</button>
	                    <button type="button" class="btn btn-primary" onclick="Javascript:oneClickAdd()">One-click add</button>
	                </div>       
	            </form>
	            <br>            
            </div>
           	
            <div class="well" >
                <label>Rule Preview</label>
                <textarea class="form-control" rows="10" id="preview" placeholder ="Placeholder for the json data"></textarea>
            
                <div class="input-group">
                    <input type="text" id="valid" class="form-control" placeholder="Valiadtion Result">
                    <span class="input-group-btn">
                    <button class="btn btn-primary" onclick="Javascript:validate()" type="button">Validate Json Format and Save</button>
                    </span>
                </div><!-- /input-group -->
			
            </div>
            
			<div class="well" >
                <div class="text-center">
                    <button type="button" class="btn  btn-primary" onclick="Javascript:continue1()">Add one rule</button>
                    <button type="button" class="btn  btn-primary" onclick="Javascript:addDataList()">Add rule list</button>
                    <button type="button" class="btn  btn-primary" onclick="Javascript:addDataListContinue()">Add rule list continue</button>
                   	<button type="button" class="btn  btn-success" onclick="Javascript:deleteAllData()">Reset rule</button>	                
                </div>
            </div>
            
            <div class="well" id = "cacheForm">
                <div class="form-group">
                    <label>Show Cache</label>
                    <input type="text" class="form-control" id="demo1" placeholder="Show Cache" >
                </div>
                <label>Para Preview</label>
                <textarea class="form-control" rows="10" id="previewPara" placeholder ="Placeholder for the Para data"></textarea>
            </div>            
            
        </div>
        
        <div class="well">
        	<h4>Step 4 : Configure Output Parameters</h4>
        	<br>
        	<form>
                <div class="form-group">
                    <label>Button Name</label>
                    <input type="text" class="form-control" id="outputName" placeholder="Enter Output Name">
                </div>
                <div class="form-group">
                    <label>Output Button Key</label>
                    <input type="text" class="form-control" id="outputUrl" placeholder="Enter Output Button Url">
                </div>
                
                <div class="text-center">
                    <button type="button" class="btn btn-primary" onclick="Javascript:addButton()">Add Output Button</button>
                    <button type="reset" class="btn btn-success">Reset</button>
                </div>
            </form>
        </div>
        
        
        
        
    """)))}),format.raw/*271.6*/("""
"""),format.raw/*272.1*/("""</div>

<!-- Modal -->
<div class="modal fade" id="confirm" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Confirmation</h4>
            </div>
            <div class="modal-body">
                <p>Are you sure you want to add this climate service?</p>
            </div>
            <div class="modal-footer">
                <button type="submit" class="btn btn-primary" data-dismiss="modal" onclick="Javascript:window.location.href='/climateService/add'">Submit</button>
                <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
            </div>
        </div>

    </div>
</div>

<div class="container col-md-6">
    <h3>Input Part Preview</h3>

    <form>
        <table id="parameterPreview" class="table table-bordered table-striped">
            <thead>
            <tr>
                <th class="col-md-2">Parameter Name</th>
                <th class="col-md-3">Value</th>
                <th class="col-md-1">&nbsp;</th>
            </tr>
            </thead>
            <tbody id="tbody"></tbody>
        </table>
    </form>
    
    <h3> Output Part Preview</h3>
    <form>
        <table class="table table-bordered table-striped">
            <thead>
            <tr>
                <th>Output</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>
                    <a id="serviceImgLink" href="">
                        <img src="" id="serviceImg" class="img-responsive">
                        <h5>  Placeholder for the image</h5>
                    </a>
                </td>
            </tr>
            <tr>
                <td>
                    <a id="commentLink" href="">
                        <textarea class="form-control" rows="3" id="comment" placeholder ="Placeholder for the link"></textarea>
                    </a>
                </td>
            </tr>
            <tr>
                <td>
                    <textarea class="form-control" rows="10" id="message" placeholder ="Placeholder for the message"></textarea>
                </td>
            </tr>
            </tbody>
        </table>
        <div class="text-center">
            <button type="submit" class="btn btn-primary">Download Data</button>
        </div>
        <br>
        <div class="text-center" id="output">
            
        </div>
    </form>
    
    <div id="msg" class="alert alert-danger fade in">
	    <strong></strong> Please fill out all blanks with *.
	</div>
    
    <div class="text-center">
         <button type="button" class="btn btn-primary btn-lg" id="addAClimateService">Add a Climate Service</button>
    </div>
    
    
</div>
""")))}))}
  }

  def render(climateServiceForm:play.data.Form[models.ClimateService]): play.twirl.api.HtmlFormat.Appendable = apply(climateServiceForm)

  def f:((play.data.Form[models.ClimateService]) => play.twirl.api.HtmlFormat.Appendable) = (climateServiceForm) => apply(climateServiceForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Dec 10 17:28:47 PST 2015
                  SOURCE: /Users/weiwang/climate-service/app/views/registerAClimateService.scala.html
                  HASH: c79a3fd43fa1914e9d52583d7542d5ead5e7dd33
                  MATRIX: 772->1|917->79|931->86|1011->90|1039->92|1128->154|1156->155|1185->158|1294->240|1322->241|1379->60|1407->259|1436->262|1492->309|1532->311|1560->312|1678->402|1707->403|1739->408|1807->448|1836->449|1872->458|2014->572|2043->573|2084->586|2163->638|2192->639|2250->670|2278->671|2346->711|2375->712|2416->725|2494->775|2523->776|2568->793|2629->826|2658->827|2696->838|2725->839|2798->884|2827->885|2863->894|2947->951|2975->952|3024->974|3052->975|3206->1103|3272->1160|3312->1162|3344->1167|15656->13448|15685->13449
                  LINES: 26->1|28->3|28->3|30->3|32->5|33->6|33->6|34->7|37->10|37->10|41->1|42->13|43->14|43->14|43->14|44->15|46->17|46->17|47->18|47->18|47->18|48->19|50->21|50->21|51->22|52->23|52->23|54->25|54->25|55->26|55->26|56->27|56->27|56->27|57->28|58->29|58->29|59->30|59->30|61->32|61->32|62->33|64->35|64->35|65->36|65->36|74->45|74->45|74->45|75->46|300->271|301->272
                  -- GENERATED --
              */
          