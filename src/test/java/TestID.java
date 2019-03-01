import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class TestID {
    String expected2;
    int IDPersona;

    @Test
    public void testIDInvalid1(){

        ID id  = new ID();
        Random random = new Random();
        //int max = 0; int min = -10
        IDPersona = random.nextInt(100);
        int newRandom = IDPersona * -1;
        //edadPersona = -1;
        expected2 = "Ingrese un ID válido";
        id.val(newRandom);

        Assert.assertEquals(expected2, id.aviso2);
    }

    @Test
    public void testIDInvalid2(){
        ID id  = new ID();
        Random random = new Random();
        //int max = 0; int min = -10
        IDPersona = random.nextInt(1000);
        //int newRandom = IDPersona + 1000;
        //edadPersona = -1;
        expected2 = "Ingrese un ID válido";
        id.val(IDPersona);

        Assert.assertEquals(expected2, id.aviso2);
    }

    @Test
    public void testIDPrimer(){
        ID id  = new ID();
        Random random = new Random();
        //int max = 0; int min = -10
        IDPersona = random.nextInt(501);
        int newRandom = IDPersona + 1000;
        //edadPersona = -1;
        expected2 = "Primer Semestre";
        id.val(newRandom);

        Assert.assertEquals(expected2, id.aviso2);

    }

}
