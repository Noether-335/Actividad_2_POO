package Ejercicio_18;

public class Empleado  {
    public static double porcentaje_retencion(double retencion, double salario_bruto){
        return (retencion/100)*salario_bruto;
    }
    public static double salario_bruto(double horas_trabajadas, double valor_hora){
        return horas_trabajadas * valor_hora;
    }
    public static double salario_neto(double salario_bruto, double porcentaje_retencion){
        return salario_bruto - porcentaje_retencion;
    }
}
