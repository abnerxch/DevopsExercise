

public class Sexo {
    String aviso4;

    public void val(String s){

String hombre = "M";
String mujer = "F";
        if(s.equals(hombre))
        {
            System.out.println("Masculino");
            aviso4 = "Masculino";

        }
        else
            if(s.equals(mujer)){
            System.out.println("Femenino");
            aviso4 = "Femenino";
        }
            else{
            System.out.println("Ingrese una opción válida");
            aviso4 = "Ingrese una opción válida";
        }
    }


}