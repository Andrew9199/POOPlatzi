class Account {
        Integer id;
        String name;
        String document;
        String email;
        String password;

public Account(String name, String document){
        this.name = name;
        this.document = document;
}
/*Aqui agragamos el metodo public para que el metodo car pueda alimentar a su parametro drive
que a su vez se alimenta de la super clase Account que esta designada como su tipo de dato*/
}
