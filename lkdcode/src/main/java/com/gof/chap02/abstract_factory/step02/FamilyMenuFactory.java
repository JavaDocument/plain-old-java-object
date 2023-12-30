package com.gof.chap02.abstract_factory.step02;

import com.gof.chap02.abstract_factory.step02.dessert.Dessert;
import com.gof.chap02.abstract_factory.step02.dessert.Macaroon;
import com.gof.chap02.abstract_factory.step02.fruit.Banana;
import com.gof.chap02.abstract_factory.step02.fruit.Fruit;
import com.gof.chap02.abstract_factory.step02.main_dish.Chicken;
import com.gof.chap02.abstract_factory.step02.main_dish.MainDish;
import com.gof.chap02.abstract_factory.step02.restaurant.Order;
import com.gof.chap02.abstract_factory.step02.side_dish.Rice;
import com.gof.chap02.abstract_factory.step02.side_dish.SideDish;

class FamilyMenuFactory implements Order {
    @Override
    public Dessert createDessert() {
        return new Macaroon();
    }

    @Override
    public Fruit createFruit() {
        return new Banana();
    }

    @Override
    public MainDish createMainDish() {
        return new Chicken();
    }

    @Override
    public SideDish createSideDish() {
        return new Rice();
    }
}
