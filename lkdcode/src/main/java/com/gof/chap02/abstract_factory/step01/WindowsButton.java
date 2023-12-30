package com.gof.chap02.abstract_factory.step01;

class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
