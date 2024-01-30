package com.gof.structual.chainOfResponsibility.step02;

interface Chain {

    abstract void setNext(Chain nextInChane);

    abstract void process(Number request);
}
