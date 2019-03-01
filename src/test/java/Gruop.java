import org.testng.annotations.Test;

public class Gruop {

    @Test (groups= "testing Devops")
    public void testEdadInvalid(){
        System.out.println("testEdadInvalid");
    }

    @Test (groups= "testing Devops")
    public void testEdadYounger(){
        System.out.println("Younger");
    }

    @Test (groups= "testing Devops")
    public void testEdadAdult(){
        System.out.println("Adult");
    }

    @Test (groups= "testing Devops")
    public void testIDInvalid1(){
        System.out.println("Invalid ID");
    }

    @Test (groups= "testing Devops")
    public void testIDInvalid2(){
        System.out.println("Invalid ID 2");

    }

    @Test (groups= "testing Devops")
    public void testIDPrimer(){
        System.out.println("ID primer semestre");

    }

    @Test (groups= "testing Devops")
    public void testNotaInvalid1(){
        System.out.println("Nota invalid");

    }

    @Test (groups= "testing Devops")
    public void testNotaRepro(){
        System.out.println("Reprobado");

    }

    @Test (groups= "testing Devops")
    public void testNotaApro(){
        System.out.println("Aprobado");

    }

    @Test (groups= "testing Devops")
    public void testSexoM(){
        System.out.println("Masculino");

    }

    @Test (groups= "testing Devops")
    public void testSexoF(){
        System.out.println("Femenino");

    }

    @Test (groups= "testing Devops")
    public void testSexoInvalid(){
        System.out.println("Sexo inválido");


    }

    @Test (groups= "testing Devops")
    public void testNombreInvalid(){
        System.out.println("Nombre inválido");

    }

    @Test (groups= "testing Devops")
    public void testNombreCorrecto(){
        System.out.println("Nombre correcto");
    }

    @Test (groups= "testing Devops")
    public void testNombreLargo(){
        System.out.println("Nombre largo");

    }

    @Test (groups= "testing Devops")
    public void testLugarLargo(){
        System.out.println("Lugar largo");

    }

    @Test (groups= "testing Devops")
    public void testLugarCorrecto(){
        System.out.println("Lugar correcto");

    }

    @Test (groups= "testing Devops")
    public void testLugarInvalid(){
        System.out.println("Lugar inválido");

    }
}
