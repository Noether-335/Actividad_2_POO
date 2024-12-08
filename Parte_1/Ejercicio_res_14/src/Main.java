/*Una empresa con tres departamentos tiene establecido un plan de incentivos para sus
vendedores. Al final del período, a cada departamento se le pide el importe global de las
ventas. A los departamentos que excedan el 33% de las ventas totales se les adiciona al
salario de los vendedores un porcentaje equivalente al 20% del salario mensual. Las
nóminas de los tres departamentos son iguales. Si se tienen los siguientes datos:
• Ventas del departamento 1
• Ventas del departamento 2
• Ventas del departamento 3
• Salario de los vendedores de cada departamento
Hacer un algoritmo que determine cuánto recibirán los vendedores de cada departamento
al finalizar el período.*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pago_1, pago_2, pago_3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las ventas del departamento 1: ");
        double ventas_1 = scanner.nextDouble();
        System.out.println("Ingrese las ventas del departamento 2: ");
        double ventas_2 = scanner.nextDouble();
        System.out.println("Ingrese las ventas del departamento 3: ");
        double ventas_3 = scanner.nextDouble();
        System.out.println("Ingrese el pago: ");
        double pago = scanner.nextDouble();
        double porcentaje_30 = (ventas_1 + ventas_2 + ventas_3) * 0.33;
        if (ventas_1 > porcentaje_30) {
            pago_1 = pago + (pago*0.2);
        } else {
            pago_1 = pago;
        }
        if (ventas_2 > porcentaje_30) {
            pago_2 = pago + (pago*0.2);
        } else {
            pago_2 = pago;
        }
        if (ventas_3 > porcentaje_30) {
            pago_3 = pago + (pago*0.2);
        } else {
            pago_3 = pago;
        }
        System.out.println("El pago del departamento 1 es: $"+pago_1);
        System.out.println("El pago del departamento 2 es: $"+pago_2);
        System.out.println("El pago del departamento 3 es: $"+pago_3);
    }
}