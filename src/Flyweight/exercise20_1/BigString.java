package Flyweight.exercise20_1;

import Flyweight.BigChar;
import Flyweight.BigCharFactory;

public class BigString {
    private BigChar[] bigChars;

    public BigString(String string, boolean shared) {
        int n = string.length();
        bigChars = new BigChar[n];

        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < n; i++) {
            if (shared) {
                bigChars[i] = factory.getBigChar(string.charAt(i));
            } else {
                bigChars[i] = new BigChar(string.charAt(i));
            }
        }
    }

    public void print() {
        for (BigChar bigChar : bigChars) {
            bigChar.print();
        }
    }
}


