package com.gof.creational.abstractFactory.step02_abstractFactoryPattern;

import com.gof.creational.abstractFactory.step02_abstractFactoryPattern.packagingFactory.BigPackaingFactory;
import com.gof.creational.abstractFactory.step02_abstractFactoryPattern.packagingFactory.SmallPackaingFactory;
import com.gof.creational.abstractFactory.step02_abstractFactoryPattern.perfume.Perfume;
import com.gof.creational.abstractFactory.step02_abstractFactoryPattern.perfumeFactory.RosePerfumeFactory;

public class App {

    public static void main(String[] args) {

        RosePerfumeFactory rosePerfumeFactory1 = new RosePerfumeFactory(new BigPackaingFactory());
        Perfume perfume1 = rosePerfumeFactory1.makePerfume();
        System.out.println(perfume1.getCap().getClass());
        System.out.println(perfume1.getBottle().getClass());

        RosePerfumeFactory rosePerfumeFactory2 = new RosePerfumeFactory(new SmallPackaingFactory());
        Perfume perfume2 = rosePerfumeFactory2.makePerfume();
        System.out.println(perfume2.getCap().getClass());
        System.out.println(perfume2.getBottle().getClass());
    }
}
