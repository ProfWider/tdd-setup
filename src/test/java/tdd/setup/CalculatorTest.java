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
    @DisplayName("should display zero when cleared")
    void calculatorDisplaysZeroWhenCleared(){
        Calculator calc1 = new Calculator();
        calc1.pressDigitKey(5);
        calc1.pressClearKey();
        assertEquals("0", calc1.readScreen());
    }

    @Test
    @DisplayName("should display the correct negative number")
    void calculatorDisplaysNegativeNumber(){
        Calculator calc2 = new Calculator();
        calc2.pressDigitKey(9);
        calc2.pressNegative();
        assertEquals("-9", calc2.readScreen());
    }

    @Test
    @DisplayName("should display result after adding two decimal numbers")
    void calculatorDisplaysResultOfDecimalNumberAddition(){
        Calculator calc3 = new Calculator();
        calc3.pressDigitKey(2);
        calc3.pressDotKey();
        calc3.pressDigitKey(2);
        calc3.pressOperationKey("+");
        calc3.pressDigitKey(2);
        calc3.pressDotKey();
        calc3.pressDigitKey(2);
        calc3.pressEquals();
        assertEquals("4.4", calc3.readScreen());
    }

}

