package com.gof.structual.chainOfResponsibility.step01;

class BPrint extends PrintMiddleware {
    @Override
    void print() {
        System.out.println("BPrint.print");
        super.nextPrint();
    }
}
