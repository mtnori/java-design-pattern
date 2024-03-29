package singleton.triple;

public class Main {
    public static void main(String[] args) {
        System.out.println("start.");
        for (int i = 0; i < 9; i++) {
            Triple triple = Triple.getInstance(i % 3);
            System.out.println(i + ":" + triple);
        }
        System.out.println("end.");
    }
}
