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
    @DisplayName("should display result after multiplying positive and negative numbers")
    void calculatorCanDoEightTimesNegativeTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(8);
        calc.pressOperationKey("x");
        calc.pressNegative();
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("-16", calc.readScreen());
    }

    @Test
    @DisplayName("should display result after multiplying integer and double numbers")
    void calculatorCanDoEightTimesTwoDotTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(8);
        calc.pressOperationKey("x");
        calc.pressDigitKey(2);
        calc.pressDotKey();
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("17.6", calc.readScreen());
    }

    @Test
    @DisplayName("should display result after multiplying integer numbers and multi-digit")
    void calculatorCanDoEightTimesTwentyTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(8);
        calc.pressOperationKey("x");
        calc.pressNegative();
        calc.pressDigitKey(2);
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("-176", calc.readScreen());
    }
}
