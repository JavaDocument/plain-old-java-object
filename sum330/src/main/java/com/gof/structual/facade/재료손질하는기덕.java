package com.gof.structual.facade;

class 재료손질하는기덕 {

    private 도마 도마;
    private 칼 칼;

    public 재료손질하는기덕() {
        this.도마 = new 도마();
        this.칼 = new 칼();
    }

    public void trim() {
        도마.setting();
        칼.setting();
        System.out.println("촵촵 채소 손질 중");
    }
}
