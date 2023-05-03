/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteDos;

/**
 *
 * @author aysanchez6
 */
public class EquivalenteHora {

     private int horas;
    private int minutos;
    private int segundos;
    private double dias;

    public EquivalenteHora(int horas) {
        this.horas = horas;
        this.minutos = calcularMinutos();
        this.segundos = calcularSegundos();
        this.dias = calcularDias();
    }

    private int calcularMinutos() {
        return this.horas * 60;
    }

    private int calcularSegundos() {
        return this.horas * 60 * 60;
    }

    private double calcularDias() {
        return this.horas / 24.0;
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public double getDias() {
        return dias;
    }
}
