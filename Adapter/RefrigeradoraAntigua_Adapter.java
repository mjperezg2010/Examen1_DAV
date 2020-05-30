/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author martinperez
 */
public class RefrigeradoraAntigua_Adapter {
    
    public void abrir(){
        System.out.println("Refrigeradora Abierta");
        
    }
    
    public void cerrar(){
        System.out.println("Refrigeradora Cerrada");
    }
    
    public void enfriar(){
        System.out.println("Enfriando");
    }
    
    public void retirarHielo(){
        System.out.println("Hielo Retirado");
    }

    public void colocarHieloTrituradora(){
        System.out.println("Hielo Colocado");
    }
    
    public void triturar(){
        System.out.println("Contenido triturado");
    }
}
