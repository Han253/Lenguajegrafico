"""
Map Chart Code generated - this code es generated based on DSL.
	
Autor: Henry Jimenez - Maria Fernanda Guerrero
Version: 24/05/2017
	
"""
	
from __future__ import print_function
from __future__ import division
from urllib.request import urlopen
from PIL import Image
import numpy as np
import json
import requests
	
def get_static_google_map(zoom=14, imgsize="500x500", imgformat="jpeg",maptype="hybrid", markers=None ):
			    
	baseURL  =  "http://maps.google.com/maps/api/staticmap?"
	baseURL += "zoom=%i&" % zoom  # zoom 0 (all of the world scale ) to 22 (single buildings scale)
	baseURL += "size=%s&" % (imgsize) 
	baseURL += "format=%s&" % imgformat
	baseURL += "maptype=%s&" % maptype  # roadmap, satellite, hybrid, terrain
	if markers != None:
		baseURL += markers
	return baseURL
	
	
def save_imagen(StrMakers):
	url = get_static_google_map(markers=StrMakers)
	r = sesion.get(url)
	f=open('%s.png' % FileName,'wb')
	f.write(r.content)
	f.close()
	
FileName="mapChart"
URL="http://192.168.100.13:8080/coordenadas"
respuesta=json.load(urlopen(URL))
	
StrMakers = "markers=color:blue"
for r in respuesta:
	StrMakers += "|%s" % str(r["latitud"])+","+str(r["longitud"])
	    
	
sesion = requests.Session()
	
save_imagen(StrMakers)
imagen = Image.open('%s.png' % FileName)
imagen
