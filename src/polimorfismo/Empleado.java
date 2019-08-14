/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author edmayen
 */
public class Empleado {
    protected String nombre;
    protected double sueldo;
    
    protected Empleado(String nombre, double sueldo)
    {
        this.setNombre(nombre);
        this.setSueldo(sueldo);
    }
    
    public String obtenerDetalles()
    {
        return "Nombre: "+getNombre()+" Sueldo: "+getSueldo();
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
