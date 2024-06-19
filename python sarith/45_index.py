#45 ingresar t1 y t2 asta que t1 sea 0 hayar promedio de tteperaturas del 5 al 15
fConProm=0
fTemSum=0
fTem1=1
while (fTem1 >0):
  fTem1= float(input("ingrese temperatuta 1:"))
  fTem2= float(input("ingrese temperatuta 2:"))
  if (fTem1,fTem2 >= 5 and fTem1,fTem2 <= 15):
    fConProm= fConProm + 1
    fTemSum = fTemSum + fTem1 + fTem2
print("el promedio de las temperaturas es:", fTemSum/fConProm)

