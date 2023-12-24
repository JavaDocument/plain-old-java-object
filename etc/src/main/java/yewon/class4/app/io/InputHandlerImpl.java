package yewon.class4.app.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputHandlerImpl implements InputHandler {

    private final BufferedReader br;

    public InputHandlerImpl() {
        this.br = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public String input() {
        try {
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
