package woni.class1.app.calculator;

public class Calculator implements Operator {

  public Input input;
  int inputNum;
  int[] arr;
  public Calculator(){
    this.input = new Input();
    this.inputNum = 2;
    this.arr = new int[inputNum];
  }
  @Override
  public int plus() {
    int result = 0;
    for(int i = 0; i< arr.length; i++) {
       arr[i] = input.add();
       result += arr[i];
    }
    return result;
  }

}
