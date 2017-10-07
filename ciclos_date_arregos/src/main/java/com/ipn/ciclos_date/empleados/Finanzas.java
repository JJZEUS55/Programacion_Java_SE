package com.ipn.ciclos_date.empleados;

import java.util.logging.Logger;

public class Finanzas {
    
    private static final Logger LOG = Logger.getLogger(Finanzas.class.getName());

    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[3];

        empleados[0] = new EmpleadoAsalariado("CHUCHIN", 25000, 24, 'H');
        empleados[1] = new EmpleadoHonorarios("PEDRO", 10000, 23);
        empleados[2] = new EmpleadoAsalariado("SOSADRIN", 30000, 50, 'H');
        
        
        LOG.info("Los ingresos totales son: " + Finanzas.calcularIngresosTotales(empleados));
    }
    
    
    public static double calcularIngresosTotales(Empleado[] empleados) {

        double ingresosTotales = 0;
        for (Empleado empleado : empleados) {
            
            ingresosTotales = ingresosTotales + empleado.generarIngresos();
        }
        return ingresosTotales;
    }
}
