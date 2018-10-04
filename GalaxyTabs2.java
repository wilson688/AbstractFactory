package com.abstractfactory.product.tablet.imp1;

import com.abstractfactory.product.tablet.Tablet;

public class GalaxyTabs2 implements Tablet {

	@Override
	public String info() {
		String msg = String.format("This is %s - %s", "Galaxy Tab s2", "8.0-inch display");
		return msg;
	}

}
