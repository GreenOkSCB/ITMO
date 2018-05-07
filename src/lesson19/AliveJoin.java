package lesson19;

public class AliveJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(){
            @Override
            public void run() {
                Thread curThread = Thread.currentThread();

                System.out.println(curThread.getName() + " state: " + curThread.getState());
            }
        };

        System.out.println("Before start state: " + t.getState());

        t.start();

        t.join(); // Ждем окончания выполнения потока t

        System.out.println("After join state: " + t.getState());
    }
}
