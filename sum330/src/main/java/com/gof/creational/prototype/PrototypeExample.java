package com.gof.creational.prototype;

class PrototypeExample {

    public static void main(String[] args) {

        Prototype original = new Prototype("원본 속성"); // 원본객체 생성
        Prototype cloned = original.clone(); // 원본 복제하여 새로운 객체 생성

        cloned.setPrototype("복제된 속성"); // 속성 변경

        System.out.println("원본 속성: " + original.getProperty());
        System.out.println("복제된 속성: " + cloned.getProperty());
    }
}
