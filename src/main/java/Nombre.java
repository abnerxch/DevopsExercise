

public class Nombre {
    String aviso5;

    public  void val(String no){
        int x ;
        x = no.length();

        //cambio
        if(x >= 25)
        {
            System.out.println("El nombre ingresado es demasiado largo");
            aviso5 = "El nombre ingresado es demasiado largo";
        }
        else if (x == 0){
            System.out.println("Debe ingresar el nombre");
            aviso5 = "Debe ingresar el nombre";
        }

        else{
            System.out.println("Nombre guardado correctamente");
            aviso5 = "Nombre guardado correctamente";
        }
    }
}
