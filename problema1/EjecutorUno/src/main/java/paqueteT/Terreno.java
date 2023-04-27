/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteT;

/**
 *
 * @author UTPL
 */
public class Terreno {

    public double costoTerreno;
    public double ancho;
    public double largo;
    public double area;
    public double valorMetros;

    public double getCostoTerreno() {
        return costoTerreno;
    }

    public void setCostoTerreno(double costoTerreno) {
        this.costoTerreno = costoTerreno;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getValorMetros() {
        return valorMetros;
    }

    public void setValorMetros(double valorMetros) {
        this.valorMetros = valorMetros;
    }

    public void calcularArea() {

        area = largo * ancho;

    }
    public double obtenerArea(){
        return area;
    }
    
    public void calcularTerreno(){
        costoTerreno = valorMetros * area;
        
    }
    public double obtenerCosto(){
        return costoTerreno;
    }
}
