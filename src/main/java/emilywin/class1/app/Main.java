package emilywin.class1.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

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
    }
}
