import java.util.Scanner;

public class Triangulo_1043 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe os valores para A, B e C separado por espaço: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if ((Math.abs(b - c) < a) && (a < b + c)
                && (Math.abs(a - c) < b && (b < a + c)
                && (Math.abs(a - b) < c) && (c < a + b))){
            System.out.println("Perimetro = " + String.format("%.1f", a + b + c).replace(",", "."));
        }
        else {
            System.out.println("Area = " + String.format("%.1f", ((a + b) * c) / 2).replace(",", "."));
        }
        sc.close();
    }
}
