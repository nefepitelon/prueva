import importlib, numpy
import openpyxl
import psycopg2 #coneccion de base de datos postgres


try:
    # Configuración de la conexión a la base de datos
    db_config = {
        'host': 'localhost',
        'database': 'cng_dev',
        'user': 'postgres',
        'password': '1234'
    }
    connection = psycopg2.connect(**db_config)
    cur = connection.cursor()

    cur.execute("SELECT * FROM reporte")

    campos = cur.fetchall()
except Exception as e:
    print("el error es :" + e)