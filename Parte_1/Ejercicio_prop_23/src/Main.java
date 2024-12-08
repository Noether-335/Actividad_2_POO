/*Dados los valores A, B y C que son los parámetros de una ecuación de segundo grado,
elaborar un algoritmo para hallar las posibles soluciones de dicha ecuación.*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double sol_1, sol_2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("De la ecuación Ax²+Bx+C=0");
        System.out.print("Ingrese el valor de A: ");
        double A = scanner.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        double B = scanner.nextDouble();
        System.out.print("Ingrese el valor de C: ");
        double C = scanner.nextDouble();
        double det = Math.pow(B, 2) - (4 * A * C);
        if (det < 0) {
            System.out.println("La ecuación no tiene soluciones reales");
        }
        else if (det == 0) {
            sol_1 = (-B)/(2*A);
            System.out.println("Las soluciones de la ecuación son " + sol_1 + " y " + sol_1);
        }
        else {
            sol_1 = (-B+Math.sqrt(det))/(2*A);
            sol_2 = (-B-Math.sqrt(det))/(2*A);
            System.out.println("Las soluciones de la ecuación son " + sol_1 + " y " + sol_2);
        }
    }
}