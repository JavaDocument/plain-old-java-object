package com.gof.chap02.abstract_factory.step01;

class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
