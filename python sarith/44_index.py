import random
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