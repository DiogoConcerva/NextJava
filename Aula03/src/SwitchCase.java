import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char dia;
        System.out.println("Digite as iniciais de um dia da semana:");
        dia = entrada.nextLine().toLowerCase().charAt(0);

        switch(dia){

            case 'd':
                System.out.println("Domingo");
                break;

            case 's':
                System.out.println("Segunda-feira, sexta-feira ou sábado");
                break;

            case 't':
                System.out.println("Terça-feira");

            case 'q':
                System.out.println("Quarta-feira ou quinta-feira");
                break;

            default:
                System.out.println("Você deve escolher entre d, s, t ou q.");

        }
        entrada.close();
    }
}
