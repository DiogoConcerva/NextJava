import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioComBonus_1009 {
    public static void main(String[] args) {
        double salario, vendasTotal, comissao;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o nome do vendedor: ");
        entrada.next();
        System.out.print("Informe o salário do vendedor: ");
        salario = entrada.nextDouble();
        System.out.print("Informe o total vendido pelo funcionário: ");
        vendasTotal = entrada.nextDouble();
        comissao = vendasTotal * 0.15;

        System.out.printf("TOTAL = R$ " + String.format("%.2f", comissao + salario).replace(",", "."));

        entrada.close();
    }
}
