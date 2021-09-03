import java.util.Scanner;

public class Exercicio04_Array {
    public static void main(String[] args) {
        /*
        Pegue um array de 10 elementos, divida-o ao meio, agora imprima o maior elemento de cada parte.
         */

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int maiorPrimeiro = 0;
        int maiorSegundo = 0;

        // Preenche vetor
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº valor: ", i + 1);
            numeros[i] = entrada.nextInt();
        }

        // Localiza o maior valor entre os 5 primeiros
        for (int i = 0; i < numeros.length/2; i++) {
            if (i == 0) {
                maiorPrimeiro = numeros[i];
            }
            else if (numeros[i] > maiorPrimeiro){
                maiorPrimeiro = numeros[i];
            }
        }

        // Localizar o maior na última parte do array
        for (int i = 5; i < numeros.length; i++) {
            if (i == 5) {
                maiorSegundo = numeros[i];
            }
            else if (numeros[i] > maiorSegundo){
                maiorSegundo = numeros[i];
            }
        }
        System.out.println("Do 1º ao 5º elemento o maior é: " + maiorPrimeiro);
        System.out.println("Do 6º ao 10º elemento o maior é: " + maiorSegundo);
    }
}
