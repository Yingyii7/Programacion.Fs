public class Ejercicio10 {
    public static void main(String[] args) {
        int i;
        int j;

        for (i= 1; i <= 9; i += 2) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
