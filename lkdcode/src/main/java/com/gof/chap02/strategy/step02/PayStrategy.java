package com.gof.chap02.strategy.step02;

interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
