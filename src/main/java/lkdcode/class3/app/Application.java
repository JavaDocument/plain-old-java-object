package lkdcode.class3.app;

import lkdcode.class3.app.domain.member.Crong;
import lkdcode.class3.app.domain.member.Player;
import lkdcode.class3.app.domain.member.Pobi;
import lkdcode.class3.app.domain.service.Game;

public class Application {
    public static void main(String[] args) {

        Game game = new Game(new Pobi(), new Crong());
        Player player = game.gameStart();

    }
}
