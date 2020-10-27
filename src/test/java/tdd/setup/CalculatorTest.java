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
    // First green test
    @Test
    @DisplayName("should display result after subtract two numbers and then multiply a number")
    void calculatorMinusAndMultiply() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(5);
        calc.pressOperationKey("-");
        calc.pressDigitKey(3);
        calc.pressEquals();
        System.out.println(calc.readScreen());
        calc.pressOperationKey("x");
        calc.pressDigitKey(3);
        calc.pressEquals();
        System.out.println(calc.readScreen());
        assertEquals("6", calc.readScreen());
    }
    // First red test
    @Test
    @DisplayName("should be able to display the result of adding two negative numbers")
    void calculatorCanAddTwoNegativeNumbers() {
        Calculator calc = new Calculator();
        calc.pressNegative();
        calc.pressDigitKey(5);
        System.out.println(calc.readScreen());
        calc.pressOperationKey("+");
        calc.pressNegative();
        calc.pressDigitKey(3);
        calc.pressEquals();
        System.out.println(calc.readScreen());
        assertEquals("-8", calc.readScreen());
    }
}
