import pymongo
import tkinter as tk
from tkinter import messagebox

class CajeroAutomatico:
    def __init__(self):
        self.cliente = pymongo.MongoClient("mongodb+srv://andresromero:andresromero@cluster0.jqmfpmb.mongodb.net/")
        self.db = self.cliente["cajero"]
        self.coleccion = self.db["transacciones"]
        self.saldo_actual = self.obtener_saldo()

    def obtener_saldo(self):
        saldo = 0
        for transaccion in self.coleccion.find():
            saldo += transaccion["monto"]
        return saldo

    def ingresar_dinero(self, monto):
        self.coleccion.insert_one({"tipo": "ingreso", "monto": monto})
        self.saldo_actual += monto
        messagebox.showinfo("Ingreso de dinero", f"Se han ingresado ${monto}. Su saldo actual es ${self.saldo_actual}")

    def retirar_dinero(self, monto):
        if monto > self.saldo_actual:
            messagebox.showerror("Error", "No tiene suficiente saldo para retirar esa cantidad.")
            return
        self.coleccion.insert_one({"tipo": "retiro", "monto": -monto})
        self.saldo_actual -= monto
        messagebox.showinfo("Retiro de dinero", f"Se han retirado ${monto}. Su saldo actual es ${self.saldo_actual}")

    def verificar_saldo(self):
        messagebox.showinfo("Saldo actual", f"Su saldo actual es ${self.saldo_actual}")

    def cerrar_conexion(self):
        self.cliente.close()

class CajeroInterfaz:
    def __init__(self, root):
        self.root = root
        self.root.title("Cajero Automático")

        self.cajero = CajeroAutomatico()

        self.label_saldo = tk.Label(root, text="Saldo actual:")
        self.label_saldo.grid(row=0, column=0)

        self.btn_verificar_saldo = tk.Button(root, text="Verificar Saldo", command=self.verificar_saldo)
        self.btn_verificar_saldo.grid(row=0, column=1)

        self.label_operacion = tk.Label(root, text="Ingrese monto:")
        self.label_operacion.grid(row=1, column=0)

        self.entry_operacion = tk.Entry(root)
        self.entry_operacion.grid(row=1, column=1)

        self.btn_ingresar = tk.Button(root, text="Ingresar Dinero", command=self.ingresar_dinero)
        self.btn_ingresar.grid(row=2, column=0)

        self.btn_retirar = tk.Button(root, text="Retirar Dinero", command=self.retirar_dinero)
        self.btn_retirar.grid(row=2, column=1)

    def verificar_saldo(self):
        self.cajero.verificar_saldo()

    def ingresar_dinero(self):
        monto = float(self.entry_operacion.get())
        self.cajero.ingresar_dinero(monto)
        self.verificar_saldo()

    def retirar_dinero(self):
        monto = float(self.entry_operacion.get())
        self.cajero.retirar_dinero(monto)
        self.verificar_saldo()

if __name__ == "__main__":
    root = tk.Tk()
    app = CajeroInterfaz(root)
    root.mainloop()