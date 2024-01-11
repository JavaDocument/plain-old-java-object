package com.gof.chap03.command.step3.step3_2;

class Application {
    public static void main(String[] args) {
        final Alarm alarm = new Alarm();
        final Lamp lamp = new Lamp();

        final Button button = new Button();
        button.press(alarm);
        button.press(lamp);
    }
}
