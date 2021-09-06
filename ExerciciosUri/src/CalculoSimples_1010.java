import java.util.Scanner;

public class CalculoSimples_1010 {
    public static void main(String[] args) {
        int codigoPeca1 = 0, numeroPecas1 = 0, codigoPeca2 = 0, numeroPecas2 = 0;
        double valor1 = 0.0, valor2 = 0.0, total1 = 0.0, total2 = 0.0;
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        System.out.print("Informe 1: Cód. Peça, Nº de Peças e Valor Unitário separado apenas por espaço: ");
        codigoPeca1 = entrada1.nextInt();
        numeroPecas1 = entrada1.nextInt();
        valor1 = entrada1.nextDouble();
        total1 = numeroPecas1 * valor1;

        System.out.print("Informe 2: Cód. Peça, Nº de Peças e Valor Unitário separado apenas por espaço: ");
        codigoPeca2 = entrada1.nextInt();
        numeroPecas2 = entrada1.nextInt();
        valor2 = entrada1.nextDouble();
        total2 = numeroPecas2 * valor2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", (total1 + total2));

    }
}
