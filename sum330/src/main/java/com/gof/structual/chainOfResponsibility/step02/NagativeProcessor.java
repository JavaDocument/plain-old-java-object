package com.gof.structual.chainOfResponsibility.step02;

class NagativeProcessor implements Chain{

    private Chain nextInChane;

    @Override
    public void setNext(Chain nextInChane) {
        this.nextInChane = nextInChane;
    }

    @Override
    public void process(Number request) {
        if (request.getNumber() < 0) {
            System.out.println("음수 : " + request.getNumber());
        } else {
            nextInChane.process(request);
        }
    }
}
