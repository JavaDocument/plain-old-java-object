package com.gof.structual.adapter.step01;

public class Main {

    public static void main(String[] args) {

        int intDate = 20231225;
        IntToStrAdapter intToStrAdapter = new IntToStrAdapter();
        String strDate = intToStrAdapter.formatAsString(intDate);
        System.out.println(strDate);


        StrToIntAdapter strToIntAdapter = new StrToIntAdapter();
        int int_Date = strToIntAdapter.formatAsInt(strDate);
        System.out.println(int_Date);
    }
}
