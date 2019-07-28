package singleton.nonsingleton;

public class Singleton {
    private static Singleton singleton = null;

    public Singleton() {
        System.out.println("インスタンスを生成しました");
    }

    /**
     * スレッドセーフにするためにsynchronizedを付ける
     */
    public static synchronized Singleton getInstance() {
        /**
         * スレッドセーフではない
         */
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
