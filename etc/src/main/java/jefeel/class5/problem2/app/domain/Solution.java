package jefeel.class5.problem2.app.domain;


public class Solution {
    public void solution(int number){

        int resultCount = 0;

        for (int i = 1; i <= number; i++) {
            String value = String.valueOf(i);
            int count = 0;
            for (int j = 0; j < value.length(); j++) {
                char digit = value.charAt(j);
                if (digit == '3' || digit == '6' || digit == '9') {
                    count++;
                }
            }

            resultCount += count;
        }

        System.out.println("박수치는 횟수: " + resultCount);
    }

}
