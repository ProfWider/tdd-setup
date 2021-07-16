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
    @DisplayName ("should delete display result after press clear")
    void calculatorCanDoClear() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressClearKey();
        assertEquals("0", calc.readScreen());
    }

    @Test
    @DisplayName ("should display result after press dot key")
    void calculatorCanDoDot () {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressDotKey();
        calc.pressDigitKey(3);
        assertEquals("2.3", calc.readScreen());
    }

    @Test
    @DisplayName ("should display result after press negative")
    void calculatorCanDoNegative () {
        Calculator calc = new Calculator();
        calc.pressNegative();
        calc.pressDigitKey(2);
        assertEquals("-2", calc.readScreen());
    }
}
