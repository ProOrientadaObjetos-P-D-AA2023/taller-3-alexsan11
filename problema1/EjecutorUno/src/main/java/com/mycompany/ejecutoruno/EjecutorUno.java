/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejecutoruno;

import static java.util.Locale.US;
import java.util.Scanner;
import paqueteT.Terreno;

/**
 *
 * @author UTPL
 */
public class EjecutorUno {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(US);
        
        System.out.println("Ingrese el ancho del terreno en metros:");
        double ancho = entrada.nextDouble();
        System.out.println("Ingrese el largo del terreno en metros:");
        double largo = entrada.nextDouble();
        System.out.println("Ingrese el valor en metros cuadrados");
        double valorMetros = entrada.nextDouble();
        
        Terreno d = new Terreno();
        
        d.ancho = ancho;
        d.largo = largo;
        d.valorMetros = valorMetros;
        
        d.calcularArea();
        d.calcularTerreno();
        System.out.printf("Costo del Terreno:\nEl ancho del terreno: %.2f\n"
                + "El largo del terreno: %.2f\nEl valor del metro cuadrado es: %.2f\n"
                + "El valor del area es: %.2f\nEl costo del terreno es: %.2f",
                d.getAncho(), d.getLargo(), d.getValorMetros(), d.obtenerArea(),
                d.obtenerCosto());
    }
}
