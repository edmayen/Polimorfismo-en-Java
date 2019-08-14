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
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado emp=new Empleado("Jose",1000);
        imprimirDetalles(emp);
        
        Gerente ger=new Gerente("Karla",2000,"Finanzas");
        imprimirDetalles(ger);
    }
    
    public static void imprimirDetalles(Empleado emp)
    {
        /*
        Se puede observar que el tipo que recibe el metodo
        es de tipo Padre(Empleado)
        Sin embargo, al momento de ejecutar el metodo, se
        ejecuta el de el hijo(Gerente)
        eso es el polimorfismo, multiples formas pero em 
        tiempo de ejecucion 
        */
        System.out.println(emp.obtenerDetalles());
    }
          
    
}
