package JavaConcurency.ThreadPool;

public class ThreadPoolMain {
    public static void main(String[] args) throws Exception {
        ThreadPool threadPool = new ThreadPool(3, 10);
        // We are not sure in what order each thread will execute its task
        // whoever thread executes its task earlier will take the next task
        for(int i=0; i<10; i++) {
            int taskNo = i;
            threadPool.execute(() -> {
                String message = Thread.currentThread().getName() + ": Task " + taskNo;
                System.out.println(message);
            });
        }

        threadPool.waitUntilAllTasksFinished();
        threadPool.stop();
    }
}
