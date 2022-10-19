package Abstract_factory.factory;

public abstract class Item {
    protected String caption; //caption: 说明文字

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
