package woni.class3.app.book;

import java.util.Random;

public class Page {


  static int lastPage = 400;

  public Page() {

  }

  public static int[] getPage() {
    Random random = new Random();
    int oddPage;
    do {
      oddPage = random.nextInt(lastPage) + 1;
    } while (oddPage % 2 == 0);

    int[] pages = new int[]{oddPage, oddPage+1};

    return pages;
  }

}
