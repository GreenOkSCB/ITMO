package lesson19;

public class ThreadInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(){
            @Override
            public void run() {
                int cnt = 0;

                while (!isInterrupted()) {
                    try {
                        Thread.sleep(1000);

                        System.out.println("MyThread " + cnt++);
                    } catch (InterruptedException e) {
                        e.printStackTrace();

                        Thread.currentThread().interrupt(); // Обязательно!!!
                    }
                }
            }
        };

        t.start();

        Thread.sleep(3500);

        t.interrupt();

        System.out.println(Thread.currentThread().getName() + ": That's all!");
    }
}
