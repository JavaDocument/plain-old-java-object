package com.gof.creational.abstractFactory.step02_abstractFactoryPattern.packagingFactory;

import com.gof.creational.abstractFactory.step02_abstractFactoryPattern.packagingFactory.bottle.BigBottle;
import com.gof.creational.abstractFactory.step02_abstractFactoryPattern.packagingFactory.bottle.Bottle;
import com.gof.creational.abstractFactory.step02_abstractFactoryPattern.packagingFactory.cap.BigCap;
import com.gof.creational.abstractFactory.step02_abstractFactoryPattern.packagingFactory.cap.Cap;

public class BigPackaingFactory implements PackagingFactory{

    @Override
    public Bottle createBottle() {
        return new BigBottle();
    }

    @Override
    public Cap createCap() {
        return new BigCap();
    }
}
