package jefeel.class1.app;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world!");

        InputInt inputInt = new InputInt();

        int[] arr = new int[2];

        int inputCount = 0;

        while(inputCount < arr.length){
            System.out.print((inputCount+1)+"번째 수를 입력해주세요 : ");
            arr[inputCount] =  inputInt.inputNumber();
            inputCount+=1;
        }

        Calculator calculator = new Calculator();

        OutputResult result = new OutputResult();

        result.outputResult(calculator.add(arr));
    }
}
