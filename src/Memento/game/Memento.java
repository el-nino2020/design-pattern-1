package Memento.game;

import java.util.ArrayList;

public class Memento {
    int money;
    ArrayList<String> fruits = new ArrayList<>();

    Memento(int money) { // wide interface
        this.money = money;
    }

    public int getMoney() { // narrow interface
        return money;
    }

    void addFruit(String fruit) { // wide interface
        fruits.add(fruit);
    }

    @SuppressWarnings({"unchecked"})
    public ArrayList<String> getFruits() { // wide interface
        return (ArrayList<String>) fruits.clone();//clone保证Memento中的数据是永久的
    }
}
