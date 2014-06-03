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
        Mascotas mascota= new Mascotas();
        mascota.setTipo("Pez");
        mascota.setNombre("Nemo");
        Persona x=new Persona();
        x.setMascota(mascota);
        
        /**
         * esto se llama composicion se dice que x tiene p 
         * el siguiente es lo que recibira el paso 4 
         */
        System.out.println(x.getMascota().registromascota());
        
    }
    
}
