/*
 * generated by Xtext 2.11.0
 */
package org.uis.lenguajegrafico.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider
import javax.inject.Inject
import org.uis.lenguajegrafico.lenguajegrafico.PieChart
import org.uis.lenguajegrafico.lenguajegrafico.ColumnChart
import org.uis.lenguajegrafico.lenguajegrafico.Feature
import org.uis.lenguajegrafico.lenguajegrafico.Map
import org.uis.lenguajegrafico.lenguajegrafico.LineChart

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class LenguajegraficoGenerator extends AbstractGenerator {
	
	@Inject extension IQualifiedNameProvider

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
         for(e : resource.allContents.toIterable.filter(PieChart)){
         	 fsa.generateFile(
             	 	e.fullyQualifiedName.toString("/")+".html",
             	 	e.compile)   
         }
         
         for(e : resource.allContents.toIterable.filter(ColumnChart)){
         	 fsa.generateFile(
             	 	e.fullyQualifiedName.toString("/")+".html",
             	 	e.compile)   
         }
         
         for(e : resource.allContents.toIterable.filter(Map)){
         	 fsa.generateFile(
             	 	e.fullyQualifiedName.toString("/")+".html",
             	 	e.compile)   
         }
         for(e : resource.allContents.toIterable.filter(LineChart)){
         	 fsa.generateFile(
             	 	e.fullyQualifiedName.toString("/")+".html",
             	 	e.compile)   
         }
	 }
	 
	 def compile(PieChart e)'''
	    <html>
	       <head>
	           <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
	           <script type="text/javascript" src="https://www.google.com/jsapi"></script>
	            <script type="text/javascript">
	                  google.charts.load('current', {'packages':['corechart']});
	                  google.charts.setOnLoadCallback(drawChart);
	                  
	                   function drawChart() {
	                  
	                          // Create the data table.
	                          var data = new google.visualization.DataTable();
	                          data.addColumn('string', 'Topping');
	                          data.addColumn('number', 'Slices');
	                          data.addRows([
	                            ['Mushrooms', 3],
	                            ['Onions', 15],
	                            ['Olives', 1],
	                            ['Zucchini', 1],
	                            ['Pepperoni', 2]
	                          ]);
	                            
	                          �FOR f:e.features�	
	                            	�f.compilePieChart�
	                          �ENDFOR�                           
	                          	                  
	                          // Instantiate and draw our chart, passing in some options.
	                          var �e.name� = new google.visualization.PieChart(document.getElementById('chart_div'));
	                          �e.name�.draw(data, options);
	                   }                 
	           </script>
	           
	       </head>
	       <body>
	         <div id="chart_div"></div>
	       </body>
	    </html>
	'''
	def compilePieChart(Feature f) '''
	    �IF f.name == 'title'�
	    	        var options = {'title':'�f.value�',
	    	        	                  'width':400,
	    	        	                  'height':300};
	     �ENDIF�	
	'''
	
	def compile(ColumnChart e)'''
	   <html>
	     <head>
	       <!--Load the AJAX API-->
	        <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
	        <script type="text/javascript">
	        
	        google.charts.load('current', {packages: ['corechart', 'bar']});
	   google.charts.setOnLoadCallback(drawBasic);
	   
	   function drawBasic() {
	   
	         var data = new google.visualization.DataTable();
	         data.addColumn('timeofday', 'Time of Day');
	         data.addColumn('number', 'Motivation Level');
	   
	         data.addRows([
	           [{v: [8, 0, 0], f: '8 am'}, 1],
	           [{v: [9, 0, 0], f: '9 am'}, 2],
	           [{v: [10, 0, 0], f:'10 am'}, 3],
	           [{v: [11, 0, 0], f: '11 am'}, 4],
	           [{v: [12, 0, 0], f: '12 pm'}, 5],
	           [{v: [13, 0, 0], f: '1 pm'}, 6],
	           [{v: [14, 0, 0], f: '2 pm'}, 7],
	           [{v: [15, 0, 0], f: '3 pm'}, 8],
	           [{v: [16, 0, 0], f: '4 pm'}, 9],
	           [{v: [17, 0, 0], f: '5 pm'}, 10],
	         ]);
	           
	           �FOR f:e.features�	
	   	            �f.compileColumnChart�
	   	       �ENDFOR� 	           
	   
	         var chart = new google.visualization.ColumnChart(
	           document.getElementById('chart_div'));
	   
	         chart.draw(data, options);
	       }
	       </script>
	     </head>
	   
	     <body>
	       <!--Div that will hold the pie chart-->
	       <div id="chart_div"></div>
	     </body>
	   </html>
	'''
	
	def compileColumnChart(Feature f) '''
	    �IF f.name == 'title'�
	    	        var options = {
	    	        	           title: '�f.value�',
	    	        	           hAxis: {
	    	        	             title: 'Time of Day',
	    	        	             format: 'h:mm a',
	    	        	             viewWindow: {
	    	        	               min: [7, 30, 0],
	    	        	               max: [17, 30, 0]
	    	        	             }
	    	        	           },
	    	        	           vAxis: {
	    	        	             title: 'Rating (scale of 1-10)'
	    	        	           }
	    	        	         };
	     �ENDIF�	
	'''
	def compile(Map e)'''
	<html>
	  <head>
	    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
	    <script type="text/javascript" src="https://www.google.com/jsapi"></script>
	    <script type="text/javascript">
	      google.charts.load("current", {packages:["map"]});
	      google.charts.setOnLoadCallback(drawChart);
	      function drawChart() {
	        var data = google.visualization.arrayToDataTable([
	          ['Lat', 'Long', 'Name'],
	          [7.141024, -73.122823, 'Oficina_Profesor'],
	          [7.133638, -73.119803, 'Sena'],
	          [7.128146, -73.114101, 'Hopital_Universitario']
	        ]);
	        var �e.name� = new google.visualization.Map(document.getElementById('map_div'));
	        �e.name�.draw(data, {showTip: true})
	      }
	
	    </script>
	  </head>
	
	  <body>
	    <div id="map_div" style="width: 800px; height: 600px"></div>
	  </body>
	</html>
	'''
	
	def compile(LineChart e)'''
	 <html>
	   <head>
	     <!--Load the AJAX API-->
	      <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
	      <script type="text/javascript">
	       google.charts.load('current', {'packages':['corechart']});
	       google.charts.setOnLoadCallback(drawChart);
	 
	       function drawChart() {
	         var data = google.visualization.arrayToDataTable([
	           ['Year', 'Sales', 'Expenses'],
	           ['2004',  1000,      400],
	           ['2005',  1170,      460],
	           ['2006',  660,       1120],
	           ['2007',  1030,      540]
	         ]);
	                          �FOR f:e.features�	
	                            	�f.compilePieChart�
	                          �ENDFOR�                           
	                          	                  
	                          // Instantiate and draw our chart, passing in some options.
	                          var �e.name� = new google.visualization.LineChart(document.getElementById('curve_chart'));
	                          �e.name�.draw(data, options);
	                   }                 
	           </script>
	           
	       </head>
	       <body>
	           <div id="curve_chart" style="width: 900px; height: 500px"></div>
	         </body>
	       </html>
	'''
	def compileLineChart(Feature f) '''
	    �IF f.name == 'title'�
	    	        var options = {'title':'�f.value�',
	    	        	            curveType: 'function',
	    	        	            legend: { position: 'bottom' }};
	     �ENDIF�	
	'''
}
