package Flyweight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("your input: ");
            String s = scanner.next();
            BigString bigString = new BigString(s);
            bigString.print();
        }
    }
}
