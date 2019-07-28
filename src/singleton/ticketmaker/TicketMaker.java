package singleton.ticketmaker;

public class TicketMaker {
    private static TicketMaker singleton = new TicketMaker();
    private int ticket = 1000;
    private TicketMaker() {}
    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
    public static TicketMaker getInstance() {
        return singleton;
    }
}
