import javax.swing.*;

public class Ex_12_7 {
    public static void main(String[] args) {
        // Variáveis
        String lado;
        //String lado2;
        //String lado3;
        int[] numeros = new int[3];

        // Entrada de dados
        for (int i = 0; i < numeros.length; i++) {
            lado = JOptionPane.showInputDialog("Informe a medida do lado " + (i + 1) + ": ");
            numeros[i] = Integer.parseInt(lado);
        }

        // Verifica se pode formar um triângulo
        if ((numeros[0] + numeros[1] > numeros[2]) &&
                (numeros[1] + numeros[2] > numeros[0]) &&
                (numeros[0] + numeros[2] > numeros[1])){
            if (numeros[0] == numeros[1] && numeros[1] == numeros[2]){
                JOptionPane.showMessageDialog(null, "Tiângulo equilátero.");
            }
            else if (numeros[0] != numeros[1] && numeros[1] != numeros[2] && numeros[2] != numeros[0]){
                JOptionPane.showMessageDialog(null, "Tiângulo escaleno.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Tiângulo isósceles.");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Não podemos forma um triângulo com essas medidas.");
        }

        // Encerra programa
        System.exit(0);
    }
}
