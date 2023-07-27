package woni.class3.app.controller;

import woni.class3.app.player.Player;
import woni.class3.app.service.Service;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Controller {

  public  Service service;
  private  Player Pobi;
  private  Player Crong;

  int PobiWin = 1;
  int CrongWin = 2;
  int Draw = 0;

  public Controller() {
    this.service = new Service();
    this.Pobi = new Player("Pobi");
    this.Crong = new Player("Crong");
  }

  public void solution() {
    // player별 펼친 페이지 받아오기
    pageNumber();

    String winner = winner(Pobi, Crong);
    if (winner.equals(Pobi.getName())) {
      System.out.println("result : " + PobiWin);
    } else if (winner.equals(Crong.getName())){
      System.out.println("result : " + CrongWin );
    } else{
      System.out.println("result : " + Draw);
    }

  }
//페이지 넘버 찾기
  public void pageNumber() {
    int[] pobiPage = service.getPage(Pobi);
    int[] crongPage = service.getPage(Crong);


    System.out.println("Pobi Page : " + Arrays.toString(pobiPage));
    System.out.println("Crong Page : " + Arrays.toString(crongPage));

    //player에 저장된 최댓값 각각 받아오기
    int pobiMaxNumber = Pobi.getMaxNumber();
    int crongMaxNumber = Crong.getMaxNumber();

    System.out.println("Pobi Max : " + pobiMaxNumber);
    System.out.println("Crong Max : " + crongMaxNumber);

  }

//  최댓값 각각 비교하여 우승자 리턴
  public String winner(Player player1, Player player2) {
    int player1maxNumber = player1.getMaxNumber();
    int player2maxNumber = player2.getMaxNumber();


    if(player1maxNumber > player2maxNumber) {
      return player1.getName();
    } else if (player1maxNumber < player2maxNumber) {
      return player2.getName();
    } else {
      return "draw";
    }


  }





}
