/*Un almacén efectúa una promoción en la cual se hace un descuento sobre el valor de la
compra total, según el color de la bolita que el cliente saque al pagar en caja. Si la bolita
es blanca no se le hará descuento alguno, si es verde se le hará un 10% de descuento, si es
amarilla un 25%, si es azul un 50% y si es roja un 100%. Hacer un algoritmo para determinar la
cantidad final que un cliente deberá pagar por su compra. Se sabe que sólo hay bolitas de los colores
mencionados.*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio_final;
        System.out.println("Ingrese el valor a pagar: ");
        double valor_pagar = scanner.nextDouble();
        System.out.println("Ingrese el color de la bola (todo en minusculas): ");
        String color = scanner.next();
        if (color.equals("blanca")) {
            precio_final = valor_pagar;
        }
        else if (color.equals("verde")) {
            precio_final = valor_pagar * 0.9;
        }
        else if (color.equals("amarilla")) {
            precio_final = valor_pagar * 0.75;
        }
        else if (color.equals("azul")) {
            precio_final = valor_pagar * 0.5;
        }
        else {
            precio_final = 0;
        }
        System.out.println("El valor final a pagar es de $" + precio_final);
    }
}