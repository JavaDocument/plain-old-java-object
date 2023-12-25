package com.gof.chap01.adapter.step01;

public class StrToIntAdapter {

    public int formatAsInt(String date) {

        String replace = date.replace("-", "");
        return Integer.parseInt(replace);
    }
}
