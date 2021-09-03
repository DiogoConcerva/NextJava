public class ParImpar {
    public static void main(String[] args) {
        int elementos[] = {99, 26, 33, 58, 100};

        for(int v : elementos){
            if (v % 2 == 0) {
                System.out.println(v + " é par.");
            }else{
                System.out.println(v + " é ímpar.");
            }
        }
    }
}