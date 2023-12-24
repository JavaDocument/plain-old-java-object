package jhlee.class5.problem3.app;

import jhlee.class5.problem3.app.controller.Controller;
import jhlee.class5.problem3.app.service.Service;
import jhlee.class5.problem3.app.view.View;

public class Main {
    public static void main(String[] args) {
        Controller.of(View.newInstance(), Service.newInstance()).start();
    }
}
