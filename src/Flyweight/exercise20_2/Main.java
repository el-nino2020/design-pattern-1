package Flyweight.exercise20_2;

import Flyweight.exercise20_1.BigString;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 50000;
        String s = generateRandomString(length);

        System.gc();
        System.gc();
        System.gc();
        System.gc();
        System.gc();
        System.gc();
        System.gc();

        BigString bigString = new BigString(s, true);
        showUsedMemory();

        System.gc();
        System.gc();
        System.gc();
        System.gc();
        System.gc();
        System.gc();
        System.gc();
        System.gc();

        bigString = new BigString(s, false);
        showUsedMemory();
    }

    private static void showUsedMemory() {
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("使用的内存为 :" + usedMemory);
    }

    private static String generateRandomString(int length) {
        StringBuilder ans = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            ans.append((char) ('0' + random.nextInt(10)));
        }

        return ans.toString();
    }
}
