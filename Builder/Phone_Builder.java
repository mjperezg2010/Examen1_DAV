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
public class Phone_Builder {
        public String battery;
	public String cover;
	public double price;

    @Override
    public String toString() {
        return "Phone_Builder{" + "battery=" + battery + ", cover=" + cover + ", price=" + price + '}';
    }

	
}
