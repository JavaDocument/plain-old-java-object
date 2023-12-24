package emilywin.class3.app.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderInputProcessor implements InputProcessor {
    private BufferedReader br;

    public BufferedReaderInputProcessor() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public String readLine() throws IOException {
        return null;
    }

    @Override
    public int readInt() throws IOException {
        return 0;
    }

}
