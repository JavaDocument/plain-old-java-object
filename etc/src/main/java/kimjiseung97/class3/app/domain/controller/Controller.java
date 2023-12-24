package kimjiseung97.class3.app.domain.controller;

import kimjiseung97.class3.app.domain.Service.Service;
import kimjiseung97.class3.app.domain.member.User;

public class Controller {

    private final Service service;

    public Controller() {
        service = new Service();
    }


    public int selectCase(final String select) {
        switch (select.charAt(0)) {
            case 'Y', 'y' -> {
                User firstuser = new User("크롱");
                User seconduser = new User("포비");
                int winnersnumber = service.findWinner(firstuser, seconduser);
                return winnersnumber;
            }
            default -> {
            }
        }
        return 0;
    }
}
