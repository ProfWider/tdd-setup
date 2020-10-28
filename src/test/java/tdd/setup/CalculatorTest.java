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
    @DisplayName("should display result after subtracting two positive numbers")
    void calculatorCanDoTwoMinusTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("-");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("0", calc.readScreen());
    }

    @Test
    @DisplayName("should display input after no operation")
    void calculatorCanDoNoOperation() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(3);
        calc.pressEquals();
        assertEquals("3", calc.readScreen());
    }

    @Test
    @DisplayName("should display result after adding three positive numbers")
    void calculatorCanDoThreePlusThreePlusThree() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(3);
        calc.pressOperationKey("+");
        calc.pressDigitKey(3);
        calc.pressOperationKey("+");
        calc.pressDigitKey(3);
        calc.pressEquals();
        assertEquals("9", calc.readScreen());
    }

    @Test
    @DisplayName("should display result with numbers leading with a dot")
    void calculatorCanDoFirstDigitDot() {
        Calculator calc = new Calculator();
        calc.pressDotKey();
        calc.pressDigitKey(5);
        calc.pressOperationKey("+");
        calc.pressDotKey();
        calc.pressDigitKey(5);
        calc.pressEquals();
        assertEquals("1", calc.readScreen());
    }

}
