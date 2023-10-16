package OOPs.AbstractClass;

public class SubClass extends AbstractClass {

    public static void main(String[] args) {
        AbstractClass obj = new SubClass();
        obj.sum(1, 2);

    }

    @Override
    void career(String name) {
        System.out.println("Engineer");
    }

    @Override
    int sum(int a, int b) {
        return a+b;
    }


}
