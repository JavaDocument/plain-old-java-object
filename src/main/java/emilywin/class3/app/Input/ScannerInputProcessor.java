package emilywin.class3.app.Input;

import java.io.IOException;
import java.util.Scanner;

public class ScannerInputProcessor implements InputProcessor{
    private  Scanner scanner;
    public ScannerInputProcessor(){
        scanner=new Scanner(System.in);
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
