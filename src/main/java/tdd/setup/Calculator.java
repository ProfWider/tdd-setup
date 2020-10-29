package tdd.setup;

// behaviour inspired by https://www.online-calculator.com/
public class Calculator {

    // Ausgabe auf dem Screen default auf 0
    private String screen = "0";

    // letzter eingegebener Wert
    private double latestValue;

    // letzte ausgewählte Operation
    private String latestOperation = "";



    /**
     * Method read Screen
     * Methode gibt String value der Variablen Screen zurück
     * @return screen
     */
    public String readScreen() {
        return screen;
    }


    /**
     * Method pressDigitKey
     * Method changed to Fix Multiplication of double digit values
     * @param digit
     */
    public void pressDigitKey(int digit) {
        if(digit > 9 || digit < 0) throw new IllegalArgumentException();
        Integer.toString(digit);
        screen = screen + digit;
    }


    // Noch nicht getestet
    // Alle grauen Tests sind noch nicht getestet
    public void pressClearKey() {
        screen = "0";               // Ausgangszustand Screen (deault Zustand)
        latestOperation = "";       // Default Zustand
        latestValue = 0.0;          // Latest Value wird auf 0.0 gesetzt
    }

    /**
     * Method pressOperationKey
     * Fix Multiplication of double digit value
     * @param operation
     */
    public void pressOperationKey(String operation)  {
        latestOperation = operation;
        latestValue = Double.parseDouble(screen);
        screen = "0";
    }


    /**
     * Method pressDotKey
     * .contains(".) fix to ignore the input of multiple dots in one number
     */
    public void pressDotKey() {
        if(!screen.endsWith(".")) screen = screen + ".";
    }   // Wenn Screen nicht mit . endet mach nen Punkt rein
        // Wenn man Zahlen zwischen die Punkte schreibt kann man mehrere Punkte in eine Zahl machen



    // Noch nicht getestet
    public void pressNegative() { screen = screen.startsWith("-") ? screen.substring(1) : "-" + screen; }
    // Wenn Screen mit - anfängt dann mach screen erster Platz im Index 1 (positiv/vorzeichnfrei)
    // Wenn Screen nicht mit - anfängt dann mach "-" + screen (Minuszeichen wird gesetzt)


    public void pressEquals() {
        var result = switch(latestOperation) {
            case "+" -> latestValue + Double.parseDouble(screen);
            case "-" -> latestValue - Double.parseDouble(screen);
            case "x" -> latestValue * Double.parseDouble(screen);
            case "/" -> latestValue / Double.parseDouble(screen);
            default -> throw new IllegalArgumentException();
        };
        screen = Double.toString(result);
        if(screen.endsWith(".0")) screen = screen.substring(0, screen.length()-2);


        // if(screen.endsWith(".0")) screen = screen.substring(0,screen.length()-2);
    }

    /**
     * Davor Richtiges Verzeichnis in Ubuntu wählen
     * git status
     * git add .
     * git commit -m 'Test Nachricht'
     *
     */
}
