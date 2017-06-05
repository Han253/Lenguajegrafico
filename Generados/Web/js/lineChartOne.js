google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChart);

function drawChart() {
        var data = new google.visualization.DataTable();
        data.addColumn('number', 'valor1');
        data.addColumn('number', 'valor2');
           
        $.getJSON(urlServerDefaul, function(response){
           	  for(var i in response){
           	      data.addRows([[response[i]["valor1"],response[i]["valor2"]]]);
           	  }
           	  
           	  var options = {legend: { position: "none" },chartArea:{width:'70%',height:'70%'},colors:['#B7344C'],animation:{duration: 1000,easing: 'linear',startup: true}};
           	  var chart = new google.visualization.LineChart(document.getElementById('lineChartOne'));
           	  chart.draw(data, options);       
           	   }); //END getJSON
}  
