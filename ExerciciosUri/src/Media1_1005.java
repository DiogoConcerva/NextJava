import java.util.Scanner;

public class Media1_1005 {
    public static void main(String[] args) {
        double notaA = 0.0, notaB = 0.0, media = 0.0;
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        System.out.print("Informe a primeira nota do aluno: ");
        notaA = entrada1.nextDouble();
        System.out.print("Informe a segunda nota do aluno: ");
        notaB = entrada2.nextDouble();
        media = ((notaA * 3.5) + (notaB * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f", media);

    }
}
