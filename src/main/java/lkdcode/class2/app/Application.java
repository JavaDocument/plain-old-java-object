package lkdcode.class2.app;

import lkdcode.class2.app.domain.controller.Controller;
import lkdcode.class2.app.domain.exception.Filter;

public class Application {
    public static void main(String[] args) {

//        String[][] list = {{"jm@email.com", "제이엠"},
//                {"jason@email.com", "제이슨"},
//                {"woniee@email.com", "워니"},
//                {"mj@email.com", "엠제이"},
//                {"nowm@email.com", "이제엠"}};
//
//        Filter.check(list);
//
//        Controller controller = new Controller(list);
//        controller.solution();

        Long test = 1L;
        int i2 = System.identityHashCode(test);
        System.out.println(i2);

        for (int i = 0; i < 100; i++) {
            test += i;
            int i1 = System.identityHashCode(test);
            System.out.println(i1);
        }

    }

}
