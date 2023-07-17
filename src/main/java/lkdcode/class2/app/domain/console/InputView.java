package lkdcode.class2.app.domain.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class InputView implements Input {
    private final BufferedReader bufferedReader;

    public InputView() {
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public String input() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
