/*
Cierta universidad para liquidar el pago de matrícula de un estudiante le exige los
siguientes datos:
• Número de inscripción
• Nombres
• Patrimonio.
• Estrato social.
La universidad cobra un valor constante para cada estudiante de $50.000. Si el patrimonio
es mayor que $2 ́000.000 y el estrato superior a 3, se le incrementa un porcentaje del 3%
sobre el patrimonio. Hacer un algoritmo que muestre:
• Número de inscripción.
• Nombres.
• Pago de matrícula.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el numero de inscripción: ");
        int num_incripcione = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite los nombres del estudiante: ");
        String nombre_estudiante = entrada.nextLine();
        System.out.println("Ingrese el patrimonio del estudiante: ");
        double patrimonio = entrada.nextDouble();
        System.out.println("Ingrese el estrato del estudiante: ");
        double estrato = entrada.nextDouble();
        double matricula = 50000.0;
        if ((patrimonio > 2000000) && (estrato > 3)) {
            matricula += patrimonio*0.03;
        }
        System.out.println("El estudiante " + nombre_estudiante + " con Num de inscripción: " + num_incripcione);
        System.out.println("Debe pagar de matricula: $"+matricula);
    }
}