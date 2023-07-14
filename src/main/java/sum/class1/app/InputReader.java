package sum.class1.app;

import java.util.Scanner;

public class InputReader {
    private final Scanner scanner;

    public InputReader() {
        scanner = new Scanner(System.in);
    }

    public int readNumber(int position) {
        System.out.print(position + "번째 정수를 입력하세요: ");
        int number = scanner.nextInt();
        return number;
    }

    public void close() {
        scanner.close();
    }
}
