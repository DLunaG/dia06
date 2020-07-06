import java.util.Scanner;

public class For {

    //Imprimir los primeros nº pares hasta el nº50.
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i += 2) {
            if (i % 5 == 0 && i != 0) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }

        }

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //Imprimir :
        //# # #
        //# # #
        //# # #
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("# ");
                if (j == 2) {
                    System.out.println();
                }
            }
        }

        //Pedir las dimensiones de un tablero e imprimirlo (patrón # - # - #...)

        Scanner sc = new Scanner(System.in);
        System.out.println("Se va a realizar un tablero, indica sus dimensiones: ");
        /*int dimension = sc.nextInt();
        for (int j = 0; j < dimension; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < dimension; i++) {
                    if (i % 2 == 0) {
                        System.out.print("#  ");
                    } else {
                        System.out.print("-  ");
                    }
                }
                System.out.println();
            } else {
                for (int k = 0; k < dimension; k++) {
                    if (k % 2 == 0) {
                        System.out.print("-  ");
                    } else {
                        System.out.print("#  ");
                    }
                }
                System.out.println();
            }
        }*/

        /*int dimension = sc.nextInt();
        for(int i = 0; i < dimension; i++){
            for(int j = 0; j < dimension; j++){
                if((i % 2 == 0 && j % 2 == 0)||(i % 2 != 0 && j % 2 != 0)){
                    System.out.print("#  ");
                }else{
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }*/
        int dimension = sc.nextInt();
        for(int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if ((i+j) % 2 == 0) {
                    System.out.print("#  ");
                }else {
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
    }
}

