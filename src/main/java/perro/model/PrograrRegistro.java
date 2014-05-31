/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package perro.model;

/**
 *
 * @author Ruben
 */
public class PrograrRegistro {
    public static void main(String args[]){
        Perro p = new Perro();
        p.setNombre("Coky");
        Persona x=new Persona();
        x.setPerro(p);
        /**
         * esto se llama composicion se dice que x tiene p 
         * el siguiente es lo que recibira el paso 4 
         */
        System.out.println(x.getPerro().getNombre());
        
    }
    
}
