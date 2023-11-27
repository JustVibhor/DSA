package JavaConcurency.RaceCondition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RaceConditionExample {
    public static void main(String[] args) {
        Map<String, String> sharedMap = new ConcurrentHashMap<>();

        Thread thread1 = new Thread(getRunnable(sharedMap));
        Thread thread2 = new Thread(getRunnable(sharedMap));

        thread1.start();
        thread2.start();
    }

    private static Runnable getRunnable(Map<String, String> sharedMap) {
        return () -> {
            for (int i = 0; i < 1_000_000; i++) {
                synchronized (sharedMap) {
                    if (sharedMap.containsKey("key")) {
                        String value = sharedMap.remove("key");
                        // since both threads may access sharedMap at the same time
                        // and concurrentHashMap only allow one thread at a time so
                        // once in while it returns null, to solve this issue use
                        // synchronized block at the critical situation
                        if (value == null) {
                            System.out.println("Iteration " + i + ": Value for 'key' was null");
                        }
                    } else {
                        sharedMap.put("key", "value");
                    }
                }
            }
        };
    }
}
