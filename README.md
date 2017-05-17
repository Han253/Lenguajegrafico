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


