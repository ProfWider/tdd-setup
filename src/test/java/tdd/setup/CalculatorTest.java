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
    @DisplayName("should display result after divide two numbers")
    void calculatorCanDoFiveDividedFive()
    {
        Calculator calc1 = new Calculator();
        calc1.pressDigitKey(5);
        calc1.pressOperationKey("/");
        calc1.pressDigitKey(5);
        calc1.pressEquals();
        assertEquals("1", calc1.readScreen());
    }

    @Test
    @DisplayName("should display show the same digit after press 'equals'")
    void calculatorCanDoSixEquals() {
        Calculator calc2 = new Calculator();
        calc2.pressDigitKey(6);
        calc2.pressEquals();
        assertEquals("6", calc2.readScreen());
    }

    @Test
    @DisplayName("should display show the result of multiplying of two digit numbers")
    void calculatorCanDoMultiplyTwoTWODIGITNumbers() {
        Calculator calc3 = new Calculator();
        calc3.pressDigitKey(1);
        calc3.pressDigitKey(0);
        calc3.pressOperationKey("x");
        calc3.pressDigitKey(2);
        calc3.pressDigitKey(0);
        calc3.pressEquals();
        assertEquals("200", calc3.readScreen());
    }
    //System.out.println(calc3.readScreen()); -> Debugger für die Kommandozeile

    @Test
    @DisplayName("should display a negative number")
    void calculatorCanNegativeANumber() {
        Calculator calc4 = new Calculator();
        calc4.pressDigitKey(1);
        calc4.pressNegative();
        assertEquals("-1", calc4.readScreen());
    }
}
