/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejecutador1;



import paqueteDos.EquivalenteHora;

/**
 *
 * @author aysanchez6
 */
public class Ejecutador1 {

    public static void main(String[] args) {
        int horas = 456;

        EquivalenteHora f = new EquivalenteHora(horas);
        
        System.out.println(horas + " horas equivalen a:");
        System.out.println(f.getMinutos() + " minutos");
        System.out.println(f.getSegundos() + " segundos");
        System.out.printf("%.2f dias",f.getDias());
    }
}
