package kimjiseung97.class1.app.console;

import kimjiseung97.class1.app.calculator.Calculator;
import kimjiseung97.class1.app.calculator.Operator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Console {

     public void showConsole(){

         List<Character> characterList = new ArrayList<>();
         Scanner scanner = new Scanner(System.in);
         System.out.println("계산하실 식을 입력해주세요");

         String input = scanner.nextLine();

         for (char ch : input.toCharArray()) {
             characterList.add(ch);
             if(characterList.size()>=3){
                 break;
             }
         }

//         System.out.println(characterList);
         scanner.close();

         Operator operator = new Operator();

         double calculator = operator.calculator(characterList);

//         System.out.println(characterList);
         System.out.println(calculator);
     }
}

