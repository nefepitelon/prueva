
try:
    def mostrar_factorial(iSum):
        print ("el factorial de es :",iSum)
    
    def operacion_factorial(iNum):
        iSum=0
        for i in range(1,iNum + 1):
            iSum = iSum + i
        return iSum

    def pedir_numFact():
         
        iNum = int(input("Agregue un numero:"))
        iSum = operacion_factorial(iNum)
        mostrar_factorial(iSum)


except Exception as e:
        print ("en este codigo colo entran digitos.")

pedir_numFact()


