import java.util.Scanner;

public class AreaCirculo{
    public static void main(String[] args) {
        // Aguarda entrada
        Scanner entrada = new Scanner(System.in);
        // Recebe a entrada
        System.out.println("Digite o valor do raio:");
        double raio = entrada.nextDouble();
        // Calcula raio
        double area = 3.14159 * Math.pow(raio, 2);
        // Mostra saídas
        System.out.println("A área é igual: ");
        System.out.printf("%.4f%n", area);
    }
}