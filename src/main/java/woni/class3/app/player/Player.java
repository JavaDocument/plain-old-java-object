package woni.class3.app.player;

import static woni.class3.app.book.Page.getPage;

public class Player {

  private String name;
  private int[] pages;

  private int maxNumber;


 public Player(String name) {
   this.name = name;
   this.pages = getPages();
   this.maxNumber = getMaxNumber();
 }
 public String getName() {
   return this.name;
 }

 public void setPage(int[] pages) {
   this.pages = pages;
 }
 public int[] getPages(){
   return pages;
 }

 public void setMaxNumber(int maxNumber) {
   this.maxNumber = maxNumber;
 }
 public int getMaxNumber() {
   return maxNumber;
 }

}
