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
}
class CalculatorTest2 {
    @Test
    @DisplayName("should display result after subtracting two positive numbers")
    void calculatorCanDoThreeMinusTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(3);
        calc.pressOperationKey("-");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("1", calc.readScreen());
    }
}
class CalculatorTest3 {
    @Test
    @DisplayName("should display result after pressDigitKey")
    void calculatorCanMulti() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        assertEquals("2", calc.readScreen());
    }
}
class CalculatorTest4 {
    @Test
    @DisplayName("should display result after adding two positive point numbers")
    void calculatorCanDoTwoPlusTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(3);
        calc.pressDotKey();
        calc.pressDigitKey(4);
        calc.pressEquals();
        assertEquals("5.4", calc.readScreen());
    }
}

