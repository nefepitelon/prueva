# 42 ungresar numero y saber si es primo o no
iNumero = int(input("ingrese el numero:"))
if (iNumero % 2 == 0 and iNumero % 1 == 0):
  print(iNumero,"no es primo")
else:
  print(iNumero,"es primo")
