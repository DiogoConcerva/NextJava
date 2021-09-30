import javax.swing.*;

public class Ex_03 {
    public static void main(String[] args) {
        // Variáveis
        String temperatura;

        temperatura = JOptionPane.showInputDialog("Informe a temperatura em Fahrenheit:");

        // Declara variável e transforma em double
        double temperaturaCelsius = Double.parseDouble(temperatura);

        // Apresenta resultado
        JOptionPane.showMessageDialog(null,temperatura + " ºF equivale a " +
                String.format("%.2f", (temperaturaCelsius - 32) / 1.8) + " ºC.");

        // Encerra programa
        System.exit(0);
    }
}
