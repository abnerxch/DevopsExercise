

public class Nombre {
    String aviso5;

    public  void val(String no){
        int x ;
        x = no.length();


        if(x > 20)
        {

            aviso5 = "El nombre ingresado es demasiado largo";
            System.out.println(aviso5);
        }
        else if (x == 0){

            aviso5 = "Debe ingresar el nombre";
            System.out.println(aviso5);
        }

        else{

            aviso5 = "Nombre guardado correctamente";
            System.out.println(aviso5);
        }
    }
}
