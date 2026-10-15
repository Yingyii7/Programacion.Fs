import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce una temperatura en Celsius: ");

        double celsius = input.nextDouble();
        double resultado = (celsius * (9/5)) + 32;
        // 1 celsius es igual a 33.8 fahrenheit
        // 33.8 es igual a 9/5 + 32
        // la operación de resultado es igual a (celsius * 33.8)
        System.out.printf(celsius + " ºC en celsius es igual a  " + resultado + " ºF en fahrenheit.");

        input.close();
    }
}
