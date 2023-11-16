/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase10;

/**
 *
 * @author LABORATORIO 04
 */
public class Iglesia {
    
    private String churchName;
    private String shepheredName;
    private String shepheredLastName;
    private int diezmoTotal;
    private double infraTax;
    private double comTax;
    private int cantFeligreses;

    public Iglesia() {
    }

    public Iglesia(String curchName, String shepheredName, String shepheredLastName, int diezmoTotal, double infraTax, double comTax, int cantFeligreses) {
        this.churchName = curchName;
        this.shepheredName = shepheredName;
        this.shepheredLastName = shepheredLastName;
        this.diezmoTotal = diezmoTotal;
        this.infraTax = infraTax;
        this.comTax = comTax;
        this.cantFeligreses = cantFeligreses;
    }

    public String getChurchName() {
        return churchName;
    }

    public void setCurchName(String name) {
        this.shepheredName = name;
    }

    public String getShepheredName() {
        return shepheredName;
    }

    public String getShepheredLastName() {
        return shepheredLastName;
    }

    public void setShepheredLastName(String shepheredLastName) {
        this.shepheredLastName = shepheredLastName;
    }

    public void setShepheredName(String shepheredName) {
        this.shepheredName = shepheredName;
    }

    public int getDiezmoTotal() {
        return diezmoTotal;
    }

    public void setDiezmoTotal(int diezmoTotal) {
        this.diezmoTotal = diezmoTotal;
    }

    public double getInfraTax() {
        return infraTax;
    }

    public void setInfraTax(double infraTax) {
        this.infraTax = infraTax;
    }

    public double getComTax() {
        return comTax;
    }

    public void setComTax(double comTax) {
        this.comTax = comTax;
    }

    public int getCantFeligreses() {
        return cantFeligreses;
    }

    public void setCantFeligreses(int cantFeligreses) {
        this.cantFeligreses = cantFeligreses;
    }

    
    
    
}
