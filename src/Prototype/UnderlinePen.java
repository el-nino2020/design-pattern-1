package Prototype;

import Prototype.framework.Product;

public class UnderlinePen implements Product {
    private char underlineChar;

    public UnderlinePen(char underlineChar) {
        this.underlineChar = underlineChar;
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            //尽管在这里createClone()相当于clone(), 但注意：clone是protected方法
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }

    @Override
    public void use(String s) {
        int length = s.length();
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(underlineChar);
        }
        System.out.println();
    }
}
