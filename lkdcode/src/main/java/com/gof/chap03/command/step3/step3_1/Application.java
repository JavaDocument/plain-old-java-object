package com.gof.chap03.command.step3.step3_1;

class Application {
    public static void main(String[] args) {
        Button button = new Button();
        Alarm alarm = new Alarm();
        button.press(alarm);
    }
}
