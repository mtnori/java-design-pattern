package prototype.framework;

public abstract class Product implements Cloneable {
    public abstract void use(String s);

    /**
     * 自分自身の複製を行う
     */
    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
