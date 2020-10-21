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
        calc.pressDigitKey(14);
        calc.pressOperationKey("+");
        calc.pressDigitKey(3);
        calc.pressEquals();
        assertEquals("7", calc.readScreen());
    }

    @Test
    @DisplayName("should display result after multiplying one positive number with negative")
    void calculatorCanDoEightTimesNegativeTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(8);
        calc.pressOperationKey("x");
        calc.pressNegative();
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("-16", calc.readScreen());
    }

}
