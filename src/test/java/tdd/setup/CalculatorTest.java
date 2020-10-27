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
    @DisplayName("should display result after multiplying two negative number")
    void calculatorCanDoNegativeTwoCommaFiveTimesTwo(){
        Calculator calc = new Calculator();
        calc.pressNegative();
        calc.pressDigitKey(2);
        calc.pressDotKey();
        calc.pressDigitKey(5);
        calc.pressOperationKey("x");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("-5", calc.readScreen());
    }

    @Test
    @DisplayName("should display result after pressing clear key")
    void calculatorCanPressClearKey() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(3);
        calc.pressOperationKey("+");
        calc.pressDigitKey(4);
        calc.pressEquals();
        calc.pressClearKey();
        assertEquals("0", calc.readScreen());

    }
}
