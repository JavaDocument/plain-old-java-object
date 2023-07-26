package jhlee.class3.app.controller;

import jhlee.class3.app.service.Service;
import jhlee.class3.app.view.View;

public class Controller {

    private final Service service;
    private final View view;

    private Controller(Service service, View view) {
        this.service = service;
        this.view = view;
    }

    public static Controller of(Service service, View view) {
        return new Controller(service, view);
    }

    public void playOneGame() {
        view.showGameResult(service.playOneGame());
    }

}
