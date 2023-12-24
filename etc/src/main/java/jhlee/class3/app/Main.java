package jhlee.class3.app;

import jhlee.class3.app.controller.Controller;
import jhlee.class3.app.service.Service;
import jhlee.class3.app.view.View;

public class Main {

    public static void main(String[] args) {

        Controller controller = Controller.of(Service.newInstance(), View.newInstance());

        controller.playOneGame();

    }

}
