package Ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        // Variáveis
        String nome;
        int idade;
        int index;
        final int TAMANHO = 10;
        int cont = 0;
        float altura;
        int escolha;

        // Guardar informações
        ArrayList<Informacoes> informacoes = new ArrayList<>();

        // Leitura de entrada
        Scanner entrada = new Scanner(System.in);

        // Executar escolha do menu
        do {
            // Menu
            System.out.println("------------ MENU AGENDA ------------");
            System.out.println("[ 1 ] Incluir informações");
            System.out.println("[ 2 ] Excluir informações");
            System.out.println("[ 3 ] Buscar index de informações");
            System.out.println("[ 4 ] Imprimir informações da agenda");
            System.out.println("[ 5 ] Imprimir informação específica");
            System.out.println("[ 6 ] Encerra programa");
            System.out.print("Informe sua escolha: ");

            // Escolha do menu
            escolha = entrada.nextInt();
            System.out.println("-------------------------------------");

            switch (escolha){
                case 1:
                    if (cont == TAMANHO){
                        System.out.println("Agenda cheia!!!");
                    }
                    else {
                        System.out.println("Informe um nome:");
                        nome = entrada.next();
                        System.out.println("Informe a idade:");
                        idade = entrada.nextInt();
                        System.out.println("Informe a altura:");
                        altura = entrada.nextFloat();
                        cont += 1;
                        armazenaPessoa(nome, idade, altura, informacoes);
                    }
                    break;
                case 2:
                    if (cont == 0){
                        System.out.println("Agenda vazia!!!");
                    }
                    else {
                        System.out.println("Informe o nome para remoção: ");
                        nome = entrada.next();
                        for (Informacoes dados:informacoes) {
                            int achou;
                            if (dados.getNome().equals(nome)){
                                achou = informacoes.indexOf(dados);
                                removePessoa(achou, informacoes);
                                cont -= 1;
                                break;
                            }
                        }
                        System.out.println("Nome não encontrado!!!");
                    }
                    break;
                case 3:
                    if (cont == 0){
                        System.out.println("Agenda vazia!!!");
                    }
                    else {
                        System.out.println("Digite o nome da pessoa para buscar sua localização:");
                        nome = entrada.next();
                        for (Informacoes dados:informacoes) {
                            if (dados.getNome().equals(nome)){
                                int achou;
                                achou = informacoes.indexOf(dados);
                                System.out.printf("%s encontra-se na posição %d%n", nome, achou);
                                break;
                            }
                            else {
                                System.out.println("Nome não encontrado!");
                            }
                        }
                    }
                    break;
                case 4:
                    if (informacoes.isEmpty()){
                        System.out.println("Agenda vazia!!!");
                    }
                    imprimeAgenda(informacoes);
                    break;
                case 5:
                    System.out.println("Informe o index para imprimir dados: ");
                    index = entrada.nextInt();
                    if (index >= TAMANHO){
                        System.out.println("Informação errada, a capacidade de armazenamento da agenda é de 10 elementos.");
                    }
                    else {
                        imprimePessoa(index, informacoes);
                    }
                    break;
            }
        }while (escolha < 6);
            System.out.print("Programa encerrado.");
            entrada.close();
    }

    // Método para incluir informações
    private static void armazenaPessoa(String nome, int idade, float altura, ArrayList informacoes){
        informacoes.add(new Informacoes(nome, idade, altura));
    }

    // Método para remover informações
    private static void removePessoa(int achou, ArrayList<Informacoes> informacoes) {
        informacoes.remove(achou);
        System.out.println("Contato removido com sucesso :)");
    }

    // Método imprime agenda
    private static void imprimeAgenda(ArrayList<Informacoes> informacoes) {
        int n = 1;
        for (Informacoes dados:informacoes) {
            System.out.printf("Informação %d:%n", n);
            System.out.println(dados.toString());
            n += 1;
        }
    }

    // Método imprime informação por index
    private static void imprimePessoa(int index, ArrayList<Informacoes> informacoes) {
            System.out.println(informacoes.get(index).toString());
    }
}
