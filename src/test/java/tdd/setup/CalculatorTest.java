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


    // erster grüner tets
    @Test
    @DisplayName("should display result after adding two positive numbers and clear it")
    void calculatorCanClear() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("-");
        calc.pressDigitKey(1);
        calc.pressClearKey();
        assertEquals("0", calc.readScreen());
    }

    // erster rot
//    @Test
//    @DisplayName("should display result after adding nagativ to a number")
//    void calculatorCanNagativ() {
//        Calculator calc = new Calculator();
//        calc.pressDigitKey(2);
//        calc.pressDotKey();
//        calc.pressDigitKey(5);
//        calc.pressNegative();
//        assertEquals("-2.5", calc.readScreen());
//    }

}

