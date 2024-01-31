package com.gof.behavioral.chainOfResponsibility.step01;

abstract class PrintMiddleware {

    private PrintMiddleware next;

    public static PrintMiddleware link(PrintMiddleware first, PrintMiddleware... chain) {
        PrintMiddleware head = first;

        for (PrintMiddleware printMiddleware : chain) {
            head.next = printMiddleware;
            head = printMiddleware;
        }

        return first;
    }

    // user0 - user1 - user2 - user3
    abstract void print(); // nextPrint()

    // user0.print();
    // user1.print();
    protected void nextPrint() {
        if (next == null) return;
        this.next.print();
    }
}
