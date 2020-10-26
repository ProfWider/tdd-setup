package tdd.setup;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Retro calculator")
class CalculatorTest {
    @Test
    @DisplayName("should display result after adding one positive number to positive number with dot")
    void calculatorCanDoAddingNumbersWithDot() {
        Calculator calc2 = new Calculator();
        calc2.pressDigitKey(2);
        calc2.pressOperationKey("+");
        calc2.pressDigitKey(1);
        calc2.pressDotKey();
        calc2.pressDigitKey(2);
        calc2.pressEquals();
        assertEquals("3.2", calc2.readScreen());
    }
}
