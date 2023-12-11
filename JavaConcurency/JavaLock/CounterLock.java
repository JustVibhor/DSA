package JavaConcurency.JavaLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterLock {
    private long count = 0;

    // add fairness (true) in the threads so the next thread waiting will get the chance to lock and unlock the lock first
    private Lock lock = new ReentrantLock(true);

    // you should always unlock the lock before cleanup
    public void inc() {
        try {
            lock.lock();
            this.count++;
        } finally {
            lock.unlock();
        }
    }

    public long getCount() {
        try {
            lock.lock();
            return this.count;
        } finally {
            lock.unlock();
        }
    }


}
