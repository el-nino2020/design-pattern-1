package Decorator.exercise12_2;

import Decorator.Display;

import java.util.ArrayList;

public class MultiStringDisplay extends Display {
    private ArrayList<String> list = new ArrayList<>();
    private int maxWidth = 0;

    public void add(String string) {
        maxWidth = Math.max(maxWidth, string.length());
        list.add(string);
    }

    @Override
    public int getColumns() {
        return maxWidth;
    }

    @Override
    public int getRows() {
        return list.size();
    }

    @Override
    public String getRowText(int row) {
        StringBuilder ans = new StringBuilder(list.get(row));
        int length = ans.length();
        for (int i = length; i < maxWidth; i++) {
            ans.append(" ");
        }
        return ans.toString();
    }
}
