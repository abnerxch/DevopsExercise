package com.company;

public class Nota {
    public static void val(int nota){

        if(nota <=0)
        {
            System.out.println("Ingrese una opción válidad");

        }else if(nota<=60){
            System.out.println("REPROBADO");
        }else{
            System.out.println("APROBADO");
        }
    }
}
