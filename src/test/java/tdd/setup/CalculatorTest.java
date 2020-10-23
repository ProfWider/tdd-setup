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
    @DisplayName("should display result after subtracting the second number of the first one")
    void calculatorCanDoThreeMinusTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(3);
        calc.pressOperationKey("-");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("1", calc.readScreen());

    }

    @Test
    @DisplayName("should display result after adding two decimal digits")
    void calculatorCanAddDecimalDigits() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(1);
        calc.pressDotKey();
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(3);
        calc.pressDotKey();
        calc.pressDigitKey(6);
        calc.pressEquals();
        assertEquals("4.8", calc.readScreen());
    }

    @Test
    @DisplayName("should display result of subtraction with a negative number after clearing the first input")
    void calculatorCanSubtractNegativesAfterClear() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(5);
        calc.pressOperationKey("+");
        calc.pressClearKey();
        calc.pressDigitKey(5);
        calc.pressNegative();
        calc.pressOperationKey("-");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("-7", calc.readScreen());
    }
}


