/*Se tienen cuatro esferas (A, B, C, D) de las cuales se sabe que tres son de igual peso y una
diferente. Elaborar un algoritmo que determine cuál es la esfera diferente y si es de mayor
o menor peso.*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String diferente, mayor_menor;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el peso de la bola A: ");
        double pesoA = scanner.nextDouble();
        System.out.println("Ingrese el peso de la bola B: ");
        double pesoB = scanner.nextDouble();
        System.out.println("Ingrese el peso de la bola C: ");
        double pesoC = scanner.nextDouble();
        System.out.println("Ingrese el peso de la bola D: ");
        double pesoD = scanner.nextDouble();
        if (pesoA == pesoB && pesoA == pesoC) {
            diferente = "D";
            if (pesoD > pesoA) {
                mayor_menor = "es de mayor peso";
            }else {mayor_menor = "es de menor peso";}
        }
        else if (pesoA == pesoB && pesoA == pesoD) {
            diferente = "C";
            if (pesoC > pesoA) {
                mayor_menor = "es de mayor peso";
            } else {mayor_menor = "es de menor peso";}
        }
        else if (pesoA == pesoC && pesoA==pesoD) {
            diferente = "B";
            if (pesoB > pesoA) {
                mayor_menor = "es de mayor peso";
            }else {mayor_menor = "es de menor peso";}
        }
        else {
            diferente = "A";
            if (pesoA > pesoB) {
                mayor_menor = "es de mayor peso";
            }else {mayor_menor = "es de menor peso";}
        }
        System.out.println("La bola diferente es " + diferente +
                " y "+ mayor_menor);
    }
}