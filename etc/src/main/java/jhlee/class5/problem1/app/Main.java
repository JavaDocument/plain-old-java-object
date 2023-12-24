package jhlee.class5.problem1.app;

import jhlee.class5.problem1.app.controller.Controller;
import jhlee.class5.problem1.app.service.Service;
import jhlee.class5.problem1.app.view.View;

public class Main {
    public static void main(String[] args) {
        Controller.of(View.newInstance(), Service.newInstance()).start();
    }
}
