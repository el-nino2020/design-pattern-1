package Prototype;

import Prototype.framework.Product;

public class MessageBox implements Product {
    private char decorateChar;

    public MessageBox(char decorateChar) {
        this.decorateChar = decorateChar;
    }


    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }

    @Override
    public void use(String s) {
        int length = s.length();
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decorateChar);
        }
        System.out.println();

        System.out.println(decorateChar + " " + s + " " + decorateChar);


        for (int i = 0; i < length + 4; i++) {
            System.out.print(decorateChar);
        }
        System.out.println();
    }
}
