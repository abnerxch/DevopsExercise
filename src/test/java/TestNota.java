import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class TestNota {
    String expected3;
    int notaPersona;

    @Test (groups= "testing Devops")
    public void testNotaInvalid1(){
        Nota nota = new Nota();
        Random random = new Random();
        //int max = 0; int min = -10
        notaPersona = random.nextInt(100);
        int newRandom = notaPersona * -1;
        //edadPersona = -1;
        expected3 = "Ingrese una opción válida";
        nota.val(newRandom);

        Assert.assertEquals(expected3, nota.aviso3);
    }

    @Test (groups= "testing Devops")
    public void testNotaRepro(){

        Nota nota = new Nota();
        Random random = new Random();
        notaPersona = random.nextInt(61);
        expected3 = "REPROBADO";
        nota.val(notaPersona);
        Assert.assertEquals(expected3, nota.aviso3);
    }

    @Test (groups= "testing Devops")
    public void testNotaApro(){

        Nota nota = new Nota();
        Random random = new Random();
        notaPersona = random.nextInt(101);

        if(notaPersona<=60){

            expected3 = "REPROBADO";
        }

        else{
            expected3 = "APROBADO";
        }


        nota.val(notaPersona);
        Assert.assertEquals(expected3, nota.aviso3);
    }
}
