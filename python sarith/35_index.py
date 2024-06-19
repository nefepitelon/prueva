#35 se quiere sacar el peso acumulado de 10 personas

i=0
fCont = 0
for i in range(0,10):
  fPeso = float(input("ingrese su peso:"))
  fCont = fCont + fPeso

print ("el peso acumulado es:", fCont)

