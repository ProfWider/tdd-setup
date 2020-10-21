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
    void calculatorFivePointFiveTimesNegativeTwo(){
        Calculator calculation = new Calculator();
        calculation.pressDigitKey(5);
        calculation.pressDotKey();
        calculation.pressDigitKey(5);
        calculation.pressOperationKey("x");
        calculation.pressNegative();
        calculation.pressDigitKey(2);
        calculation.pressEquals();
        assertEquals("-11",calculation.readScreen());
    }

}
