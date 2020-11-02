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
    @DisplayName("should display 0 after pressing clear button")
    void canClear() {
        Calculator c = new Calculator();
        c.pressDigitKey(5);
        c.pressClearKey();
        assertEquals("0", c.readScreen());
    }

    @Test
    @DisplayName("should display the correct number")
    void showCorrectInput(){
        Calculator c = new Calculator();
        c.pressDigitKey(5);
        c.readScreen();
        assertEquals("5", c.readScreen());
    }

    @Test
    @DisplayName("Should display negative value of input")
    void calCanConvertInput() {
        Calculator c = new Calculator();
        c.pressNegative();
        c.pressDigitKey(5);
        c.pressEquals();
        assertEquals("-5", c.readScreen());
    }


}
