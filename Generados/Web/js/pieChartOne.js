google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChart);
			                  
function drawChart() {
		// Data table 
		var data = new google.visualization.DataTable();
		data.addColumn('string', 'nombre');
		data.addColumn('number', 'valor1');
			                          
		$.getJSON(urlServerDefaul, function(response){
			      for(var i in response){
			              data.addRows([[response[i]["nombre"],response[i]["valor1"]]]);
			      }
			                            	                                      
			       var options = {'title':'Paises Latinoamericanos'
			       ,'width':400
			       ,'height':300};
			                          
		// Instantiate and draw our chart, passing in some options.
		var chart = new google.visualization.PieChart(document.getElementById('pieChartOne'));
		chart.draw(data, options);       
		}); //END getJSON
}          
