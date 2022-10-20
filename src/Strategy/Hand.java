package Strategy;

//猜拳手势作为枚举类实现更好
public enum Hand {
    GUU, //石头
    CHO, //剪刀
    PHA; //布

    public Result fight(Hand h) {
        if (this.equals(h)) {
            return Result.DRAW;
        } else if ((this.ordinal() + 1) % 3 == h.ordinal()) {
            return Result.WIN;
        } else {
            return Result.LOSE;
        }
    }
}
