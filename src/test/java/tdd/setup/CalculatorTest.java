package tdd.setup;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Retro calculator")
class CalculatorTest {
    @Test
    @DisplayName("should display result after multiply one positive and one negative number")
    void calculatorCanDoMultiplyTwo()
    {
        Calculator calc = new Calculator();

        calc.pressDigitKey(2);
        calc.pressNegative();
        calc.pressDigitKey(5);
        calc.pressOperationKey("x");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("-50", calc.readScreen());
    }
}
