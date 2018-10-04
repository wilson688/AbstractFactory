package com.abstractfactory.factories;

import com.abstractfactory.MobileFactory;
import com.abstractfactory.product.smartphone.*;
import com.abstractfactory.product.smartphone.imp1.*;
import com.abstractfactory.product.tablet.*;
import com.abstractfactory.product.tablet.imp1.*;

public class SamsungFactory implements MobileFactory {

	@Override
	public SmartPhone createSmartPhone(SmartPhoneType type) {
		SmartPhone phone = null;
		switch (type) {
		case Galaxyon7:
			phone = new Galaxyon7();
			break;
		case GalaxyJ7:
			phone = new GalaxyJ7();
			break;
		default:
			break;
		}
		return phone;
	}

	@Override
	public Tablet createTablet(TabletType type) {
		Tablet tablet = null;
		switch (type) {
		case GalaxyTabA:
			tablet = new GalaxyTabA();
			break;
		case GalaxyTabs2:
			tablet = new GalaxyTabs2();
			break;
		default:
			break;
		}

		return tablet;

	}

}
