package Strategy;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won = false;
    private Hand prevHand;//上一局的手势

    public WinningStrategy() {
        random = new Random();
    }

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.values()[random.nextInt(3)];
        }
        return prevHand;
    }

    @Override
    public void study(Boolean win) {
        won = win;
    }
}
