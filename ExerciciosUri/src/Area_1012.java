import java.util.Scanner;

public class Area_1012 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe os valores para a, b e c na mesma linha separado por espaço: ");
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();

        System.out.println("TRIANGULO: " + String.format("%.3f", (a * c) / 2).replace(",", "."));
        System.out.println("CIRCULO: " + String.format("%.3f", 3.14159 * Math.pow(c, 2)).replace(",", "."));
        System.out.println("CIRCULO: " + String.format("%.3f", ((a + b) * c) / 2).replace(",", "."));
        System.out.println("QUADRADO: " +  String.format("%.3f", Math.pow(b, 2)).replace(",", "."));
        System.out.println("RETANGULO: " + String.format("%.3f", a * b).replace(",", "."));

        entrada.close();
    }
}
