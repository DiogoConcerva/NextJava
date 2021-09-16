import java.util.Scanner;

public class FormulaDeBhaskara_1036 {
    public static void main(String[] args) {
        double a, b, c, delta;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe os valores para A, B e C separado por espaço: ");
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();

        delta = (Math.pow(b, 2) - 4 * a * c);

        if ((a == 0) || (delta < 0)){
            System.out.print("Impossivel calcular");
        }
        else {
            System.out.println("R1 = " + String.format("%.5f", ((-b + Math.sqrt(delta)) / (2 * a))).replace(",", "."));
            System.out.println("R2 = " + String.format("%.5f", ((-b - Math.sqrt(delta)) / (2 * a))).replace(",", "."));
        }
        entrada.close();
    }
}
