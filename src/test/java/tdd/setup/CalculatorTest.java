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
    @DisplayName("should return zero when the delete key is pressed")
    void PressClearKey() {
        Calculator calculator = new Calculator();
        calculator.pressDigitKey(2);
        calculator.pressClearKey();
        assertEquals("0", calculator.readScreen());

    }

    @Test
    @DisplayName("should return a dot on display")
    void PressDotKey() {
        Calculator calculator = new Calculator();
        calculator.pressDigitKey(2);
        calculator.pressDotKey();
        calculator.pressDigitKey(2);
        assertEquals("2.2", calculator.readScreen());

    }
    @Test
    @DisplayName("should return a negative number on display")
    void PressNegative() {
        Calculator calculator = new Calculator();
        calculator.pressNegative();
        calculator.pressDigitKey(4);
        assertEquals("-4", calculator.readScreen());
    }



}


