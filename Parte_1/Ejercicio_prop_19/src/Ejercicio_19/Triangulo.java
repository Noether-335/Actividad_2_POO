package Ejercicio_19;

public class Triangulo {
    public static double calc_perim(double lado){
        return lado*3;
    }
    public static double calc_altura(double lado){
        return (Math.sqrt(3)*lado)/2;
    }
    public static double calc_area(double lado, double altura){
        return (lado*altura)/2;
    }
}
