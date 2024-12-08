/*Se tiene la siguiente información de un empleado:
· código del empleado,
· nombres,
· número de horas trabajadas al mes,
· valor hora trabajada,
· porcentaje de retención en la fuente.
Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto.
*/

package Ejercicio_18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el codigo de empleado: ");
        int codigo = entrada.nextInt();
        entrada.nextLine(); //Para consumir el salto de linea y poder leer el nombre completo
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese las horas trabajadas en el mes: ");
        double horas = entrada.nextInt();
        System.out.println("Ingrese el valor por hora trabajada:  ");
        double valor = entrada.nextDouble();
        System.out.println("Ingrese el porcentaje de retención (sin el simbolo %): ");
        double retencion = entrada.nextDouble();

        double salario_bruto = Empleado.salario_bruto(horas, valor);
        double porcentaje_retencion = Empleado.porcentaje_retencion(retencion, salario_bruto);
        double salario_neto = Empleado.salario_neto(salario_bruto, porcentaje_retencion);

        System.out.println("El empleado: " + nombre + ", con codigo de empleado: " + codigo);
        System.out.println("Tiene como salario bruto : $" + salario_bruto);
        System.out.println("Tiene como salario neto: $" + salario_neto);
    }
}