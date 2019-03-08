
public class Nacimiento {

    String aviso6;

    public  void val(String na){
        int x;
        x = na.length();

        //cambio
        if(x >= 31)
        {

            aviso6 = "El lugar ingresado es demasiado largo";
            System.out.println(aviso6);
        }

        else if (x == 0){

            aviso6 = "Debe ingresar el lugar de nacimiento";
            System.out.println(aviso6);
        }

        else{

            aviso6 = "Lugar de nacimiento guardado correctamente";
            System.out.println(aviso6);
        }
    }

}
