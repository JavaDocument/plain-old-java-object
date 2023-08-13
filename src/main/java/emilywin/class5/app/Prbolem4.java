package emilywin.class5.app;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Prbolem4 {

private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        System.out.print("출금할 금액을 입력하세요 : ");
        int money= Integer.parseInt(br.readLine());
        System.out.println("변환된 결과 : "+solution(money));
    }

    private static ArrayList solution(int money){
        ArrayList arrayList = new ArrayList();

        int[] amount = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};

        for (int i = 0; i < amount.length; i++) {
            arrayList.add(money / amount[i]);
            money %= amount[i];
        }
        return arrayList;
    }
}

