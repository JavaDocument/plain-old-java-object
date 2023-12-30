package com.gof.structual.adapter.step01;

public class IntToStrAdapter {

    public String formatAsString(int date) {

        String stringDate = Integer.toString(date);
        String year = stringDate.substring(0, 4);
        String month = stringDate.substring(4, 6);
        String day = stringDate.substring(6, 8);
        return year + "-" + month + "-" + day;
    }

}
