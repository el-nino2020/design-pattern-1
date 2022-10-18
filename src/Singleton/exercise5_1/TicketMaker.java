package Singleton.exercise5_1;

public class TicketMaker {
    private int ticket = 1000;
    private static TicketMaker ticketMaker = new TicketMaker();

    public int getNextTicketNumber() {
        return ticket++;
    }

    private TicketMaker() {
    }

    public static TicketMaker getInstance() {
        return ticketMaker;
    }
}
