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

    // 1. neuer grüner Test
    @Test
    @DisplayName("should display 0 after pressing clear key")
    void calculatorCanDoClear() {
        Calculator test1 = new Calculator();
        test1.pressDigitKey(4);
        test1.pressClearKey();
        test1.pressDigitKey(2);
        test1.pressClearKey();
        assertEquals("0", test1.readScreen());
    }
}
