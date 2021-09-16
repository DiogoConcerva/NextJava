import java.util.Scanner;

public class NúmeroPrimo_1165 {
    public static void main(String[] args) {
        int qtd, total = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantos números deseja saber se é primo: ");
        qtd = sc.nextInt();
        int numeros[] = new int[qtd];

        for (int i = 0; i < qtd; i++){
            System.out.print("Informe o valor para verificação: ");
            numeros[i] = sc.nextInt();
        }

        for (int n:numeros) {
            int cont = n;
            while (cont >= 1){
                if (n % cont == 0){
                    total += 1;
                }
                cont -= 1;
            }
            if (total == 2) {
                System.out.println(n + " eh primo");
                total = 0;
            }
            else {
                System.out.println(n + " nao eh primo");
                total = 0;
            }
        }
        sc.close();
    }
}
