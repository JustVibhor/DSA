package OOPs.InBuiltPackage;

public class ObjectClassDemo {
    private int num;

    ObjectClassDemo(int num) {
        this.num = num;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected ObjectClassDemo clone() throws CloneNotSupportedException {
        return (ObjectClassDemo)super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectClassDemo)obj).num;
    }

    // number representation of an object
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public ObjectClassDemo() {
        super();
    }

    public static void main(String[] args) {
        ObjectClassDemo obj = new ObjectClassDemo(4);
        ObjectClassDemo obj2 = new ObjectClassDemo(4);
        System.out.println(obj instanceof Object);
        System.out.println(obj.getClass());
        System.out.println(obj.hashCode());
        System.out.println(obj == obj2);
        System.out.println(obj.equals(obj2));
    }
}
