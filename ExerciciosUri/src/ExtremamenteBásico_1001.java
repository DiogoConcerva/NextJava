import java.util.Scanner;

public class ExtremamenteBásico_1001 {
    public static void main(String[] args) {
        int a, b, soma;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        a = entrada.nextInt();
        System.out.print("Informe o segundo valor: ");
        b = entrada.nextInt();
        soma = a + b;

        System.out.println("X = " + soma);
        entrada.close();
    }
}
