

import java.util.Scanner;

public class Edad {
String aviso1;


    public void val(int ed){

        if(ed <0)
        {

            aviso1 = "Ingrese una opción válidad";
            System.out.println(aviso1);


        }else if(ed<18 && ed >= 0){

            aviso1 = "Younger";
            System.out.println(aviso1);
        }else{

            aviso1 = "Adult";
            System.out.println(aviso1);
        }

        return;
    }









}
