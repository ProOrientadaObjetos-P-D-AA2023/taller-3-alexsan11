/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteCelular;

/**
 *
 * @author aysanchez6
 */
public class EquipoCelulares {
    private String sistemaOperativo;
    private double tamañoPantalla;
    private double costoInicial;
    private double iva = 12;
    private double ivaInicial;
    private double costoFinal;
    private String dirMac;
    private String infIMEI;

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public double getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(double tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public double getCostoInicial() {
        return costoInicial;
    }

    public void setCostoInicial(double costoInicial) {
        this.costoInicial = costoInicial;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public double getIvaInicial() {
        return ivaInicial;
    }

    public void setIvaInicial(float ivaInicial) {
        this.ivaInicial = ivaInicial;
    }

    public double getCostoFinal() {
        return costoFinal;
    }

    public void setCostoFinal(float costoFinal) {
        this.costoFinal = costoFinal;
    }

    public String getDirMac() {
        return dirMac;
    }

    public void setDirMac(String dirMac) {
        this.dirMac = dirMac;
    }

    public String getInfIMEI() {
        return infIMEI;
    }

    public void setInfIMEI(String infIMEI) {
        this.infIMEI = infIMEI;
    }
    
    public void ivaCostoInicial(){
        ivaInicial = (iva/100) * costoInicial;
    }
    
    public void calcularCostoFinal(){
        costoFinal = costoInicial + ivaInicial;
    }

    
}
