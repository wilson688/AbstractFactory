package com.abstractfactory;

import com.abstractfactory.product.smartphone.*;
import com.abstractfactory.product.tablet.*;

public interface MobileFactory {
	public SmartPhone createSmartPhone(SmartPhoneType type);

	public Tablet createTablet(TabletType type);
}
