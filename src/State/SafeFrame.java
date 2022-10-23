package State;

import Decorator.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class SafeFrame extends Frame implements ActionListener, Context {
    private TextField textClock = new TextField(60);
    private TextArea textScreen = new TextArea(10, 60);
    private Button useButton = new Button("use safe");
    private Button alarmButton = new Button("alarm");
    private Button callButton = new Button("call");
    private Button exitButton = new Button("exit");//按钮用中文会有问题

    private State state = DayState.getInstance();

    public SafeFrame(String title) {
        super(title);
        setBackground(Color.LIGHT_GRAY);
        setLayout(new BorderLayout());

        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);

        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);

        Panel panel = new Panel();
        panel.add(useButton);
//        useButton.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(alarmButton);
        panel.add(callButton);
        panel.add(exitButton);

        add(panel, BorderLayout.SOUTH);

        pack();

        setPreferredSize(new Dimension(500, 500));
        setLocation(500, 500);

        setVisible(true);


        useButton.addActionListener(this);
        alarmButton.addActionListener(this);
        callButton.addActionListener(this);
        exitButton.addActionListener(this);

    }

    @Override
    public void setClock(int hour) {
        String string = String.format("现在时间是%02d:00", hour);
        System.out.println(string);
        textClock.setText(string);
        state.setClock(this, hour);
    }

    @Override
    public void callSecurityCenter(String message) {
        textScreen.append("call! " + message + "\n");
    }

    @Override
    public void recordLog(String message) {
        textScreen.append("record... " + message + "\n");

    }

    @Override
    public void changeState(State state) {
        System.out.format("从%s状态变为了%s状态\n", this.state, state);
        this.state = state;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        Object source = e.getSource();

        if (source == useButton) {
            state.use(this);
        } else if (source == alarmButton) {
            state.alarm(this);
        } else if (source == callButton) {
            state.call(this);
        } else if (source == exitButton) {
            System.exit(0);
        } else {
            System.out.println("? Undefined action ?");
        }
    }
}












