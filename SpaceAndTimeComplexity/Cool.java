package SpaceAndTimeComplexity;

// Akra Baazi Formula for divide and conq
// for linear use f(n) = alpha**n and u move on to find c1 and c2
// for non homogeneous do normally just and add g(n), and guess c

public class Cool {
    public static void main(String[] args) {
        System.out.println(fibonacciInConstantTime(100));
    }

    static int fibonacciInConstantTime(int n) {
        return (int)(1/Math.sqrt(5)*(Math.pow((1 + Math.sqrt(5))/2, n) - Math.pow((1 - Math.sqrt(5))/2, n)));
    }
}
