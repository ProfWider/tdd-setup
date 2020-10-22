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
    @DisplayName("should display result after multiplying two positive numbers")
    void calculatorCanDoTwoMultiplyTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(3);
        calc.pressOperationKey("x");
        calc.pressDigitKey(3);
        calc.pressEquals();
        assertEquals("9", calc.readScreen());
    }

    @Test
    @DisplayName("should display result after add two negative numbers")
    void calculatorCanAddNegativeNumbers() {
        Calculator calc = new Calculator();
        calc.pressNegative();
        calc.pressDigitKey(3);
        calc.pressOperationKey("+");
        calc.pressNegative();
        calc.pressDigitKey(3);
        calc.pressEquals();
        assertEquals("-6", calc.readScreen());
    }


    @Test
    void printDreihundertDreissig() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(3);
        calc.pressOperationKey("x");
        calc.pressDigitKey(3);
        calc.pressEquals();

        calc.pressClearKey();

        assertEquals("0", calc.readScreen());
    }
    @Test
    @DisplayName("should display result after adding three positive numbers")
    void calculatorCanDoTwoPlusTwoPlusTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("6", calc.readScreen());
    }
}
