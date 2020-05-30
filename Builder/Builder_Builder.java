/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author martinperez
 */
public interface Builder_Builder {
    
    public abstract void addBattery(String tipo);
    public abstract void addCover(String cover);
    public abstract void setPrice(double price);
    public abstract Phone_Builder getPhone();
    
}
