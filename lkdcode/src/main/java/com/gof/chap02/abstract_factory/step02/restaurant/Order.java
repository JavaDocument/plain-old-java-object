package com.gof.chap02.abstract_factory.step02.restaurant;

import com.gof.chap02.abstract_factory.step02.dessert.Dessert;
import com.gof.chap02.abstract_factory.step02.fruit.Fruit;
import com.gof.chap02.abstract_factory.step02.main_dish.MainDish;
import com.gof.chap02.abstract_factory.step02.side_dish.SideDish;

public interface Order {
    Dessert createDessert();

    Fruit createFruit();

    MainDish createMainDish();

    SideDish createSideDish();
}
