package Composite;

public abstract class Entry {
    public abstract String getName();

    public abstract int getSize();

    public void add(Entry entry) {
        throw new FileTreatmentException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return String.format("%s (%d)", getName(), getSize());
    }
}
