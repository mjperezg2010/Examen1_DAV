/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author martinperez
 */
public class Coc_State {
    
    private Rango_State rango = null;
    private Player_State player = new Player_State();

    public void setRango(Rango_State rango) {
            this.rango = rango;
    }

    public void RangoAction() {
            rango.action(player);
    }
    
}
