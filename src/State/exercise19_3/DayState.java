package State.exercise19_3;

import State.*;

public class DayState implements State {
    private static DayState dayState = new DayState();

    private DayState() {
    }

    public static DayState getInstance() {
        return dayState;
    }

    @Override
    public void setClock(Context context, int hour) {
        if (12 <= hour && hour < 14) {//当有超过两个State类时，在State中控制状态切换变得很麻烦
            context.changeState(LunchTimeState.getInstance());
        } else if (!(9 <= hour && hour < 17)) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void use(Context context) {
        context.recordLog("使用金库(白天)");
    }

    @Override
    public void alarm(Context context) {
        context.callSecurityCenter("按下警铃(白天)");
    }

    @Override
    public void call(Context context) {
        context.callSecurityCenter("正常通话(白天)");
    }

    @Override
    public String toString() {
        return "[白天]";
    }
}
