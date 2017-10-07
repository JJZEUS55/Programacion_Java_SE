package com.ipn.ciclos_date.empleados;


public class EmpleadoHonorarios extends Empleado{
    
    private static final double IVA = .16;

    public EmpleadoHonorarios(String nombre, double sueldo, int edad){
        super(nombre, sueldo, edad);
    }
    
    @Override
    public double generarIngresos() {
        return getSueldo()-(getSueldo()*IVA);
    }
    

}
