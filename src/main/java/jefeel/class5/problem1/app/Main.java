package jefeel.class5.problem1.app;


import static jefeel.class5.problem1.app.domain.Input.inputCode;
import static jefeel.class5.problem1.app.domain.Output.viewSolution;
import static jefeel.class5.problem1.app.domain.Solution.solution;


public class Main {


    public static void main(String[] args) {

        String cryptogram = inputCode();
        String solution = solution(cryptogram);
        viewSolution(solution);
    }


}

