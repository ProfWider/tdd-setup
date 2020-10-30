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
    @DisplayName("should display result after adding two positive numbers -test-")
    void calculatorCanDoAdd() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(19);
        calc.pressOperationKey("+");
        calc.pressDigitKey(70);
        calc.pressEquals();
        assertEquals("89", calc.readScreen());
    }
    @Test
    @DisplayName("should display result after multiplying two positive numbers")
    void calculatorCanDoMultiply() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(4);
        calc.pressOperationKey("x");
        calc.pressDigitKey(3);
        calc.pressEquals();
        assertEquals("12", calc.readScreen());
    }

    @Test
    @DisplayName("should display result after adding two negative numbers")
    void calculatorCanDoNeg() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(5);
        calc.pressOperationKey("+");
        calc.pressDigitKey(4);
        calc.pressEquals();
        assertEquals("1", calc.readScreen());
    }
    @Test
    @DisplayName("should display result after dividing two numbers")
    void calculatorCanDoDiv() {
        Calculator calc = new Calculator();
        calc.pressNegative();
        calc.pressDigitKey(-2);
        calc.pressOperationKey("/");
        calc.pressDigitKey(5);
        calc.pressEquals();
        assertEquals("0.4", calc.readScreen());
    }
    @Test
    @DisplayName("should display result after dividing two numbers -solved-")
    void calculatorCanDoDivSolved() {
        Calculator calc = new Calculator();
        calc.pressNegative();
        calc.pressDigitKey(-2);
        calc.pressOperationKey("/");
        calc.pressDigitKey(5);
        calc.pressEquals();
        assertEquals("0.4", calc.readScreen());
    }

    @Test
    @DisplayName("no name yet ")
    void calculatorCanDoFloating() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressDotKey();
        calc.pressDigitKey(5);
        calc.pressOperationKey("/");
        calc.pressDigitKey(5);
        calc.pressEquals();
        assertEquals("0.4", calc.readScreen());
    }


}
