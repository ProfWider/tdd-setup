package tdd.setup;

// behaviour inspired by https://www.online-calculator.com/
public class Calculator {

    private String screen = "";

    private double latestValue;

    private String latestOperation = "";

    public String readScreen() {
        return screen;
    }

    public void pressDigitKey(int digit) {
        if(digit > 9 || digit < 0) throw new IllegalArgumentException();
        if(latestOperation.isEmpty()) {
            screen +=  digit;
        } else if(screen.contains(".")) {
            screen += Integer.toString(digit);
            System.out.println(latestValue);
        } else {
            screen = Integer.toString(digit);
            System.out.println(latestValue);
        }
    }

    public void pressClearKey() {
        screen = "0";
        latestOperation = "0";
        latestValue = 0.0;

    }

    public void pressOperationKey(String operation)  {
        latestOperation = operation;
        latestValue = Double.parseDouble(screen);
        screen = "";
    }

    public void pressDotKey() {
        if(!screen.endsWith(".")) screen = screen + ".";
    }

    public void pressNegative() {
        screen = screen.startsWith("-") ? screen.substring(1) : "-" + screen;
    }

    public void pressEquals() {
        System.out.println(screen);
        System.out.println(latestValue +", screen: " +screen + "operation: " + (latestValue * Double.parseDouble(screen)));
        var result = switch(latestOperation) {
            case "+" -> latestValue + Double.parseDouble(screen);
            case "-" -> latestValue - Double.parseDouble(screen);
            case "x" -> latestValue * Double.parseDouble(screen);
            case "/" -> latestValue / Double.parseDouble(screen);
            default -> throw new IllegalArgumentException();
        };

        screen = Double.toString(Math.round( 100.0 * result) / 100.0);
        if(screen.endsWith(".0")) screen = screen.substring(0,screen.length()-2);
        latestOperation = "";

    }
}
