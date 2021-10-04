import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_Lista_04 {
    public static void main(String[] args) {
        int escolha;
        Boolean opcao = true;
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> informacoes = new ArrayList<>();

        while (opcao){
            System.out.println("[ 1 ] - Cadastrar aluno");
            System.out.println("[ 2 ] - Exibir média do aluno");
            System.out.println("[ 3 ] - Exibir qual aluno tem maior média");
            System.out.println("[ 4 ] - Sair");
            System.out.print("Digite sua opção: ");
            escolha = sc.nextInt();

            while (escolha < 1 || escolha > 4){
                System.out.print("Opção inválida, digite novamente entre 1 e 4: ");
                escolha = sc.nextInt();
            }

            switch (escolha){
                case 1:
                    if (informacoes.size() < 3){
                        inserirAluno(informacoes);
                    }
                    else {
                        System.out.println("Armazenamento cheio.");
                    }
                    break;

                case 2:
                    if (informacoes.size() == 0){
                        System.out.print("Lista vazia.\n");
                    }
                    else {
                        exibirMediaAluno(informacoes);
                    }
                    break;

                case 3:
                    if (informacoes.size() < 3){
                        System.out.print("Para utilizar essa opção é necessário que todos os 3 (três) alunos estejam cadastrados.\n");
                    }
                    else {
                        exibirMaiorMedia(informacoes);
                    }
                    break;

                case 4:
                    System.out.println("Programa encerrado.");
                    opcao = false;
                    break;
            }
        }
        sc.close();
    }

    private static void inserirAluno(ArrayList<Aluno> informacoes) {
        int matricula;
        String nome;
        double nota1;
        double nota2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a matrícula do aluno: ");
        matricula = sc.nextInt();
        while (matricula < 0){
            System.out.print("A matrícula só pode ser números positivos, digite uma matrícula válida: ");
            matricula = sc.nextInt();
        }
        System.out.print("Nome do aluno(a): ");
        nome = sc.next();
        System.out.print("Informe a primeira nota do aluno(a): ");
        nota1 = sc.nextDouble();
        System.out.print("Informe a segunda nota do aluno(a): ");
        nota2 = sc.nextDouble();

        Aluno aluno = new Aluno(matricula, nome, nota1, nota2);
        informacoes.add(aluno);
    }

    private static void exibirMediaAluno(ArrayList<Aluno> informacoes) {
        boolean achou = false;
        int matricula;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número de matrícula para localizarmos a média do aluno(a): ");
        matricula = sc.nextInt();
        for (Aluno dados : informacoes) {
            if (dados.getMatricula() == matricula){
                System.out.printf("A média do aluno(a) %s é %s%n", dados.getNome(),
                        String.format("%.2f", dados.getMedia()).replace(",", "."));
                achou = true;
            }
        }
        if (!achou){
            System.out.print("Matrícula não encontrada.\n");
        }
    }

    private static void exibirMaiorMedia(ArrayList<Aluno> informacoes) {
        double media = 0.0;
        String name = "";

        for (Aluno dados : informacoes) {
            if (dados.getMedia() > media) {
                media = dados.getMedia();
                name = dados.getNome();
            }
        }
        System.out.printf("A maior média da turma foi do aluno(a): %s e sua média foi: %s%n",
                name, String.format("%.2f", media).replace(",", "."));
    }
}
