package State.exercise19_3;

import State.*;

public class LunchTimeState implements State {

    private static LunchTimeState lunchTimeState = new LunchTimeState();

    private LunchTimeState() {
    }

    public static LunchTimeState getInstance() {
        return lunchTimeState;
    }

    @Override
    public void setClock(Context context, int hour) {
        if (!(12 <= hour && hour < 14))
            context.changeState(DayState.getInstance());
    }

    @Override
    public void use(Context context) {
        context.callSecurityCenter("紧急：午餐时间使用金库");
    }

    @Override
    public void alarm(Context context) {
        context.callSecurityCenter("按下警铃(午餐时间)");

    }

    @Override
    public void call(Context context) {
        context.recordLog("午餐时间的通话录音");
    }

    @Override
    public String toString() {
        return "[午餐时间]";
    }
}
