import java.sql.SQLOutput;
import java.util.Scanner;

public class ImpuestoAcortado {

    public static void main(String[] args) {
        double dinero;
        double impuestos = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuánto dinero has cobrado este último año? Vamos a calcular los impuestos que debes pagar.");
        dinero = sc.nextDouble();
        if (dinero > 60_000){
            impuestos += 6_000 + ((dinero-60_000)*0.3);
        }else if (dinero > 40_000){
            impuestos += 2_000 + ((dinero-40_000)*0.2);
        }else if (dinero > 20_000){
            impuestos = (dinero-20_000)*0.1;
        }else{
            impuestos = 0;
        }
        System.out.println("El dinero que has ganado este año son "+dinero+"€.\n" +
                "El total de impuestos que debes son "+impuestos+"€. \n" +
                "El porcentaje total de los impuestos sobre tu renta ha sido del "+(impuestos/dinero*100)+"%");
        System.out.println(" ");

        System.out.println("Salario mensual: "+(dinero/12)+"€ brutos");
        System.out.println("Salario mensual (14 pagas): "+(dinero/14)+"€ brutos");
        System.out.println("Al mes debes "+(impuestos/12)+"€ y se te queda en "+((dinero/12)-(impuestos/12))+"€ netos");
        System.out.println("Al mes (con 14 pagas) debes "+(impuestos/14)+"€ y se te queda en "+((dinero/14)-(impuestos/14))+"€ netos");
    }
}
