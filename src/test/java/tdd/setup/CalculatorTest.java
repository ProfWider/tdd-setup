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
    @DisplayName("should display result after multiplying one negative numbers and one positive numbers")
    void calculatorCanDoMinusTwoCommaFiveTimesTwo(){
        Calculator calctest = new Calculator();
        calctest.pressNegative();
        calctest.pressDigitKey(2);
        calctest.pressDotKey();
        calctest.pressDigitKey(5);
        calctest.pressOperationKey("x");
        calctest.pressDigitKey(2);
        calctest.pressEquals();
        assertEquals("5", calctest.readScreen());
        }
    }
