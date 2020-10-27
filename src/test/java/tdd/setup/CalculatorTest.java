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
    //first successful test
    @Test
    @DisplayName("should display result after subtracting two positive numbers")
    void calculatorCanDoFourMinusTwo() {
        Calculator calc1 = new Calculator();
        calc1.pressDigitKey(4);
        calc1.pressOperationKey("-");
        calc1.pressDigitKey(2);
        calc1.pressEquals();
        assertEquals("2", calc1.readScreen());
    }
    //first failed test
    @Test
    @DisplayName("should display same digit after pressing Equals without an operation")
    void calculatorCanDoFourEquals() {
        Calculator calc2 = new Calculator();
        calc2.pressDigitKey(4);
        calc2.pressEquals();
        assertEquals("4", calc2.readScreen());
    }
    //second failed test
    @Test
    @DisplayName("should display result after adding two positive floats")
    void calculatorCanDoThreePointOnePlusThreePointOne() {
        Calculator calc3 = new Calculator();
        calc3.pressDigitKey(3);
        calc3.pressDotKey();
        calc3.pressDigitKey(1);
        calc3.pressOperationKey("+");
        calc3.pressDigitKey(3);
        calc3.pressDotKey();
        calc3.pressDigitKey(1);
        calc3.pressEquals();
        assertEquals("6.2", calc3.readScreen());
    }

}
