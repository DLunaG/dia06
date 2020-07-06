import java.util.Scanner;

public class ImpuestoAcortado {

    public static void main(String[] args) {
        double dinero;
        double impuestos =0;

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
                "El total de impuestos que debes son: "+impuestos+"€. \n" +
                "El porcentaje total de los impuestos sobre tu renta ha sido del "+(impuestos/dinero*100));
    }
}
