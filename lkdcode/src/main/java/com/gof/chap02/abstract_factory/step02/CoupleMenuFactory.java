package com.gof.chap02.abstract_factory.step02;

import com.gof.chap02.abstract_factory.step02.dessert.Dessert;
import com.gof.chap02.abstract_factory.step02.dessert.Tart;
import com.gof.chap02.abstract_factory.step02.fruit.Fruit;
import com.gof.chap02.abstract_factory.step02.fruit.Tomato;
import com.gof.chap02.abstract_factory.step02.main_dish.MainDish;
import com.gof.chap02.abstract_factory.step02.main_dish.Steak;
import com.gof.chap02.abstract_factory.step02.restaurant.Order;
import com.gof.chap02.abstract_factory.step02.side_dish.Potatoes;
import com.gof.chap02.abstract_factory.step02.side_dish.SideDish;

class CoupleMenuFactory implements Order {
    @Override
    public Dessert createDessert() {
        return new Tart();
    }

    @Override
    public Fruit createFruit() {
        return new Tomato();
    }

    @Override
    public MainDish createMainDish() {
        return new Steak();
    }

    @Override
    public SideDish createSideDish() {
        return new Potatoes();
    }

}
