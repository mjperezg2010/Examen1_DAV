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
public class Player_State {
    
    

    public Player_State() {
    }
    
    //Lider
    public void ascenderAColider(String nombre){
        System.out.println(nombre+" fue ascendido a Colider");
    }
    
    
    //Lider y Colider
    public void cambiarNombreClan(String nombreClan){
        System.out.println("El nuevo nombre del clan es: "+nombreClan);
        
    }
    
    public void eliminarMiembro(String nombre){
        System.out.println(nombre+" ha sido eliminado");
    }
    
    //Lider miembro colider
    
    public void publicarAnuncios(String anuncio){
        System.out.println("Anuncio: "+anuncio);
        
    }
}
