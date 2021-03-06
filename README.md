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

#### Update 30 Jun
- Se corrigen errores en el código generado para Python
- Se añade el atributo CellSize que permite definir las celdas que ocupa un gráfico en el Dashboard.
- Validación para nombre único de elementos añadida, ahora no se pueden crear dos gráficos o tuplas con el mismo nombre.
- Selección de plataforma de generación de código añadida.
- Activar o desactivar normalización de datos.

