package jhlee.class2.app;

import jhlee.class2.app.controller.Controller;

public class Main {

    public static void main(String[] args) {
        Controller controller = Controller.newInstance();

        controller.start();
    }

}
