package sum.class2.app.ui;


import java.util.Scanner;

public class InputScanner implements Input {

    private Scanner scanner;

    public InputScanner() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String read() {
        return scanner.nextLine();
    }
}
