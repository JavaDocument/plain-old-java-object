package lkdcode.class3.app.domain.factory;

import lkdcode.class3.app.domain.member.Crong;
import lkdcode.class3.app.domain.member.Player;
import lkdcode.class3.app.domain.member.PlayerList;
import lkdcode.class3.app.domain.member.Pobi;

public class PlayerFactory {
    private PlayerFactory() {
    }

    public static Player create(PlayerList name) {
        switch (name) {
            case Pobi -> {
                return new Pobi();
            }
            case Crong -> {
                return new Crong();
            }
            default -> {
                throw new IllegalArgumentException("존재하지 않는 플레이어입니다. : " + name);
            }
        }
    }


}
