package State;

public interface State {

    void setClock(Context context, int hour);

    void use(Context context); //使用金库

    void alarm(Context context);//按下警铃

    void call(Context context);//打电话
}
