import javax.swing.*;

public class Ex_05 {
    public static void main(String[] args) {
        // Variáveis
        String numero;

        // Entrada de informações
        numero = JOptionPane.showInputDialog("Informe um número: ");

        // Declara variavel e tranforma em int
        int numeroPar = Integer.parseInt(numero);


        // Informa resultado
        if (numeroPar % 2 == 0){
            JOptionPane.showMessageDialog(null, "O número " + numeroPar + " é par.");
        }
        else {
            JOptionPane.showMessageDialog(null, "O número " + numeroPar + " é ímpar.");
        }

        // Encerra programa
        System.exit(0);
    }
}
