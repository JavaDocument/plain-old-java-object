package com.gof.creational.adapter.step01;

class Store {
    private final String itemName = "사과";
    private final int price = 3_000;

    public String buyItem(Won won) {
        if (won.getAmount() >= price) {
            return itemName;
        }

        return null;
    }
}
