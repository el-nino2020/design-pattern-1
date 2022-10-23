package State;

public class NightState implements State {
    private static NightState nightState = new NightState();

    private NightState() {
    }

    public static NightState getInstance() {
        return nightState;
    }

    @Override
    public void setClock(Context context, int hour) {
        if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void use(Context context) {
        context.callSecurityCenter("紧急：晚上使用金库");
    }

    @Override
    public void alarm(Context context) {
        context.callSecurityCenter("按下警铃(晚上)");
    }

    @Override
    public void call(Context context) {
        context.recordLog("晚上的通话录音");
    }

    @Override
    public String toString() {
        return "[晚上]";
    }
}
