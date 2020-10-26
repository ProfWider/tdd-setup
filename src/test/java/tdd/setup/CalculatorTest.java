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
    @DisplayName("should display result after adding two two-digit numbers")
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
    @DisplayName("should display result after deleting the digit after the operation")
    void calculatorCanDoClearKey() {
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
