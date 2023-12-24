package lkdcode.class3.app;

import lkdcode.class3.app.domain.factory.PlayerFactory;
import lkdcode.class3.app.domain.member.Player;
import lkdcode.class3.app.domain.member.PlayerList;
import lkdcode.class3.app.domain.controller.Game;

public class Application {
    public static void main(String[] args) {

        Player crong = PlayerFactory.create(PlayerList.Crong);
        Player pobi = PlayerFactory.create(PlayerList.Pobi);

        Game game = Game.newInstance(pobi, crong);
        game.gameStart();

    }
}
