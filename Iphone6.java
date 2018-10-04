package com.abstractfactory.product.smartphone.imp1;

import com.abstractfactory.product.smartphone.SmartPhone;

public class Iphone6 implements SmartPhone {

	@Override
	public String info() {
		String msg = String.format("This is %s - %s", "Iphone 6s", "4.7-inch display");
		return msg;
	}

}