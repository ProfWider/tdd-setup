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
    @DisplayName("should display result after divide two numbers")
    void calculatorCanDoFiveDividedFive()
    {
        Calculator calc1 = new Calculator();
        calc1.pressDigitKey(5);
        calc1.pressOperationKey("/");
        calc1.pressDigitKey(5);
        calc1.pressEquals();
        assertEquals("1", calc1.readScreen());
    }
}
