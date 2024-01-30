package com.gof.structual.chainOfResponsibility.step02;

class ZeroProcessor implements Chain {

    private Chain nextInChain;

    @Override
    public void setNext(Chain nextInChane) {
        this.nextInChain = nextInChane;
    }

    @Override
    public void process(Number request) {
        if (request.getNumber() == 0) {
            System.out.println("제로 : " + request.getNumber());
        } else {
            nextInChain.process(request);
        }
    }
}
