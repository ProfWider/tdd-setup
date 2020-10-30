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
    @DisplayName("mein test1")
    void calculatorCanDoTwoMinusTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("-");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("0", calc.readScreen());
    }

    @Test
    @DisplayName("mein test2")
    void calculatorCanDoEightyPlusTwenty() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(8);
        calc.pressDigitKey(0);
        calc.pressOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressDigitKey(0);
        calc.pressEquals();
        assertEquals("100", calc.readScreen());
    }

    @Test
    @DisplayName("mein test3")
    void calculatorCanDoJustTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("2", calc.readScreen());
    }

    @Test
    @DisplayName("mein test4")
    void calculatorCanDoClear() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("-");
        calc.pressDigitKey(3);
        calc.pressClearKey();
        assertEquals("0", calc.readScreen());
    }

    @Test
    @DisplayName("mein test5")
    void calculatorCanDoNegative() {
    Calculator calc = new Calculator();
    calc.pressNegative();
    calc.pressDigitKey(2);
    calc.pressEquals();
    assertEquals("-2", calc.readScreen());
    }

    @Test
    @DisplayName("mein test6")
    void calculatorCanDot() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(0);
        calc.pressDotKey();
        calc.pressDigitKey(2);
        calc.pressDotKey();
        calc.pressEquals();
        assertEquals("0.2", calc.readScreen());
    }

    }

