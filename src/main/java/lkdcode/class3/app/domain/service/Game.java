package lkdcode.class3.app.domain.service;

import lkdcode.class3.app.domain.member.Player;

public class Game {

    private final Player firstPlayer;
    private final Player secondPlayer;

    public Game(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public Player gameStart() {
        int firstPlayerNumber = firstPlayer.getPlayerNumber();
        int secondPlayerNumber = secondPlayer.getPlayerNumber();

        return firstPlayerNumber > secondPlayerNumber ? firstPlayer : secondPlayer;
    }

}
