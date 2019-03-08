import java.util.Scanner;

public class Main {
    static Edad edad = new Edad();
    static Sexo sexo = new Sexo();
    static Nota nota = new Nota();
    static ID id = new ID();
    static Nombre nombre = new Nombre();
    static Nacimiento nacimiento = new Nacimiento();

    public static void main(String[] args) {

        int op;
        Scanner sc= new Scanner (System.in);
        do{
            op =menu();
            switch(op){
                case 1:
                    //Insert name option
                    String no;
                    System.out.println("Ingrse su nombre");
                    no = sc.nextLine();
                    nombre.val(no);
                    break;

                case 2:
                    //Insert age option
                    int ed;
                    System.out.println("Ingrese su edad");
                    ed = sc.nextInt();

                    edad.val(ed);
                    break;

                case 3:
                    //Add gender option
                    String s;
                    System.out.println("Ingrese su sexo");
                    s = sc.nextLine();
                    s = s.toUpperCase();
                    System.out.println(s);
                    sexo.val(s);
                    break;

                case 4:
                    //Add place option
                    String na;
                    System.out.println("Ingrse su lugar de nacimiento");
                    na = sc.nextLine();
                    nacimiento.val(na);
                    break;

                case 5:
                    //Insert ID option
                    int i;
                    System.out.println("Ingrese su ID");
                    i = sc.nextInt();
                    id.val(i);

                    break;
                case 6:
                    //Grades option
                    int n;
                    System.out.println("Ingrese su calificación");
                    n = sc.nextInt();
                    nota.val(n);
                    break;
                case 0:
                    //Program out
                    System.out.println("Usted ha salido del programa");

                    break;
            }


        }while(op!=0);


    }

    public static int menu(){
        //main menu, for users
        int op;
        Scanner sc= new Scanner (System.in);
        do{
            System.out.println("Información del Usuario");
            System.out.println("1. Nombre");
            System.out.println("2. Edad");
            System.out.println("3. Sexo");
            System.out.println("4. Lugar de nacimiento");
            System.out.println("5. ID");
            System.out.println("6. Nota Obtenida");
            System.out.println("0. Datos completos. SALIR");
            op = sc.nextInt();


        }while (op <0 || op >11);
        return op;
    }
}
