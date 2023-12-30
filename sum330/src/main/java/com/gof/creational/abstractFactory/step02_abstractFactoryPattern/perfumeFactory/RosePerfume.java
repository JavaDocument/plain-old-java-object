package com.gof.creational.abstractFactory.step02_abstractFactoryPattern.perfumeFactory;

import com.gof.creational.abstractFactory.step02_abstractFactoryPattern.perfume.Color;
import com.gof.creational.abstractFactory.step02_abstractFactoryPattern.perfume.Perfume;

public class RosePerfume extends Perfume {

    public RosePerfume() {
        setName("장미향 향수");
        setColor(Color.PINK);
    }
}
