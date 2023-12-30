package com.gof.creational.abstractFactory.step02_abstractFactoryPattern.perfumeFactory;

import com.gof.creational.abstractFactory.step02_abstractFactoryPattern.packagingFactory.PackagingFactory;
import com.gof.creational.abstractFactory.step02_abstractFactoryPattern.perfume.Perfume;

public class RosePerfumeFactory extends DefaultPerfumeFactory {

    private PackagingFactory packagingFactory;

    public RosePerfumeFactory(PackagingFactory packagingFactory) {
        this.packagingFactory = packagingFactory;
    }

    @Override
    public Perfume makePerfume() {
        RosePerfume rosePerfume = new RosePerfume();
        rosePerfume.setCap(packagingFactory.createCap());
        rosePerfume.setBottle(packagingFactory.createBottle());
        return rosePerfume;
    }
}
