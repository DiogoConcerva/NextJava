import java.util.Scanner;

public class Diferenca_1007 {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, d = 0, difernca = 0;
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);
        Scanner entrada4 = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        a = entrada1.nextInt();
        System.out.print("Informe o segundo valor: ");
        b = entrada2.nextInt();
        System.out.print("Informe o terceiro valor: ");
        c = entrada3.nextInt();
        System.out.print("Informe o quarto valor: ");
        d = entrada4.nextInt();
        difernca = (a * b) - (c * d);

        System.out.println("DIFERENCA = " + difernca);
    }
}
