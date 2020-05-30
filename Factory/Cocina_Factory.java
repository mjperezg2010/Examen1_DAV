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
public class Cocina_Factory {

    public Cocina_Factory() {
        
    }
    
    public Comida_Factory cocinar(TipoComida_Factory comida){
        
        if(comida.equals(TipoComida_Factory.Combo1)){
            return new Combo1_Factory();
         
        }else if (comida.equals(TipoComida_Factory.Combo2)){
            return new Combo2_Factory();
        }
        
        return new Comida_Factory(comida);
    }
    
    
}
