public class Ex_11 {
    public static void main(String[] args) {
        // Variaveis
        double chico = 1.10;
        double juca = 1.20;
        int anos = 0;
        while (chico < juca){
            anos += 1;
            chico += 0.02;
            juca += 0.01;
        }
        System.out.printf("Serão necessário %d anos para Chico passar Juca.", anos);
    }
}
