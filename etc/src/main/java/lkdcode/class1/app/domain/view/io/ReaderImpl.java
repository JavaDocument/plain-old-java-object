package lkdcode.class1.app.domain.view.io;

import java.util.Scanner;

public class ReaderImpl implements Reader {
    private final Scanner scanner;

    public ReaderImpl() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String read() {
        return scanner.nextLine();
    }

}
