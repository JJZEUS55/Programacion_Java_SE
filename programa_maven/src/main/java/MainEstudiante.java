
import com.ipn.escom.Estudiante;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lety
 */
public class MainEstudiante {
    
    public static void main(String[] args) {
        
        Estudiante raul = new Estudiante();
        raul.nombre = "Raul";
        raul.apellidos = "Hernandez Perez";
        raul.direccion = "Av de las palmas No.108";
        raul.numCuenta = 126548;
        raul.telCel = 55595303;
        
        raul.mostrarDatos();
        raul.inscribir(raul);
        raul.DardeBaja(raul.numCuenta);
        
    }
    
}
