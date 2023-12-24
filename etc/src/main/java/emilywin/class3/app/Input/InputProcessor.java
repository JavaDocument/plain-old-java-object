package emilywin.class3.app.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface InputProcessor {
    String readLine() throws IOException;
    int readInt() throws IOException;
}
