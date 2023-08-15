package jefeel.class5.problem2.app;


import jefeel.class5.problem2.app.domain.Input;
import jefeel.class5.problem2.app.domain.Solution;


public class Main {

    public static void main(String[] args) {

        Input input = new Input();
        int number = input.randomNumber();

        Solution solution = new Solution();
        solution.solution(number);


    }


}
