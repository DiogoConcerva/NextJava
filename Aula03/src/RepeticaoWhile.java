import java.util.Scanner;

public class RepeticaoWhile{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase = "";

        while(!frase.equals("SAIR")){
            System.out.println("Digite algo:");
            frase = entrada.nextLine().toUpperCase();
        }
        entrada.close();
    }
}