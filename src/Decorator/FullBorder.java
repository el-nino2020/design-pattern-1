package Decorator;

public class FullBorder extends Border {

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return display.getColumns() + 2;
    }

    @Override
    public int getRows() {
        return display.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == display.getRows() + 1) {
            return makeHorizontalBorder();
        }
        return "|" + display.getRowText(row - 1) + "|";
    }

    private String makeHorizontalBorder() {
        StringBuilder ans = new StringBuilder(getColumns());
        ans.append("+");
        for (int i = 0; i < display.getColumns(); i++) {
            ans.append("-");
        }
        ans.append("+");
        return ans.toString();
    }
}
