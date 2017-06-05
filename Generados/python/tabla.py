"""
Pie Chart Code generated - this code es generated based on DSL.

Autor: Henry Jimenez - Maria Fernanda Guerrero
Version: 24/05/2017

"""
from urllib.request import urlopen
import matplotlib.pyplot as plt
import pandas as pd
import json


URL="http://192.168.100.13:8080/paises"
response=json.load(urlopen(URL))

pd.DataFrame(response)
