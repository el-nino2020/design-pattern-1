package Decorator.exercise12_1;

import Decorator.Border;
import Decorator.Display;

public class UpDownBorder extends Border {
    private char borderChar;

    public UpDownBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return display.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == getRows() - 1) {
            return makeHorizontalBorder();
        }
        return display.getRowText(row - 1);
    }

    private String makeHorizontalBorder() {
        StringBuilder ans = new StringBuilder(getColumns());

        for (int i = 0; i < getColumns(); i++) {
            ans.append(borderChar);
        }

        return ans.toString();
    }

}
