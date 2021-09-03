import java.util.Scanner;

public class Exercicio02_Array {
    public static void main(String[] args) {
        /*
        Inicialize e imprima todos os elementos de um array 2D
         */

        final int TAM = 2;
        int[][] numeros = new int[TAM][TAM];
        Scanner entrada = new Scanner(System.in);
        int valor = 0;

        // Preencher array
        for (int i = 0 ; i < numeros.length; i++){
            for (int j = 0; j < numeros.length; j++){
                System.out.printf("Informe o valor para %d, %d: ", i, j);
                valor = entrada.nextInt();
                numeros[i][j] = valor;
            }
        }

        // Mostra valores
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++){
                System.out.printf("O valor digitado na posição %d, %d foi: %d%n", i, j, numeros[i][j]);
            }
        }
    }
}
