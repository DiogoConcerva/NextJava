package Ex02;

import java.util.ArrayList;
import java.util.List;

public class Informacoes {
    // Variáveis
    private String nome;
    private int idade;
    private float altura;

    // Contrutor
    public Informacoes(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Getters and Seters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // Lista todas as informações
    @Override
    public String toString() {
        return "Nome = '" + nome + '\'' +
                ", Idade = " + idade +
                ", Altura = " + altura;
    }
}
