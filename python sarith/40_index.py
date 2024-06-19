#40 se ingresan 10 pares de temperatura, hayar promedio de T1 y T2
fTemSum1 =0 
fTemSum2=0
i=0
for i in range(0,10):
      fTem1= float(input("ingrese la temperatura 1:"))
      fTem2= float(input("ingrese la temperatura 2:"))
      fTemSum1 = fTemSum1 + fTem1
      fTemSum2 = fTemSum2 + fTem2
print ("la temperatura promedio 1 es:", fTemSum1/10)
print ("la temperatura promedio 2 es:", fTemSum2/10)
