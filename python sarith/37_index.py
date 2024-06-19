#37 ingresar 10 edades y sacar el porcentaje de personas mayores y menores de edad
iEdadConMa=0
iEdadConMe=0
i=0
for i in range(0,10):
  iEdad = int(input("ingresa la edad:"))
  
  if (iEdad >= 18):
      
      iEdadConMa = iEdadConMa + 1
  elif (iEdad < 18):
    
      iEdadConMe = iEdadConMe + 1

print("la cantidad de personas mayores de edad es:", iEdadConMa/10*100)
print("la cantidad de personas menores de edad es:",iEdadConMe/10*100)
