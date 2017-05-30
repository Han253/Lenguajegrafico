google.charts.load('current', {packages: ['corechart', 'bar']});
google.charts.setOnLoadCallback(drawBasic);
	   
function drawBasic() {
	   
	   var data = new google.visualization.DataTable();
	   data.addColumn('number', 'valor1');
	   data.addColumn('number', 'valor2');
	                               
	   $.getJSON(urlServerDefaul, function(response){
	             for(var i in response){
	                 data.addRows([[response[i]["valor1"],response[i]["valor2"]]]);
	             }
	                                                                         
	              var options = {'title':'Valores Relacionados','width':400,'height':400};
	                   
	              var chart = new google.visualization.ColumnChart(document.getElementById('barChartOne'));
	              chart.draw(data, options);       
	              }); //END getJSON
}
