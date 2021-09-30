import javax.swing.*;

public class Ex_02 {
    private static final double VENDAS_EFETUADAS = 0.05;
    public static void main(String[] args) {
        // Variáveis
        String salarioFixo;
        String comissao;
        String carrosVendidos;
        String valorTotal;
        String valorCarroVendido;

        // Informações de venda
        carrosVendidos = JOptionPane.showInputDialog("Quantos carros o funcionário vendeu:");
        valorTotal = JOptionPane.showInputDialog("O valor total de suas vendas:");
        salarioFixo = JOptionPane.showInputDialog("Salário fixo:");
        valorCarroVendido = JOptionPane.showInputDialog("Quanto recebeu por carro vendido:");

        // Declara e transformar String em double
        double quantidadeCarros = Double.parseDouble(carrosVendidos);
        double totalVendas = Double.parseDouble(valorTotal);
        double salrio = Double.parseDouble(salarioFixo);
        double carroVendido = Double.parseDouble(valorCarroVendido);

        // Informação do salário final
        JOptionPane.showMessageDialog(null, "O salário final é R$ " +
                String.format("%.2f",
                        (salrio + (totalVendas * VENDAS_EFETUADAS) + (quantidadeCarros * carroVendido))));

        // Encerra programa
        System.exit(0);
    }
}
