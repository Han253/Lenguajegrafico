google.charts.load('current', {'packages': ['table'], 'callback': drawTable});

function drawTable() {
	
	var data = new google.visualization.DataTable();
			
	data.addColumn('string', 'nombre');
	data.addColumn('number', 'valor1');
	
	$.getJSON(urlServerDefaul, function(response){
		for(var i in response){
			data.addRows([[response[i]["nombre"],response[i]["valor1"],]]);
		}
		
		
		var cssClassNames={headerCell:'headerTable',tableRow:'rowTable'};
		var options={cssClassNames,width:'100%', height:'100%',allowHtml:true,alternatingRowStyle:false};
		var table = new google.visualization.Table(document.getElementById('tabla'));
		table.draw(data,options);      
		 
	}); //END getJSON	      	
}
