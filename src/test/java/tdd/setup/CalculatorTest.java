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
    @DisplayName("should clear display")
    void calculatorCanClearDisplay() {
        Calculator calc2 = new Calculator();
        calc2.pressDigitKey(8);
        calc2.pressClearKey();
        assertEquals("0", calc2.readScreen());
    }

    @Test
    @DisplayName("should return a negative number")
    void calculatorCanDoNegative() {
        Calculator calc3 = new Calculator();
        calc3.pressDigitKey(4);
        calc3.pressNegative();
        assertEquals("-4", calc3.readScreen());
    }

    @Test
    @DisplayName("decimal number")
    void CalculatorCanDoDecimal() {
        Calculator calc4 = new Calculator();
        calc4.pressDigitKey(5);
        calc4.pressDotKey();
        calc4.pressDigitKey(5);
        assertEquals("5.5", calc4.readScreen());
    }

    @Test
    @DisplayName("should display result after adding two positive decimal numbers")
    void CalculatorCanDoPlusDecimal(){
        Calculator calc5 = new Calculator();
        calc5.pressDigitKey(2);
        calc5.pressDotKey();
        calc5.pressDigitKey(2);
        calc5.pressOperationKey("+");
        calc5.pressDigitKey(2);
        calc5.pressDotKey();
        calc5.pressDigitKey(2);
        calc5.pressEquals();
        assertEquals("4.4", calc5.readScreen());
    }


}
