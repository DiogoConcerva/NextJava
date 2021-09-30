import javax.swing.*;
import java.util.Arrays;

public class Ex_12_8 {
    public static void main(String[] args) {
        // Variáveis
        String numero;
        int[] numeros = new int[3];

        // Entrada de dados
        for (int i = 0; i < numeros.length; i++) {
            numero = JOptionPane.showInputDialog("Informe o " + (i + 1) + "º número:");
            numeros[i] = Integer.parseInt(numero);
        }

        // Ordena array e mostra em ordem decrescente
        Arrays.sort(numeros);

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        // Encerra programa
        System.exit(0);
    }
}
