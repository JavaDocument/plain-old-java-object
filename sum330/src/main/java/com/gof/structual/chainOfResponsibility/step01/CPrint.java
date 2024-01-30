package com.gof.structual.chainOfResponsibility.step01;

class CPrint extends PrintMiddleware {
    @Override
    void print() {
        System.out.println("CPrint.print");
        super.nextPrint();
    }

    // boolean print() {
    // if (sdjkflajsdfl.sjkfajsk()) return true;
    // return super.nextValid();
//}
}
