package com.gof.chap01.adapter.step03;

class WON implements Currency {
    private double amount;

    public WON(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return this.amount;
    }

}
