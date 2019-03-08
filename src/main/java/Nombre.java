

public class Nombre {
    String aviso5;

    public  void val(String no){
        int x ;
        x = no.length();


        if(x > 20)
        {
            //Don´t accept 20+ characters names
            System.out.println("El nombre ingresado es demasiado largo");
            aviso5 = "El nombre ingresado es demasiado largo";
        }
        else if (x == 0){
            //Name is required
            System.out.println("Debe ingresar el nombre");
            aviso5 = "Debe ingresar el nombre";
        }

        else{
            //Success!!
            System.out.println("Nombre guardado correctamente");
            aviso5 = "Nombre guardado correctamente";
        }
    }
}
