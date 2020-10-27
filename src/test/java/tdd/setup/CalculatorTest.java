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
    @DisplayName("should display result after adding two positive numbers")
    void calculatorCanDoTheSquareOfThree() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(3);
        calc.pressOperationKey("x");
        calc.pressDigitKey(3);
        calc.pressEquals();
        assertEquals("9", calc.readScreen());
    }
    @Test
    @DisplayName("should keep on adding the first number if no second number is added after the plus")
    void cando() {
        Calculator calc3 = new Calculator();
        calc3.pressDigitKey(2);
        calc3.pressOperationKey("-");
        calc3.pressDigitKey(-2);
        calc3.pressEquals();
        assertEquals("4", calc3.readScreen());
    }

}
