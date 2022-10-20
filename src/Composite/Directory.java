package Composite;

import java.util.ArrayList;

public class Directory extends Entry {
    private String name;
    private ArrayList<Entry> directory = new ArrayList<>();

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

        for (Entry entry : directory) {
            ans += entry.getSize();
        }

        return ans;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry : directory) {
            entry.printList(prefix + "/" + name);
        }
    }

    @Override
    public void add(Entry entry) {
        directory.add(entry);
    }
}
