class Main {
    
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        //En java se nos da por defecto un metodo contructor para nuestras clases
Car car = new Car("AMO123", new Account ("Andres Herrera", "12312"));
/*Cuando ponemos car. nos dara todas las dependencias que tenga la clase en este caso
Car*/
car.passenger = 4;
System.out.println("Car license: " + car.license);
//Podemos ir creando objetos de esta manera
Car car2 = new Car("EQU234", new Account ("Andrew Williams", "12312"));
car2.passenger = 3;
System.out.println("Car license: " + car2.license);
    }
}