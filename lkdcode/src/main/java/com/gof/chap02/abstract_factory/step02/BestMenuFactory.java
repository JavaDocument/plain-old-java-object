package com.gof.chap02.abstract_factory.step02;

import com.gof.chap02.abstract_factory.step02.dessert.Cake;
import com.gof.chap02.abstract_factory.step02.dessert.Dessert;
import com.gof.chap02.abstract_factory.step02.fruit.Apple;
import com.gof.chap02.abstract_factory.step02.fruit.Fruit;
import com.gof.chap02.abstract_factory.step02.main_dish.MainDish;
import com.gof.chap02.abstract_factory.step02.main_dish.Pasta;
import com.gof.chap02.abstract_factory.step02.restaurant.Order;
import com.gof.chap02.abstract_factory.step02.side_dish.Cabbage;
import com.gof.chap02.abstract_factory.step02.side_dish.SideDish;

class BestMenuFactory implements Order {
    @Override
    public Dessert createDessert() {
        return new Cake();
    }

    @Override
    public Fruit createFruit() {
        return new Apple();
    }

    @Override
    public MainDish createMainDish() {
        return new Pasta();
    }

    @Override
    public SideDish createSideDish() {
        return new Cabbage();
    }
}
