package BitManipulation;

public class Bits {
    public static void main(String[] args) {
        int n = 12;
        int k = 3;

        if (((1 << k) & n) != 0)
            System.out.print("Not zero");
        else
            System.out.print("Zero");
    }


}
