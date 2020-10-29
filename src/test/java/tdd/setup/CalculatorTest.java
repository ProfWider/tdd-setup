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
    @DisplayName("should display result after substracting two positive numbers")
    void calculatorCanDoFiveMinusTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(5);
        calc.pressOperationKey("-");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("3", calc.readScreen());
    }

    @Test
    @DisplayName("should display the point number correctly")
    void calculatorCanDoNumbersWithDots() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(5);
        calc.pressDotKey();
        calc.pressDigitKey(2);
        calc.pressDotKey();
        assertEquals("5.2", calc.readScreen());
    }
}