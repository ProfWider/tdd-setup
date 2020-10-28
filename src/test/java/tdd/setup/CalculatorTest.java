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
    @DisplayName("should display 0 when clear button is used")
    void calculatorShowsZeroAfterPressingClearKey() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(3);
        calc.pressOperationKey("/");
        calc.pressDigitKey(4);
        calc.pressClearKey();
        assertEquals("0", calc.readScreen());

    }

    @Test
    @DisplayName("should display result after multiplying double digit numbers")
    void calculatorCanDoTenTimesTen() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressDigitKey(0);
        calc.pressOperationKey("x");
        calc.pressDigitKey(1);
        calc.pressDigitKey(5);
        calc.pressEquals();
        assertEquals("300", calc.readScreen());

    }

    @Test
    @DisplayName("should display decimal number without 0 in the beginning")
    void calculatorCanDivide() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressDotKey();
        calc.pressDigitKey(5);
        assertEquals("2.5", calc.readScreen());

    }
}