import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;

        System.out.print("Informe um número para calcular a sequência de Fibonacci até ele: ");
        numero = entrada.nextInt();

        for(int cont = 1; cont <= numero; cont++){
            System.out.printf("%d ", fibo(cont));
        }
        System.out.println();

        entrada.close();
    }

    public static int fibo(int n){
        int fib = 0, fib1 = 0, fib2 = 1;
        if(n == 1){
            return (0);
        }

        if(n == 2){
            return(1);
        }

        for(int cont = 3; cont <= n; cont++){
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }
        return(fib);
    }
}