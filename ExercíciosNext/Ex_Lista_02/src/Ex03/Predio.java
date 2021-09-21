package Ex03;

import java.util.Scanner;

public class Predio {
    public static void main(String[] args) {
        // Variáveis
        int terreo = 0;
        final int andares = 3;
        final int CAPACIDADE_MAXIMA = 3;
        int escolha;
        Scanner entrada = new Scanner(System.in);

        Elevador elevador = new Elevador();
        elevador.inicializaElevador(terreo, andares, CAPACIDADE_MAXIMA);
        // Menu
        do {
            System.out.println("------------- MENU -------------");
            System.out.println("[ 1 ] Entrar no elevador");
            System.out.println("[ 2 ] Sair do elevador");
            System.out.println("[ 3 ] Subir andares");
            System.out.println("[ 4 ] Descer andares");
            System.out.println("[ 5 ] Informações elevador");
            System.out.println("[ 6 ] Desligar elevador");
            System.out.println("--------------------------------");
            System.out.print("Digite sua esolha: ");
            escolha = entrada.nextInt();
            switch (escolha){
                case 1:
                    elevador.entrarElevador();
                    break;
                case 2:
                    elevador.sairElevador();
                    break;
                case 3:
                    elevador.subirAndares();
                    break;
                case 4:
                    elevador.descerAndadres();
                    break;
                case 5:
                    System.out.println(elevador.toString());
                    break;
            }
        }while (escolha < 6);
        System.out.println("Programa encerrado!!!");
        entrada.close();
    }
}
