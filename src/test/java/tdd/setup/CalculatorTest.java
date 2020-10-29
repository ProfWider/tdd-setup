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


    /**
     * 1. Roter Test
     * do multiplication with double digit numbers
     * 20 * 50 = 1000
     */
    @Test
    @DisplayName("Calculator displays correct result of the multiplication of two digit numbers!!")
    void calcCanDoMultiplicationOfDoubleDigitNumbers() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(1);
        calc.pressDigitKey(0);
        calc.pressOperationKey("x");
        calc.pressDigitKey(2);
        calc.pressDigitKey(0);
        calc.pressEquals();
        assertEquals("200", calc.readScreen());
    }


    /**
     * 2. Roter Test
     * press Dot Key Multiple times
     * Online Calculator ignores multiple dot inputs
     */
    @Test
    @DisplayName("Calculator ignores input of multiple dots")
    void calculatorIgnoresMultipleDotsInOneNumber () {
        Calculator calc = new Calculator();
        calc.pressDotKey();
        calc.pressDigitKey(8);
        calc.pressDotKey();
        calc.pressDotKey();
        calc.pressDigitKey(5);
        assertEquals("0.85", calc.readScreen());
    }







}
