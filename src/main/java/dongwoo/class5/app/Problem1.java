package dongwoo.class5.app;

import java.util.Stack;

//대문자 체크하기
public class Problem1 {
    public static void main(String[] args) {
        Stack<Character> compare = new Stack<>();
        String cryptogram = "zyelleyz";
        StringBuffer stringBuffer = new StringBuffer();

        boolean checkLength = checkCryptogram(cryptogram);

        if(checkLength){
            compare.push(cryptogram.charAt(0));

            for (int i = 1; i < cryptogram.length(); i++) {
                char cryp = cryptogram.charAt(i);

                if(compare.peek().equals(cryp)){
                    compare.pop();
                }else {
                    compare.push(cryp);

                }

            }

            for (int i = 0; i < compare.size(); i++) {
                stringBuffer.append(compare.get(i));
            }

            System.out.println("result = " + stringBuffer);
        }


    }

    private static boolean checkCryptogram(String cryptogram) {
        int length = cryptogram.length();
        if (length>=1&&length<=1000){
            return true;
        }
        return false;

    }
}