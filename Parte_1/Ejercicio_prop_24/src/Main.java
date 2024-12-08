/*Se tienen tres esferas (A,B,C) de diferente peso, elaborar un algoritmo que determine cuál es
la esfera de mayor peso.*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A");
        double pesoA = scanner.nextDouble();
        System.out.println("Ingrese el peso de la esfera B");
        double pesoB = scanner.nextDouble();
        System.out.println("Ingrese el peso de la esfera C");
        double pesoC = scanner.nextDouble();
        if (pesoA > pesoB && pesoA > pesoC) {
            System.out.println("La esfera A es la mas pesada");
        }
        else if (pesoB > pesoC) {
            System.out.println("La esfera B es la mas pesada");
        }
        else {
            System.out.println("La esfera C es la mas pesada");
        }
    }
}