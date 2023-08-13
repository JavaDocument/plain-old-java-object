package emilywin.class5.app;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prbolem2 {

private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        System.out.print("숫자를 입력하세요 : ");
        int number = Integer.parseInt(br.readLine());
        System.out.println("손뼉친 횟수 : "+clapCount(number));
    }

    public static int clapCount(int number){
        int clapCount=0;
        for (int i = 1; i <=number; i++) {
            String s = Integer.toString(i);
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if(c=='3'||c=='6'||c=='9') {
                    clapCount++;
                }
            }
        }
        return clapCount;
    }

}

