package jhlee.class1.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = Calculator.newInstance();
    }

    @Test
    @DisplayName("계산기가 13 더하기 5 를 잘 수행해야 한다")
    void plusTest1() {
        OperandQueue<Integer> operandQueue = PlusOperandQueue.newInstance();

        operandQueue.addOperand(13);
        operandQueue.addOperand(5);

        double result = calculator.calculate(operandQueue);

        assertEquals(18, result);
    }
    
    @Test
    @DisplayName("계산기가 -5 더하기 1을 잘 수행해야 한다.")
    void plusTest2() {
        OperandQueue<Integer> operandQueue = PlusOperandQueue.newInstance();

        operandQueue.addOperand(-5);
        operandQueue.addOperand(1);

        double result = calculator.calculate(operandQueue);

        assertEquals(-4, result);
    }

}