/*Dado el valor del lado en un triángulo equilátero, haga un algoritmo que obtenga el
perímetro, el valor de la altura y el área del triángulo. */

package Ejercicio_19;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el lado del triángulo: ");
        double lado = entrada.nextDouble();
        double perimetro = Triangulo.calc_perim(lado);
        double altura = Triangulo.calc_altura(lado);
        double area = Triangulo.calc_area(lado, altura);
        System.out.println("El perimetro es: " + perimetro);
        System.out.println("El altura es: " + altura);
        System.out.println("El area es: " + area);
    }
}