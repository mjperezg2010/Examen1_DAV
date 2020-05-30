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
public class Colider_State implements Rango_State{
    public void action(Player_State player){
        player.cambiarNombreClan("Clan Magistral");
        player.eliminarMiembro("Jorge");
        player.publicarAnuncios("Atencion todos es hora de atacar");
        
    }
    
}
