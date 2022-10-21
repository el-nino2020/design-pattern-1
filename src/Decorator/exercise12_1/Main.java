package Decorator.exercise12_1;

import Decorator.Display;
import Decorator.FullBorder;
import Decorator.SideBorder;
import Decorator.StringDisplay;

public class Main {
    public static void main(String[] args) {
        Display display1 = new StringDisplay("Hell, world");
        display1.show();
        System.out.println("==================================================================");

        Display display2 = new UpDownBorder(display1, '-');
        display2.show();
        System.out.println("==================================================================");

        Display display3 = new SideBorder(display2, '*');
        display3.show();
        System.out.println("==================================================================");

        Display display4 = new FullBorder(new UpDownBorder(new SideBorder(new UpDownBorder(new SideBorder(new StringDisplay("HELL, WORLD"), '*'), '='), '|'), '/'));
        display4.show();
    }
}
