package com.gof.chap04.template_method.step2;

class Application {

    public static void main(String[] args) {
        Item apple = new Apple(1300.0);
        Item banana = new Banana(1000.0);

        apple.payment(PaymentType.CASH);
        apple.payment(PaymentType.CARD);
        apple.payment(PaymentType.ACCOUNT_TRANSFER);

        banana.payment(PaymentType.CASH);
        banana.payment(PaymentType.CARD);
        banana.payment(PaymentType.ACCOUNT_TRANSFER);
    }

}
