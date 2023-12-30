package com.gof.creational.abstractFactory.step02_abstractFactoryPattern.packagingFactory;

import com.gof.creational.abstractFactory.step02_abstractFactoryPattern.packagingFactory.bottle.Bottle;
import com.gof.creational.abstractFactory.step02_abstractFactoryPattern.packagingFactory.cap.Cap;

public interface PackagingFactory {

    Bottle createBottle();

    Cap createCap();
}
