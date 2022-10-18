package Template_method;

public abstract class AbstractDisplay {
    public abstract void open();

    public abstract void print();

    public abstract void close();

    //final确保处理流程不会被子类更改
    public final void display() {
        open();

        for (int i = 0; i < 5; i++) {
            print();
        }

        close();
    }
}
