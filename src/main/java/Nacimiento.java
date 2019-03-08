
public class Nacimiento {

    String aviso6;

    public  void val(String na){
        int x;
        x = na.length();

        //cambio
        if(x >= 29)
        {
            System.out.println("El lugar ingresado es demasiado largo");
            aviso6 = "El lugar ingresado es demasiado largo";
        }

        else if (x == 0){
            System.out.println("Debe ingresar el lugar de nacimiento");
            aviso6 = "Debe ingresar el lugar de nacimiento";
        }

        else{
            System.out.println("Lugar de nacimiento guardado correctamente");
            aviso6 = "Lugar de nacimiento guardado correctamente";
        }
    }

}
