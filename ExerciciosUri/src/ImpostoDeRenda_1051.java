import java.util.Scanner;

public class ImpostoDeRenda_1051 {
    public static void main(String[] args) {
        double salario;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o salário: R$ ");
        salario = sc.nextDouble();

        if (salario <= 2000.00){
            System.out.println("Isento");
        }
        else if (salario >= 2000.01 && salario <= 3000.00){
            System.out.println("R$ " + String.format("%.2f", salario * 0.08).replace(",", "."));
        }
        else if (salario >= 3000.01 && salario <= 4500.00){
            System.out.println("R$ " + String.format("%.2f", ((1000 * 0.08) + ((salario - 3000) * 0.18))).replace(",", "."));
        }
        else {
            System.out.println("R$ " + String.format("%.2f", ((1000 * 0.08) + (1499.99 * 0.18) + (salario - 4500.01) * 0.28)).replace(",", "."));
        }
        sc.close();
    }
}
