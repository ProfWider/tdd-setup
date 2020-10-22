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

    // 1. neuer grüner Test
    @Test
    @DisplayName("should display result 0 after pressing the clear key")
    void calculatorCanDoClear() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("x");
        calc.pressDigitKey(5);
        calc.pressEquals();
        calc.pressClearKey();
        assertEquals("0", calc.readScreen());
    }

    // 2. neuer roter Test
    @Test
    @DisplayName("should display result after adding a decimal number with a positive number")
    void calculatorCanDoTwoDotTwoPlusThree1() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressDotKey();
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(3);
        calc.pressEquals();
        assertEquals("5", calc.readScreen());
    }

}
