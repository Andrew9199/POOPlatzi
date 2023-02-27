    import java.util.ArrayList;
    import java.util.Map;
    
    class UberVan extends Car{
        //Atributo propios de UberBlack
        //Aqui ocurre algo curioso con el tipo de dato ya que el arraylist solo permite un argumento
        //Map<String, ArrayList<String, Integer>> typeCardAccepted;
        //Y de necesitar dos quedaria
        Map<String, Map<String, Integer>> typeCardAccepted;
        ArrayList<String> seatsMaterial;
        //Creación del metodo constructo que a su vez hereda las cosas de Car
        public UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCardAccepted, ArrayList<String> seatsMaterial){
            super(license, driver);
            this.typeCardAccepted = typeCardAccepted;
            this.seatsMaterial = seatsMaterial;
        }
    }
