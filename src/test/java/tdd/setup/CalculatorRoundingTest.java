package tdd.setup;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Retro calculator")
class CalculatorRoundingTest {
    @Test
    @DisplayName("should display a rounded number")
    void calculatorCanDoTwoPlusTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(1);
        calc.pressDotKey();
          calc.pressDigitKey(5);
        calc.pressOperationKey("+");
       calc.pressDigitKey(1);
        calc.pressDotKey();
          calc.pressDigitKey(5);
        calc.pressEquals();
        assertEquals("3", calc.readScreen());
    }
}
