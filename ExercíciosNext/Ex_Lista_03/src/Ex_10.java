public class Ex_10 {
    public static void main(String[] args) {
        // Verificação
        for (int i = 1; i < 2798; i++) {
            if ((i % 3 ==0) && (i % 5 == 0) && (i % 7 ==0)){
                System.out.println(i);
            }
        }
    }
}
