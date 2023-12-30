package com.gof.chap02.strategy.step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ConsoleReader {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static String read() {
        while (true) {
            try {
                return READER.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
