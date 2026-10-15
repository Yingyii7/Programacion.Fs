import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce un numero de años:");

            int años = input.nextInt();
            int horas = 24 * 365 * años;

            System.out.println("Hay " + horas + " horas en " + años +" años");

            input.close();
        }
    }
