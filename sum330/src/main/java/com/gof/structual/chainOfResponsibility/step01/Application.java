package com.gof.structual.chainOfResponsibility.step01;

class Application {
    public static void main(String[] args) {
        final PrintMiddleware printMiddleware = PrintMiddleware.link(
                new APrint(),
                new BPrint(),
                new CPrint(),
                new BPrint(),
                new APrint(),
                new APrint(),
                new CPrint()
        );

        // 5%
        // -1_000
        // 3%
        // -500

        // 큰 돌
        // 중간 돌
        // 작은 돌
        // 모래
        // 종이

        final PrintServer printServer = new PrintServer(printMiddleware);

        //

        printServer.execute();
        //
    }

    private double discount(double amount) {
        amount *= 0.95;
        //return nextDiscount(amount *= 0.95);
        return amount * 0.95;
    }

    private double discount2(double amount) {
        return amount - 1_000;
    }
}
