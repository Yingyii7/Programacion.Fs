public class Ejercicio11 {
    public static void main(String[] args) {
        int i;
        //i es igual a las filas
        int j;
        //j es igual a las posiciones de cada fila

        for (i = 1; i <= 5; i++) {
            //para recorrer las filas
            for (j = 1; j <= 9; j++) {
                //para recorrer las posiciones de cada fila
                if (i == 5 || j == 6 - i || j == 4 + i) {
                    //al terminar el bucle cambia la i
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
