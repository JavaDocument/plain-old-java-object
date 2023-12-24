package sum.class2.app;

import sum.class2.app.member.Member;
import sum.class2.app.ui.InputScanner;
import sum.class2.app.ui.OutputConsole;

import java.util.*;

public class App {

    public static void main(String[] args) {

        Set<Member> members = new HashSet<>();
        InputScanner input = new InputScanner();
        OutputConsole output = new OutputConsole();

        while(true) {
            output.print("[알림] 종료하려면 '0'을 입력하세요.");

            output.print("이메일을 입력하세요. : ");
            String email = input.read();

            if (email.equals("0")) {
                break;
            }

            output.print("닉네임을 입력하세요. :");
            String nickName = input.read();

            Member newMember = new Member(email, nickName);



        }








    }
}
