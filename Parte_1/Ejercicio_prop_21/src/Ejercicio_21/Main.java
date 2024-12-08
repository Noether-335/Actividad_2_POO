/*
Dados los tres lados de un triángulo, haga un algoritmo que encuentre: perímetro,
semiperímetro y el área del triángulo.
 */
package Ejercicio_21;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los lados del triangulo");
        System.out.println("Ingrese el lado a: ");
        double a = entrada.nextDouble();
        System.out.println("Ingrese el lado b: ");
        double b = entrada.nextDouble();
        System.out.println("Ingrese el lado c: ");
        double c = entrada.nextDouble();
        double perimetro = Triangulo.calc_perimetro(a, b, c);
        double S = Triangulo.calc_semiperimetro(perimetro);
        double area = Triangulo.calc_area(a, b, c ,S);
        System.out.println("El perimetro es: " + perimetro);
        System.out.println("El semi perimetro es:  " + S);
        System.out.println("El area del triangulo es: " + area);
    }
}