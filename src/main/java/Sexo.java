

public class Sexo {
    String aviso4;

    public void val(String s){


        if(s == "M")
        {
            System.out.println("Masculino");
            aviso4 = "Masculino";

        }else if(s == "F"){
            System.out.println("Femenino");
            aviso4 = "Femenino";
        }else{
            System.out.println("Ingrese una opción válida");
            aviso4 = "Ingrese una opción válida";
        }
    }


}