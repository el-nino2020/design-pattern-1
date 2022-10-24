package Flyweight;

public class BigString {
    private BigChar[] bigChars;

    public BigString(String string) {
        int n = string.length();
        bigChars = new BigChar[n];

        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < n; i++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    public void print() {
        for (BigChar bigChar : bigChars) {
            bigChar.print();
        }
    }
}
