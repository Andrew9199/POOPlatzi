class Account:
    id = int
    name = str
    document = str
    email = str
    password = str

    def __init__(self, name, document):
        self.name = name
        self.document = document

# Como ya vimos en clases pasadas debemos poner el atributo self antes de poner los atributos en este caso name y document
