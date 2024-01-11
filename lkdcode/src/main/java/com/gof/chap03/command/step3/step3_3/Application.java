package com.gof.chap03.command.step3.step3_3;

class Application {
    public static void main(String[] args) {
        final Alarm alarm = new Alarm();
        final Lamp lamp = new Lamp();

        Button button = new Button();
        button.press(alarm);
        button.press(lamp);

        //---------------------

        final Remote remote = new Remote();
        final Keyboard keyboard = new Keyboard();
        final Calculator calculator = new Calculator();

        button.press(remote);
        button.press(keyboard);
        button.press(calculator);
    }
}
