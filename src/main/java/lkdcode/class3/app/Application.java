package lkdcode.class3.app;

import lkdcode.class3.app.domain.factory.PlayerFactory;
import lkdcode.class3.app.domain.member.PlayerList;
import lkdcode.class3.app.domain.controller.Game;

public class Application {
    public static void main(String[] args) {

        Game game = Game.newInstance(PlayerFactory.create(PlayerList.Pobi), PlayerFactory.create(PlayerList.Crong));
        game.gameStart();

    }
}
