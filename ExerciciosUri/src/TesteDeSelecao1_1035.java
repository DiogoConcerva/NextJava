import java.util.Scanner;

public class TesteDeSelecao1_1035 {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe os quatros números separados por espaço: ");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        d = entrada.nextInt();

        if ((b > c) && (d > a) && ((c + d) > (a + b)) && ((c > 0) && (d > 0)) && (a % 2 == 0)){
            System.out.print("Valores aceitos");
        }
        else {
            System.out.print("Valores nao aceitos");
        }
        entrada.close();
    }
}
