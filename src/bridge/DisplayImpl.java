package bridge;

/**
 * Implementor
 * 実装のクラス階層の最上位クラス
 */
public abstract class DisplayImpl {
    public abstract void rawOpen();
    public abstract void rawPrint();
    public abstract void rawClose();
}
