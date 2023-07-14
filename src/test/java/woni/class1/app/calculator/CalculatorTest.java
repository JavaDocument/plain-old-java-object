package woni.class1.app.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  Calculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new Calculator();

  }

  @Test
  @DisplayName("15 더하기 3은 18이 나와야 한다")
  void calculateTest() {
    int[] arr = new int[]{13,5};
    int result = 0;
    for(int i = 0; i< arr.length; i++) {
      result += arr[i];
    }

    assertEquals(18, result);
  }
  @Test
  @DisplayName("-5 더하기 1은 -4가 나와야 한다")
  void calculateTest2() {
    int[] arr = new int[]{-5,1};
    int result = 0;
    for(int i = 0; i< arr.length; i++) {
      result += arr[i];
    }

    assertEquals(-4, result);
  }



}