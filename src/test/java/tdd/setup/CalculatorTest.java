package tdd.setup;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Retro calculator")
class CalculatorTest {
    private Calculator calc = new Calculator();

    @Test
    @DisplayName("can do 2 + 2")
    void calculatorCanDoTwoPlusTwo() {
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("4", calc.readScreen());
    }

    @Test
    @DisplayName("can do basic subtraction")
    void calculatorBasicMinus() {
        calc.pressDigitKey(2);
        calc.pressOperationKey("-");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("0", calc.readScreen());
    }

    @Test
    @DisplayName("can do basic multiplication")
    void calculatorBasicMultiplication() {
        calc.pressDigitKey(2);
        calc.pressOperationKey("x");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("4", calc.readScreen());
    }

    @Test
    @DisplayName("can do basic division")
    void calculatorBasicDivision() {
        calc.pressDigitKey(2);
        calc.pressOperationKey("/");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("1", calc.readScreen());
    }

    @Test
    @DisplayName("can do nested addition")
    void calculatorNestedAddition() {
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("6", calc.readScreen());
    }

    @Test
    @DisplayName("interim result for nested calculations")
    void calculatorInterimResult() {
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        assertEquals("4", calc.readScreen());
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        assertEquals("6", calc.readScreen());
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        assertEquals("8", calc.readScreen());
        calc.pressDigitKey(2);
    }

    @Test
    @DisplayName("only one dot press allowed")
    void calculatorPressDotAgain() {
        calc.pressDigitKey(2);
        calc.pressDotKey();
        calc.pressDigitKey(5);
        assertEquals("2.5", calc.readScreen());
        calc.pressDotKey();
        assertEquals("2.5", calc.readScreen());
    }

    @Test
    @DisplayName("pressing nagative again makes number positive")
    void calculatorPressNegativeAgain() {
        calc.pressDigitKey(2);
        calc.pressNegative();
        assertEquals("-2", calc.readScreen());
        calc.pressNegative();
        assertEquals("2", calc.readScreen());
    }

}
