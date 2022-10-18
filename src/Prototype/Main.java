package Prototype;

import Prototype.framework.Manager;
import Prototype.framework.Product;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.register("strong message", new UnderlinePen('~'));
        manager.register("warning box", new MessageBox('*'));
        manager.register("slash box", new MessageBox('/'));

        Product p1 = manager.create("strong message");
        p1.use("hello, world");

        Product p2 = manager.create("warning box");
        p2.use("hello, world");

        Product p3 = manager.create("slash box");
        p3.use("hello, world");
    }
}
