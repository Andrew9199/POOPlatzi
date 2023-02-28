#Debemos ver que es similar el como se importan las clases en python
from car import Car

#Declaracion de los atributos propios de la clase
class UberX(Car):
    brand = str
    model = str
    #Definimos el metodo constructor que a su vez llama los parametros del constructor de Car
    def __init__(self, license, driver, brand, model):
        super().__init__(license, driver)
        self.brand = brand
        self.model = model