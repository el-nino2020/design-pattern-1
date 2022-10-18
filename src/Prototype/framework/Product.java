package Prototype.framework;

public interface Product extends Cloneable {
    Product createClone();

    void use(String s);
}
