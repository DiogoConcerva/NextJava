import javax.swing.*;

public class Ex_08 {
    public static void main(String[] args) {
        // Variáveis
        String numero1;
        String numero2;
        String numero3;

        // Entrada de dados
        numero1 = JOptionPane.showInputDialog("Informe o primeiro número:");
        numero2 = JOptionPane.showInputDialog("Informe o segundo número:");
        numero3 = JOptionPane.showInputDialog("Informe o terceiro número:");

        // Declara e transforma em int
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        int num3 = Integer.parseInt(numero3);

        // Informa resultado
        if (num1 > num2){
            if (num1 > num3){
                if (num2 > num3){
                    JOptionPane.showMessageDialog(null, "Os números em ordem decrescente é: " +
                            num1 + ", " + num2 + ", " + num3 + ".");
                }else {
                    JOptionPane.showMessageDialog(null, "Os números em ordem decrescente é: " +
                            num1 + ", " + num3 + ", " + num2 + ".");
                }
            }
        }
        if (num1 < num2){
            if (num2 > num3){
                if (num1 > num3){
                    JOptionPane.showMessageDialog(null, "Os números em ordem decrescente é: " +
                            num2 + ", " + num1 + ", " + num3 + ".");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Os números em ordem decrescente é: " +
                            num2 + ", " + num3 + ", " + num1 + ".");
                }
            }
        }
        if (num1 < num2) {
            if (num2 < num3) {
                JOptionPane.showMessageDialog(null, "Os números em ordem decrescente é: " +
                        num3 + ", " + num2 + ", " + num1 + ".");
            }
        }
        if (num1 > num2){
            if (num1 < num3){
                JOptionPane.showMessageDialog(null, "Os números em ordem decrescente é: " +
                        num3 + ", " + num1 + ", " + num2 + ".");
            }
        }
        // Encerra programa
        System.exit(0);
    }
}
