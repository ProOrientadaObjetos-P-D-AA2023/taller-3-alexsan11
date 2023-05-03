/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejecutor3;

import paqueteCelular.EquipoCelulares;

/**
 *
 * @author aysanchez6
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        EquipoCelulares p = new EquipoCelulares();

        p.setSistemaOperativo("Xiaomi");
        p.setTamañoPantalla(8.8);
        p.setCostoInicial( 250.09);
        p.setDirMac("00:1f:b3:6e:32:7h.");
        p.setInfIMEI("050863/01/672533/5");

        p.ivaCostoInicial();
        p.calcularCostoFinal();

        System.out.println("Sistema operativo: " + p.getSistemaOperativo());
        System.out.println("Tamaño de la pantalla: " + p.getTamañoPantalla());
        System.out.println("Costo inicial del equipo: $" + p.getCostoInicial());
        System.out.println("Direccion Mac: " + p.getDirMac());
        System.out.println("IMEI: " + p.getInfIMEI());
        System.out.println("IVA: %" + p.getIva() + "\n");
        System.out.print("Costo final del equipo: " + p.getCostoFinal());
    }
}
