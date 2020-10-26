package tdd.setup;

// behaviour inspired by https://www.online-calculator.com/
public class Calculator {

    //bugfix red test one >> do not initialize screen
    private String screen = "";

    private double latestValue;

    private String latestOperation = "";

    public String readScreen() {

        return screen;
    }

    //bug fix for test case three
    public void pressDigitKey(int digit) {
        if(digit > 99 || digit < 0) throw new IllegalArgumentException();

        if(latestOperation.isEmpty()) {
            screen = screen + digit;
        } else {
            latestValue = Double.parseDouble(screen);
            screen = Integer.toString(digit);
        }
    }

    public void pressClearKey() {
        screen = "0";
        latestOperation = "";
        latestValue = 0.0;
    }

    public void pressOperationKey(String operation)  {

        latestOperation = operation;
    }

    public void pressDotKey() {

        if(!screen.endsWith(".")) screen = screen + ".";
    }

    public void pressNegative() {

        screen = screen.startsWith("-") ? screen.substring(1) : "-" + screen;
    }

    public void pressEquals() {
        double result;
        switch (latestOperation) {
            case "+":
                result = latestValue + Double.parseDouble(screen);
                break;
            case "-":
                result = latestValue - Double.parseDouble(screen);
                break;
            case "x":
                result = latestValue * Double.parseDouble(screen);
                break;
            case "/":
                result = latestValue / Double.parseDouble(screen);
                break;
            default:
                throw new IllegalArgumentException();
        }
        screen = Double.toString(result);
        if(screen.endsWith(".0")) screen = screen.substring(0,screen.length()-2);
    }



}
