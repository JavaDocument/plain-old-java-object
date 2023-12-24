package jhlee.class2.app;

import jhlee.class2.app.controller.Controller;
import jhlee.class2.app.service.Service;
import jhlee.class2.app.viewer.Viewer;

public class Main {

    public static void main(String[] args) {
        Controller controller = Controller.of(Service.newInstance(), Viewer.newInstance());

        controller.start();
    }

}
