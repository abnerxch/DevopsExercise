

public class Sexo {
    String aviso4;

    public void val(String s){

String hombre = "M";
String mujer = "F";
        if(s.equals(hombre))
        {

            //Male condition



            aviso4 = "Masculino";
            System.out.println(aviso4);

        }
        else
            if(s.equals(mujer)){

                //Female condition



            aviso4 = "Femenino";
            System.out.println(aviso4);
        }
            else{

                //Male or female only

            aviso4 = "Ingrese una opción válida";
                System.out.println(aviso4);
        }
    }


}