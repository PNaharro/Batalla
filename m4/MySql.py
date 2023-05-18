import mysql.connector
import xml.etree.ElementTree as ET

# Conectar a la base de datos MySQL
cnx = mysql.connector.connect(user='root', password='toor', host='127.0.0.1', database='br')

# Crear un objeto cursor
cursor = cnx.cursor()
query = "SELECT * FROM batalla"
cursor.execute(query)
# Ejecutar una consulta SQL
root = ET.Element("Batalla")
for row in cursor:
    batallas = ET.SubElement(root, "batalla")
    ET.SubElement(batallas, "id_batalla").text =str(row[0])
    ET.SubElement(batallas, "id_player").text = str(row[1])
    ET.SubElement(batallas, "warrior_id").text = str(row[2])
    ET.SubElement(batallas, "warrior_weapon_id").text = str(row[3])
    ET.SubElement(batallas, "oponent_id").text = str(row[4])
    ET.SubElement(batallas, "oponent_weapon_id").text = str(row[5])
    ET.SubElement(batallas, "damage_caused").text = str(row[6])
    ET.SubElement(batallas, "damage_recived").text = str(row[7])
    ET.SubElement(batallas, "battle_points").text = str(row[8])



    tree = ET.ElementTree(root)
    tree.write("batalla.xml")


    # agregar más elementos según la estructura de la tabla "Battle"


# Recuperar los resultados de la consulta

# Imprimir los resultados


# Cerrar la conexión con la base de datos
cnx.close()



