import java.util.Scanner;

public class DivisoresI_1157 {
    public static void main(String[] args) {
        int num = 0, pos = 0, div = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número para localizarmos seus divisores: ");
        num = entrada.nextInt();
        int [] numeros = new int[num];

        for (int i = num; i > 0; i--) {
            if (num % i == 0){
                numeros[pos] = i;
                pos++;
            }
        }
        while (numeros[div] != 0){
            System.out.println(numeros[div]);
            div++;
        }
        entrada.close();
    }
}
