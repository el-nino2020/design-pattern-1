package Command.exercise22_1;

import Command.command.MacroCommand;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {
    private Color color = Color.RED;
    private int radius = 6;
    private MacroCommand history;


    public DrawCanvas(int width, int height, MacroCommand history) {
        this.history = history;
        setSize(width, height);
        setBackground(Color.white);
    }

    @Override
    public void paint(Graphics g) {
        history.execute();
    }

    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
}
