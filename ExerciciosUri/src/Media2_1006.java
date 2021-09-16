import java.util.Scanner;

public class Media2_1006 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.print("Informe a segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.print("Informe a terceira nota: ");
        nota3 = entrada.nextDouble();
        media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;

        System.out.printf("MEDIA = " + String.format("%.1f", media).replace(",", "."));
        entrada.close();
    }
}
