from car import Car
from account import Account

#Aqui importamos las clases Car y Account para usarlas en en main

if __name__ == "__main__":
    print("Hola mundo")

#Aqui podemos ver como se usa la clase Account para crear una instacia a partir del reciquisito de la clase Car llamada driver

    car = Car("AMS678", Account("Andres Herrera", "ANDA678"))
    print(vars(car))
    print(vars(car.driver))