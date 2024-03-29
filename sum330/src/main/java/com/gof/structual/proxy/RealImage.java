package com.gof.structual.proxy;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println(fileName + " 로딩 중");
    }

    @Override
    public void displayImage() {
        System.out.println(fileName + " 표시");
    }
}
