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
  