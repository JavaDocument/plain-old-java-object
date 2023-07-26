package sum.class3.app.ui;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner scanner;
    private Console console;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.console = new Console();
    }

    public void show() {
        int inputNumber = 0;


        while (true) {

            displayMenu();
            inputNumber = selectMenu();
            System.out.println();

            switch (inputNumber) {
                case 1:
                    console.gameStart();
                    System.out.println();
                    break;
                case 2:
                    console.gameResult();
                    System.out.println();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("번호를 다시 입력해주세요!");
            }


        }
    }

    private int selectMenu() {
        System.out.print("번호를 입력하세요 -> ");
        try {
            int menuNumber = scanner.nextInt();
            scanner.nextLine();
            if (menuNumber >= 0 && menuNumber <= 3) {
                return menuNumber;
            } else {
                System.out.println("번호를 다시 입력해주세요.");
                return selectMenu();
            }
        } catch (InputMismatchException e) {
            scanner.nextLine();
//            e.printStackTrace();
            System.out.println("숫자를 입력해주세요!");
            return selectMenu();
        }

    }

    private void displayMenu() {
        System.out.println("==============================");
        System.out.println("포비와 크롱의 페이지번호 게임!");
        System.out.println("------------------------------");
        System.out.println("1. 시작하기");
        System.out.println("2. 결과보기");
        System.out.println("0. 그만하기");
        System.out.println("==============================");
    }

}
