package Singleton.exercise5_1;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(TicketMaker.getInstance().getNextTicketNumber() + "\t");
            if ((i + 1) % 5 == 0) System.out.println();
        }
    }
}
