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
    @DisplayName("should display result after subtracting two positive numbers")
    void calculatorCanDoTwoMinusTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("-");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("0", calc.readScreen());
    }
    @Test
    @DisplayName("should display result after changing a Number to negative")
    void calculatorCanDoNegative() {
        Calculator calc = new Calculator();
        calc.pressNegative();
        calc.pressDigitKey(2);
        assertEquals("-2", calc.readScreen());
    }

    @Test
    @DisplayName("should display result after multiplying two positive two digit numbers")
    void calculatorCanMultiplyTwoTwoDigitNumbers() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressDigitKey(0);
        calc.pressOperationKey("x");
        calc.pressDigitKey(2);
        calc.pressDigitKey(5);
        calc.pressEquals();
        assertEquals("500", calc.readScreen());
    }



}
