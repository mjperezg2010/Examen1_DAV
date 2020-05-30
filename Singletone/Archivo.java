/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singletone;

/**
 *
 * @author martinperez
 */
public class Archivo {
    
    private String contenido;
    private static volatile Archivo instance = new Archivo();


    private Archivo() {
        
    }
    
    public static Archivo getInstance(){
        return instance;
    }
    
    public void abrirArchivo(){
        System.out.println("Archivo abierto");
    }
    
    public void cerrarArchivo(){
        System.out.println("Archivo cerrado");
    }
    
    public void modificarArchivo(String contenido){
        this.contenido=contenido;
    }
    
    public void getContenido(){
        System.out.println(contenido);
    }
    
}
