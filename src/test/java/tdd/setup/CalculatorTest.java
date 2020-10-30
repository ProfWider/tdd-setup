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
    @DisplayName("should display result 3")
    void calculatorCanDoFiveMinusTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(5);
        calc.pressOperationKey("-");
        calc.pressDigitKey(2);
        System.out.println(calc.readScreen());
        calc.pressEquals();
        assertEquals("3", calc.readScreen());
    }

    @Test
    @DisplayName("should display result 5.5")
    void calculatorCanShowDecimal() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(5);
        calc.pressDotKey();
        calc.pressDigitKey(5);
        System.out.println(calc.readScreen());
        assertEquals("5.5", calc.readScreen());
    }

    @Test
    @DisplayName("should display same digit after pressing Equals without an operation")
    void calculatorCanDoFourEquals() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(5);
        calc.pressEquals();
        assertEquals("5", calc.readScreen());
    }
}