package lesson19;

public class Daemon {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(){
            @Override
            public void run() {
                int cnt = 0;

                while (true) {
                    try {
                        Thread.sleep(1000);

                        System.out.println("MyThread " + cnt++);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        t.setDaemon(true);
        t.start();

        Thread.sleep(3500);

        System.out.println(Thread.currentThread().getName() + ": That's all!");
    }
}
