package yewon.class5.app;

import java.util.Scanner;
import java.util.Stack;

public class Problem1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        // 입력받기
        String cryptogram = sc.next();

        // 스택에서 꺼낸 문자와 같을 시 스택 내 문자 삭제
        // 다르면 스택에 삽입
        for (int i = 0; i < cryptogram.length(); i++) {
            // 처음에 스택 비어있으니 삽입
            if (stack.empty()) {
                stack.push(cryptogram.charAt(i));
                continue;
            }
            if (stack.peek() == cryptogram.charAt(i)) {
                stack.pop();
            } else {
                stack.push(cryptogram.charAt(i));
            }
        }

        for (int i = 0; i < stack.size(); i++) {
            answer.append(stack.get(i));
        }

        System.out.print(answer);

        sc.close();

    }

}
