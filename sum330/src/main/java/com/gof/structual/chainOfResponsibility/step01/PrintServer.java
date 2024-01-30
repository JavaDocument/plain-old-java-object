package com.gof.structual.chainOfResponsibility.step01;

class PrintServer {

    private final PrintMiddleware printMiddleware;

    public PrintServer(PrintMiddleware printMiddleware) {
        this.printMiddleware = printMiddleware;
    }

    public void execute() {
        this.printMiddleware.print();
    }
}
