package emilywin.class1.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a=0,b=0,sum=0;
        System.out.print("원하시는 첫번째 정수를 입력해주세요 : ");
        a=Integer.parseInt(br.readLine());
        System.out.print("원하시는 두번째 정수를 입력해주세요 : ");
        b=Integer.parseInt(br.readLine());
        sum=a+b;
        System.out.println("입력하신 두개의 정수의 합은 "+sum+"입니다.");


//        Scanner sc=new Scanner(System.in);
//        int a=0,b=0,sum=0;
//        System.out.print("원하시는 첫번째 정수를 입력해주세요 : ");
//        a=sc.nextInt();
//        System.out.print("원하시는 두번째 정수를 입력해주세요 : ");
//        b=sc.nextInt();
//        sum=a+b;
//        System.out.println("입력하신 두개의 정수의 합은 "+sum+"입니다.");
        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
        System.out.println("시간차이(m) : "+secDiffTime);
    }
}
