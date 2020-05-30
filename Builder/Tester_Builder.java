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
public class Tester_Builder {
    
    public void makePhone(Builder_Builder phoneBuilder) {
		
		phoneBuilder.addBattery("Type A");
		phoneBuilder.addCover("Black");
		phoneBuilder.setPrice(299.99);
	}
    
}
