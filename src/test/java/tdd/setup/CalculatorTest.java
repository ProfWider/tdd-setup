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
    @DisplayName("display should show String 'Error' after pressing 'equals'")
    void calculatorCanDivideFourByZeroEquals() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(4);
        calc.pressOperationKey("/");
        calc.pressDigitKey(0);
        calc.pressEquals();
        assertEquals("Error", calc.readScreen());
    }
// 5. Fix zu diesem Test  PASSED



};
