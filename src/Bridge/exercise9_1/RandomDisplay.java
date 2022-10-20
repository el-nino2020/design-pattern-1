package Bridge.exercise9_1;

import Bridge.CountDisplay;
import Bridge.DisplayImpl;

import java.util.Random;

public class RandomDisplay extends CountDisplay {
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        multiDisplay(new Random().nextInt(times + 1));
    }
}
