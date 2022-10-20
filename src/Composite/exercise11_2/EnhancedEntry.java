package Composite.exercise11_2;



public abstract class EnhancedEntry {
    public abstract String getName();

    public abstract int getSize();

    public void add(EnhancedEntry entry) {
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

    //新加入的成员
    private EnhancedEntry parent = null;

    public String getAbsolutePath() {
        return getParentPath(this, "");
    }

    private String getParentPath(EnhancedEntry entry, String postfix) {
        String ans = "/" + entry.getName() + postfix;
        return entry.parent == null ? ans : getParentPath(entry.parent, ans);
    }

    protected void setParent(EnhancedEntry parent) {
        this.parent = parent;
    }
}
