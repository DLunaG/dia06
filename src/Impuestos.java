import java.util.Scanner;

public class Impuestos {
// Los impuesto se pagan con tramos: los primeros 20.000 tasa de 0%
// los siguientes 20.000 tasa del 10%, los siguientes 20.000 tasa del 20%
// a partir de ahi, el 30%
// Dada una cifra, hay que averiguar cuantos impuestos tiene que pagar.

    public static void main(String[] args) {
        double impuestoTotal = 0;
        double dineroACalcular;
        double dineroInicial;

        Scanner sc = new Scanner(System.in);
        System.out.println("Hola, pequeño defraudador en potencia . Introduce los ingresos del último año y te diré cuánto has de pagar: ");
        dineroACalcular = sc.nextDouble(); //ej = 18.000 , 43.000
        dineroInicial = dineroACalcular;
        System.out.println("Has ganado "+dineroACalcular+"€");
        if (dineroACalcular <= 20_000){
            System.out.println("No tienes porqué pagar impuestos. Enhorabuena, eres pobre.");
        }else if (dineroACalcular > 20_000){
            dineroACalcular -= 20_000;
            if (dineroACalcular <= 20_000){
                impuestoTotal = dineroACalcular*0.1;
                System.out.println("Tienes que pagar "+impuestoTotal+"€ de impuestos.");
            }else if (dineroACalcular > 20_000){
                impuestoTotal = 2_000;
                dineroACalcular -= 20_000;
                if (dineroACalcular <= 20_000){
                    impuestoTotal += dineroACalcular*0.2;
                    System.out.println("Tienes que pagar "+impuestoTotal+"€ de impuestos.");
                }else if (dineroACalcular > 20_000){
                    impuestoTotal += 4_000;
                    dineroACalcular -= 20_000;
                    impuestoTotal += dineroACalcular*0.3;
                    System.out.println("Tienes que pagar "+impuestoTotal+"€ de impuestos.");
                }
            }
        }
        System.out.println("El porcentaje de impuesto total sobre tu dinero es del "+(impuestoTotal/dineroInicial*100)+"%");
    }
}
