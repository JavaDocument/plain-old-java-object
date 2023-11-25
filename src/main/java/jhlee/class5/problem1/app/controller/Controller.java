package jhlee.class5.problem1.app.controller;

import jhlee.class5.problem1.app.service.Service;
import jhlee.class5.problem1.app.view.View;

public class Controller {
    private final View view;
    private final Service service;
    private Controller(View view, Service service) {
        this.view = view;
        this.service = service;
    }
    public static Controller of(View view, Service service) {
        return new Controller(view, service);
    }
    public void start() {
        view.showResult(service.decrypt(view.showMainMenu()));
    }
}
