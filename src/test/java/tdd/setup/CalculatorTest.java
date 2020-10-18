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
    @DisplayName("should display 0 after pressing clear key")
    void calculatorCanClearDisplay(){

        Calculator calc = new Calculator();
        calc.pressDigitKey(5);
        calc.pressClearKey();
        assertEquals("0", calc.readScreen());
        assertEquals(0.0, calc.getLatestValue());
        assertEquals("", calc.getLatestOperation());

    }

    @Test
    @DisplayName("should convert an entered positive number to a negative number")
    void calculatorCanConvertEnteredNumber(){

        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressNegative();
        assertEquals("-2", calc.readScreen());
    }

    @Test
    @DisplayName("should display decimal numbers")
    void calculatorCanDisplayDecimalNumber() {

        Calculator calc = new Calculator();
        calc.pressDigitKey(5);
        calc.pressDotKey();
        calc.pressDigitKey(2);
        assertEquals(5.2, calc.readScreen());
            }

}
