package factory_method;

import factory_method.framework.Factory;
import factory_method.framework.Product;
import factory_method.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Alpha");
        Product card2 = factory.create("Beta");
        Product card3 = factory.create("Sigma");

        card1.use();
        card2.use();
        card3.use();
    }
}
