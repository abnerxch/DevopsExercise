import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class TestSexo {
    String expected4;
    String sexoPersona;

    @Test (groups= {"Testing Sexo"}, description = "Test male")
    public void testSexoM(){
        Sexo sexo = new Sexo();
        expected4 = "Masculino";
        sexoPersona = "M";
        sexo.val(sexoPersona);

        Assert.assertEquals(expected4, sexo.aviso4);
    }

    @Test (groups= {"Testing Sexo"}, description = "Test female")
    public void testSexoF(){
        Sexo sexo = new Sexo();
        expected4 = "Femenino";
        sexoPersona = "F";
        sexo.val(sexoPersona);

        Assert.assertEquals(expected4, sexo.aviso4);
    }

    @Test (groups= {"Testing Sexo"}, description = "Test invalid gender")
    public void testSexoInvalid(){
        Sexo sexo = new Sexo();
        expected4 = "Ingrese una opción válida";
        Random random = new Random();
        int letra = random.nextInt(26);
        switch (letra){
            case 0: sexoPersona = "A"; break;
            case 1: sexoPersona = "B"; break;
            case 2: sexoPersona = "C"; break;
            case 3: sexoPersona = "D"; break;
            case 4: sexoPersona = "E"; break;
            case 5: sexoPersona = "M"; break;
            case 6: sexoPersona = "G"; break;
            case 7: sexoPersona = "H"; break;
            case 8: sexoPersona = "I"; break;
            case 9: sexoPersona = "J"; break;
            case 10: sexoPersona = "K"; break;
            case 11: sexoPersona = "L"; break;
            default: sexoPersona = " "; break;

        }
        //sexoPersona = "A";
        sexo.val(sexoPersona);
        Assert.assertEquals(expected4, sexo.aviso4);
    }
}
