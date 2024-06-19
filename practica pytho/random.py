import random
try:
    iNumUser = int(input("agrege su numero:"))
    iNumRamdom = random.randint(1,11)

    while (iNumUser != iNumRamdom ):
        print ("JA JA JA",iNumUser,"no es")  

    print("Bien", iNumUser,"si es el nuemro ")

except Exception as e:
        print ("en este codigo colo entran digitos.")