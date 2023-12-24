package kimjiseung97.class1.app.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import woni.class1.app.calculator.Calculator;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OperatorTest {

    Operator operator;

    @BeforeEach
    void setUp() {
        operator = new Operator();

    }
    @Test
    @DisplayName("1+2연산이 잘 수행되어야 한다")
    void calculator() {
        List<Character> characterList = new ArrayList<>();

        characterList.add('1');
        characterList.add('+');
        characterList.add('2');

        double calculator = operator.calculator(characterList);

        System.out.println(calculator);


    }
}