from car import Car

class UberVan(Car):
    typeCardAccepted = []
    seatsMaterial    = []
    
    def __init__(self, license, driver, typeCardAccepted, seatsMaterial):
        super().__init__(license, driver)
        self.typeCardAccepted = typeCardAccepted
        self.seatsMaterial    = seatsMaterial