import java.util.Scanner;

public class Experiências_1094 {
    public static void main(String[] args) {
        int casos, coelhos = 0, ratos = 0, sapos = 0, qtd, total = 0;
        char tipo;
        double pc, pr, ps;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de casos: ");
        casos = entrada.nextInt();

        for (int i = 0; i < casos; i++) {
            System.out.print("Informe a quantidade de cobaia(s) e o tipo separado por espaço: ");
            qtd = entrada.nextInt();
            tipo = entrada.next().toUpperCase().charAt(0);
            if (qtd >= 1 && qtd <= 15){
                total += qtd;
            }
            if (tipo == 'C'){
                coelhos += qtd;
            }
            else if (tipo == 'R'){
                ratos += qtd;
            }
            else if (tipo == 'S'){
                sapos += qtd;
            }
        }
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);
        pc = (coelhos * 100) / (double)total;
        pr = (ratos * 100) / (double)total;
        ps = (sapos * 100) / (double)total;
        System.out.println("Percentual de coelhos: " + String.format("%.2f", pc).replace(",", ".") + " %");
        System.out.println("Percentual de ratos: " + String.format("%.2f", pr).replace(",", ".") + " %");
        System.out.println("Percentual de sapos: " + String.format("%.2f", ps).replace(",", ".") + " %");

        entrada.close();
    }
}
