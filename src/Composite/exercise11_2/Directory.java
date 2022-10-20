package Composite.exercise11_2;

import java.util.ArrayList;

public class Directory extends EnhancedEntry {
    private String name;
    private ArrayList<EnhancedEntry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int ans = 0;

        for (EnhancedEntry entry : directory) {
            ans += entry.getSize();
        }

        return ans;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (EnhancedEntry entry : directory) {
            entry.printList(prefix + "/" + name);
        }
    }

    //新加入的成员
    @Override
    public void add(EnhancedEntry entry) {
        directory.add(entry);
        entry.setParent(this);
    }
}
