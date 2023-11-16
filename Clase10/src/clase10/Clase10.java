/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase10;

import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO 04
 */
public class Clase10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de iglesias que desea ingresar: "));
        Iglesia arrIglesia[] = new Iglesia[opcion];
        
        View view = new View();
        view.GetDataIglesias(arrIglesia);
    }
    
}
