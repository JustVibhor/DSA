package JavaConcurency.ThreadLocal;

public class ThreadLocalExample {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();

        Thread thread1 = new Thread(() -> {
            threadLocal.set("Thread 1");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//            threadLocal.remove();
            String value = threadLocal.get();
            System.out.println(value);
        });

        Thread thread2 = new Thread(() -> {
            threadLocal.set("Thread 2");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            String value = threadLocal.get();
            System.out.println(value);
        });

        thread2.start();
        thread1.start();


    }
}
