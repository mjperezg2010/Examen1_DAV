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
public class PhoneBuilder_Builder implements Builder_Builder{
    
    private Phone_Builder phone = new Phone_Builder();

	@Override
	public void addBattery(String Type) {
		phone.battery = Type;
	}

	@Override
	public void addCover(String sides) {
		phone.cover = sides;
	}

	
	@Override
	public void setPrice(double price) {
		phone.price = price;
	}

	@Override
	public Phone_Builder getPhone() {
		return phone;
	}
    
}
