public class Nota {
    String aviso3;
    public  void val(int nota){

        if(nota < 0 || nota > 100)
        {
            System.out.println("Ingrese una opción válida");
            aviso3 = "Ingrese una opción válida";

        }else if(nota>=0 && nota <= 60){
            System.out.println("REPROBADO");
            aviso3 = "REPROBADO";
        }else{
            System.out.println("APROBADO");
            aviso3 = "APROBADO";
        }
    }
}
