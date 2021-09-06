import java.util.Scanner;

public class SomaSimples_1003 {
    public static void main(String[] args) {
        int a = 0, b = 0, soma = 0;

        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        a = entrada1.nextInt();
        System.out.print("Informe o segundo valor: ");
        b = entrada2.nextInt();
        soma = a + b;

        System.out.println("SOMA = " + soma );
    }
}
