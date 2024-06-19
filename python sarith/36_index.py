#36 se quiere sacar el peso promedio de 5 personas
fPesoTotal=0
i=0
for i in range(0,5):
  fPeso = float(input("ingrese su peso:"))
  fPesoTotal = fPesoTotal + fPeso
print("el peso promedio es:", fPesoTotal/5)

