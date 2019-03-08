public class Nota {
    String aviso3;
    public  void val(int nota){
        //cambio
        if(nota < 0 || nota >= 101)
        {

            aviso3 = "Ingrese una opción válida";
            System.out.println(aviso3);

        }else if(nota>=0 && nota <= 60){

            aviso3 = "REPROBADO";
            System.out.println(aviso3);
        }else{

            aviso3 = "APROBADO";
            System.out.println(aviso3);
        }
    }
}
