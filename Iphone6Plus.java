package com.abstractfactory.product.smartphone.imp1;

import com.abstractfactory.product.smartphone.SmartPhone;

public class Iphone6Plus implements SmartPhone {
	
	@Override
	public String info() {
		String msg = String.format("This is %s - %s", "Iphone 6s Plus", "5.5-inch display");
		return msg;
	}


}


