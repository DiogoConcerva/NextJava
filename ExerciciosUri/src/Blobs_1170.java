import java.util.Scanner;

public class Blobs_1170 {
    public static void main(String[] args) {
        int casos;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe com quantos casos deseja entrar: ");
        casos = entrada.nextInt();
        double peso[] = new double[casos];
        int dias[] = new int[casos];

        for (int i = 0; i < casos; i++) {
            System.out.print("Informe o peso: ");
            peso[i] = entrada.nextDouble();
        }

        for (int i = 0; i < peso.length; i++) {
            int dia = 0;
            while (peso[i] >= 1){
                peso[i] = peso[i] / 2;
                dia +=1;
            }
            dias[i] = dia;
        }

        for (int n:dias) {
            System.out.println(n + " dias");
        }
        entrada.close();
    }
}
