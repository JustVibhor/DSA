package JavaConcurency.MultiThreading;

public class DaemonThread {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            while (true) {
                sleep(500);
                System.out.println("Running");
            }
        };

        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();
        sleep(5200);
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
