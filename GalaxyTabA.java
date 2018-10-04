package com.abstractfactory.product.tablet.imp1;

import com.abstractfactory.product.tablet.Tablet;

public class GalaxyTabA implements Tablet {

	@Override
	public String info() {
		String msg = String.format("This is %s - %s", "Galaxy Tab A", "9.7-inch display");
		return msg;
	}
}
