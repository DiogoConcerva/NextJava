import java.util.Scanner;

public class NúmeroPerfeito_1164 {
    public static void main(String[] args) {
        int qtd, soma = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe quantos casos deseja testar: ");
        qtd = entrada.nextInt();
        int [] numeros = new int[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite o valor: ");
            numeros[i] = entrada.nextInt();
        }

        for (int n:numeros) {
            int cont = n;
            while (cont > 1){
                cont -= 1;
                if (n % cont == 0){
                    soma += cont;
                }
            }
            if (soma == n){
                System.out.println(n + " eh perfeito");
                soma = 0;
            }
            else {
                System.out.println(n + " nao eh perfeito");
                soma = 0;
            }
        }
        entrada.close();
    }
}
