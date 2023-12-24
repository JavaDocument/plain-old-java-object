package emilywin.class5.app;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prbolem3 {

private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        System.out.print("변환할 문장을 입력하세요 : ");
        String sentences= br.readLine();
        System.out.println("변환된 문장 : "+convertSentences(sentences));
    }

    private static String convertSentences(String sentences) {
        String answer = "";
        for (int i = 0; i < sentences.length(); i++) {
            char alphabet = sentences.charAt(i);
            if(alphabet>=(char)('a')&&alphabet<=(char)('z')){ //소문자
                int a =90 + 65 - sentences.charAt(i);
                answer+= (char)(a);
            }else if(alphabet>=(char)('A')&&alphabet<=(char)('Z')){//대문자
                int a =122 + 97 - sentences.charAt(i);
                answer+= (char)(a);
            }else{
                answer+=alphabet;
            }
        }
        return answer;
    }


}

