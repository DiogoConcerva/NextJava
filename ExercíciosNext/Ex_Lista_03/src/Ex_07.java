import javax.swing.*;

public class Ex_07 {
    public static void main(String[] args) {
        // Variáveis
        String lado1;
        String lado2;
        String lado3;

        // Entrada de dados
        lado1 = JOptionPane.showInputDialog("Informe a medida do lado 1:");
        lado2 = JOptionPane.showInputDialog("Informe a medida do lado 2:");
        lado3 = JOptionPane.showInputDialog("Informe a medida do lado 3:");

        // Declara variavel e transforma em int
        int inf1 = Integer.parseInt(lado1);
        int inf2 = Integer.parseInt(lado2);
        int inf3 = Integer.parseInt(lado3);

        // Verifica se pode formar um triângulo
        if ((inf1 + inf2 > inf3) && (inf2 + inf3 > inf1) && (inf1 + inf3 > inf2)){
            if (inf1 == inf2 && inf2 == inf3){
                JOptionPane.showMessageDialog(null, "Tiângulo equilátero.");
            }
            else if (inf1 != inf2 && inf2 != inf3 && inf3 != inf1){
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
