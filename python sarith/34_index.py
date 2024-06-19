#34 10 personas consulta edad , mostar el promedio y cuantas personas son mayores de 18
i=0
iCont = 0
iContEdad = 0
for i in range(0,10):
  iEdad = int(input("ingrese su edad:"))
  iCont = iCont + iEdad
  if (iEdad >= 18):
    iContEdad = iContEdad + 1

print ("la edad promedio es:", iCont/10)
print("la cantidad de personas mayores de edad es:", iContEdad)
