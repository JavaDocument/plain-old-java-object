package lkdcode.class1.app;

import lkdcode.class1.app.domain.menu.Menu;
import lkdcode.class1.app.global.config.AppConfig;


public class Application {
    public static void main(String[] args) {
        var console = AppConfig.console();
        var calculator = AppConfig.calculator();

        var menu = new Menu(console, calculator);
        menu.start();
    }

}
