

public class Nombre {
    String aviso5;

    public  void val(String no){
        int x ;
        x = no.length();

        //cambio
        if(x >= 25)
        {

            //Don´t accept 20+ characters names


            aviso5 = "El nombre ingresado es demasiado largo";
            System.out.println(aviso5);
        }
        else if (x == 0){

            //Name is required
            aviso5 = "Debe ingresar el nombre";
            System.out.println(aviso5);
        }

        else{

            //Success!!



            aviso5 = "Nombre guardado correctamente";
            System.out.println(aviso5);
        }
    }
}
