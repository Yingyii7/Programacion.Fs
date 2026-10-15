import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el nombre del alumno: ");
        String nombre = input.nextLine();

        System.out.println("Introduce la nota de la primera evaluacion: ");
        double primeraevaluacion = input.nextDouble();

        System.out.println("Introduce la nota de la segunda evaluacion: ");
        double segundaevaluacion = input.nextDouble();

        System.out.println("Introduce la nota de la tercera evaluacion: ");
        double terceraevaluacion = input.nextDouble();

        double media = (primeraevaluacion+segundaevaluacion+terceraevaluacion)/3;
        System.out.println("La nota media de " + nombre + " es " + media);

        input.close();
    }
}
