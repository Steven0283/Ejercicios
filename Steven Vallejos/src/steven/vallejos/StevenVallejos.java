/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package steven.vallejos;

import java.io.ObjectInputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO 04
 */
public class StevenVallejos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion = 0;
        double cuotaMensual = 0;
        int facturasPendientes = 0;
        Factura factura = new Factura("", 0, 0, 0, 0, 0, 0);
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de facturas que desea ingresar: ")) ;
        for (int i = 1; i <= opcion; i++) {
            
            factura.setNombreCliente(JOptionPane.showInputDialog("Ingrese el nombre del clinete: "));
            factura.cedCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cédula del cliente: "));
            factura.numFactura = (int)(Math.random() * 200 + 1);
            factura.montoFactura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la factura: "));
            factura.mesFactura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de la factura: "));
            factura.anioFactura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de la factura: "));
            factura.estFactura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estado de la factura \n"
                    + "1. Factura pagada \n"
                    + "2. Factura pendiente"));
            
        }
        
        System.out.println(factura.getNombreCliente());
        System.out.println(factura.getCedCliente());
        System.out.println(factura.getNumFactura());
        System.out.println(factura.getMontoFactura());
        System.out.println(factura.getMesFactura());
        System.out.println(factura.getAnioFactura());
        
        if (factura.estFactura == 2) {
                System.out.println("Factura pendiente");
                
            }
        
        cuotaMensual = ((factura.getMontoFactura() * 0.05) + factura.getMontoFactura() / 6);
        facturasPendientes = factura.getEstFactura();
        
        System.out.println(cuotaMensual);
    }
    
}
