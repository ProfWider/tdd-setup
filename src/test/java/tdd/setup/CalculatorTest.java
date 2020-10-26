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

    @Test @DisplayName("3 mal 2")
    void calculatorMultyplies() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(3);
        calc.pressOperationKey("x");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("6", calc.readScreen());
    }
    @Test @DisplayName("macht es den punkt?")
    void calculatorDotKey() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(3);
        calc.pressDotKey();
        calc.pressDigitKey(1);
        assertEquals("3.1", calc.readScreen());
    }

    @Test @DisplayName("funktioniert der clear key?")
    void calculatorNegativeKey() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressDotKey();
        calc.pressDigitKey(2);
        calc.pressClearKey();
        calc.pressDigitKey(2);
        assertEquals("2",calc.readScreen());

    }


}
