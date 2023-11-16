/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase10;

/**
 *
 * @author LABORATORIO 04
 */
public class Feligres {
    private String name;
    private String lastName;
    private int id;
    private double diezmo;

    public Feligres() {
    }

    public Feligres(String name, String lastName, int id, double diezmo) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.diezmo = diezmo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDiezmo() {
        return diezmo;
    }

    public void setDiezmo(double diezmo) {
        this.diezmo = diezmo;
    }
    
    
}
