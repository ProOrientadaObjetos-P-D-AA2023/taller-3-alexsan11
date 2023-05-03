/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package principal;

import secundario.AdministrarInstituciones;

/**
 *
 * @author aysanchez6
 */
public class Principal {

    public static void main(String[] args) {
        
        
        
        
        
        
        AdministrarInstituciones f = new AdministrarInstituciones();
        
        f.setNombre("Calasan");
        f.setTipo("privado");
        f.setNumAlumnos(555);
        f.setNumDocentes(56);
        f.setNumSedes(4);
        f.setGastosProyectados(345.44 );

      
        f.calcularPresupuesto();
        System.out.println("Administracion de Instituciones\n--------------------");
        
        System.out.printf("Nombre: %s\nTipo de institucion: %s\n"
                + "Numero de alumnos: %d\nNumero de docentes: %d\n"
                + "Numeros de sedes: %d\nGastos proyectos: %.2f\n",
                f.getNombre(),
                f.getTipo(),
                f.getNumAlumnos(),
                f.getNumDocentes(),
                f.getNumSedes(),
                f.getGastosProyectados());
        System.out.println("El presupuesto de la institución es: $" + f.obtenerPresupuesto());
    
    }
}
