package OOPs;

public class StaticBlock {
    static int a = 5;
    static int b;

    // will only run when the first obj is created (Just ONCE)
    static {
        System.out.println("Its a Static Block");
        b = 6;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();

        System.out.println("a: " + a + " b: " + b);

        StaticBlock.b  += 3;
        System.out.println("a: " + a + " b: " + b);
    }
}
