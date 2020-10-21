package tdd.setup;

import jdk.jfr.StackTrace;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Retro calculator")
class CalculatorTest {
    @Test
    @DisplayName("Test: should display result after adding two positive numbers")
    void calculatorCanDoTwoPlusTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("4", calc.readScreen());
    }

    @Test
    @DisplayName("Test: should display result after multiplying two positive numbers")
    void calculatorCanMultiplicate() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(3);
        calc.pressOperationKey("x");
        calc.pressDigitKey(4);
        calc.pressEquals();
        assertEquals("12", calc.readScreen());
    }

}
