package com.gof.chap01.adapter.step03;

class Application {
    public static void main(String[] args) {
        CurrencyExchange currencyExchange = new CurrencyExchange();

        USD myUSD = new USD(5);
        YEN myYEN = new YEN(280);
        WON myWON = new WON(4_000);

        WON result1 = (WON) currencyExchange.exchange(myUSD
                , currency -> new WON(currency.getAmount() * 1_000.0));

        YEN result2 = (YEN) currencyExchange.exchange(myUSD,
                currency -> new YEN(currency.getAmount() * 140.0));

        WON result3 = (WON) currencyExchange.exchange(myYEN
                , currency -> new WON(currency.getAmount() * 10.0));

        USD result4 = (USD) currencyExchange.exchange(myYEN,
                currency -> new USD(currency.getAmount() / 140.0));

        USD result5 = (USD) currencyExchange.exchange(myWON,
                currency -> new USD(currency.getAmount() / 1_000.0));

        YEN result6 = (YEN) currencyExchange.exchange(myWON,
                currency -> new YEN(currency.getAmount() / 10.0));

        System.out.println("myUSD : $" + myUSD.getAmount() + " -> WON = " + result1.getAmount());
        System.out.println("myUSD : $" + myUSD.getAmount() + " -> YEN = " + result2.getAmount());
        System.out.println("myYEN : Y" + myYEN.getAmount() + " -> WON = " + result3.getAmount());
        System.out.println("myYEN : Y" + myYEN.getAmount() + " -> USD = " + result4.getAmount());
        System.out.println("myWON : ₩" + myWON.getAmount() + " -> USD = " + result5.getAmount());
        System.out.println("myWON : ₩" + myWON.getAmount() + " -> YEN = " + result6.getAmount());

    }
}
