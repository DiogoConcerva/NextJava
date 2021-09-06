import java.util.Scanner;

public class Esfera_1011 {
    public static void main(String[] args) {
        double raio = 0.0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor do raio: ");
        raio = entrada.nextDouble();

        System.out.printf("VOLUME = %.3f", ((4.0 / 3) * 3.14159 * Math.pow(raio, 3)));
    }
}
