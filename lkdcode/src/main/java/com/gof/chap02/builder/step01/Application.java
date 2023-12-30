package com.gof.chap02.builder.step01;

class Application {
    public static void main(String[] args) {
        MyHome build = new MyHome.Builder()
                .name("MyHome")
                .address("Seoul")
//                .door(2)
//                .post(1227)
                .build();

        System.out.println(build);
    }
}
