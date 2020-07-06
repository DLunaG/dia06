import java.util.Scanner;

public class PrimerEjercicioDia06 {
    //Pide dós nº, haz algo con ellos e intercambia las variables. Un swap

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nº entero cualquiera: ");
        int a = sc.nextInt();
        System.out.println("Introduce el segundo nº entero: ");
        int b = sc.nextInt();
        System.out.println("Los números son:\n" +
                "a = "+a+"\n" +
                "b = "+b);
        System.out.println("Su suma es: "+(a+b));
        System.out.println("Se va a proceder a intercambiar los números (swap).");
        int z = a;
        a = b;
        b = z;
        System.out.println("Ahora, los números son:\n" +
                "a = "+a+"\n" +
                "b = "+b);

        //Ahora, intentar hacerlo sin variables auxiliar:
        System.out.println("Escribe otro nº: ");
        int i = sc.nextInt();
        System.out.println("Escribe otro nº: ");
        int j = sc.nextInt();
        System.out.println("Ok, los números son: \n" +
                "i = "+i+"\n" +
                "j = "+j);
        System.out.println("Se va a proceder a intercambiarlos sin utilizar otra variable: ");
            i = j + i;
            j = i - j;
            i = i - j;
        System.out.println("Ahora, los números son: ");
        System.out.println("i = "+i);
        System.out.println("j = "+j);
    }
}
