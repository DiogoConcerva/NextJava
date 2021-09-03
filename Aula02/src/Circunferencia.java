import java.util.Scanner;

public class Circunferencia{
    public static void main(String[] args) {
        // Aguarda entrada
        Scanner entrada = new Scanner(System.in);
        // Recebe a entrada
        System.out.println("Informe a medida do raio:");
        double raio = entrada.nextDouble();
        // Calcula raio
        double area = 3.14159 * Math.pow(raio, 2);
        // Calcula circunferência
        double circunferencia = 2 * 3.14159 * raio;
        // Mostra saídas
        System.out.println("A área é igual: ");
        System.out.printf("%.4f\n", area);
        // Se o raio for maior que 3.5
        if(raio > 3.5){
            System.out.println("A circunferência é igua a:");
            System.out.printf("%.4f\n", circunferencia);
        }
    }
}