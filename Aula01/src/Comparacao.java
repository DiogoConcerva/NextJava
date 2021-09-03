public class Comparacao {
    public static void main(String[] args) {
        int x = 3;
        int y = 2;
        int z = 1;

        // Imprimir Z, Y, X
        if(x > y && x > z && y > z){
            System.out.println("Z = " + z + " Y = " + y + " X = " + x);
        }
        // Imprimir Z, X, Y
        else if(y > x && y > z && x > z){
            System.out.println("Z = " + z + " X = " + x + " Y = " + y);
        }
        // Imprimir Y, X, Z
        else if(x > y && x < z && y < z){
            System.out.println("Y = " + y + " X = " + x + " Z = " + z);
        }
        // Imprimir Y, Z, X
        else if(y < z && y < x && z < x){
            System.out.println("Y = " + y + " Z = " + z + " X = " + x);
        }
        // Imprimir X, Y, Z
        else if(x < y && x < z && y < z){
            System.out.println("X = " + x + " Y = " + y + " Z = " + z);
        }
        // Imprimir X, Z, Y
        else if(x < y && x < z && z < y) {
            System.out.println("X = " + x + " Z = " + z + " Y = " + y);
        }
    }
}
