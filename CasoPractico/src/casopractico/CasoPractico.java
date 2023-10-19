/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casopractico;

import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO 04
 */
public class CasoPractico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double salario = 0;
        int cantEmpleados = 0;
        double sem = 0.0925;
        double ivm = 0.0508;
        double resultSem = 0;
        double resultIvm = 0;
        double resultTotal = 0;
        
        cantEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados que trabajan en su empresa: "));
        
        for (int i = 1; i <= cantEmpleados; i++) {
            salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario del empleado: "));
            resultSem = salario * sem;
            resultIvm = salario * ivm;
            resultTotal = (resultSem + resultIvm) + resultTotal;
            JOptionPane.showMessageDialog(null, "El slario es: " +salario+ "\n"
                + "La deducción por SEM es: " +resultSem+ "\n"
                        + "La deducción por IVM es: " +resultIvm+ "\n"
                                + "El resultado total es: " +resultTotal);
        }
        
        JOptionPane.showMessageDialog(null, resultTotal);

        
    
    }
    
}
