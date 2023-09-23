package SpaceAndTimeComplexity;

public class Cool {
    public static void main(String[] args) {
        System.out.println(fibonacciInConstantTime(6));
    }

    static int fibonacciInConstantTime(int n) {
        return (int)(1/Math.sqrt(5)*(Math.pow((1 + Math.sqrt(5))/2, n) - Math.pow((1 - Math.sqrt(5))/2, n)));
    }
}
