google.charts.load("current", {packages:["map"]});
google.charts.setOnLoadCallback(drawChart);
	      
function drawChart() {
	      	
var data = new google.visualization.DataTable();
data.addColumn('number', 'latitud');
data.addColumn('number', 'longitud');
data.addColumn('string', 'nombre');
	      	
$.getJSON(coordenadas, function(response){
	      for(var i in response){
	      	  data.addRows([[response[i]["latitud"],response[i]["longitud"],response[i]["nombre"]]]);
	      }
	      var options = {'title':'TituloMapa'};
	      var chart = new google.visualization.Map(document.getElementById('mapChart'));
	      chart.draw(data, options);       
	      }); //END getJSON	      	
}
