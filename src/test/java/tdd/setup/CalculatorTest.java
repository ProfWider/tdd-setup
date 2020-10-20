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
    void calCanTwoMultipliedFour() {
        Calculator calculator = new Calculator();
        calculator.pressDigitKey(2);
        calculator.pressOperationKey("x");
        calculator.pressDigitKey(4);
        calculator.pressEquals();
        assertEquals("8", calculator.readScreen());
    }

//    @Test
//    @DisplayName("should display 0 after pressing clear button")
//    void calculatorClearsScreen() {
//        Calculator cal = new Calculator();
//        cal.pressDigitKey(5);
//        cal.pressClearKey();
//        assertEquals("0", cal.readScreen());
//    }
//
//    @Test
//    @DisplayName("Should display the correctly placed dot after pressing the dot button")
//    void calSetsDotCorrectly() {
//        Calculator c = new Calculator();
//        c.pressDigitKey(9);
//        c.pressDigitKey(0);
//        c.pressDotKey();
//        c.pressDigitKey(1);
//        c.pressDigitKey(5);
//        c.readScreen();
//        assertEquals("90.15", c.readScreen());
//    }
//
//    @Test
//    @DisplayName("Should display negative value of input")
//    void calCanConvertInput() {
//        Calculator c = new Calculator();
//        c.pressNegative();
//        c.pressDigitKey(5);
//        c.pressEquals();
//        assertEquals("-5", c.readScreen());
//    }
}
