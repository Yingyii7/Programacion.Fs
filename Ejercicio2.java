import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        
        System.out.println("Introduce el lado del cuadrado: ");
        double lado = input.nextDouble();

        double area = lado * lado;
        System.out.println("El area del cuadrado es de: " + area);

        input.close();
    }
}
