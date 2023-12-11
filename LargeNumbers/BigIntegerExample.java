package LargeNumbers;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Random;

public class BigIntegerExample {
    public static void main(String[] args) {
        BigInteger A = BigInteger.valueOf(12);
        BigInteger B = BigInteger.valueOf(123131);
        int c = B.intValue();
        BigInteger C   = BigInteger.valueOf(22);
        BigInteger X = new BigInteger("3487234333");

        // constants
        BigInteger D = BigInteger.TEN;

        // addition
        BigInteger s = C.add(A);

        BigInteger f =  BigInteger.ONE;
        BigInteger f1 =  BigInteger.TEN;
        BigInteger f2 =  BigInteger.ZERO;

        HashMap<Integer, BigInteger> map = new HashMap<>();

        for(int i=0; i<100; i++) {
            map.put(i, new BigInteger(3, new Random()));
        }


    }
}
