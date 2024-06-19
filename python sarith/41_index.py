import random
#41 genere numero al azar multiplos 5 asta que se ingres (s)
sCind=0
while (sCind != "s"):
      sCind=input("ingrese (s) para salir,cualquier otra tecla para continuar:")
      iNumero = random.randrange(0,36,5)
      print(iNumero)
salir = print("salir")
