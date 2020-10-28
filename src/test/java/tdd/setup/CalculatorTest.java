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
    @DisplayName("should display result after multiply one positive and one negative number")
    void calculatorCanDoMultiplyTwo() {
        Calculator calc1 = new Calculator();
        calc1.pressDigitKey(2);
        calc1.pressNegative();
        calc1.pressDigitKey(5);
        calc1.pressOperationKey("x");
        calc1.pressDigitKey(2);
        calc1.pressEquals();
        assertEquals("-50", calc1.readScreen());
    }

    @Test
    @DisplayName("should display the number after using clear key")
    void calculatorCanShowNumberAfterUsingClearKey() {
        Calculator c = new Calculator();
        c.pressDigitKey(1);
        c.pressOperationKey("x");
        c.pressDigitKey(1);
        c.pressClearKey();
        c.pressDigitKey(2);
        c.pressEquals();
        assertEquals("2", c.readScreen());
    }
}
