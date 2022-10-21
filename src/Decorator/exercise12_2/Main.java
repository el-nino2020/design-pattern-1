package Decorator.exercise12_2;

import Decorator.Display;
import Decorator.FullBorder;
import Decorator.SideBorder;

public class Main {
    public static void main(String[] args) {
        MultiStringDisplay display1 = new MultiStringDisplay();
        display1.add("good morning");
        display1.add("good afternoon");
        display1.add("good night");

        display1.show();
        System.out.println("========================================================================");

        Display display2 = new SideBorder(display1, '#');
        display2.show();
        System.out.println("========================================================================");

        Display display3 = new FullBorder(display1);
        display3.show();

    }
}
