package yewon.class3.app.controller;

import yewon.class3.app.handler.OutputHandlerImpl;
import yewon.class3.app.service.Service;

import java.util.Arrays;

public class Controller {

    // Result
    private final int POBI_WIN = 1;
    private final int CRONG_WIN = -1;
    private final int DRAW = 0;
    private final Service service;
    private final OutputHandlerImpl output;

    public Controller() {
        service = new Service();
        output = new OutputHandlerImpl();
    }

    public void solution() {
        // 페이지 뽑기
        String[] pobi = service.selectPages();
        String[] crong = service.selectPages();

        // 뽑은 페이지 보여주기
        output.message("📖 포비가 뽑은 건... " + viewPages(pobi));
        output.message("📖 크롱이 뽑은 건... " + viewPages(crong));

        // 큰 수 구하기
        int largestOfPobi = service.getLargest(pobi);
        int largestOfCrong = service.getLargest(crong);

        // 큰 수 보여주기
        output.message("✅ 포비의 가장 큰 수는... " + largestOfPobi);
        output.message("✅ 크롱의 가장 큰 수는... " + largestOfCrong);

        // 결과 출력
        getResult(largestOfPobi, largestOfCrong);
    }

    // 결과값 출력
    private void getResult(int largestOfPobi, int largestOfCrong) {
        if (largestOfPobi < largestOfCrong) {
            output.message(CRONG_WIN);
            return;
        }
        if (largestOfPobi > largestOfCrong){
            output.message(POBI_WIN);
            return;
        }
        output.message(DRAW);
    }

    // 뽑은 페이지 보여주기
    private String viewPages(String[] pages) {
        return Arrays.toString(pages);
    }

}
