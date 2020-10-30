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
    @DisplayName("should display clear result after divide two positive numbers")
    void calculatorCanClearDisplay() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(3);
        calc.pressOperationKey("/");
        calc.pressDigitKey(2);
        calc.pressEquals();
        calc.pressClearKey();
        assertEquals("0", calc.readScreen());
    }
    @Test
    @DisplayName("New Button for Fractional")
    void calculatorFractional() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(3);
        calc.pressOperationKey("1/x");
        calc.pressEquals();
        assertEquals("0.3333333333333333", calc.readScreen());
    }

    @Test
    @DisplayName("Calculate with numbers up to 1 million")
    void calculatorMoreNumbers() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(1000000);
        calc.pressOperationKey("/");
        calc.pressDigitKey(1000000);
        calc.pressEquals();
        assertEquals("1", calc.readScreen());
    }

    @Test
    @DisplayName("should display result after divide one negative decimal number and negative decimal")
    void calculatorCanUseDecimalNumbers() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(9);
        calc.pressNegative();
        assertEquals("-9", calc.readScreen());
    }
}
