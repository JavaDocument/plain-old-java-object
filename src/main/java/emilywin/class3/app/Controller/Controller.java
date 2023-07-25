package emilywin.class3.app.Controller;

import emilywin.class3.app.Input.BufferedReaderInputProcessor;
import emilywin.class3.app.Input.InputProcessor;
import java.io.IOException;

public class Controller{
    //pobi / crong 입력 받기
    public Controller() throws IOException {
        start();
    }

    public void start(){
        BufferedReaderInputProcessor bufferedReaderInputProcessor = new BufferedReaderInputProcessor();
        System.out.print("pobi : ");
        
        System.out.print("crong : ");
    }
}
