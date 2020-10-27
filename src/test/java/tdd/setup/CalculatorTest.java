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
    @DisplayName("should clear the screen and show only a zero as default on the screen")
    void calculatorCanClearTheScreen() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(9);
        calc.pressOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressEquals();
        calc.pressClearKey();
        assertEquals("0", calc.readScreen());
    }
    @Test
    @DisplayName("should display a decimal number like 2.5 = 2.5 after pressing --> pressEquals()")
    void calculatorCanShowADecimal() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressDotKey();
        calc.pressDigitKey(5);
        calc.pressEquals();
        assertEquals("2.5", calc.readScreen());
    }
}
