package com.abstractfactory.product.smartphone.imp1;

import com.abstractfactory.product.smartphone.SmartPhone;

public class GalaxyJ7 implements SmartPhone {

	@Override
	public String info() {
		String msg = String.format("This is %s - %s", "Samsung Galaxy J7", "5.5 inches display"); 
		return msg;
	}

}
