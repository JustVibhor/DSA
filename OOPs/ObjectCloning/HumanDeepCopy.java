package OOPs.ObjectCloning;

public class HumanDeepCopy implements Cloneable {
    int age;
    String name;
    int[] arr;

    public HumanDeepCopy(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 5, 2, 1, 10};
    }

    // Deep copy of the object
    @Override
    public Object clone() throws CloneNotSupportedException {
        HumanDeepCopy twin = (HumanDeepCopy)super.clone();

        twin.arr = new int[twin.arr.length];

        System.arraycopy(this.arr, 0, twin.arr, 0, twin.arr.length);

        return twin;
    }
}
