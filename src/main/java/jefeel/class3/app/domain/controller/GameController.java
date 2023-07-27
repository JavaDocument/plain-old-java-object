package jefeel.class3.app.domain.controller;


import jefeel.class3.app.domain.calculation.Calculation;
import jefeel.class3.app.domain.input.PlayerInputList;
import jefeel.class3.app.domain.input.RandomPage;
import jefeel.class3.app.domain.output.OutputResult;


public class GameController {

    PlayerInputList pobi = new PlayerInputList();
    PlayerInputList crong = new PlayerInputList();
    static Calculation calculation = new Calculation();
    OutputResult outputResult = new OutputResult();
    public int finalScore;

    public void start() {
        int result = findWinner(pobi, crong);
        outputResult.showScore(result);
    }

    ;

    public int findPlayerNumber(PlayerInputList player) {
        int firstPage = RandomPage.randomPage();
        int secondPage = firstPage + 1;

        player.addNumber(firstPage, secondPage);
        System.out.println("이번 플레이어의 리스트: " + player);

        for (int i = 0; i < 2; i++) {
            int result = calculation.myScore(player.getIndex(i));
            player.setNumber(i, result);
        }

        finalScore = calculation.compareNumber(player.getIndex(0), player.getIndex(1));

        return finalScore;
    }

    public int findWinner(PlayerInputList firstPlayer, PlayerInputList secondPlayer) {
        int firstResult = findPlayerNumber(firstPlayer);
        System.out.println("플레이어1 결과 " + firstResult);
        int secondResult = findPlayerNumber(secondPlayer);
        System.out.println("플레이어2 결과 " + secondResult);

        if (firstResult > secondResult) {
            return 1;
        }

        if (firstResult < secondResult) {
            return 2;
        }

        return 0;
    }

}
