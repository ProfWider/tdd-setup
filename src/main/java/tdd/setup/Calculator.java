package tdd.setup;

// behaviour inspired by https://www.online-calculator.com/
public class Calculator {

    private String screen = "0";

    private double latestValue;

    private String latestOperation = "";

    //Fix2
    private int initialeEingabe = 0;

    public String readScreen() {
        return screen;
    }
    //Fix2
    public void pressDigitKey(int digit)
    {
        if (initialeEingabe == 0)
        {
            if (latestOperation.isEmpty())
            {
                screen = screen + digit;
            }
            else
            {
                latestValue = Double.parseDouble(screen);
                screen = Integer.toString(digit);
                initialeEingabe = 1;
            }
        }
        else
        {
            screen = screen + digit;
        }
    }


    //Fix2
    public void pressClearKey() {
        screen = "0";
        latestOperation = "";
        latestValue = 0.0;
        initialeEingabe = 0;
    }

    public void pressOperationKey(String operation)  {
        latestOperation = operation;
    }

    //Fix2
    public void pressDotKey() {
        //if(!screen.endsWith(".")) screen = screen + ".";
        //if(!screen.contains(".")) screen = screen + ".";
        screen = !screen.contains(".") ? screen = screen + "." : screen;
    }

    public void pressNegative() {
        screen = screen.startsWith("-") ? screen.substring(1) : "-" + screen;
    }

    public void pressEquals() {
        var result = switch(latestOperation) {
            case "+" -> latestValue + Double.parseDouble(screen);
            case "-" -> latestValue - Double.parseDouble(screen);
            case "x" -> latestValue * Double.parseDouble(screen);
            case "/" -> latestValue / Double.parseDouble(screen);
            //Fix 1
            case "" -> Double.parseDouble(screen);
            default -> throw new IllegalArgumentException();
        };
        screen = Double.toString(result);
        if(screen.endsWith(".0")) screen = screen.substring(0,screen.length()-2);
    }
}
