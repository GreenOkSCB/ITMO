package lesson19;

public class ThreadsMain {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            new Thread(new MyRunnable()).start();
        }

        System.out.println(Thread.currentThread().getName());
    }

    private static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello! Thread is: " + getName());
        }
    }

    private static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello, runnable! " + Thread.currentThread().getName());
        }
    }
}
