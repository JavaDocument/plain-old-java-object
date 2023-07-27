package woni.class3.app.service;


import woni.class3.app.book.Page;
import woni.class3.app.player.Player;

public class Service {

  public  Page page;

  public Service() {
    this.page = new Page();
  }

//  player 페이지 선정
  public int[] getPage(Player player) {
//   player name
    String playerName = player.getName();
    int[] playerPage = page.getPage();
//    페이지 배열 가져오기
    player.setPage(playerPage);
    getMaxNumber(player, playerPage);

    return playerPage;
  }

  public int getMaxNumber(Player player ,int[] playerPages) {
    int playerMaxNumber;

    int odd = playerPages[0];
    int even = playerPages[1];

    int[] oddPage = new int[String.valueOf(odd).length()];
    int[] evenPage = new int[String.valueOf(even).length()];


//    홀수 페이지와 짝수 페이지의 자릿수를 각각 배열에 담음

    int i = oddPage.length-1;
    while (odd > 0 ) {
      oddPage[i] = odd % 10;
      odd = odd / 10;
      i--;
    }
    int l = evenPage.length-1;
    while (even > 0 ) {
      evenPage[l] = even % 10;
      even = even / 10;
      l--;
    }

    // 배열에 넣은 홀수, 짝수 값 계산하기
    int sumOddPage =arraySum(oddPage);
    int sumEvenPage = arraySum(evenPage);
    int mulOddPage = arrayMulti(oddPage);
    int mulEvenPage = arrayMulti(evenPage);


    // 각각의 크기 구별
    if(sumOddPage >= sumEvenPage &&  sumOddPage >= mulOddPage && sumOddPage >= mulEvenPage ) {
      playerMaxNumber = sumOddPage;
    } else if (sumEvenPage >= sumOddPage && sumEvenPage >= mulOddPage && sumEvenPage >= mulEvenPage) {
      playerMaxNumber = sumEvenPage;
    } else if (mulOddPage >= sumOddPage && mulOddPage >= sumEvenPage && mulOddPage >= mulEvenPage) {
      playerMaxNumber = mulOddPage;
    } else {
      playerMaxNumber =  mulEvenPage;
    }

    player.setMaxNumber(playerMaxNumber);
    return playerMaxNumber;
  }


  private static int arraySum(int[] array) {
    int sum = 0;
    for (int i : array) {
      sum += i;
    }
    return sum;

  }
  private static int arrayMulti(int[] array) {
    int multi = 1;
    for (int i : array) {
      multi *= i;
    }
    return multi;
  }


}
