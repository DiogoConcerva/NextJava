import java.util.Scanner;

public class DividindoXporY_1116 {
    public static void main(String[] args) {
        int qtd = 0;
        double resultado = 0.0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe quantos pares serão lidos: ");
        qtd = entrada.nextInt();
        int [] num1 = new int[qtd];
        int [] num2 = new int[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.print("Informe os 2 números separados por espaço: ");
            num1[i] = entrada.nextInt();
            num2[i] = entrada.nextInt();
        }
        for (int i = 0; i < qtd; i++) {
            if (num2[i] == 0){
                System.out.println("divisao impossivel");
            }
            else{
                resultado = (double) num1[i] / (double) num2[i];
                System.out.println(String.format("%.1f", resultado).replace(",", "."));
            }
        }
        entrada.close();
    }
}
