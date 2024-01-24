package com.gof.chap05.proxy.step1;

class ProxyPrinter implements Printable {
    private String name;
    private Printer real;

    public ProxyPrinter() {
        this.name = "No name";
        this.real = null;
    }

    public ProxyPrinter(String name) {
        this.name = name;
        this.real = null;
    }

    @Override
    public void setName(String name) {
        if (real != null) {
            real.setName(name);
        }
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print(String str) {
        realize();
        this.real.print(str);
    }

    private synchronized void realize() {
        if (this.real == null) this.real = new Printer();
    }
}
