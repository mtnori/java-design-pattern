package singleton.ticketmaker;

public class Main {
    public static void main(String[] args) {
        System.out.println("start.");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + TicketMaker.getInstance().getNextTicketNumber());
        }
        System.out.println("end.");
    }
}
