import random
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
 