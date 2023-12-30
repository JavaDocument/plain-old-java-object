package com.gof.chap02.abstract_factory.step01;

class Application {
    public static void main(String[] args) {
        final MacOsFactory macOsFactory = new MacOsFactory();
        final WindowsFactory windowsFactory = new WindowsFactory();

        CustomApp macApp = new CustomApp(macOsFactory.createButton(), macOsFactory.createCheckbox());
        macApp.paint();

        CustomApp windowsApp = new CustomApp(windowsFactory.createButton(), windowsFactory.createCheckbox());
        windowsApp.paint();
    }
}
