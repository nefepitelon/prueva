#33 mostar la cantidad de mujeres mayores y hombres menores de edad

iContF =0
iContM =0

i=0
iPerso =int(input("ingrese el numero de personas:"))  
print("deijite (f) si es mujer y (m) si es hombre")

for i in range(0,iPerso):
  sGenero = input("ingrese su genero:")
  sEdad = int(input("ingrese su edad:"))
  if (sGenero == "f"):
      if (sEdad >= 18):
        iContF = iContF + 1
  if(sGenero == "m"):
    if (sEdad < 18):
      iContM = iContM + 1
print("la cantidad de hombres menores es:", iContM)
print("la cantidad de mujeres mayores es:", iContF)
