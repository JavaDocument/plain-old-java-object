package jhlee.class2.app.controller;

import jhlee.class2.app.viewer.Viewer;

public class Controller {

    private Controller() {}

    public static Controller newInstance() {
        return new Controller();
    }

    public void start() {
        while (!Viewer.showIndexPage()) {
            System.out.println("오류가 발생했습니다 다시 시도해주세요");
        }

        
    }

}
