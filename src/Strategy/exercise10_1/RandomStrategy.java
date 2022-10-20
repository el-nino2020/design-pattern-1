package Strategy.exercise10_1;

import Strategy.Strategy;
import Strategy.Hand;

import java.util.Random;

public class RandomStrategy implements Strategy {
    private Random random;

    public RandomStrategy(int seed) {
        random = new Random(seed);
    }

    public RandomStrategy() {
        random = new Random();
    }

    public Hand nextHand() {
        return null;
    }

    @Override
    public void study(Boolean win) {

    }
}
