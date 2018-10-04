package com.abstractfactory;

import java.util.*;

import com.abstractfactory.product.smartphone.SmartPhone;
import com.abstractfactory.product.smartphone.SmartPhoneType;
import com.abstractfactory.product.tablet.Tablet;
import com.abstractfactory.product.tablet.TabletType;


public class Main {
	public static void main(String[] args) {
    List<SmartPhone> phones1 = new ArrayList<>(); 
    List<Tablet> tab1 = new ArrayList<>(); 

    System.out.println("--------APPLE BRAND-------------------");
    MobileFactory appleF = MobileProducer.getMobileFactory(MobileFactoryType.AppleFactory); 
    phones1.add(appleF.createSmartPhone(SmartPhoneType.Iphone6)); 
    phones1.add(appleF.createSmartPhone(SmartPhoneType.Iphone6Plus));
    
    tab1.add(appleF.createTablet(TabletType.IPadMini4));

    tab1.add(appleF.createTablet(TabletType.IPadPro));
    
    phones1.forEach(phone->System.out.println(phone.info()));
    tab1.forEach(tab2->System.out.println(tab2.info()));
    
    /*System.out.println("--------SAMSUNG BRAND-------------------");
    List<SmartPhone> phones2 = new ArrayList<>(); 
    List<Tablet> tab2 = new ArrayList<>(); 

    MobileFactory samsungF = MobileProducer.getMobileFactory(MobileFactoryType.SamsungFactory); 
    phones2.add(samsungF.createSmartPhone(SmartPhoneType.GalaxyJ7)); 
    phones2.add(samsungF.createSmartPhone(SmartPhoneType.Galaxyon7));
    
    tab2.add(samsungF.createTablet(TabletType.GalaxyTabA));

    tab2.add(samsungF.createTablet(TabletType.GalaxyTabs2));
    
    phones2.forEach(phone->System.out.println(phone.info()));
    tab2.forEach(tab3->System.out.println(tab3.info()));
	
*/	}
}
