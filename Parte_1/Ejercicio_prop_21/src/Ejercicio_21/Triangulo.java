package Ejercicio_21;
public class Triangulo {
    public static double calc_perimetro(double a, double b, double c) {
        return (a + b + c);
    }
    public static double calc_semiperimetro(double perimetro) {
        return perimetro / 2;
    }
    public static double calc_area(double a, double b, double c, double S) {
        return Math.sqrt(S*(S-a)*(S-b)*(S-c));
    }
}
