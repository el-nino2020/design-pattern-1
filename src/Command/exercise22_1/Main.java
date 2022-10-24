package Command.exercise22_1;

import Command.command.MacroCommand;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener, ItemListener {
    private MacroCommand history = new MacroCommand();
    private DrawCanvas canvas = new DrawCanvas(1000, 1000, history);
    private JButton clearButton = new JButton("clear");
    private Choice choice = new Choice();

    public Main(String title) {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);
        choice.addItemListener(this);

        //这个练习参考了https://youtu.be/1EN2lA__xV0
        choice.add("red");
        choice.add("yellow");
        choice.add("green");
        choice.add("black");


        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(choice);


        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);

        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == clearButton) {
            history.clear();
            canvas.repaint();
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        DrawCommand command
                = new DrawCommand(canvas, e.getPoint());
        history.append(command);
        command.execute();

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String color = choice.getSelectedItem();
        ColorCommand command = null;
        switch (color) {
            case "red":
                command = new ColorCommand(canvas, Color.RED);
                break;
            case "yellow":
                command = new ColorCommand(canvas, Color.YELLOW);
                break;
            case "green":
                command = new ColorCommand(canvas, Color.GREEN);
                break;
            case "black":
                command = new ColorCommand(canvas, Color.BLACK);
                break;
        }
        history.append(command);
        command.execute();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    public static void main(String[] args) {
        new Main("Command Pattern");
    }


}
