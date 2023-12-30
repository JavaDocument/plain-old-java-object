package com.gof.chap02.strategy.step02;

import static com.gof.chap02.strategy.step02.ConsoleReader.read;

class PayByCreditCard implements PayStrategy {
    private CreditCard creditCard;

    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Paying " + paymentAmount + " using Credit Card.");
            creditCard.setAmount(creditCard.getAmount() - paymentAmount);
        }
        return false;
    }

    private boolean cardIsPresent() {
        return creditCard != null;
    }

    @Override
    public void collectPaymentDetails() {
        System.out.print("Enter the card number : ");
        final String number = read();
        System.out.print("Enter the card expiration date 'mm/yy' : ");
        final String date = read();

        System.out.print("Enter the CVV code : ");
        final String cvv = read();
        this.creditCard = new CreditCard(number, date, cvv);
    }
}
