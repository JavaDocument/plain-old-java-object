package jhlee.class5.problem4.app.controller;

import jhlee.class5.problem4.app.dto.request.RequestDTO;
import jhlee.class5.problem4.app.service.Service;
import jhlee.class5.problem4.app.view.View;

public class Controller {
    private static final char ZERO = '0';
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
        view.showResult(service.countWon(view.showMainMenu()));
    }
}
