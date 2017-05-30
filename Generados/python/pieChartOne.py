"""
Pie Chart Code generated - this code es generated based on DSL.

Autor: Henry Jimenez - Maria Fernanda Guerrero
Version: 24/05/2017

"""

from urllib.request import urlopen
import matplotlib.pyplot as plt
import json

nombre=[]
valor1=[]

URL="http://192.168.100.13:8080/paises"
response=json.load(urlopen(URL))
for i in response:
    nombre.append(i["nombre"])
    valor1.append(i["valor1"])

fig, ax = plt.subplots()
ax.pie(valor1, labels=nombre, autopct='%1.1f%%')
ax.set_title('Paises Latinoamericanos')
ax.axis('equal')  # Equal aspect ratio ensures that pie is drawn as a circle.
plt.show()  

