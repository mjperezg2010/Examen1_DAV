/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;

/**
 *
 * @author martinperez
 */
public class Programa_Observer implements Subject_Observer{

    public Programa_Observer() {
    }
    
    //ArrayList<String> jobs = new ArrayList();
    ArrayList<Observer_Observer> usuarios = new ArrayList();

    @Override
    public void registerObserver(Observer_Observer usuario) {
        usuarios.add(usuario);

    }

    @Override
    public void removeObserver(Observer_Observer usuario) {
        usuarios.remove(usuario);
    }

 

    public void addMejora(String mejora) {
        System.out.println(mejora+" añadida\n");

    }

    

    @Override
    public String toString() {
        return "\nActualizacion Nueva!";
    }

    @Override
    public void notifyAllObservers() {
        for (Observer_Observer usuario : usuarios) {
            usuario.Update(this);
        }
    }
    
    
}
