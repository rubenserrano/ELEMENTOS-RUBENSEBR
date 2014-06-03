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
public class Mascotas {
    private String tipo;
    private String nombre;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String registromascota(){
        
        return "Tu "+tipo+". Con nombre "+nombre+" a quedado reguistrado";
    }
            
    
}
