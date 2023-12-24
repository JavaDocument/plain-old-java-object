package woni.class1.app.calculator;

import java.util.Scanner;

public class Input {
  Scanner scanner;


  public Input(){
   this.scanner = new Scanner(System.in);
  }
  public int add() {
    System.out.println("정수를 입력하세요");
    int num = Integer.parseInt(scanner.nextLine());

    return num;
    }


}
