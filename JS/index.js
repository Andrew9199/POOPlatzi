var car = new Car("AW456", new Account("Andres Herrera", "QWE234"))
/*Aqui hacemos uso tanto de lo definido en la funcion car con su nombre y tal como
la funcion de Account que nos ayuda a crear el driver apartir del nombre y el document*/
car.passenger = 4;
car.printDataCar();
//Aqui invocamos el metodo de car que nos da el var Car = new Car("AW345", new Account("Andres Herrera", "123543"))
//Hay que llamar al documento, no a la clase
//Cuidado con declarar una variable igual que el metodo constructor -.-"
var uberX = new UberX("Aw345", new Account("Andres Herrera", "123543"), "Chevrolet","Spark")
uberX.passenger = 4;
uberX.printDataCar();

var uberfinolis = new UberBlack("ASD538", new Account("Carlos Santana", "737130", "Debito o credito" ,"Cuero"))
uberfinolis.passenger = 2;
uberfinolis.printDataCar();