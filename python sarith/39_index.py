#39 mostar 10 temperaturas y sacar la mayor
fTemMay =0
for i in range(0,10):
  fTemperatura= float(input("ingrese la temperatura:"))

  if (fTemperatura >fTemMay):
    fTemMay = fTemperatura
print("la temperatura mayor es:", fTemMay)
