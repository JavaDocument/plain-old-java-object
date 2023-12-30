package com.gof.chap01.adapter.step03;

class YEN implements Currency {
    private double amount;

    public YEN(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return this.amount;
    }

}
