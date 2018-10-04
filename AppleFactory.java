package com.abstractfactory.factories;

import com.abstractfactory.MobileFactory;
import com.abstractfactory.product.smartphone.SmartPhone;
import com.abstractfactory.product.smartphone.SmartPhoneType;
import com.abstractfactory.product.smartphone.imp1.Iphone6;
import com.abstractfactory.product.smartphone.imp1.Iphone6Plus;
import com.abstractfactory.product.tablet.Tablet;
import com.abstractfactory.product.tablet.TabletType;
import com.abstractfactory.product.tablet.imp1.IPadMini4;
import com.abstractfactory.product.tablet.imp1.IPadPro;

public class AppleFactory implements MobileFactory {

	@Override
	public SmartPhone createSmartPhone(SmartPhoneType type) {
		SmartPhone phone = null;
		switch (type) {
		case Iphone6:
			phone = new Iphone6();
			break;
		case Iphone6Plus:
			phone = new Iphone6Plus();
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
		case IPadMini4:
			tablet = new IPadMini4();
			break;
		case IPadPro:
			tablet = new IPadPro();
			break;
		default:
			break;
		}

		return tablet;
	}

}
