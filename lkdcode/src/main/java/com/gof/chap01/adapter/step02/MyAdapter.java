package com.gof.chap01.adapter.step02;

class MyAdapter {

    public int changeExecute(String target) {
        return Integer.parseInt(target.substring(target.indexOf("=") + 1).trim());
    }

}
