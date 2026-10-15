import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        System.out.println("Introduce el primer numero: ");
        double n1 = input.nextDouble();

        System.out.println("Introudce el segundo numero: ");
        double n2 = input.nextDouble();

        double suma = (double)n1 + n2;
        double resta = (double)n1 - n2;
        double producto = (double)n1 * n2;
        double division = (double)n1/n2;
        

        System.out.println("La suma de estos dos nuemros es: " + suma);
        System.out.println("La resta de estos dos nuemros es: " + resta);
        System.out.println("La producto de estos dos nuemros es: " + producto);
        System.out.println("La division de estos dos nuemros es: " + division);

        input.close();
    }
}
              