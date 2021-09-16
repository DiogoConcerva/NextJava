import java.text.DecimalFormat;
import java.util.Scanner;

public class Salario_1008 {
    public static void main(String[] args) {
        int numero, horas;
        double valor, salario;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o número do funcionário: ");
        numero = entrada.nextInt();
        System.out.print("Informe as horas trabalhadas: ");
        horas = entrada.nextInt();
        System.out.print("Informe o valor que o funcionário recebe: ");
        valor = entrada.nextDouble();
        salario = horas * valor;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ " + String.format("%.2f", salario).replace(",", "."));
    }
}
