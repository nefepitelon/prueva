 #calculadora factorial que solo reiba enteros
try:
    iNum = int(input("agrege un numero"))
    print(iNum)
except Exception as e:
  #     print ("en este codigo colo entran digitos.")

# try:
#     iNum = int(input("Agregue un numero: "))
#     print(iNum)
# except Exception as e:
#     print ("en este codigo colo entran digitos.")

def imprimirNumero(iNum):
    print(iNum)

def pedirNumero():
    iNum = int(input("Agregue un numero: "))

    imprimirNumero(iNum)
    
pedirNumero()