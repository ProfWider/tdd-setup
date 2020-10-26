package tdd.setup;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Retro calculator")
class CalculatorTest {
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
