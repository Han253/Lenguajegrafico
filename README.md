# Lenguajegrafico

Arquitectura del Lenguaje de dominio específico (en inglés domain-specific language, DSL) creado para representar los tipos de graficos seleccionados, su sintaxis es posteriormente analizada para generar archivos que puedan ser interpretados o compilados en diferentes plataformas de forma que generen los graficos definidos en el lenguaje.

### Lenguajegrafico.xtext
Archivo donde se define la sintaxis del lenguaje de dominio específico. 

### LenguajegraficoGenerator.xtext
En este archivo se define el tratamiento de las definiciones realizadas por el usuario para generar los archivos de salida html/python/java etc. (Actualmente genera HTML)

### grafico.lg
Archivo de prueba donde se han definido los tipos de graficos existentes y se puede apreciar la sintaxis del lenguaje. 

### sampleData.json
Archivo json que contiene los datos que toma el servidor para dar respuesta a las peticiones. 

### Prototipo 1.0 Terminado
Se añaden las siguientes características: 
- Los datos se obtienen desde un web services que los envía en formato JSON mediante la librería JQuery de JavaScript en los archivos generados. 
- se configura el script para asignar los datos en la forma que la librería GoogleChart los requiere para cada tipo de gráfico definido. 
- Se puede configurar la URL de los datos desde las Tuplas de datos que contienen el nombre de las características o se asigna una ruta por defecto. 
-Se añade la característica Titulo de forma explicita para cada gráfico, esta característica es opcional y en caso de no ser definida se asigna un valor por defecto.  
- ser genera un archivo properties.js donde se encuentra la configuración de URL´s definidas por el usuario.

### Prototipo 2.0

- Se añade python como segunda plataforma generada.
- el codigo generado ahora se organiza en directorios para su facil identificación. 
- Generación de Dashboard añadida para la plataforma HTMl.
- Filtro de etiquetas para permitir que los graficos generados puedan ser conectados a una variedad más amplia de bases de datos.
- Propiedades Visuales añadidas


![alt text]([url=https://flic.kr/p/VoEkX5][img]https://c1.staticflickr.com/5/4282/35043352982_95c1d07979_b.jpg[/img][/url][url=https://flic.kr/p/VoEkX5]Dash[/url] by [url=https://www.flickr.com/photos/92562689@N06/]ab1c766b06a24f5c9d3cd9c9e09ca769[/url], on Flickr)
