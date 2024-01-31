package com.gof.behavioral.chainOfResponsibility.step02;

interface Chain {

    abstract void setNext(Chain nextInChane);

    abstract void process(Number request);
}
