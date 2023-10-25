package LinkedList.Questions.InterviewQues;

public class Main {
    public static void main(String[] args) {
        int n = 1;
        int slow = findSumOfSquare(n);
        int fast = findSumOfSquare(findSumOfSquare(n));

        while(slow != fast) {
            if(slow == 1 || fast == 1) {
                System.out.println(slow + " " + fast);
            }
            slow = findSumOfSquare(slow);
            fast = findSumOfSquare(findSumOfSquare(fast));
        }

        System.out.println(slow + " " + fast);
    }


    public static int findSumOfSquare(int n) {
        int sum = 0;

        while(n > 0) {
            int temp = n % 10;
            sum += temp*temp;
            n /= 10;
        }

        return sum;
    }
}
