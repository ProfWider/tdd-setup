package tdd.setup;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Retro calculator")
class MultipleOperationTest {
    @Test
    @DisplayName("should display a result after multiple additions")
    void calculatorCanDoMultipleAddition() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(1);
        calc.pressOperationKey("+");
        calc.pressDigitKey(3);
        calc.pressOperationKey("+");
        calc.pressDigitKey(5);
        calc.pressEquals();
        assertEquals("9", calc.readScreen());
    }
}
