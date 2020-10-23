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
    @DisplayName("should display result after multiplying two numbers, one of them is negative")
    void calculatorCanDoTwoMultiplyMinusTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("x");
        calc.pressNegative();
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("-4", calc.readScreen());
    }

    @Test
    @DisplayName("should display 0 after pressing clear Key")
    void calculatorCanClearScreen() {
       Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("x");
        calc.pressNegative();
        calc.pressDigitKey(2);
        calc.pressEquals();
        calc.pressClearKey();
        assertEquals("0",calc.readScreen());
    }

    @Test@DisplayName("should display the correct number after minusing two numbers, " +
            "one of them with dot(double or float number)")
    void calculatorCanUseDotKey() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(5);
       // calc.pressDotKey();
        calc.pressDigitKey(5);
        calc.pressOperationKey("-");
        calc.pressDigitKey(1);
        calc.pressEquals();
        assertEquals("4.5",calc.readScreen());
    }



}
