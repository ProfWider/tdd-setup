package tdd.setup;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Retro calculator")
class CalculatorTest {

    private Calculator calc = new Calculator();
    @Test
    @DisplayName("should display result after adding two positive numbers")
    void calculatorCanDoTwoPlusTwo() {
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("4", calc.readScreen());
    }

    @Test
    @DisplayName("should revert screen to 0")
    void calculatorCanClearScreen(){
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressEquals();
        calc.pressClearKey();
        assertEquals("0", calc.readScreen());
    }

    @Test
    @DisplayName("should move decimal point two spaces forward")
    void calculatorCanDecimalizePercentages(){
        calc.pressDigitKey(8);
        calc.pressDigitKey(9);
        calc.pressDigitKey(8);
        calc.pressOperationKey("%");
        assertEquals("8.98", calc.readScreen());
    }

    @Test
    @DisplayName ("if the negative key is pressed before the input of a number, the number should turn negative")
    void calculatorCanDisplayNegativeNumbers () {
        calc.pressClearKey();
        calc.pressNegative();
        calc.pressDigitKey(8);
        calc.pressDigitKey(8);
        assertEquals("-88", calc.readScreen());
    }
}
