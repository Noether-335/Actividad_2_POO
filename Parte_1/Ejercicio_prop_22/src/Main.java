/*Elaborar un algoritmo que entre el nombre de un empleado, su salario básico por hora y el
número de horas trabajadas en el mes; escriba su nombre y salario mensual si éste es mayor
de $450.000, de lo contrario escriba sólo el nombre.*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las horas trabajadas: ");
        double horas = scanner.nextDouble();
        System.out.println("Ingrese el valor de cada hora: ");
        double valor_hora = scanner.nextDouble();
        double salario = horas * valor_hora;
        scanner.nextLine();
        System.out.println("Ingrese el nombre del trabajador");
        String nombre = scanner.nextLine();
        if (salario > 450000){
            System.out.println(nombre+": $"+salario);
        }else {System.out.println(nombre);}
    }
}