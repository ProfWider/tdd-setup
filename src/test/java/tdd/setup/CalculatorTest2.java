package tdd.setup;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Retro calculator2")
class CalculatorTest2 {
    @Test
    @DisplayName("should display negative result after adding two numbers")
    void calculatorCanDosixPlusTen() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(6);
        calc.pressOperationKey("-");
        calc.pressDigitKey(9);
        calc.pressEquals();
        assertEquals("-3", calc.readScreen());



    }
}
