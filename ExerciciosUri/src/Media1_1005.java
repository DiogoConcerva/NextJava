import java.util.Scanner;

public class Media1_1005 {
    public static void main(String[] args) {
        double notaA, notaB, media;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a primeira nota do aluno: ");
        notaA = entrada.nextDouble();
        System.out.print("Informe a segunda nota do aluno: ");
        notaB = entrada.nextDouble();
        media = ((notaA * 3.5) + (notaB * 7.5)) / 11;

        System.out.printf("MEDIA = " + String.format("%.5f", media).replace(",", "."));

        entrada.close();
    }
}
