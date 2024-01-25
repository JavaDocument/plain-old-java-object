package com.gof.structual.proxy;

public class Main {

    public static void main(String[] args) {

        ProxyImage image1 = new ProxyImage("이미지_1");
        ProxyImage image2 = new ProxyImage("이미지_2");

        image1.displayImage();
        System.out.println();
        image2.displayImage();
    }
}
