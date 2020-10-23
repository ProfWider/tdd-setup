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
    @DisplayName("should display result after subtracting two numbers")
    void calculatorCanDoTwoMinusTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("-");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("0", calc.readScreen());
    }

    @Test
    @DisplayName("should display result after adding two-digit numbers ")
    void calculatorCanMultiplyDecimalNumbers() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressDigitKey(5);
        calc.pressOperationKey("+");
        calc.pressDigitKey(3);
        calc.pressDigitKey(5);
        calc.pressEquals();
        assertEquals("60", calc.readScreen());
    }
    @Test
    @DisplayName("should delete the lastest number after the operation")
    void calculatorCanDeleteLatestValue() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(3);
        calc.pressClearKey();
        calc.pressDigitKey(4);
        calc.pressEquals();
        assertEquals("6", calc.readScreen());
    }

}

