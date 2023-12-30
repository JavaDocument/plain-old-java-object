package com.gof.structual.adapter.step01;

public class StrToIntAdapter {

    public int formatAsInt(String date) {

        String replace = date.replace("-", "");
        return Integer.parseInt(replace);
    }
}
