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
public interface Subject_Observer {
    public void registerObserver(Observer_Observer registro);
    public void removeObserver(Observer_Observer remove);
    public void notifyAllObservers();
    
}
