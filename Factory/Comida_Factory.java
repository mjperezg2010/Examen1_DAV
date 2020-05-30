/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author martinperez
 */
public class Comida_Factory {
    
    private TipoComida_Factory tipo;
    

    public Comida_Factory(TipoComida_Factory tipo) {
        this.tipo = tipo;
    }

    public TipoComida_Factory getTipo() {
        return tipo;
    }

    public void setTipo(TipoComida_Factory tipo) {
        this.tipo = tipo;
    }
    
    
}
