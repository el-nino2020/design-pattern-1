package Strategy;

public class Player {
    private String name;
    private Strategy strategy;

    private int winCount = 0;
    private int loseCount = 0;
    private int gameCount = 0;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void getFeedback(Result result) {
        gameCount++;
        switch (result) {
            case WIN:
                winCount++;
                strategy.study(true);
                break;
            case LOSE:
                loseCount++;
                strategy.study(false);
                break;
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", winCount=" + winCount +
                ", loseCount=" + loseCount +
                ", gameCount=" + gameCount +
                '}';
    }
}
