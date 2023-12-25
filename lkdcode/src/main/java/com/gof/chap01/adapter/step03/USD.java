package com.gof.chap01.adapter.step03;

class USD implements Currency {
    private double amount;

    public USD(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return this.amount;
    }

}
