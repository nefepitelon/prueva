#31 contar cuantas personas son mayores de edad de un numero  de personas 
iPersonas=int(input("ingrese el numero de personas:"))
iCont=0
for i in range(1,iPersonas):
  iEdad=int(input("ingrese su edad:"))
  if (iEdad >=18):
      iCont = iCont + 1
print(iCont)