import javax.swing.*;

public class Ex_01 {
    private static final double PERCENTUAL_DISTRIBUIDOR = 0.28;
    private static final double PERCENTUAL_IMPOSTOS = 0.45;

    public static void main(String[] args) {
        // Variáveis
        double somaImpostos = PERCENTUAL_DISTRIBUIDOR + PERCENTUAL_IMPOSTOS;
        String custo;
        double custoFabrica;

        // Lê o custo de fábrica do carro
        custo = JOptionPane.showInputDialog("Custo de fábrica do carro:");

        // Converte String para double
        custoFabrica = Double.parseDouble(custo);

        JOptionPane.showMessageDialog(null, "O carro terá um custo final de: " +
                String.format("%.2f",(custoFabrica * somaImpostos) + custoFabrica));


        //Encerra programa
        System.exit(0);
    }
}
