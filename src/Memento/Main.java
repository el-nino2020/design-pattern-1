package Memento;

import Memento.game.Gamer;
import Memento.game.Memento;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();

        for (int i = 0; i < 100; i++) {
            System.out.println("Round: " + i);
            System.out.println("当前状态: " + gamer);

            gamer.bet();

            //只有在钱增加时才保存状态，因此会丢失上次保存以来增加的"好吃的"水果
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("钱增加了很多，保存当前游戏状态");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("钱减少了很多，恢复之前的状态");
                gamer.restoreMemento(memento);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
