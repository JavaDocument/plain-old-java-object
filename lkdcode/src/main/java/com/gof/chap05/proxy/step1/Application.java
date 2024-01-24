package com.gof.chap05.proxy.step1;

class Application {
    public static void main(String[] args) {
        final Printable printer = new ProxyPrinter("proxy");
        System.out.println("현재 이름: " + printer.getName());

        printer.setName("real");
        System.out.println("현재 이름: " + printer.getName());
        printer.print("Hello World!!");
    }
}
