
public class Nacimiento {

    String aviso6;

    public  void val(String na){
        int x;
        x = na.length();


        if(x > 30)
        {
            //Don´t accept places with 30+ characters
            System.out.println("El lugar ingresado es demasiado largo");
            aviso6 = "El lugar ingresado es demasiado largo";
        }

        else if (x == 0){
            //User would insert a place
            System.out.println("Debe ingresar el lugar de nacimiento");
            aviso6 = "Debe ingresar el lugar de nacimiento";
        }

        else{
            //Succeess!

            System.out.println("Lugar de nacimiento guardado correctamente");
            aviso6 = "Lugar de nacimiento guardado correctamente";
        }
    }

}
