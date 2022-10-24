package Flyweight.exercise20_1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("your input: ");
            String s = scanner.next();
            BigString bigString = new BigString(s, false);//在debug模式下查看
            bigString.print();
        }
    }
}


