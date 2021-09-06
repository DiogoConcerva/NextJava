import java.util.Scanner;

public class Area_1012 {
    public static void main(String[] args) {
        double a = 0.0, b = 0.0, c = 0.0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe os valores para a, b e c na mesma linha separado por espaço: ");
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();

        System.out.printf("TRIANGULO: %.3f%n", ((a * c) / 2));
        System.out.printf("CIRCULO: %.3f%n", (3.14159 * Math.pow(c, 2)));
        System.out.printf("CIRCULO: %.3f%n", ((a + b) * c) / 2);
        System.out.printf("QUADRADO: %.3f%n", (Math.pow(b, 2)));
        System.out.printf("RETANGULO: %.3f%n", (a * b));
    }
}
