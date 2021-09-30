import javax.swing.*;

public class Ex_04 {
    private static final int PESO1 = 4;
    private static final int PESO2 = 7;
    public static void main(String[] args) {
        // Variáveis
        String numero1;
        String numero2;

        // Entreda de dados
        numero1 = JOptionPane.showInputDialog("Informe a primeira nota:");
        numero2 = JOptionPane.showInputDialog("Informe a segunda nota:");

        // Declara e tranforma em double
        double nota1 = Double.parseDouble(numero1);
        double nota2 = Double.parseDouble(numero2);

        // Informa resultado
        JOptionPane.showMessageDialog(null, "A média ponderada dos números é: " +
                String.format("%.2f", (((nota1 * PESO1) + (nota2 * PESO2)) / (PESO1 + PESO2))));

        // Encerra programa
        System.exit(0);
    }
}
