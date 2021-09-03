import java.util.Locale;
import java.util.Scanner;

public class Exercicio05_Array {
    public static void main(String[] args) {
        /*
        Faça uma agenda telefônica usando arrays. Você vai armazenar o número da pessoa em um array
        e o nome dela em outro. Pedirá ao usuário para inserir o nome da pessoa então retornará o
        número dela. O usuário pode inserir o nome com lower ou upper case, isso não fará diferença.
         */

        final int TAM = 5;
        String[] nome = new String[TAM];
        int[] telefone = new int[TAM];
        String localizar = "";
        int achou = 0;

        Scanner pessoa = new Scanner(System.in);
        Scanner contato = new Scanner(System.in);
        Scanner procura = new Scanner(System.in);

        // Insere contato na agenda
        for (int i = 0; i < TAM; i++) {
            System.out.print("Informe seu nome: ");
            nome[i] = pessoa.nextLine().toUpperCase();
            System.out.print("Informe seu número: ");
            telefone[i] = contato.nextInt();
        }

        // Pede contato para localizar
        System.out.print("Qual nome deseja localizar: ");
        localizar = procura.nextLine().toUpperCase();

        // Localiza nome e busca número
        for (int cont = 0; cont < nome.length; cont++) {
            if (nome[cont].equals(localizar)){
                achou = cont;
                System.out.println("O contato é: " + + telefone[achou]);
            }
        }
    }
}
