public class Nota {
    String aviso3;
    public  void val(int nota){
        //cambio
        if(nota < 0 || nota > 100)
        {

            //Don´t accept negative grades neither 100+ grades


            aviso3 = "Ingrese una opción válida";
            System.out.println(aviso3);

        }else if(nota>=0 && nota <= 60){

            //Reprobado condition



            aviso3 = "REPROBADO";
            System.out.println(aviso3);
        }else{


            //Aprobado condition

            aviso3 = "APROBADO";
            System.out.println(aviso3);
        }
    }
}
