public class Ejercicio13 {
    public static void main(String[] args) {

        double base = 100;
        final double IVA = 0.21;

        double total = base * (1 + IVA);

        System.out.println("Base imponible: " + base + " euros");
        System.out.println("Total de la factura: " + total + " euros");
    }
}