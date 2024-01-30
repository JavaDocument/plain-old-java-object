package com.gof.structual.chainOfResponsibility.step01;

class APrint extends PrintMiddleware {
    @Override
    void print() {
        System.out.println("APrintMiddleware.print");
        super.nextPrint();
    }
}
