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
    // neuer grüner Test
    void calculatorCanDoTwoMinusTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("-");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("0", calc.readScreen());
    }
    @Test
    // neuer roter Test
    void calculatorPercentage() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(5);
        calc.pressDigitKey(0);
        calc.pressOperationKey("%");
        assertEquals("0.5", calc.readScreen());
    }
    
    @Test
    // 2.roter Test
    void NumberStartsWith0() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressDigitKey(0);
        assertEquals("20", calc.readScreen());
    }
    
    @Test
    // 3.roter Test
    void DotTest() {
        Calculator calc = new Calculator();
        calc.pressDotKey();
        calc.pressDigitKey(5);
        calc.pressOperationKey("x");
        calc.pressDotKey();
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("0.1", calc.readScreen());
      }
}
