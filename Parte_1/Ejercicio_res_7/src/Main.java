/*
Hacer un algoritmo que, dados dos valores numéricos A y B, escriba un mensaje diciendo
si A es mayor, menor o igual a B.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de A: ");
        float a = scanner.nextFloat();
        System.out.println("Ingrese el valor de B: ");
        float b = scanner.nextFloat();
        if (a == b){
            System.out.println("A es igual a B");
        }
        else if (a < b){
            System.out.println("A es menor que B");
        }
        else {
            System.out.println("A es mayor que B");
        }
    }
}