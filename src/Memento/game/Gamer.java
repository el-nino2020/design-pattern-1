package Memento.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random = new Random();
    private static final String[] FRUITS_NAME = {
            "苹果", "葡萄", "香蕉", "橘子"
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        switch (dice) {
            case 1:
                money += 100;
                System.out.println("金钱增加了100");
                break;
            case 2:
                money /= 2;
                System.out.println("金钱减半了");
                break;
            case 6:
                String fruit = getFruit();
                fruits.add(fruit);
                System.out.println("获得了: " + fruit);
                break;
            default:
                System.out.println("无事发生");
        }
    }


    public Memento createMemento() {
        Memento ans = new Memento(money);

        for (String fruit : fruits) {
            if (fruit.startsWith("好吃的")) {
                ans.addFruit(fruit);
            }
        }

        return ans;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    private String getFruit() {
        StringBuilder ans = new StringBuilder();

        if (random.nextBoolean()) {
            ans.append("好吃的");
        }
        ans.append(FRUITS_NAME[random.nextInt(FRUITS_NAME.length)]);
        return ans.toString();
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }
}
