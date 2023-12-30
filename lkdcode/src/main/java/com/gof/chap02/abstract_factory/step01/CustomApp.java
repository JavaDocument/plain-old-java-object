package com.gof.chap02.abstract_factory.step01;

class CustomApp {
    private Button button;
    private CheckBox checkBox;

    public CustomApp(Button button, CheckBox checkBox) {
        this.button = button;
        this.checkBox = checkBox;
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}

