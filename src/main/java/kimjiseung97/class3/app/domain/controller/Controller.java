package kimjiseung97.class3.app.domain.controller;

import kimjiseung97.class3.app.domain.Service.Service;

public class Controller {

    private final Service service;

    public Controller() {
        service = new Service();
    }


    public String selectCase(final String select){
        switch (select.charAt(0)) {
            case 'Y', 'y' -> {
                String winner = service.findWinner();
                return winner;
            }
            default -> {
            }
        }
        return select;
    }
}
