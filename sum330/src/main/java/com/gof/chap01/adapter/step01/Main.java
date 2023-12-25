package com.gof.chap01.adapter.step01;

public class Main {

    // DateFormatterInt 데이트포맷터1 - 20231225
    // DateFormatterString 데이트포맷터2 - 2023-12-25
    // IntToString 어댑터 1->2 (int -> String)
    // 어댑터 2->1 (String -> int)

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
