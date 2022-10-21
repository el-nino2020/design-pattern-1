package Visitor;


import java.util.Iterator;

public abstract class Entry implements Element{
    public abstract String getName();

    public abstract int getSize();

    public void add(Entry entry) {
        throw new FileTreatmentException();
    }

    public Iterator<Entry> iterator() {
        throw new FileTreatmentException();
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", getName(), getSize());
    }
}
