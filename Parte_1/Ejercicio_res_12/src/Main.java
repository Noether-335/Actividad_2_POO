/*Determinar la cantidad de dinero recibida por un trabajador por concepto de las horas
semanales trabajadas en una empresa, sabiendo que cuando las horas de trabajo exceden
de 40, el resto se considera horas extras y se pagan al doble de una hora normal, cuando
no exceden de 8; si las horas extras exceden de 8, se pagan las primeras 8 al doble de lo
que se paga una hora normal y el resto al triple. Del trabajador se conocen los siguientes
datos: nombres, número de horas trabajadas en la semana y valor recibido por una hora
normal de trabajo.*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pago;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese las horas trabajadas: ");
        double horasTrabajadas = scanner.nextDouble();
        System.out.println("Ingrese valor por hora: ");
        double valorHora = scanner.nextDouble();
        if (40 < horasTrabajadas && horasTrabajadas<= 48) {
            pago = (40*valorHora) +
                    ((horasTrabajadas-40)*2*valorHora);
        }
        else if (horasTrabajadas > 48) {
            pago = (40*valorHora) + (8*2*valorHora) +
                    ((horasTrabajadas-48)*3*valorHora);
        }
        else {
            pago = horasTrabajadas*valorHora;
        }
        System.out.println("Al empleado "+nombre+" le corresponde un pago de: $" +
                pago );
    }
}