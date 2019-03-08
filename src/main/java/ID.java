

public class ID {

    String aviso2;
    public void val(int i) {

        //Los ID van de 1000 a 2000
        //de 1000 a 1500 = Primer semestre
        //1501 a 2000 = Segundo semestre

        if (i >= 1000 && i <= 1500) {
            //First semester ID
            System.out.println("Primer Semestre");
            aviso2 = "Primer Semestre";


        } else if (i >= 1501 && i <= 2000)
        {
            //Second semester ID
            System.out.println("Segundo Semestre");
        aviso2 = "Segundo Semestre";}

        else{
            //Don´t accept negative ID
            System.out.println("Ingrese un ID válido");
            aviso2 = "Ingrese un ID válido";
        }



    }
}