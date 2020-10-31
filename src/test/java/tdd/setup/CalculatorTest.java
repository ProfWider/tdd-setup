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
    // Analysieren Sie das Verhalten der Klasse Calculator und finden Sie Abweichungen im Vergleich zu www.online-calculator.com
    // verglichen mit dem Taschenrechner erkennen wir, dass in unserem code mehrere methoden fehlen. zum Beispiel zum Ausführen
    // Prozent rechnungen oder die wurzel ziehen, oder rückwerz
}
