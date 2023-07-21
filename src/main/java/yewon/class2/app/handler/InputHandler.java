package yewon.class2.app.handler;

import yewon.class2.app.service.DuplicateValidator;
import yewon.class2.app.service.EmailValidator;
import yewon.class2.app.service.NicknameValidator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputHandler {

    private BufferedReader br;
    private DuplicateValidator duplicateValidator;
    private EmailValidator emailValidator;
    private NicknameValidator nicknameValidator;

    public InputHandler() {
        this.br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String input() {
        try {
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*public String inputEmail() {
        try {
            String email = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String inputNickname() {
        try {
            String nickname = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }*/

}
