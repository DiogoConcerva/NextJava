import java.util.Scanner;

public class Exercicio03_Array {
    public static void main(String[] args) {
        /*
        Encontre o maior e o menor elementos de uma array de 1 dimensão.
         */

        int[] numeros = {-10, 28, -99, 1001, 99};
        int menor = 0, maior = 0;

        // Varrer e localizar menor e maior valor
        for (int i = 0; i < numeros.length; i++) {
            if (i == 0) {
                menor = numeros[i];
                maior = numeros[i];
            }
            else if (menor > numeros[i]){
                    menor = numeros[i];
                }
            else if (numeros[i] > maior){
                maior = numeros[i];
            }
        }
        System.out.printf("O menor número do array é %d e o maior é %d", menor, maior);
    }
}
