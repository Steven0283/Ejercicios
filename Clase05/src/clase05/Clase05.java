/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase05;

import javax.swing.JOptionPane;


public class Clase05 {
    
    int hola = 1;

    

    
    public static void main(String[] args) {
    /*    
        int numero = 2;
        int result = 0;
        metodo1(numero);
        result = metodo2(numero, numero);
        System.out.println(numero);
        System.out.println("Result: " + result);*/
    
        String result = null;
        System.out.println(result);
        result = analizaProblema(0);
        System.out.println(result);
        
        calculadora(0, 0, 0);
        metodo2(0, 0, 0, 0, 0, 0);
        
    }
    
    /*
    public static void metodo1(int parametro){
        parametro = parametro * 2;
    }
    
    public static int metodo2 (int n1, int n2){
        return n1 + n2;
    }*/
    
    /***
     * El método va a analizar 
     * @param problema
     * @return 
     */
    
    public static String analizaProblema(int problema){
        
        String respuesta = "";
        return respuesta;
    }
    

    
    public static double calculadora(double num1, double num2, int opcion){
        
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite un segundo valor: "));
        
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("***** Bienvenido al menú de calculadora *****\n"
                + "1. Suma\n"
                + "2. Resta\n"
                + "3. Multiplicación\n"
                + "4. División"));
        
        
        switch (opcion) {
            case 1:
                JOptionPane.showMessageDialog(null, "Usted seleccionó la opción de suma \n"
                        + "El resultado de la operación es: " + (num1 + num2));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Ustedseleccionó la opción de resta \n"
                        + "El resultado de la operación es: " + (num1 - num2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Usted seleccionó la opción de multiplicar \n"
                        + "El resultado de la operación es: " + (num1 * num2));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Usted seleccionó la opción de división \n"
                        + "El resultado de la operación es: " + (num1 / num2));
                break;
            
            default:
                throw new AssertionError();
        }
        
        return 0;
    }
    
    
    /***
     * 
     * @param val1
     * @param val2
     * @param val3
     * @param val4
     * @param resultadoSuma
     * @param resultadoProm 
     */
    public static void metodo2(int val1, int val2, int val3, int val4, int resultadoSuma, double resultadoProm){
        
        val1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para el primer valor: "));
        val2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para el segundo valor: "));
        val3 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para el tercer valor: "));
        val4 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para el cuarto valor: "));
        
        resultadoSuma = val1 + val2 + val3 + val4;
        resultadoProm = resultadoSuma / 4;
        
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + resultadoSuma + " Y el promedio es: " + resultadoProm);
                
                
        
}
        
        
      
            
    
}
