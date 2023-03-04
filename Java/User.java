public class User extends Account{
    
    public User (String name, String document){
        super(name, document);
    }

    public void printDataUser(){
        System.out.println("El nombre del User es " + name + " y su documento es " + document);
    }
}
