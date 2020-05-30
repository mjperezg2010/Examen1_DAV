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
public class RefrigeradoraModerna_Adapter implements Refrigeradora_Adapter {
    
    public void enfriarAutomatico(){
        System.out.println("Enfriando");
    }
    
    
    
    public void triturarhielo(){
        System.out.println("Hielo triturado!");
    }
    
    public void abrir(){
        System.out.println("Refrigeradora Abierta");
        enfriarAutomatico();
    }
    
    public void cerrar(){
        System.out.println("Refrigeradora Cerrada");
    }
    
    
    
}
