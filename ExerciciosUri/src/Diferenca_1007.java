import java.util.Scanner;

public class Diferenca_1007 {
    public static void main(String[] args) {
        int a, b, c, d, diferenca;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        a = entrada.nextInt();
        System.out.print("Informe o segundo valor: ");
        b = entrada.nextInt();
        System.out.print("Informe o terceiro valor: ");
        c = entrada.nextInt();
        System.out.print("Informe o quarto valor: ");
        d = entrada.nextInt();
        diferenca = (a * b) - (c * d);

        System.out.println("DIFERENCA = " + diferenca);
    }
}
