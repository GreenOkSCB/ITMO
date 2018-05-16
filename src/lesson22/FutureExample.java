package lesson22;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureExample {
    private static String result;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        runnable();
        callable();
    }

    private static void runnable() throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                result = "Runnable";

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t.start();
        t.join();

        System.out.println(result);
    }

    private static void callable() throws ExecutionException, InterruptedException {
        FutureTask<String> task = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(100);

                return "Callable";
            }
        });

        new Thread(task).start();

        System.out.println(task.get());
    }

    private static class MyCallable implements Callable<String> {
        private final String prefix;

        private MyCallable(String prefix) {
            this.prefix = prefix;
        }

        @Override
        public String call() throws Exception {
            return prefix + "callable";
        }
    }
}
