import java.text.DecimalFormat;
import java.util.Scanner;

public class Salario_1008 {
    public static void main(String[] args) {
        int numero = 0, horas = 0;
        double valor = 0.0, salario = 0.0;
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);

        System.out.print("Informe o número do funcionário: ");
        numero = entrada1.nextInt();
        System.out.print("Informe as horas trabalhadas: ");
        horas = entrada2.nextInt();
        System.out.print("Informe o valor que o funcionário recebe: ");
        valor = entrada3.nextDouble();
        salario = horas * valor;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f", salario);
    }
}
