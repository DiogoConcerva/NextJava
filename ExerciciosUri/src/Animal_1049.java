import java.util.Scanner;

public class Animal_1049 {
    public static void main(String[] args) {
        String nome1, nome2, nome3;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com as três informações, uma em cada linha:");
        nome1 = entrada.next().toLowerCase();
        nome2 = entrada.next().toLowerCase();
        nome3 = entrada.next().toLowerCase();

        if (nome1.equals("vertebrado") && nome2.equals("ave") && nome3.equals("carnivoro")){
            System.out.println("aguia");
        }
        else if (nome1.equals("vertebrado") && nome2.equals("ave") && nome3.equals("onivoro")){
            System.out.println("pomba");
        }
        else if (nome1.equals("vertebrado") && nome2.equals("mamifero") && nome3.equals("onivoro")){
            System.out.println("homem");
        }
        else if (nome1.equals("vertebrado") && nome2.equals("mamifero") && nome3.equals("herbivoro")){
            System.out.println("vaca");
        }
        else if (nome1.equals("invertebrado") && nome2.equals("inseto") && nome3.equals("hematofago")){
            System.out.println("pulga");
        }
        else if (nome1.equals("invertebrado") && nome2.equals("inseto") && nome3.equals("herbivoro")){
            System.out.println("lagarta");
        }
        else if (nome1.equals("invertebrado") && nome2.equals("anelideo") && nome3.equals("hematofago")){
            System.out.println("sanguessuga");
        }
        else if (nome1.equals("invertebrado") && nome2.equals("anelideo") && nome3.equals("onivoro")){
            System.out.println("minhoca");
        }
        entrada.close();
    }
}
