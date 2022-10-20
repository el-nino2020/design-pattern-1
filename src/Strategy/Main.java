package Strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seed1, seed2;
        try {
            System.out.print("输入一个种子值(int): ");
            seed1 = Integer.parseInt(scanner.next());
            System.out.print("再输入一个种子值(int): ");
            seed2 = Integer.parseInt(scanner.next());
        } catch (Exception e) {
            System.out.println("输入值有误，退出程序");
            return;
        }

        Player player1 = new Player("Eve", new WinningStrategy(seed1));
        Player player2 = new Player("Satan", new ProbStrategy(seed2));

        int gameCount = 10000;
        for (int i = 0; i < gameCount; i++) {
            Hand hand1 = player1.nextHand();
            Hand hand2 = player2.nextHand();

            player1.getFeedback(hand1.fight(hand2));
            player2.getFeedback(hand2.fight(hand1));
        }

        System.out.println(player1);
        System.out.println("===================================================");
        System.out.println(player2);

    }
}
