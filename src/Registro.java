import java.util.Scanner;

public class Registro {
    //Pedimos nombre, apellidos, fecha de nacimiento (int)
    //Escribimos la frase Hola + n + a + tienes X años.
    public static void main(String[] args) {
        String name;
        String subName;
        int birthDate;
        int años;

        Scanner sc = new Scanner(System.in);
        System.out.println("Buenos días, introduce tu nombre por favor: ");
        name = sc.nextLine();
        System.out.println("Hola, "+name+". Introduce tu apellido: ");
        subName = sc.nextLine();
        System.out.println("Pon tu año de nacimiento " + subName);
        birthDate = sc.nextInt();
        años = 2020 - birthDate;
        System.out.println("Hola "+name+" "+subName+". Tienes "+(años-1)+"/"+años+" años.");


    }
}
