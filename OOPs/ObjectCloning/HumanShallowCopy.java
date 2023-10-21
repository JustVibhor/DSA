package OOPs.ObjectCloning;

public class HumanShallowCopy implements Cloneable {
    int age;
    String name;
    int[] arr;

    public HumanShallowCopy(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 5, 2, 1, 10};
    }

    // shallow copy of the object
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
