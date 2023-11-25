package JavaConcurency.MultiThreading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main is starting");

        Thread thread1 = new Thread1("thread1");
        Thread thread2 = new Thread(new Thread2(), "thread2");

        // Using Runnable interface is better way of creating a thread
        // as you can't extend multiple classes but can implement multiple
        // interfaces.
        // Thread2 is superior to Thread1

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread() + ", " + i);
            }
        }, "thread3");

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Main is starting");
    }
}
