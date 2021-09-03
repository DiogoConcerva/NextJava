import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        // Cria objeto para ler entrada
        Scanner entrada = new Scanner(System.in);
        // Cria e inicializa a variável fatorial
        int fatorial = 0;

        // Aguarda entrada no terminal
        System.out.print("Digite um valor para o fatorial: ");
        // Recebendo a entrada
        fatorial = entrada.nextInt();

        // Calcula fatorial
        for(int cont = fatorial; cont > 1; cont--){
            fatorial = fatorial * (cont - 1);
        }
        // Imprime resultado
        System.out.println("O resultado do fatorial é: " + fatorial);
        // Encerra o programa
        entrada.close();
    }
}
