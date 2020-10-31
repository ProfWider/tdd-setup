package tdd.setup;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Retro calculator")

class CalculatorTest {

    @Test
    @DisplayName("should display result after adding two positive numbers")
        // given test
    void calculatorCanDoTwoPlusTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("4", calc.readScreen());
    }

    @Test
    @DisplayName("should display result after multiplying two positive numbers")
        // green test other functionality tested
    void calculatorCanDoMulti() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(5);
        calc.pressOperationKey("x");
        calc.pressDigitKey(3);
        calc.pressEquals();
        assertEquals("15", calc.readScreen());
    }

    @Test
    @DisplayName("executable with none of the given operations ")
        // 1st red test
        // 1st green test after code alteration in class Calculator
    void calculatorCanDoAddTwoFloating() {
        Calculator calc = new Calculator();
        calc.pressDotKey();
        calc.pressEquals();
        assertEquals("0", calc.readScreen());
    }

    @Test
    @DisplayName("should display result after dividing by a floating number")
        // 2nd red test
    void calculatorCanDoDivByFloating() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(5);
        calc.pressOperationKey("/");
        calc.pressDigitKey(2);
        calc.pressDotKey();
        calc.pressDigitKey(5);
        calc.pressEquals();
        assertEquals("2", calc.readScreen());
    }
}
