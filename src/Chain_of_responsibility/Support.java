package Chain_of_responsibility;

public abstract class Support {
    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    //这里返回next只是为了方便程序编写
    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    protected abstract boolean resolve(Trouble trouble);

    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    private void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }

    @Override
    public String toString() {
        return String.format("[%s]", name);
    }


}
