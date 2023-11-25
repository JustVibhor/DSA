package JavaConcurency.MultiThreading;

public class ThreadStoppingExample {
    public static class StoppableRunnable implements Runnable {
        private boolean stopRequested = false;

        public synchronized void requestStop() {
            this.stopRequested = true;
        }

        public synchronized boolean isStopRequested() {
            return this.stopRequested;
        }

        private void sleep(long millis) {
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            System.out.println("Stoppable Runnable Running");
            while (!isStopRequested()) {
                sleep(1000);
                System.out.println("...");
            }
            System.out.println("Stoppable Runnable Stopped");
        }
    }

    public static void main(String[] args) {
        StoppableRunnable runnable = new StoppableRunnable();
        Thread thread = new Thread(runnable, "The Thread");
        thread.start();

        try {
            thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Requested stop");
        runnable.requestStop();
        System.out.println("Stop Requested");
    }
}
