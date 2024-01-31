package com.gof.behavioral.chainOfResponsibility.step02;

class PositiveProcessor implements Chain {

    private Chain nextInChane;

    @Override
    public void setNext(Chain nextInChane) {
        this.nextInChane = nextInChane;
    }

    @Override
    public void process(Number request) {
        if (request.getNumber() > 0) {
            System.out.println("양수 : " + request.getNumber());
        } else {
            nextInChane.process(request);
        }
    }
}
