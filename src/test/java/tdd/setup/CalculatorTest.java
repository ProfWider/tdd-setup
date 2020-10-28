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
    @DisplayName("should display zero after adding")
    void calculatorCanDoTwoPlusTwoNewWithClearFunction() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressEquals();
        calc.pressClearKey();
        assertEquals("0", calc.readScreen());
    }
    @Test
    @DisplayName("should display result of percentage")
    void calculatorCanDoPercentageOperationKey() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(8);
        calc.pressOperationKey("%");
        assertEquals("0.08", calc.readScreen());
    }
    @Test
    @DisplayName("should display big number")
    void calculatorCanDoCalculateBigNumber() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(1);
        calc.pressDigitKey(0);
        calc.pressDigitKey(0);
        calc.pressDigitKey(0);
        calc.pressDigitKey(0);
        calc.pressDigitKey(0);
        calc.pressDigitKey(0);
        calc.pressOperationKey("x");
        calc.pressDigitKey(1);
        calc.pressDigitKey(0);
        calc.pressDigitKey(0);
        calc.pressDigitKey(0);
        calc.pressDigitKey(0);
        calc.pressDigitKey(0);
        calc.pressDigitKey(0);
        calc.pressEquals();
        assertEquals("1e+12", calc.readScreen());
    }

    @Test
    @DisplayName("should display small number")
    void calculatorCanDoCalculateSmallNumber() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(1);
        calc.pressOperationKey("/");
        calc.pressDigitKey(1);
        calc.pressDigitKey(0);
        calc.pressDigitKey(0);
        calc.pressDigitKey(0);
        calc.pressDigitKey(0);
        calc.pressDigitKey(0);
        calc.pressDigitKey(0);
        calc.pressDigitKey(0);
        calc.pressEquals();
        assertEquals("1e-7", calc.readScreen());
    }
}
// andere Fälle testen