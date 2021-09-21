package Ex01;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private Double altura;

    public Pessoa(String nome, String dataNascimento, Double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    // Exibe resultado de nome, data de nascimento e altura como String via janela
    public void imprimirDados(Long idade){
        JOptionPane.showMessageDialog(null,
                "Nome: " + this.getNome() + "\nData de nascimento: " + this.getDataNascimento() +
                        "\nAltura: " + this.getAltura() + "\nIdade: " + idade + " anos","Resultado", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    // Método calcular idade
    public Long calcularIdade() throws ParseException {
        // Formato da data
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // Data atual tipo String
        String hoje = simpleDateFormat.format(new Date());

        // Data de nascimento e atual tipo Date
        Date nascimento = simpleDateFormat.parse(this.dataNascimento);
        Date atual = simpleDateFormat.parse(hoje);

        // Calculado da diferença de dias em Milissegundos
        long diff = atual.getTime() - nascimento.getTime();

        // Calculo para transformar em dias
        TimeUnit time = TimeUnit.DAYS;
        long diferenca = time.convert(diff, TimeUnit.MILLISECONDS);

        // Retorna resultado em dias
        return (diferenca / 365);
    }
}
