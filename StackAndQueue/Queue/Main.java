package StackAndQueue.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomQueue<Integer> queue = new CustomQueue<>();

        for(int i=1; i<6; i++) {
            System.out.print(i + "    ");
            queue.push(i);
        }
        System.out.println();

        while (!queue.isEmpty()) {
            System.out.print(queue.pop() + "    ");
        }
    }
}
