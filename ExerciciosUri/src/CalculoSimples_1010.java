import java.util.Scanner;

public class CalculoSimples_1010 {
    public static void main(String[] args) {
        int numeroPecas1, numeroPecas2;
        double valor1, valor2, total1, total2;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe 1: Cód. Peça, Nº de Peças e Valor Unitário separado apenas por espaço: ");
        entrada.nextInt();
        numeroPecas1 = entrada.nextInt();
        valor1 = entrada.nextDouble();
        total1 = numeroPecas1 * valor1;

        System.out.print("Informe 2: Cód. Peça, Nº de Peças e Valor Unitário separado apenas por espaço: ");
        entrada.nextInt();
        numeroPecas2 = entrada.nextInt();
        valor2 = entrada.nextDouble();
        total2 = numeroPecas2 * valor2;

        System.out.printf("VALOR A PAGAR: R$ " + String.format("%.2f",total1 + total2).replace(",", "."));

    }
}
