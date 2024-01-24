package com.gof.chap05.facade.step1;

class DataBase {
    private DataBase() {
    }

    public static String read(String file) {
        return "불러오기 성공: " + file;
    }
}
