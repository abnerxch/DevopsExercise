

import java.util.Scanner;

public class Edad {
String aviso1;


    public void val(int ed){

        if(ed <0)
        {
            System.out.println("Ingrese una opción válidad");
            aviso1 = "Ingrese una opción válidad";


        }else if(ed<18 && ed >= 0){
            System.out.println("Younger");
            aviso1 = "Younger";
        }else{
            System.out.println("Adult");
            aviso1 = "Adult";
        }

        return;
    }









}
