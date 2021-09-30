import javax.swing.*;

public class Ex_06 {
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
        double media = ((nota1 * PESO1) + (nota2 * PESO2)) / (PESO1 + PESO2);

        // Informa resultado
        if (media > 7){
            JOptionPane.showMessageDialog(null, "Aluno aprovado com média: " +
                    String.format("%.2f", media));
        }
        else if (media > 4 && media < 6.9){
            JOptionPane.showMessageDialog(null, "Aluno na final com média: " +
                    String.format("%.2f", media));
        }
        else {
            JOptionPane.showMessageDialog(null, "Aluno reprovado com média: " +
                    String.format("%.2f", media));
        }

        // Encerra programa
        System.exit(0);
    }
}
