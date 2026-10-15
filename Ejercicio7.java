import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce tu peso en kg: ");
        double peso = input.nextDouble();
        
        System.out.println("Introduce tu altura en m: ");
        double altura = input.nextDouble();

        double BMI = peso / (altura * altura);
        // BMI = peso(kg) / (altura(m)^2)

        System.out.printf("Tu inidice de masa corporal es de: %.2f%n", BMI);
        // cuando es printf,se pone coma después de %.2f%n. En otros casos ponemos + normalmente.
        
    input.close();
    }
}
