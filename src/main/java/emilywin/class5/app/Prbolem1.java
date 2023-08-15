package emilywin.class5.app;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prbolem1 {

private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        System.out.print("암호문을 입력하세요 : ");
        String cryptogram = br.readLine();
        System.out.println("암호 해독 결과 : "+checkDuplicate(cryptogram));
    }

    public static StringBuilder checkDuplicate(String str){
        StringBuilder answer = new StringBuilder(str);;
        boolean b;

        do {
             b= false;
            for (int i = 0; i < answer.length()-1; i++) {
                if(answer.charAt(i)==answer.charAt(i+1)){
                    b=true;
                    answer.delete(i,i+2);
                }
            }
        } while (b==true);

        return answer;
    }

}

