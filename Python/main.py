from account import Account
from car import Car
from uberX import UberX
from uberBlack import UberBlack

#Aqui importamos las clases Car y Account para usarlas en en main

if __name__ == "__main__":
    print("Hola mundo")

#Aqui podemos ver como se usa la clase Account para crear una instacia a partir del reciquisito de la clase Car llamada driver

    car1 = Car("AMS678", Account("Andres Herrera", "ANDA678"))
    print(vars(car1))
    print(vars(car1.driver))
    
    uberMhe = UberX("AAFE23", Account("Alexis Sanchez", "173456"), "Chebrolet", "1341MX");
    print(vars(uberMhe))
    print(vars(uberMhe.driver))

    uberWow = UberBlack("ASDA4332", Account("Andrew Williams", "91992002"), "Ferrary", "PocoX3NFC")    