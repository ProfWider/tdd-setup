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
    //Aufgabe 1.2 bereits funktionierende Funktion wird getestet
    @Test
    @DisplayName("should display result after dividing two positive numbers")
    void calculatorCanDoEightDividedByFour() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(8);
        calc.pressOperationKey("/");
        calc.pressDigitKey(4);
        calc.pressEquals();
        assertEquals("2", calc.readScreen());
    }
    // Aufgabe 2.1 Funktion finden die nicht funktioniert
    @Test
    void printDot() {
        Calculator calc = new Calculator();
        calc.pressDotKey();
        calc.pressDigitKey(3);
        calc.pressDotKey();
        calc.pressDigitKey(3);
        calc.pressOperationKey("x");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("0.66", calc.readScreen());
    }

    //Aufgabe 2.2 zweiter Operand kann nur einstellig sein
    @Test
    void printDreihundertDreissig() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(3);
        calc.pressDigitKey(3);
        calc.pressOperationKey("x");
        calc.pressDigitKey(1);
        calc.pressDigitKey(0);
        calc.pressEquals();
        assertEquals("330", calc.readScreen());
    }

}
