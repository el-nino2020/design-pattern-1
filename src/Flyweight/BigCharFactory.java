package Flyweight;

import java.util.HashMap;

public class BigCharFactory {
    private static BigCharFactory bigCharFactory = new BigCharFactory();
    private HashMap<Character, BigChar> pool = new HashMap<>();

    private BigCharFactory() {
    }

    public static BigCharFactory getInstance() {
        return bigCharFactory;
    }

    public synchronized BigChar getBigChar(char charName) {
        BigChar bigChar = pool.get(charName);

        if (bigChar == null) {
            bigChar = new BigChar(charName);
            pool.put(charName, bigChar);
        }
        return bigChar;
    }
}
