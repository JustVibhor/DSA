package StackAndQueue.CircularQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        CircularQueue<Integer> circularQueue = new CircularQueue<>(5);

        for (int i=1; i<6; i++) {
            System.out.print(i + "    ");
            circularQueue.push(i);
        }
        System.out.println();

        while (!circularQueue.isEmpty()) {
            System.out.print(circularQueue.pop() + "    ");
        }
    }
}
