package Bridge.exercise9_3;

import Bridge.CountDisplay;
import Bridge.DisplayImpl;

public class IncreasingDisplay extends CountDisplay {

    public IncreasingDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void fixedStepIncreasingDisplay(int times, int step) {
        for (int i = 0; i < times; i++) {
            multiDisplay(i * step);
        }
    }


}
