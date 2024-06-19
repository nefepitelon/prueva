#32 mostar la cantidad de mujeres y hombres ingresadas con su porcentaje

iContF =0
iContM =0
i=0
iPerso =int(input("ingrese el numero de personas:"))  
print("deijite (f) si es mujer y (m) si es hombre")

for i in range(0,iPerso):
  sGenero = input("ingrese su genero:")
  if (sGenero == "f"):
    iContF = iContF + 1
  if(sGenero == "m"):
    iContM = iContM + 1
print("la cantidad de hombres es:", iContM)
print("la cantidad de mujeres es:", iContF)
print("el porcentaje de hombres es:", iContM/iPerso*100)
print("el porcentaje de mujeres es:", iContF/iPerso*100)

