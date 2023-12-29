package com.gof.chap02.strategy.step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.SimpleTimeZone;

import static com.gof.chap02.strategy.step02.ConsoleReader.*;

class PayByPayPal implements PayStrategy {
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private String email;
    private String password;
    private boolean signedIn;

    static {
        DATA_BASE.put("amanda1985", "amanda@ya.com");
        DATA_BASE.put("qwerty", "john@amazon.eu");
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (this.signedIn) {
            System.out.println("Paying " + paymentAmount + " using PayPal.");
            return true;
        }

        return false;
    }

    @Override
    public void collectPaymentDetails() {
        while (!this.signedIn) {
            System.out.print("Enter the user's email: ");
            this.email = read();
            System.out.print("Enter the password: ");
            this.password = read();
            if (verify()) {
                System.out.println("Data verification has been successful.");
            } else {
                System.out.println("Wrong email or password!");
            }
        }
    }

    private boolean verify() {
        setSignedIn(this.email.equals(DATA_BASE.get(this.password)));
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}
