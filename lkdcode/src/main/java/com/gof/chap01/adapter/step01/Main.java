package com.gof.chap01.adapter.step01;

class Main {
    public static void main(String[] args) {
        Dollar dollar = new Dollar(3);
        CurrencyExchange currencyExchange = new CurrencyExchange();

        Store store = new Store();
        String item = store.buyItem(currencyExchange.dollarToWon(dollar));
        System.out.println(item);
    }
}
