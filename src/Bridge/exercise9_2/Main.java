package Bridge.exercise9_2;

import Bridge.CountDisplay;
import Bridge.Display;
import common.Param;

public class Main {
    public static void main(String[] args) {

        Display display1 = new Display(new TextDisplayImpl(
                Param.SRC_PATH + "Bridge\\exercise9_2\\input1.txt"));
        display1.display();

        System.out.println("============================================================");

        CountDisplay display2 = new CountDisplay(new TextDisplayImpl(
                Param.SRC_PATH + "Bridge\\exercise9_2\\input2.txt"));
        display2.multiDisplay(2);
    }
}
