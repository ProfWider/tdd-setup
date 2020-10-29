package tdd.setup;

// behaviour inspired by https://www.online-calculator.com/
public class Calculator {

    private String screen = "";

    private double latestValue;

    private String latestOperation = "";

    private boolean clearScreen = false;


    public String readScreen() {
        return screen;
    }

   public void pressDigitKey(int digit) {
        if(digit > 9 || digit < 0) throw new IllegalArgumentException();

       //new code, added new variable clear screen, this variable is set, when the
       //operation button is pressed
       if (clearScreen) {
           screen = Integer.toString(digit);
           clearScreen = false;
       } else {
           screen = screen + Integer.toString(digit);
       }

       if (latestOperation.isEmpty()){
           latestValue = Double.parseDouble(screen);
       }
    }

    public void pressClearKey() {
        screen = "0";
        latestOperation = "";
        latestValue = 0.0;
        clearScreen = false;
    }

    public void pressOperationKey(String operation)  {
        latestOperation = operation;
        clearScreen = true;

    }

    public void pressDotKey() {
        if(!screen.endsWith(".")) screen = screen + ".";
    }

    public void pressNegative() {
        screen = screen.startsWith("-") ? screen.substring(1) : "-" + screen;
    }

   // public void pressTwoOperationKeys

    public void pressEquals() {
        var result = switch(latestOperation) {
            case "+" -> latestValue + Double.parseDouble(screen);
            case "-" -> latestValue - Double.parseDouble(screen);
            case "x" -> latestValue * Double.parseDouble(screen);
            case "/" -> latestValue / Double.parseDouble(screen);

            default -> throw new IllegalArgumentException();
        };
        screen = Double.toString(result);
        if(screen.endsWith(".0")) screen = screen.substring(0,screen.length()-2);
    }
}
