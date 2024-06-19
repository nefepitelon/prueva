#28 mostar los numeros del uno al 10
for i in range(1,11):
  print(i)

#29 mostrar las tres primeras potencias del uno al 5

for i in range(1,6):
  print("La potecia de",i,"es:",i,i**2,i**3)

#30 dado un numero mostar su trabala del 1 al 10
iNumero=int(input("ingrese el numero:"))

for i in range(1,11):
  print(iNumero,"x",i,"=",iNumero*i)

#31 contar cuantas personas son mayores de edad de un numero  de personas 
iPersonas=int(input("ingrese el numero de personas:"))
iCont=0
for i in range(1,iPersonas):
  iEdad=int(input("ingrese su edad:"))
  if (iEdad >=18):
      iCont = iCont + 1
print(iCont)

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

#35 se quiere sacar el peso acumulado de 10 personas

i=0
fCont = 0
for i in range(0,10):
  fPeso = float(input("ingrese su peso:"))
  fCont = fCont + fPeso

print ("el peso acumulado es:", fCont)


#36 se quiere sacar el peso promedio de 5 personas
fPesoTotal=0
i=0
for i in range(0,5):
  fPeso = float(input("ingrese su peso:"))
  fPesoTotal = fPesoTotal + fPeso
print("el peso promedio es:", fPesoTotal/5)

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

#38 crear codigo genere 5 numeros del 0 al 36, mostar el porsentaje de numeros pares e imparesy y ceros generados

iConPar =0
iConCero=0
iConImpar=0
i=0
for i in range(0,5):
  iNumero = random.randint(0,36)
  print(iNumero)
  if (iNumero % 2 == 0):
    iConPar = iConPar + 1
    print("si entro P" )
  else:
    iConImpar = iConImpar + 1
    print("si entro I")
  if (iNumero ==0):
      iConCero = iConCero + 1
      print("si entro 0")

print ("el porcentaje de numeros pares es:", iConPar/5*100)
print ("el porcentaje de numeros impares es:", iConImpar/5*100)
print ("el porcentaje de numeros ceros es:", iConCero/5*100)
 
  
#39 mostar 10 temperaturas y sacar la mayor
fTemMay =0
for i in range(0,10):
  fTemperatura= float(input("ingrese la temperatura:"))

  if (fTemperatura >fTemMay):
    fTemMay = fTemperatura
print("la temperatura mayor es:", fTemMay)

#40 se ingresan 10 pares de temperatura, hayar promedio de T1 y T2
fTemSum1 =0 
fTemSum2=0
i=0
for i in range(0,10):
      fTem1= float(input("ingrese la temperatura 1:"))
      fTem2= float(input("ingrese la temperatura 2:"))
      fTemSum1 = fTemSum1 + fTem1
      fTemSum2 = fTemSum2 + fTem2
print ("la temperatura promedio 1 es:", fTemSum1/10)
print ("la temperatura promedio 2 es:", fTemSum2/10)

#41 genere numero al azar multiplos 5 asta que se ingres (s)
sCind=0
while (sCind != "s"):
      sCind=input("ingrese (s) para salir,cualquier otra tecla para continuar:")
      iNumero = random.randrange(0,36,5)
      print(iNumero)
salir = print("salir")


# 42 ungresar numero y saber si es primo o no
iNumero = int(input("ingrese el numero:"))
if (iNumero % 2 == 0 and iNumero % 1 == 0):
  print(iNumero,"no es primo")
else:
  print(iNumero,"es primo")

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

#44 10 numeros 0 36 azar cantindad de pares impares nueros en la segunda docena y le mas grande 

iConPar =0
iConInpar =0
iConDoSe =0  
iConMay=0
i=0
for i in range(0,10):
  iNum = random.randint(0,36)
  print("este es el numero:",iNum)
  
  if (iNum % 2 == 0 and iNum != 0):
    iConPar = iConPar + 1
  else:
    iConInpar = iConInpar + 1
  if (iNum >= 12 and iNum <= 24):
    iConDoSe = iConDoSe + 1  
  if (iNum > iConMay):
      iConMay = iNum
  
  print("numero de impares es:", iConInpar)
  print("numero de pares es:", iConPar)
  print("numero de numeros en la segunda docena es:", iConDoSe)
  print("el numero mayor es:", iConMay)


#45 ingresar t1 y t2 asta que t1 sea 0 hayar promedio de tteperaturas del 5 al 15
fConProm=0
fTemSum=0
fTem1=1
while (fTem1 >0):
  fTem1= float(input("ingrese temperatuta 1:"))
  fTem2= float(input("ingrese temperatuta 2:"))
  if (fTem1,fTem2 >= 5 and fTem1,fTem2 <= 15):
    fConProm= fConProm + 1
    fTemSum = fTemSum + fTem1 + fTem2
print("el promedio de las temperaturas es:", fTemSum/fConProm)


#46 leen numeros asta sumar 1000, hayar cantidad multiplos 6 suma de los numeros entre el 1 y 10
iNumSum = 0
iConMult = 0
iNumSumRan = 0
while (iNumSum < 1000):
  iNum = int(input("ingrese numero:"))
  iNumSum = iNumSum + iNum
  if (iNum % 6 == 0):
    iConMult = iConMult + 1
  if (iNum >=1 and iNum <= 10):
    iNumSumRan = iNumSumRan + iNum
print("estos son los multiplos de 6:", iConMult)
print("este son los numeros sumados de 1 a 10:", iNumSumRan)
  