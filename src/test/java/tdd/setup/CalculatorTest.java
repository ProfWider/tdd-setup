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



    /**
     * 1. Grüner Test
     * Press Negative Key
     * -5 * 2 Ergebnis sollte - 100 sein
     */
    @Test
    void calculatorCanDoMultiplicationWithNegativeNumbers () {
        Calculator calc = new Calculator();
        calc.pressDigitKey(5);
        calc.pressNegative();
        calc.pressOperationKey("x");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("-10", calc.readScreen());
    }





}
