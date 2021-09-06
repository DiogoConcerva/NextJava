import java.util.Scanner;

public class Media2_1006 {
    public static void main(String[] args) {
        double nota1 = 0.0, nota2 = 0.0, nota3 = 0.0, media = 0.0;
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        nota1 = entrada1.nextDouble();
        System.out.print("Informe a segunda nota: ");
        nota2 = entrada2.nextDouble();
        System.out.print("Informe a terceira nota: ");
        nota3 = entrada3.nextDouble();
        media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;

        System.out.printf("MEDIA = %.1f", media);
    }
}
