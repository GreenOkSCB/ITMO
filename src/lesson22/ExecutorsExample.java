package lesson22;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorsExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
            pool.submit(new Task());
        }

        List<Future<String>> futures = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Future<String> fut = pool.submit(new Task2());

            futures.add(fut);
        }

        for (Future<String> future : futures) {
            System.out.println(future.get());
        }

        pool.shutdown();
    }

    private static class Task implements Runnable {
        @Override
        public void run() {
            System.out.println("Task invoked in " + Thread.currentThread().getName());
        }
    }

    private static class Task2 implements Callable<String> {
        @Override
        public String call() throws Exception {
            Thread.sleep(1);

            return "Task2 invoked in " + Thread.currentThread().getName();
        }
    }
}
