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
    @DisplayName("should display result after subtracting two positiv digits" )
    void calculatorCanDoTwoMinusTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("-");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("0", calc.readScreen());
    }

    @Test
    @DisplayName("should display a double digit")
    void calculatorCanDisplaySomething() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(3);
        assertEquals("3", calc.readScreen());
        calc.pressClearKey();
        assertEquals("0", calc.readScreen());
    }

    @Test
    @DisplayName("should display a double digit")
    void calculatorCanDisplayDigit() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(3);
        calc.pressDotKey();
        calc.pressDigitKey(3);
        assertEquals("3.3", calc.readScreen());
        calc.pressOperationKey("x");
        calc.pressDigitKey(3);
        calc.pressDotKey();
        calc.pressDigitKey(3);
        calc.pressEquals();
        assertEquals("10.89", calc.readScreen());
    }
}
