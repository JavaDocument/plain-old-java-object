package com.gof.creational.adapter.step02;

class MyAdapter {

    public int changeExecute(String target) {
        return Integer.parseInt(target.substring(target.indexOf("=") + 1).trim());
    }

}
