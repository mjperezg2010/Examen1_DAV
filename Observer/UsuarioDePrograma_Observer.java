/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author martinperez
 */
public class UsuarioDePrograma_Observer implements Observer_Observer{
    
     private String name;
   
   
    public UsuarioDePrograma_Observer(String name) {
        this.name = name;
    }
    public void Update(Subject_Observer update){
        
        System.out.println(this.name+ " Hay una nueva actualizacion!"+update);
		
    }
    
}
