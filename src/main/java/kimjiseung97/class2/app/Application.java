package kimjiseung97.class2.app;

import kimjiseung97.class2.app.check.ValidationCheck;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        String[][] list = {{"jm@email.com", "제이엠"},
                {"jason@email.com", "제이슨"},
                {"woniee@email.com", "워니"},
                {"mj@email.com", "엠제이"},
                {"nowm@email.com", "이제엠"}};

        ValidationCheck validationCheck = new ValidationCheck();

        validationCheck.check(list);

    }
}
