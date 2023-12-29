package com.gof.chap02.strategy.step02;

import java.util.HashMap;
import java.util.Map;

import static com.gof.chap02.strategy.step02.ConsoleReader.read;

class Application {
    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) {
        while (!order.isClosed()) {
            int cost;
            String continueChoice;
            do {
                System.out.print("""
                        Please, select a product:
                        1 - Mother board
                        2 - CPU
                        3 - HDD
                        4 - Memory
                        """
                );

                final int choice = Integer.parseInt(read());
                cost = priceOnProducts.get(choice);
                System.out.print("Count: ");
                final int count = Integer.parseInt(read());
                order.setTotalCost(cost * count);
                System.out.print("Do you wish to continue selecting products? Y/N: ");
                continueChoice = read();
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println("""
                        Please, select a payment method:
                        1 - PayPal
                        2 - Credit Card""");

                final String paymentMethod = read();
                if (paymentMethod.equals("1")) {
                    strategy = new PayByPayPal();
                } else {
                    strategy = new PayByCreditCard();
                }
            }


            order.processOrder(strategy);
            System.out.print("Pay " + order.getTotalCost() + " units or Continue shopping? P/C: ");
            final String proceed = read();
            if (proceed.equalsIgnoreCase("P")) {
                if (strategy.pay(order.getTotalCost())) {
                    System.out.println("Payment has been successful.");
                } else {
                    System.out.println("FAIL! Please, check your data.");
                }
                order.setClosed();
            }
        }
    }
}
