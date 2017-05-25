package edu.oit.lesson9;

public enum Month {
    JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5), JUNE(6), JULY(7), AUGUST(8), SEPTEMBER(9), OCTOBER(10), NOVEMBER(11), DECEMBER(12);
    private int value;
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    private Month (int value) {
        this.value = value;
    }
    
    public static void main(String[] args) {
        System.out.println("August: " + Month.AUGUST.getValue());
        
        greet(Month.APRIL);
        for (Month mon: Month.values()) {
            System.out.printf("%-3s %s\n", mon.getValue(), Month.greet(mon));
        }
    }
    
    public static String greet(Month mon) {
        String greeting = "";
        switch(mon) {
        case JANUARY:
            greeting = "It's " + Month.JANUARY.name() + ", Happiness always looks small!";
            break;
        case FEBRUARY:
            greeting = "It's " + Month.FEBRUARY.name() + ", Crazy mathematics of happiness!";
            break;
        case MARCH:
            greeting = "It's " + Month.MARCH.name() + ", Who give importance to their happiness!";
            break;
        case APRIL:
            greeting = "It's " + Month.APRIL.name() + ", I pray all the happiness surrounds you.!";
            break;
        case MAY:
            greeting = "It's " + Month.MAY.name() + ", Happiness depends solely upon what you think!";
            break;
        case JUNE:
            greeting = "It's " + Month.JUNE.name() + ", I pray all the happiness surrounds you..!";
            break;
        case JULY:
            greeting = "It's " + Month.JULY.name() + ", Cause of your happiness / Pain!";
            break;
        case AUGUST:
            greeting = "It's " + Month.AUGUST.name() + ", Love is happiness of 2day!";
            break;
        case SEPTEMBER:
            greeting = "It's " + Month.SEPTEMBER.name() + ", Love may give happiness or sadness!";
            break;
        case OCTOBER:
            greeting = "It's " + Month.OCTOBER.name() + ", Wish you lots of love, joy and happiness.!";
            break;
        case NOVEMBER:
            greeting = "It's " + Month.NOVEMBER.name() + ", Always be the reason of someone's happiness!";
            break;
        case DECEMBER:
            greeting = "It's " + Month.DECEMBER.name() + ", Hidden happiness within you!";
            break;
        }
        
        return greeting;
    }
}
