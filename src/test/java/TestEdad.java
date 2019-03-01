
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class TestEdad {
    String expected1;
    int edadPersona;

    @Test
    public void testEdadInvalid(){
        Edad edad = new Edad();
        Random random = new Random();
        //int max = 0; int min = -10
        edadPersona = random.nextInt(100);
        int newRandom = edadPersona * -1;
        //edadPersona = -1;
        expected1 = "Ingrese una opción válidad";
        edad.val(newRandom);
        Assert.assertEquals(edad.aviso1, expected1);
    }

    @Test
    public void testEdadYounger(){
        Edad edad = new Edad();
        Random random = new Random();
        edadPersona = random.nextInt(19);
        expected1 = "Younger";
        edad.val(edadPersona);
        Assert.assertEquals(edad.aviso1, expected1);
    }

    @Test
    public void testEdadAdult(){
        Edad edad = new Edad();
        Random random = new Random();
        int lim1 = random.nextInt(999);
        //int lim2 = random.nextInt(999);
        int liminf = lim1 + 18;
        //int limsup = lim2 + 19;

        expected1 = "Adult";
        edad.val(liminf);
        Assert.assertEquals(edad.aviso1, expected1);
    }
}
