package OOPs;

public class InnerClasses {
    static class Test {
        public void maine() {
            System.out.println("Inner Class");
        }

        static void maineTwo() {
            System.out.println("Static inner method");
        }
    }

    public static void main(String[] args) {
        System.out.println("Outter Class");
        Test obj = new Test();
        obj.maine();
        Test.maineTwo();
    }
}
