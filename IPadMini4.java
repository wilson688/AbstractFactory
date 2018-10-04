package com.abstractfactory.product.tablet.imp1;

import com.abstractfactory.product.tablet.Tablet;

public class IPadMini4 implements Tablet {
	@Override
	public String info() {
		String msg = String.format("This is %s - %s", "IPad Mini 4", "7.9-inch display");
		return msg;
	}

}
