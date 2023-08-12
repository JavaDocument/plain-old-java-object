package jhlee.class4.app;

import jhlee.class4.app.controller.Controller;
import jhlee.class4.app.service.Service;
import jhlee.class4.app.view.View;

public class Main {
    public static void main(String[] args) {
        Controller.of(View.newInstance(), Service.newInstance()).start();
    }
}
