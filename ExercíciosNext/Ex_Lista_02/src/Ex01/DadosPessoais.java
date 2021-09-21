package Ex01;

import javax.swing.*;
import java.text.ParseException;

public class DadosPessoais {
    public static void main(String[] args) throws ParseException {

        // Declaração de variáveis
        String nome;
        String dataNascimento;
        String altura;

        // Recebe nome, data de nascimento e altura como String via janela
        nome = JOptionPane.showInputDialog("Informe seu nome:");
        dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento dd/mm/aaaa");
        altura = JOptionPane.showInputDialog("Informe a sua altura:");

        // Cria objeto
        Pessoa pessoa = new Pessoa(nome, dataNascimento, Double.parseDouble(altura));

        // Imprime informações
        Long idade = pessoa.calcularIdade();
        pessoa.imprimirDados(idade);


        // Encerra o programa
        System.exit(0);
    }
}
