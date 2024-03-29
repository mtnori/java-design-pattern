package singleton.triple;

public class Triple {
    private static Triple[] triple = new Triple[] {
            new Triple(0),
            new Triple(1),
            new Triple(2)
    };
    private int id;
    private Triple(int id) {
        this.id = id;
        System.out.println("ID:" + id + "のインスタンスを生成しました");
    }
    public static Triple getInstance(int id) {
        return triple[id];
    }
    @Override
    public String toString() {
        return "Triple{" +
                "id=" + id +
                '}';
    }
}
