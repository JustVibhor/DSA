package StackAndQueue.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomStack<Integer> stack = new CustomStack<>();

        for(int i=0; i<6; i++) {
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + "    ");
        }
    }
}
