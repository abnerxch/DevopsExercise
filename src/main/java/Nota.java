public class Nota {
    String aviso3;
    public  void val(int nota){

        if(nota < 0 || nota > 100)
        {
            //Don´t accept negative grades neither 100+ grades
            System.out.println("Ingrese una opción válida");
            aviso3 = "Ingrese una opción válida";

        }else if(nota>=0 && nota <= 60){
            //Reprobado condition
            System.out.println("REPROBADO");
            aviso3 = "REPROBADO";
        }else{

            //Aprobado condition
            System.out.println("APROBADO");
            aviso3 = "APROBADO";
        }
    }
}
