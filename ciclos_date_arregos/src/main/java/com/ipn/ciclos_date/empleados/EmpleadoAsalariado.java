package com.ipn.ciclos_date.empleados;

public class EmpleadoAsalariado extends Empleado {

    public static final double DESCUENTO_INFONAVIT = .15;
    public static final double DESCUENTO_IMSS = .10;

    
    public EmpleadoAsalariado() {
        
    }
    
    
    
    public EmpleadoAsalariado(String nombre, double sueldo, int edad, char sexo){        
        //SUPER sirve para poder usar el constructor de la clase padre utilizando sus parametros, nos ayuda acceder a los valores de las clases que heredamos
        super(nombre, sueldo, edad, sexo);
        
    }
    
    
    
    @Override
    public double generarIngresos() {

        double descuentoInfonavit = getSueldo() * DESCUENTO_INFONAVIT;
        double descuentoImss = getSueldo() * DESCUENTO_IMSS;
        double ingreso = getSueldo() - descuentoImss - descuentoInfonavit;

        return ingreso;
    }

}
