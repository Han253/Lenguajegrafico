google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChartpieChartOne);
			                  
function drawChartpieChartOne() {
		// Data table 
		var data = new google.visualization.DataTable();
		data.addColumn('string', 'nombre');
		data.addColumn('number', 'valor1');
			                          
		$.getJSON(urlServerDefaul, function(response){
			      for(var i in response){
			              data.addRows([[response[i]["nombre"],response[i]["valor1"]]]);
			      }
			                            	                                      
		var options = {chartArea:{width:'90%',height:'100%'},colors:['#378ED1','#3CAB65','#904C9F','#B7344C','#B734B2']};
			                          
		// Instantiate and draw our chart, passing in some options.
		var chart = new google.visualization.PieChart(document.getElementById('pieChartOne'));
		chart.draw(data, options);       
		}); //END getJSON
}          
