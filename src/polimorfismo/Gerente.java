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
public class Gerente extends Empleado{
    
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento=departamento;
    }
    
    //sobreescritura del metodo padre heredado
    public String obtenerDetalles()
    {
        /*
        Para no repeteir el codigo se puede utilizar 
        el metodo del padre y solo agregar a este 
        metodo de la clase hija, esto es invocar un 
        metodo sobreescrito
        */
        return super.obtenerDetalles()+" Departamento: "
                +getDepartamento();
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
}
