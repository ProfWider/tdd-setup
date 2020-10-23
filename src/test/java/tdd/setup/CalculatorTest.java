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
    @DisplayName("should display result after minus two positive numbers")
    void calculatorCanDoTwoMinusTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("-");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("0", calc.readScreen());
        System.out.println(calc.readScreen());

    }
    @Test
    @DisplayName("test for adding a decimal number with a natural number")
    void calculatorCanDoDotAndAddANegativeNumber() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(3);
        calc.pressDotKey();
        calc.pressDigitKey(3);
        calc.pressOperationKey("+");
        calc.pressNegative();
        calc.pressDigitKey(2);
        calc.pressEquals();
        System.out.println(calc.readScreen());
        assertEquals("1.3", calc.readScreen());
    }

}
