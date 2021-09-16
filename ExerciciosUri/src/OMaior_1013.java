import java.util.Scanner;

public class OMaior_1013 {
    public static void main(String[] args) {
        int num1, num2, num3, maiorAB, maiorAC, maiorBC;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe os três números separados por espaço: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        num3 = entrada.nextInt();

        maiorAB = (num1 + num2 + Math.abs(num1 - num2)) / 2;
        maiorAC = (num1 + num3 + Math.abs(num1 - num3)) / 2;
        maiorBC = (num2 + num3 + Math.abs(num2 - num3)) / 2;

        if (maiorAB >= maiorAC && maiorAB > maiorBC){
            System.out.println(maiorAB + " eh o maior");
        }
        else if (maiorAC > maiorAB && maiorAC > maiorBC){
            System.out.println(maiorAC + " eh o maior");
        }
        else{
            System.out.println(maiorBC + " eh o maior");
        }
        entrada.close();
    }
}
