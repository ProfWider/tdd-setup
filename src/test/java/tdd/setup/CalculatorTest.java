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
    void calculatorCanDoFiveTimesFive() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(5);
        calc.pressOperationKey("x");
        calc.pressDigitKey(5);
        calc.pressEquals();
        assertEquals("25", calc.readScreen());
    }

    @Test
    @DisplayName("pressing 2 times pressDotKey() adds 2 '.' but expecting one '.'")
    void calculatorAddsTwoDotes() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(1);
        calc.pressDotKey();
        calc.pressDigitKey(5);
        System.out.println(calc.readScreen());
        calc.pressDotKey();
        calc.pressOperationKey("x");
        calc.pressDigitKey(3);
        calc.pressEquals();
        assertEquals("4.5", calc.readScreen());
    }

    @Test
    @DisplayName("pressing 2 times pressDotKey() adds 2 '.' but expecting one '.'")
    void calculatorAddsAZeroAtBegin() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(1);
        assertEquals("1", calc.readScreen());
    }

}
