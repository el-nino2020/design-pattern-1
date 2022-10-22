package Chain_of_responsibility.exercise14_4;

import Chain_of_responsibility.Trouble;

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


    //使用循环来实现
    public final void support(Trouble trouble) {
        Support cur = this;

        while (cur != null) {
            if (resolve(trouble)) {
                done(trouble);
                return;
            }
            cur = cur.next;
        }

        fail(trouble);
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
