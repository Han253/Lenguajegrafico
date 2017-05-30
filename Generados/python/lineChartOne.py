"""
Line Chart Code generated - this code es generated based on DSL.

Autor: Henry Jimenez - Maria Fernanda Guerrero
Version: 24/05/2017
"""

valor1=[]
valor2=[]

URL="http://192.168.100.13:8080/paises"
response=json.load(urlopen(URL))
for i in response:
	valor1.append(i["valor1"])
	valor2.append(i["valor2"])

fig, ax = plt.subplots()
ax.bar(valor1,valor2)
ax.set_title('Valores Relacionados grafico Linea')
plt.show()

