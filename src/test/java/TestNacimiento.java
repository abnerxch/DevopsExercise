import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class TestNacimiento {

    String expected6;
    String lugarPersona;

    @Test (groups= "testing Devops")
    public void testLugarInvalid(){
        Nacimiento nacimiento = new Nacimiento();
        expected6 = "Debe ingresar el lugar de nacimiento";
        lugarPersona ="";
        nacimiento.val(lugarPersona);
        Assert.assertEquals(expected6, nacimiento.aviso6);
    }

    @Test (groups= "testing Devops")
    public void testLugarCorrecto(){
        Nacimiento nacimiento = new Nacimiento();
        Random random = new Random();
        expected6 = "Lugar de nacimiento guardado correctamente";
        int nombreRandom = random.nextInt(31);
        if(nombreRandom == 0){
            lugarPersona ="";
            expected6 = "Debe ingresar el lugar de nacimiento";
        }

        else {

            for(int i = 0; i <= nombreRandom; i++){
                lugarPersona += "C";
            }

        }
        //largoNombre ="";
        nacimiento.val(lugarPersona);
        Assert.assertEquals(expected6, nacimiento.aviso6);
    }

    @Test (groups= "testing Devops")
    public void testLugarLargo(){

        Nacimiento nacimiento = new Nacimiento();
        Random random = new Random();
        expected6 = "El lugar ingresado es demasiado largo";
        int nombreRandom = random.nextInt(100);
        if(nombreRandom >= 0 || nombreRandom <= 30){
            nombreRandom += 30;

            for(int j = 0; j <= nombreRandom; j++){
                lugarPersona += "B";
            }
        }
        else {
            for(int i = 0; i <= nombreRandom; i++){
                lugarPersona += "A";
            }
        }

        nacimiento.val(lugarPersona);
        Assert.assertEquals(expected6, nacimiento.aviso6);

    }

}
