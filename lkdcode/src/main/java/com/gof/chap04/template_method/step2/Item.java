package com.gof.chap04.template_method.step2;

abstract class Item {

    public final void payment(final PaymentType paymentType) {
        System.out.println("=============================");
        System.out.println("제품 가격: " + price());
        System.out.println("결제 타입: " + paymentType.name());
        System.out.println("결제 완료 금액: " + paymentType.process(price()));
        System.out.println("=============================");
    }

    protected abstract Double price();
}
