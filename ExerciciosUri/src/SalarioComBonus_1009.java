import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioComBonus_1009 {
    public static void main(String[] args) {
        String nome = "";
        double salario = 0.0, vendasTotal = 0.0, comissao = 0.0;
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);

        System.out.print("Informe o nome do vendedor: ");
        nome = entrada1.nextLine();
        System.out.print("Informe o salário do vendedor: ");
        salario = entrada2.nextDouble();
        System.out.print("Informe o total vendido pelo funcionário: ");
        vendasTotal = entrada3.nextDouble();
        comissao = vendasTotal * 0.15;

        System.out.printf("TOTAL = R$ %.2f", comissao + salario);
    }
}
