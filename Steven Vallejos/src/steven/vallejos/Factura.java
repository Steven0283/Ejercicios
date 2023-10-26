/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package steven.vallejos;

import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO 04
 */
public class Factura {
    public String nombreCliente;
    public int cedCliente;
    public int numFactura;
    public double montoFactura;
    public int mesFactura;
    public int anioFactura;
    public int estFactura;

    public Factura(String nombreCliente, int cedCliente, int numFactura, double montoFactura, int mesFactura, int anioFactura, int estFactura) {
        this.nombreCliente = nombreCliente;
        this.cedCliente = cedCliente;
        this.numFactura = numFactura;
        this.montoFactura = montoFactura;
        this.mesFactura = mesFactura;
        this.anioFactura = anioFactura;
        this.estFactura = estFactura;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getCedCliente() {
        return cedCliente;
    }

    public void setCedCliente(int cedCliente) {
        this.cedCliente = cedCliente;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public double getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(double montoFactura) {
        this.montoFactura = montoFactura;
    }

    public int getMesFactura() {
        return mesFactura;
    }

    public void setMesFactura(int mesFactura) {
        this.mesFactura = mesFactura;
    }

    public int getAnioFactura() {
        return anioFactura;
    }

    public void setAnioFactura(int anioFactura) {
        this.anioFactura = anioFactura;
    }

    public int getEstFactura() {
        return estFactura;
    }

    public void setEstFactura(int estFactura) {
        this.estFactura = estFactura;
    }
    
    
    
}
