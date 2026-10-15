import java.util.Scanner;

public class otraforma3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        double n1;
        double n2;

        System.out.println("Introduce el primer numero: ");
        n1 = (double)input.nextDouble();

        System.out.println("Introudce el segundo numero: ");
        n2 = (double)input.nextDouble();

        double suma = n1 + n2;
        double resta = n1 - n2;
        double producto = n1 * n2;
        double division = n1/n2;

        System.out.println("La suma de estos dos nuemros es: " + suma);
        System.out.println("La resta de estos dos nuemros es: " + resta);
        System.out.println("La producto de estos dos nuemros es: " + producto);
        System.out.printf("La division de estos dos nuemros es:  %.2f%n",  division);

        input.close();
    }
}
