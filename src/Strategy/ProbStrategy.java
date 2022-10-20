package Strategy;

import java.util.Arrays;
import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random random;
    private Hand prevHand = Hand.values()[0];
    private Hand curHand = Hand.values()[0];

    /**
     * history[上一局手势][这一局手势] = 过去这么做的胜利次数。换言之，
     * 这是基于自己之前的行为和猜拳的结果做预测。这个方法有效的前提是：对手
     * 的策略是固定的
     */
    private int[][] history = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
    };

    public ProbStrategy() {
        random = new Random();
    }

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {

        int index = curHand.ordinal();
        int sum = Arrays.stream(history[index]).sum();
        int choice = random.nextInt(sum);
        int nextIndex;
        if (choice < history[index][0]) {
            nextIndex = 0;
        } else if (choice < history[index][0] + history[index][1]) {
            nextIndex = 1;
        } else {
            nextIndex = 2;
        }

        prevHand = curHand;
        curHand = Hand.values()[nextIndex];

        return curHand;
    }

    @Override
    public void study(Boolean win) {
        int prevIndex = prevHand.ordinal();
        int curIndex = curHand.ordinal();
        if (win) {
            history[prevIndex][curIndex]++;
        } else {
            history[prevIndex][(curIndex + 1) % 3]++;
            history[prevIndex][(curIndex + 2) % 3]++;
        }
    }
}
