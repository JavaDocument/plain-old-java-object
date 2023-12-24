package lkdcode.class2.app;

import lkdcode.class2.app.domain.controller.Controller;
import lkdcode.class2.app.domain.exception.Filter;

public class Application {
    public static void main(String[] args) {

        String[][] list = {{"jm@email.com", "제이엠"},
                {"jason@email.com", "제이슨"},
                {"woniee@email.com", "워니"},
                {"mj@email.com", "엠제이"},
                {"nowm@email.com", "이제엠"}};

        Filter.check(list);

        Controller controller = new Controller(list);
        controller.solution();

    }

}
