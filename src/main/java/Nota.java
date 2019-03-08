public class Nota {
    String aviso3;
    public  void val(int nota){

        if(nota < 0 || nota > 100)
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
