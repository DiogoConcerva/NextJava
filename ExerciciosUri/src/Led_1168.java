import java.util.Scanner;

public class Led_1168 {
    public static void main(String[] args) {
        int casos, total;
        int [] leds = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe quantos casos: ");
        casos = entrada.nextInt();
        String numeros[] = new String[casos];
        System.out.println("Informe quais números deseja formar: ");

        for (int i = 0; i < casos; i++) {
            numeros[i] = entrada.next();
        }

        for (int i = 0; i < casos; i++) {
            int soma = 0;
            for (int j = 0; j < numeros[i].length(); j++) {
                soma += leds[Integer.parseInt(String.valueOf(numeros[i].charAt(j)))];
            }
            System.out.printf("%d leds%n", soma);
        }
        entrada.close();
    }
}
