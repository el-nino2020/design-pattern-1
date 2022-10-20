package Bridge.exercise9_1;

import Bridge.StringDisplayImpl;

public class Main {
    public static void main(String[] args) {
        RandomDisplay display = new RandomDisplay(new StringDisplayImpl("Theta"));
        display.randomDisplay(5);
    }
}
