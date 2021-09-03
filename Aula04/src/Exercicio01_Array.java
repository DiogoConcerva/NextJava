import java.util.Scanner;

public class Exercicio01_Array {
    public static void main(String[] args) {

        /*
        Pegue um array com 10 inteiras e copie todos os elementos em um novo array, mas na ordem inversa.
         */

        final int TAMANHO = 10;
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[TAMANHO];
        int[] inverter = new int[TAMANHO];
        int pos = 0;

        // Preencher vetor principal
        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite um valor: ");
            numeros[i] = entrada.nextInt();
        }

        // Preencher vetor no sentido inverso
        for (int i = numeros.length; i > 0 ; i--) {
            inverter[pos] = numeros[i - 1];
            pos++;
        }

        // Mostra vetor invertido
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(inverter[i] + " ");
        }
    }
}
