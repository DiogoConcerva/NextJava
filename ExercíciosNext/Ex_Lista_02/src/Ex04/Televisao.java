package Ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class Televisao {
    public static void main(String[] args) {
        // Variáveis
        int escolha;
        String opc;
        // Entrada
        Scanner entrada = new Scanner(System.in);

        // Cria objeto "Ligar TV"
        ControleRemoto ligar = new ControleRemoto();
        // Menu
        do {
            System.out.println("--------------- MENU ---------------");
            System.out.println("[ 1 ] Aumentar ou diminuir volume");
            System.out.println("[ 2 ] Aumentar ou diminuir canais");
            System.out.println("[ 3 ] Trocar para um canal indicado");
            System.out.println("[ 4 ] Consultar volume e canal");
            System.out.println("[ 0 ] Desligar TV");
            System.out.println("------------------------------------");
            System.out.print("Informe sua escolha: ");
            escolha = entrada.nextInt();
            System.out.println("------------------------------------");

            switch (escolha){
                case 1:
                    System.out.println("[ + ] Aumentar volume e [ - ] diminuir volume");
                    opc = entrada.next();
                    if (ligar.getVolume() == 0 && opc.equals("-")){
                        System.out.println("Volume no mínimo");
                    }
                    else {
                        if (opc.equals("+")){
                            ligar.setVolume();
                            System.out.println("O volume agora é: " + ligar.getVolume());
                        }
                        else {
                            ligar.setDiminueVolume();
                            System.out.println("O volume agora é: " + ligar.getVolume());
                        }
                    }
                    break;

                case 2:
                    System.out.println("[ + ] Aumentar canal e [ - ] diminuir canal");
                    opc = entrada.next();
                    if (ligar.getCanais() == 1 && opc.equals("-")){
                    System.out.println("Canal no mínimo");
                    }
                    else {
                        if (opc.equals("+")){
                            ligar.setCanais();
                            System.out.println("O canal agora é: " + ligar.getCanais());
                        }
                        else {
                            ligar.setDiminuirCanais();
                            System.out.println("O canal agora é: " + ligar.getCanais());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Informe um canal: ");
                    opc = entrada.next();
                    if (Integer.parseInt(opc) >= 1){
                        ligar.setCanalIndicado(Integer.parseInt(opc));
                        System.out.println("O canal agora é: " + ligar.getCanais());
                    }
                    else {
                        System.out.println("Canal inválido");
                    }
                    break;
                case 4:
                    System.out.println("Canal..: " + ligar.getCanais());
                    System.out.println("Volume.: " + ligar.getVolume());
                    break;
            }
        } while (escolha != 0);
        System.out.println("TV desligada");

        // Encerra Scanner
        entrada.close();
    }
}
