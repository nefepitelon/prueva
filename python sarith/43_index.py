#43leer altura, edad, sexo, fin altuta negativa, promedio de altura mujeres y hombres,promedio de edad personas 

fAltura=0
iConM=0
iConF=0
fAlturaM=0
fAlturaF=0
iEdadSum=0
while (fAltura >= 0):
  fAltura= float(input("ingresar altura:"))
  iEdad = int(input("ingresar edad:"))
  sSexo = input("ingresar sexo (f) o (m):")
  iEdadSum = iEdadSum + iEdad 
  
  if (sSexo == "f"):
    iConF = iConF + 1
    fAlturaF = fAlturaF + fAltura
  else:
    iConM = iConM +1
    fAlturaM = fAlturaM + fAltura
    
print("el promedio de altura de mujeres es:", fAlturaF/iConF)
print("el promedio de altura de hombres es ", fAlturaM/iConM)
print("la edad promedio es:", iEdadSum/iConF+iConM)
