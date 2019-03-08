import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class TestNombre {
    String expected5;
    String largoNombre;

    @Test (groups= {"Testing Nombre"}, description = "Test invalid name")
    public void testNombreInvalid(){
        Nombre nombre = new Nombre();
        expected5 = "Debe ingresar el nombre";
        largoNombre ="";
        nombre.val(largoNombre);
        Assert.assertEquals(expected5, nombre.aviso5);
    }

    //@Test (groups= {"Testing Nombre"}, description = "Test valid name)
    public void testNombreCorrecto(){
        Nombre nombre = new Nombre();
        Random random = new Random();
        expected5 = "Nombre guardado correctamente";
        int nombreRandom = random.nextInt(21);
        if(nombreRandom == 0){
            largoNombre ="";
            expected5 = "Debe ingresar el nombre";
        }

        else {

            for(int i= 0; i <= nombreRandom; i++)
            {
                largoNombre += "C";
            }

        }
        //largoNombre ="";
        nombre.val(largoNombre);
        Assert.assertEquals(expected5, nombre.aviso5);
    }

    @Test (groups= {"Testing Nombre"}, description = "Test large name")
    public void testNombreLargo(){

        Nombre nombre = new Nombre();
        Random random = new Random();
        expected5 = "El nombre ingresado es demasiado largo";
        int nombreRandom = random.nextInt(100);
        if(nombreRandom >= 0 || nombreRandom <= 20){
            nombreRandom += 20;

            for(int j = 0; j <= nombreRandom; j++){
                largoNombre += "B";
            }
        }
        else {
            for(int i = 0; i <= nombreRandom; i++){
                largoNombre += "A";
            }
        }

        nombre.val(largoNombre);
        Assert.assertEquals(expected5, nombre.aviso5);

    }
}
