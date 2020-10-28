package tdd.setup;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Retro calculator")
class CalculatorTest {
    @Test
    @DisplayName("should display result after adding two positive numbers")
    void calculatorCanDoTwoPlusTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("4", calc.readScreen());
    }

    //test one
    @Test
    @DisplayName("should display result after multiplying a positive with a negative number")
    void calculatorCanDoFiveMultiplyingThree() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(5);
        calc.pressOperationKey("x");
        calc.pressNegative();
        calc.pressDigitKey(3);
        calc.pressEquals();
        assertEquals("-15", calc.readScreen());
    }

    //test case two
    @Test
    @DisplayName("should return a result for operations on digits greater 9")
    void calculatorOperationsOnDigitsGreaterNine() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(16);
        calc.pressOperationKey("x");
        calc.pressDigitKey(16);
        calc.pressEquals();
        assertEquals("256", calc.readScreen());
    }
}
