package Ejercicio_clases;

public class Rectangulo {
    float base;
    float altura;
    Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    double calcularArea() {
        return base * altura;
    }
    double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }
}

