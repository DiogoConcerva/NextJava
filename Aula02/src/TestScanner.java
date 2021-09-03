import java.util.Scanner;

public class TestScanner{
    public static void main(String[] args) {
        // Entrada por teclado
        Scanner sc = new Scanner(System.in);
        // Pega informação digitada
        System.out.println("Informe uma String:");
        String palavra = sc.nextLine();
        // Tamanho da palavra digitada
        int lenPalavra = palavra.length();
        // Saídas
        System.out.println(palavra);
        System.out.println(lenPalavra);
    }
}