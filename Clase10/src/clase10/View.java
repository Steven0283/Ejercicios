/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase10;

import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO 04
 */
public class View {

    /***
     * Método que solicita los datos d la iglesia al usuiario por medio de JOP
     */
    public void GetDataIglesias(Iglesia[] iglesia) {
        
        for (int i = 0; i < iglesia.length; i++) {
            JOptionPane.showMessageDialog(null, "Se le solicitarán los datos de la iglesia: ");
            
            String churchName = JOptionPane.showInputDialog("Ingrese el nombre de la iglesia: ");
            String shepheredName = JOptionPane.showInputDialog("Ingrese el nombre del pastor: ");
            String shepheredLastName = JOptionPane.showInputDialog("Ingrese los apellidos del pastor: ");
            int cantFeligreses = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de feligreses que acuden a esta iglesia: "));
            iglesia[i] = new Iglesia(churchName, shepheredName, shepheredLastName, i, i, i, cantFeligreses);
            
        }
    }
    
    /***
     * Método que muestra en pantalla los datos 
     */
    public void showDataIglesias(Iglesia[] iglesia){
        for (int i = 0; i < iglesia.length; i++) {
            
        }
    
    }

}
