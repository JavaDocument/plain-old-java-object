package kimjiseung97.class3.app;

import kimjiseung97.class3.app.domain.Service.Service;
import kimjiseung97.class3.app.domain.controller.Controller;
import kimjiseung97.class3.app.domain.member.User;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

       Controller controller = new Controller();

        int y = controller.selectCase("Y");

        System.out.println(y);

//        User user = new User("크롱");
//
//        User user1 = new User("포비");
//
//        int maxNumber = user.findMaxNumber();
//
//        int maxNumber1 = user1.findMaxNumber();
//
//        System.out.println(maxNumber);
//        System.out.println(maxNumber1);


    }
}
