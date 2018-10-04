package com.abstractfactory.product.tablet.imp1;

import com.abstractfactory.product.tablet.Tablet;

public class IPadPro implements Tablet {
	@Override
	public String info() {
		String msg = String.format("This is %s - %s", "IPad Pro", "12.9-inch display");
		return msg;	
		}

}
