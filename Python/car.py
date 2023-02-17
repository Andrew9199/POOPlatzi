from account import Account
#Debemos importar la clase Account del archivo account.py para poder usarlo en la definicion del atributo drive

class Car:
    id = int
    license = str
    driver = Account("","")
    #El tipo de drive se cambia por account por se un atributo con herencia
    passegenger = int
    
#Hacemos mas o menos lo mismo que en Account

    def __init__(self, license, driver):
        self.license = license
        self.driver = driver