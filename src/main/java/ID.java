

public class ID {

    String aviso2;
    public void val(int i) {

        //Los ID van de 1000 a 2000
        //de 1000 a 1500 = Primer semestre
        //1501 a 2000 = Segundo semestre


if (i >= 1000 && i <= 1500) {
  //first semester
            aviso2 = "Primer Semestre";
            System.out.println(aviso2);
        }
           
        else
            if (i >= 1501 && i <= 2000)
        {
               //Second semester ID
        aviso2 = "Segundo Semestre";
        System.out.println(aviso2);
        }

        else{
          
          //invalid ID
            aviso2 = "Ingrese un ID válido";
            System.out.println(aviso2);
        }



    }
}