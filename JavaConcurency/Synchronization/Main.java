package JavaConcurency.Synchronization;

public class Main {
    // Threads share same memory space, i.e. they can share resources
    // Synchronized used when you want to use 1 thread at a time

    public static void main(String[] args) {
        System.out.println("Main is starting");

        Stack stack = new Stack(5);

        new Thread(
                () -> {
                    int counter = 0;

                    while (++counter < 10) {
                        System.out.println("Pushed: " + stack.push(100));
                    }
                }, "Pusher"
        ).start();

        new Thread(
                () -> {
                    int counter = 0;
                    while (++counter < 10) {
                        System.out.println("Popped: " + stack.pop());
                    }
                }, "Popper"
        ).start();

        System.out.println("Main is ending");
    }
}
