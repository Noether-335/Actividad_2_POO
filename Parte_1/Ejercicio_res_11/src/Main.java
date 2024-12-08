/*Escribir un algoritmo que acepte tres números enteros diferentes y muestre el mayor de
ellos. */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        float num_1 = scanner.nextFloat();
        System.out.println("Ingrese el segundo numero");
        float num_2 = scanner.nextFloat();
        System.out.println("Ingrese el tercer numero");
        float num_3 = scanner.nextFloat();
        if (num_1 > num_2 && num_2 > num_3) {
            System.out.println("El numero "+num_1+" es el mayor de todos");
        }
        else if (num_2 > num_3) {
            System.out.println("El numero "+num_2+" es el mayor de todos");
        }
        else {
            System.out.println("El numero "+num_3+" es el mayor de todos");
        }
    }
}