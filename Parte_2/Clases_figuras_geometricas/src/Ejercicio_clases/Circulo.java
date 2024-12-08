package Ejercicio_clases;

public class Circulo {
    float radio;
    Circulo(float radio) {
        this.radio = radio;
    }
    double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }
    double calcularPerimetro() {
        return 2*Math.PI*radio;
    }
}