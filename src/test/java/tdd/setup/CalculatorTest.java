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

    //first extension of the existing test
    @Test
    @DisplayName("should display result after subtract two positive numbers")
    void calculatorCanDoFiveMinusThree() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(5);
        calc.pressOperationKey("-");
        calc.pressDigitKey(3);
        calc.pressEquals();
        assertEquals("2", calc.readScreen());
    }
    //second extension of the existing test
    @Test
    @DisplayName("should display result after multiplying two positive numbers")
    void calculatorCanDoFiveMultiplyingThree() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(5);
        calc.pressOperationKey("x");
        calc.pressDigitKey(3);
        calc.pressEquals();
        assertEquals("15", calc.readScreen());
    }

}
