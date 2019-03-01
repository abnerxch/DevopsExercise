package com.company;

public class ID {
    public static void val(int i) {

        //Los ID van de 1000 a 2000
        //de 1000 a 1500 = Primer semestre
        //1501 a 2000 = Segundo semestre

        if (i >= 1000 && i <= 1500) {
            System.out.println("Primer Semestre");

        } else if (i >= 1501 && i <= 2000)
        {System.out.println("Segundo Semestre");}else{
            System.out.println("Ingrese un ID válido");
        }



    }
}