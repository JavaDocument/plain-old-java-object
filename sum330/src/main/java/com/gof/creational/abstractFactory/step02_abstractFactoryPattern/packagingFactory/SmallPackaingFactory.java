package com.gof.creational.abstractFactory.step02_abstractFactoryPattern.packagingFactory;

import com.gof.creational.abstractFactory.step02_abstractFactoryPattern.packagingFactory.bottle.Bottle;
import com.gof.creational.abstractFactory.step02_abstractFactoryPattern.packagingFactory.bottle.SmallBottle;
import com.gof.creational.abstractFactory.step02_abstractFactoryPattern.packagingFactory.cap.Cap;
import com.gof.creational.abstractFactory.step02_abstractFactoryPattern.packagingFactory.cap.SmallCap;

public class SmallPackaingFactory implements PackagingFactory {

    @Override
    public Bottle createBottle() {
        return new SmallBottle();
    }

    @Override
    public Cap createCap() {
        return new SmallCap();
    }
}
