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
    @Test
    @DisplayName("should clear the display")
    void calculatorCanClear() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressClearKey();
        assertEquals("0", calc.readScreen());
    }

    @Test
    @DisplayName("should put a dot after the digit displayed")
    void calculatorCanPutDot() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressDotKey();
        calc.pressDigitKey(2);
        calc.pressDotKey();
        assertEquals("2.2", calc.readScreen());
    }

}