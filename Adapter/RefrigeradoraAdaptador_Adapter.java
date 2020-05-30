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
public class RefrigeradoraAdaptador_Adapter extends RefrigeradoraModerna_Adapter{
    
    private RefrigeradoraAntigua_Adapter refrigeradora;

    public RefrigeradoraAdaptador_Adapter(final RefrigeradoraAntigua_Adapter refrigeradora) {
        this.refrigeradora = refrigeradora;
    }
    
    
    
    @Override
    public void triturarhielo(){
        refrigeradora.retirarHielo();
        refrigeradora.colocarHieloTrituradora();
        refrigeradora.triturar();
        System.out.println("Hielo Triturado!");
    }
    
}
