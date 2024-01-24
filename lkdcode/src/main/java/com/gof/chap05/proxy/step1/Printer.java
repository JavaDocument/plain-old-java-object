package com.gof.chap05.proxy.step1;

class Printer implements Printable {
    private String name;

    public Printer() {
        heavyJob("인스턴스 생성 중...");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("인스턴스 생성 중...");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print(String str) {
        System.out.println(str);
    }

    private void heavyJob(String msg) {
        System.out.println(msg);
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println("무거운 작업 중.........");
            }
        } catch (InterruptedException ignored) {
        }
        System.out.println("완료");
    }
}
