from payment import Payment

class Card(Payment):
    number = int
    CVV = int
    date = str
    
    def __init__(self, number, CVV, date):
        super().__init__()
        self.number = number
        self.CVV = CVV
        self.date = date
