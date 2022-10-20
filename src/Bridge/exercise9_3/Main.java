package Bridge.exercise9_3;

//写这个练习的时候参考了答案
public class Main {
    public static void main(String[] args) {
        IncreasingDisplay display1 = new IncreasingDisplay(
                new CharDisplayImpl('<', '*', '>'));
        display1.fixedStepIncreasingDisplay(4, 1);

        IncreasingDisplay display2 = new IncreasingDisplay(
                new CharDisplayImpl('|', '#', '-'));
        display2.fixedStepIncreasingDisplay(6, 2);

    }
}
