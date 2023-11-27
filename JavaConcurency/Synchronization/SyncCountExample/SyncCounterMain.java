package JavaConcurency.Synchronization.SyncCountExample;

public class SyncCounterMain {
    public static void main(String[] args) {
        SyncCounter counter = new SyncCounter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.incCount();
            }
            System.out.println(counter.getCount());
        });

        Thread thread2 = new Thread(() -> {
            for(int i=0; i<1_000_000; i++) {
                counter.incCount();
            }
            System.out.println(counter.getCount());
        });

        thread1.start();
        thread2.start();
    }
}